package com.runehonor.game.players.packets;

import com.runehonor.Constants;
import com.runehonor.GameServer;
import com.runehonor.game.npcs.pet.DropPet;
import com.runehonor.game.npcs.pet.PetData;
import com.runehonor.game.players.Client;
import com.runehonor.game.players.PacketType;
import com.runehonor.game.players.PlayerSave;

/**
 * Drop Item
 **/
public class DropItem implements PacketType {

	@Override
	public void processPacket(Client c, int packetType, int packetSize) {
		int itemId = c.getInStream().readUnsignedWordA();
		c.getInStream().readUnsignedByte();
		c.getInStream().readUnsignedByte();
		int slot = c.getInStream().readUnsignedWordA();
		c.alchDelay = System.currentTimeMillis();
		if(!c.getItems().playerHasItem(itemId, 1)) {
			return;
		}
		if(c.inTrade || c.isBanking) {
			c.sendMessage("You can't drop items while trading or banking!");
			return;
		}
		if(c.isDead) {
			return;
		}
		if(c.arenas()) {
			c.sendMessage("You can't drop items inside the arena!");
			return;
		}
		
		if(itemId == 4045) {
			int explosiveHit = 15;
			c.startAnimation(827);
			c.getItems().deleteItem(itemId, slot, c.playerItemsN[slot]);
			c.handleHitMask(explosiveHit);
			c.dealDamage(explosiveHit);
			c.getAssistant().refreshSkill(3);
			c.forcedText = "Ow! That really hurt!";
			c.forcedChatUpdateRequired = true;
			c.updateRequired = true;
		}

		boolean droppable = true;
		for (int i : Constants.UNDROPPABLE_ITEMS) {
			if (i == itemId) {
				droppable = false;
				break;
			}
		}
		for (int i = 0; i < PetData.petData.length; i++)
        {
                if (PetData.petData[i][1] == itemId)
                {
                	if (c.getPetSummoned())
                    {
                            droppable = false;
                            break;
                    }
                }
        }
		 
		 DropPet.getInstance().dropPetRequirements(c, itemId, slot);
		if(c.playerItemsN[slot] != 0 && itemId != -1 && c.playerItems[slot] == itemId + 1) {
			if(droppable) {
				if (c.underAttackBy > 0) {
					if (c.getShops().getItemShopValue(itemId) > 1000) {
						c.sendMessage("You may not drop items worth more than 1000 while in combat.");
						return;
					}
				}
				GameServer.itemHandler.createGroundItem(c, itemId, c.getX(), c.getY(), c.playerItemsN[slot], c.getId());
				c.getItems().deleteItem(itemId, slot, c.playerItemsN[slot]);
				PlayerSave.saveGame(c);
			} else {
				c.sendMessage("This item cannot be dropped.");
			}
		}

	}
}
