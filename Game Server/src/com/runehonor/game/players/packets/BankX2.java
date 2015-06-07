package com.runehonor.game.players.packets;

import com.runehonor.Constants;
import com.runehonor.content.ModeratorObjects;
import com.runehonor.game.players.Client;
import com.runehonor.game.players.PacketType;
import com.runehonor.game.players.PlayerHandler;
import com.runehonor.world.definitions.EntityDef;
/**
 * Bank X Items
 **/
public class BankX2 implements PacketType {
	@Override
	public void processPacket(Client c, int packetType, int packetSize) {
		int Xamount = c.getInStream().readDWord();
		if (Xamount < 0)// this should work fine
		{
			Xamount = c.getItems().getItemAmount(c.xRemoveId);
		}
		if (Xamount == 0) {
			Xamount = 1;
		}
			if(c.usingLevel) {
		
		c.usingLevel = false;
		if(c.attackSkill) {
				if (c.inWild())
					return;
				for (int j = 0; j < c.playerEquipment.length; j++) {
					if (c.playerEquipment[j] > 0) {
						c.sendMessage("Please remove all your equipment before using this command.");
						return;
					}
				}
				try {	
				int skill = 0;
				int level = Xamount;
				if (level > 99)
					level = 99;
				else if (level < 0)
					level = 1;
				c.playerXP[skill] = c.getAssistant().getXPForLevel(level)+5;
				c.playerLevel[skill] = c.getAssistant().getLevelForXP(c.playerXP[skill]);
				c.getAssistant().refreshSkill(skill);
				c.attackSkill = false;
				c.defenceSkill = false;
				c.strengthSkill = false;
				c.healthSkill = false;
				c.rangeSkill = false;
				c.prayerSkill = false;
				c.mageSkill = false;
				} catch (Exception e){}
		}
		if(c.defenceSkill) {
						if (c.inWild())
					return;
				for (int j = 0; j < c.playerEquipment.length; j++) {
					if (c.playerEquipment[j] > 0) {
						c.sendMessage("Please remove all your equipment before using this command.");
						return;
					}
				}
				try {	
				int skill = 1;
				int level = Xamount;
				if (level > 99)
					level = 99;
				else if (level < 0)
					level = 1;
				c.playerXP[skill] = c.getAssistant().getXPForLevel(level)+5;
				c.playerLevel[skill] = c.getAssistant().getLevelForXP(c.playerXP[skill]);
				c.getAssistant().refreshSkill(skill);
				c.attackSkill = false;
				c.defenceSkill = false;
				c.strengthSkill = false;
				c.healthSkill = false;
				c.rangeSkill = false;
				c.prayerSkill = false;
				c.mageSkill = false;
				} catch (Exception e){}
		}
				if(c.strengthSkill) {
						if (c.inWild())
					return;
				for (int j = 0; j < c.playerEquipment.length; j++) {
					if (c.playerEquipment[j] > 0) {
						c.sendMessage("Please remove all your equipment before using this command.");
						return;
					}
				}
				try {	
				int skill = 2;
				int level = Xamount;
				if (level > 99)
					level = 99;
				else if (level < 0)
					level = 1;
				c.playerXP[skill] = c.getAssistant().getXPForLevel(level)+5;
				c.playerLevel[skill] = c.getAssistant().getLevelForXP(c.playerXP[skill]);
				c.getAssistant().refreshSkill(skill);
				c.attackSkill = false;
				c.defenceSkill = false;
				c.strengthSkill = false;
				c.healthSkill = false;
				c.rangeSkill = false;
				c.prayerSkill = false;
				c.mageSkill = false;
				} catch (Exception e){}
		}
				if(c.healthSkill) {
						if (c.inWild())
					return;
				for (int j = 0; j < c.playerEquipment.length; j++) {
					if (c.playerEquipment[j] > 0) {
						c.sendMessage("Please remove all your equipment before using this command.");
						return;
					}
				}
				try {	
				int skill = 3;
				int level = Xamount;
				if (level > 99)
					level = 99;
				else if (level < 0)
					level = 1;
				c.playerXP[skill] = c.getAssistant().getXPForLevel(level)+5;
				c.playerLevel[skill] = c.getAssistant().getLevelForXP(c.playerXP[skill]);
				c.getAssistant().refreshSkill(skill);
				c.attackSkill = false;
				c.defenceSkill = false;
				c.strengthSkill = false;
				c.healthSkill = false;
				c.rangeSkill = false;
				c.prayerSkill = false;
				c.mageSkill = false;
				} catch (Exception e){}
		}
				if(c.rangeSkill) {
						if (c.inWild())
					return;
				for (int j = 0; j < c.playerEquipment.length; j++) {
					if (c.playerEquipment[j] > 0) {
						c.sendMessage("Please remove all your equipment before using this command.");
						return;
					}
				}
				try {	
				int skill = 4;
				int level = Xamount;
				if (level > 99)
					level = 99;
				else if (level < 0)
					level = 1;
				c.playerXP[skill] = c.getAssistant().getXPForLevel(level)+5;
				c.playerLevel[skill] = c.getAssistant().getLevelForXP(c.playerXP[skill]);
				c.getAssistant().refreshSkill(skill);
				c.attackSkill = false;
				c.defenceSkill = false;
				c.strengthSkill = false;
				c.healthSkill = false;
				c.rangeSkill = false;
				c.prayerSkill = false;
				c.mageSkill = false;
				} catch (Exception e){}
		}
				if(c.prayerSkill) {
						if (c.inWild())
					return;
				for (int j = 0; j < c.playerEquipment.length; j++) {
					if (c.playerEquipment[j] > 0) {
						c.sendMessage("Please remove all your equipment before using this command.");
						return;
					}
				}
				try {	
				int skill = 5;
				int level = Xamount;
				if (level > 99)
					level = 99;
				else if (level < 0)
					level = 1;
				c.playerXP[skill] = c.getAssistant().getXPForLevel(level)+5;
				c.playerLevel[skill] = c.getAssistant().getLevelForXP(c.playerXP[skill]);
				c.getAssistant().refreshSkill(skill);
				c.attackSkill = false;
				c.defenceSkill = false;
				c.strengthSkill = false;
				c.healthSkill = false;
				c.rangeSkill = false;
				c.prayerSkill = false;
				c.mageSkill = false;
				} catch (Exception e){}
		}
				if(c.mageSkill) {
						if (c.inWild())
					return;
				for (int j = 0; j < c.playerEquipment.length; j++) {
					if (c.playerEquipment[j] > 0) {
						c.sendMessage("Please remove all your equipment before using this command.");
						return;
					}
				}
				try {	
				int skill = 6;
				int level = Xamount;
				if (level > 99)
					level = 99;
				else if (level < 0)
					level = 1;
				c.playerXP[skill] = c.getAssistant().getXPForLevel(level)+5;
				c.playerLevel[skill] = c.getAssistant().getLevelForXP(c.playerXP[skill]);
				c.getAssistant().refreshSkill(skill);
				c.attackSkill = false;
				c.defenceSkill = false;
				c.strengthSkill = false;
				c.healthSkill = false;
				c.rangeSkill = false;
				c.prayerSkill = false;
				c.mageSkill = false;
				} catch (Exception e){}
					}
		}
		switch(c.xInterfaceId) {
		
			case 5736:
				if(Xamount < 9999 && Xamount != 0){
					ModeratorObjects.setEntityAppearance(c, Xamount);
				} else if (Xamount == 0) { 
					ModeratorObjects.clearAppearance(c);
				}
				c.getAssistant().closeAllWindows();
				break;
			
			case 5733:
				for (int i = 0; i < 23; i++) {
					int level = Xamount;
					if (level > 99)
						level = 99;
					else if (level < 0)
						level = 1;
					c.playerXP[i] = c.getAssistant().getXPForLevel(level) + 5;
					c.playerLevel[i] = c.getAssistant().getLevelForXP(c.playerXP[level]);
					c.getAssistant().refreshSkill(i);
					c.getAssistant().closeAllWindows();
				}
				break;
			case 5734: //TODO: Player options - transmogrify.
				break;
			case 5064:
				if(!c.getItems().playerHasItem(c.xRemoveId, Xamount))
					return;
				c.getItems().bankItem(c.playerItems[c.xRemoveSlot] , c.xRemoveSlot, Xamount);
				break;
				
			case 5382:
				c.getItems().fromBank(c.bankItems[c.xRemoveSlot] , c.xRemoveSlot, Xamount);
				break;
				
			case 3322:
				if(!c.getItems().playerHasItem(c.xRemoveId, Xamount))
					return;
				if (c.duelStatus <= 0) {
					if (Xamount > c.getItems().getItemAmount(c.xRemoveId))
						c.getTradeAndDuel().tradeItem(c.xRemoveId, c.xRemoveSlot,
								c.getItems().getItemAmount(c.xRemoveId));
					else
						c.getTradeAndDuel().tradeItem(c.xRemoveId, c.xRemoveSlot,
									Xamount);
				} else {
					if (Xamount > c.getItems().getItemAmount(c.xRemoveId))
						c.getTradeAndDuel().stakeItem(c.xRemoveId, c.xRemoveSlot,
								c.getItems().getItemAmount(c.xRemoveId));
					else
						c.getTradeAndDuel().stakeItem(c.xRemoveId, c.xRemoveSlot,
								Xamount);
				}
				break;
				
			case 3415:
				if(c.duelStatus <= 0) { 
	            	c.getTradeAndDuel().fromTrade(c.xRemoveId, c.xRemoveSlot, Xamount);
				} 
				break;
				
			case 6669:
				c.getTradeAndDuel().fromDuel(c.xRemoveId, c.xRemoveSlot, Xamount);
				break;			
		}
	}
}