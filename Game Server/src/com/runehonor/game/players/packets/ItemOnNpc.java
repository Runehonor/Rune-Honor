package com.runehonor.game.players.packets;

import com.runehonor.game.items.UseItem;
import com.runehonor.game.npcs.NPC;
import com.runehonor.game.npcs.NPCHandler;
import com.runehonor.game.players.Client;
import com.runehonor.game.players.PacketType;


public class ItemOnNpc implements PacketType {

	@Override
	public void processPacket(Client c, int packetType, int packetSize) {
		int itemId = c.getInStream().readSignedWordA();
		int i = c.getInStream().readSignedWordA();
		int slot = c.getInStream().readSignedWordBigEndian();
		int npcId = NPCHandler.npcs[i].npcType;
		if(!c.getItems().playerHasItem(itemId, 1, slot)) {
			return;
		}
		NPC n = NPCHandler.npcs[i];
		c.npcClickIndex = i;
		c.clickNpcType = 0;
		c.itemOnNpcItemId = itemId;
		c.itemOnNpcItemSlot = slot;
		if(c.goodDistance(n.getX(), n.getY(), c.getX(), c.getY(), 1)) {
			c.turnPlayerTo(n.getX(), n.getY());
			UseItem.ItemonNpc(c, itemId, slot, npcId);	
		} else {
			c.clickNpcType = 4;
		}
	}
}
