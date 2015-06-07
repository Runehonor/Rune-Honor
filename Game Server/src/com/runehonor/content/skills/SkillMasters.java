package com.runehonor.content.skills;

import com.runehonor.Constants;
import com.runehonor.game.players.Client;

public class SkillMasters {

	public enum MasterData {
		HUNTER(5113, 9948, Constants.HUNTER),
		CONSTRUCTION(4247, 9789, Constants.CONSTRUCTION),
		SLAYER(1599, 9786, Constants.SLAYER),
		RUNECRAFTING(553, 9765, Constants.RUNECRAFTING),
		STRENGTH(4297, 9750, Constants.STRENGTH),
		ATTACK(4288, 9747, Constants.ATTACK),
		DEFENCE(705, 9753, Constants.DEFENCE),
		MAGIC(1658, 9762, Constants.MAGIC),
		PRAYER(802, 9759, Constants.PRAYER),
		RANGED(682, 9756, Constants.RANGED),
		HITPOINTS(961, 9768, Constants.HITPOINTS),
		MINING(3295, 9792, Constants.MINING),
		SMITH(604, 9795, Constants.SMITHING),
		FISHING(308, 9798, Constants.FISHING),
		FM(4946, 9804, Constants.FIREMAKING),
		COOKING(847, 9801, Constants.COOKING),
		FLETCHING(575, 9783, Constants.FLETCHING),
		CRAFTING(805, 9780, Constants.CRAFTING),
		FARMING(3299, 9810, Constants.FARMING),
		WC(4906, 9807, Constants.WOODCUTTING),
		HERBLORE(455, 9774, Constants.HERBLORE),
		THIEVING(2270, 9777, Constants.THIEVING),
		AGILITY(437, 9771, Constants.AGILITY);

		private int
		masterId,
		capeId,
		skillId;

		MasterData(int masterId, int capeId, int skillId) {
			this.masterId = masterId;
			this.capeId = capeId;
			this.skillId = skillId;
		}

		public int getMaster() {
			return masterId;
		}

		public int getCape() {
			return capeId;
		}

		public int getSkill() {
			return skillId;
		}
	}
	
	public static int getMaster() {
		for(MasterData m : MasterData.values()) {
			if (m.getMaster() == m.getMaster()) {
				return m.getMaster();
			}
		}
		return -1;	
	}
	
	public static int getSkill(Client c) {
		for(MasterData m : MasterData.values()) { 
			if (c.talkingNpc == m.getMaster()) {
			return m.getSkill();
			}
		}
		return -1;	
	}
	
    public static String getSkillName(Client c) {
        for (MasterData m : MasterData.values()) {
            if (c.talkingNpc == m.getMaster()) {
                return m.name().toLowerCase();
            }
        }
        return "";
    }

	public static int checkMaxedSkills(Client c) {
		int maxed = 0;
		for (int j = 0; j < c.playerLevel.length; j++) {
			if (c.getLevelForXP(c.playerXP[j]) >= 99) {
				maxed++;				
			}			
		}		
		return maxed;
	}

	public static void addSkillCape(Client c) {
		if(c.getItems().freeSlots() < 2) {
			c.getDH().sendStatement("You need at least 2 free inventory spaces to buy a skillcape.");
			c.nextChat = -1;
			return;
		}
		int maxed = checkMaxedSkills(c);
		for(MasterData m : MasterData.values()) {
			if (c.talkingNpc == m.getMaster()) {
				if (c.getAssistant().getLevelForXP(c.playerXP[getSkill(c)]) >= 99) {
					if (c.getItems().playerHasItem(995, 99000)) {
						if (maxed > 1) {
							c.getItems().addItem(m.capeId + 1, 1);
						} else {
							c.getItems().addItem(m.capeId, 1);
						}
						c.getItems().addItem(m.capeId + 2, 1);
						c.getItems().deleteItem(995, 99000);
						c.getAssistant().closeAllWindows();
					} else {
						c.getDH().sendStatement("You need 99,000 coins to buy a "+getSkillName(c)+" skillcape.");
						c.nextChat = -1;
						return;
					}
				} else {
					c.getDH().sendStatement("You need 99 "+getSkillName(c)+" to buy this skillcape.");
					c.nextChat = -1;
					return;
				}
			}
		}
	}
	
	public static void startDialogue(Client c) {
		for(MasterData m : MasterData.values()) {
			if (m.getMaster() == m.getMaster()) {
				c.getDH().sendDialogues(5, m.getMaster());
			}
		}
	}
	
	public static void masterDialogue(Client c) {
		for(MasterData m : MasterData.values()) {
			if (c.talkingNpc == m.getMaster()) {
				c.npcType = c.talkingNpc;
				c.getDH().sendNpcChat("Hello I'm the "+getSkillName(c)+" master, would you like to", 
					"buy a skillcape?", c.getDH().CALM, "SkillMaster");
				c.nextChat = 441;
			}
		}
	}
	
	public static void masterOptions(Client c) {
		for(MasterData m : MasterData.values()) {
			if (c.talkingNpc == m.getMaster()) {
				c.getDH().sendOption2("I want to buy a skill cape.", "No thanks.");
				c.dialogueAction = 10000; 
			}
		}
	}

}
