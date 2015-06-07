package com.runehonor.game.minigames.pestcontrol;

import com.runehonor.Constants;
import com.runehonor.game.players.Client;

public class PestControlRewards {
	
	/**
	 * Can players use points exchange yes ? no
	 */
	public final static boolean CAN_EXCHANGE_POINTS = true;

	/**
	 * Rewards interface int id
	 */
	public final static int REWARDS_INTERFACE = 18691;

	/**
	 * Void Knights that can exchange points
	 */
	public final static int[] VOID_KNIGHTS = {3788, 3789};

	/**
	 * Reward Types
	 */
	public final static int
	NONE = 0,
	ATTACK = 1,
	STRENGTH = 2,
	DEFENCE = 3,
	RANGED = 4,
	MAGIC = 5,
	HITPOINTS = 6,
	PRAYER = 7;

	/**
	 * Reward Type Selected
	 */
	public static int rewardSelected = 0;

	/**
	 * Gets String Reward Chosen
	 * @return
	 */
	public static String checkReward() {
		if(rewardSelected == NONE) {
			return "None";
		} else if(rewardSelected == NONE) {
			return "None";
		} else if(rewardSelected == ATTACK) {
			return "Attack";
		} else if(rewardSelected == STRENGTH) {
			return "Strength";
		} else if(rewardSelected == DEFENCE) {
			return "Defence";
		} else if(rewardSelected == RANGED) {
			return "Ranged";
		} else if(rewardSelected == MAGIC) {
			return "Magic";
		} else if(rewardSelected == HITPOINTS) {
			return "Hitpoints";
		} else if(rewardSelected == PRAYER) {
			return "Prayer";
		}
		return "";
	}

	/**
	 * Opens Point Exchange
	 * @param c
	 * @param button
	 */
	public static void exchangePestPoints(Client c) {
		if (!CAN_EXCHANGE_POINTS) {
			c.sendMessage("Pest Control point exchange is currently disabled.");
			return;
		}
		c.getAssistant().sendFrame126("Void Knights' Training Options", 18758);
		c.getAssistant().sendFrame126("ATTACK", 18767);
		c.getAssistant().sendFrame126("STRENGTH", 18768);
		c.getAssistant().sendFrame126("DEFENCE", 18769);
		c.getAssistant().sendFrame126("RANGED", 18770);
		c.getAssistant().sendFrame126("MAGIC", 18771);
		c.getAssistant().sendFrame126("HITPOINTS", 18772);
		c.getAssistant().sendFrame126("PRAYER", 18773);
		c.getAssistant().sendFrame126(checkReward(), 18782);
		c.getAssistant().sendFrame126("Points: "+c.pcPoints, 18783);
		c.sendMessage("You currently have "+c.pcPoints+" pest control points.");
		c.getAssistant().showInterface(REWARDS_INTERFACE);
	}

	public static void handlePestButtons(Client c, int button) {
		switch(button) {

		/**
		 * Attack
		 */
		case 73072:
		case 73079:
			rewardSelected = ATTACK;
			c.getAssistant().sendFrame126(checkReward(), 18782);
			break;

			/**
			 * Strength
			 */
		case 73073:
		case 73080:
			rewardSelected = STRENGTH;
			c.getAssistant().sendFrame126(checkReward(), 18782);
			break;

			/**
			 * Defence	
			 */
		case 73074:
		case 73081:
			rewardSelected = DEFENCE;
			c.getAssistant().sendFrame126(checkReward(), 18782);
			break;

			/**
			 * Ranged	
			 */
		case 73075:
		case 73082:
			rewardSelected = RANGED;
			c.getAssistant().sendFrame126(checkReward(), 18782);
			break;

			/**
			 * Magic		
			 */
		case 73076:
		case 73083:
			rewardSelected = MAGIC;
			c.getAssistant().sendFrame126(checkReward(), 18782);
			break;

			/**
			 * Hitpoints	
			 */
		case 73077:
		case 73084:
			rewardSelected = HITPOINTS;
			c.getAssistant().sendFrame126(checkReward(), 18782);
			break;

			/**
			 * Prayer	
			 */
		case 73078:
		case 73085:
			rewardSelected = PRAYER;
			c.getAssistant().sendFrame126(checkReward(), 18782);
			break;

			/**
			 * Confirm	
			 */
		case 73091:
			switch(rewardSelected) {
			case NONE:
				c.sendMessage("You don't have a reward selected.");
				break;
			case ATTACK:
				if(c.pcPoints > 1) {
					c.getAssistant().addSkillXP(c.playerLevel[Constants.ATTACK] * c.playerLevel[Constants.ATTACK]/17.5 * 4, Constants.ATTACK);
					c.sendMessage("You have been rewarded attack experience.");
					c.pcPoints -= 2;
				} else {
					c.sendMessage("You need at least 2 pest control points to exchange your points.");
				}
				break;
			case STRENGTH:
				if(c.pcPoints > 1) {
					c.getAssistant().addSkillXP(c.playerLevel[Constants.STRENGTH] * c.playerLevel[Constants.STRENGTH]/17.5 * 4, Constants.STRENGTH);
					c.sendMessage("You have been rewarded strength experience.");
					c.pcPoints -= 2;
				} else {
					c.sendMessage("You need at least 2 pest control points to exchange your points.");
				}
				break;
			case DEFENCE:
				if(c.pcPoints > 1) {
					c.getAssistant().addSkillXP(c.playerLevel[Constants.DEFENCE] * c.playerLevel[Constants.DEFENCE]/17.5 * 4, Constants.DEFENCE);
					c.sendMessage("You have been rewarded defence experience.");
					c.pcPoints -= 2;
				} else {
					c.sendMessage("You need at least 2 pest control points to exchange your points.");
				}
				break;
			case RANGED:
				if(c.pcPoints > 1) {
					c.getAssistant().addSkillXP(c.playerLevel[Constants.RANGED] * c.playerLevel[Constants.RANGED]/17.5 * 4, Constants.RANGED);
					c.sendMessage("You have been rewarded ranged experience.");
					c.pcPoints -= 2;
				} else {
					c.sendMessage("You need at least 2 pest control points to exchange your points.");
				}
				break;
			case MAGIC:
				if(c.pcPoints > 1) {
					c.getAssistant().addSkillXP(c.playerLevel[Constants.MAGIC] * c.playerLevel[Constants.MAGIC]/17.5 * 4, Constants.MAGIC);
					c.sendMessage("You have been rewarded magic experience.");
					c.pcPoints -= 2;
				} else {
					c.sendMessage("You need at least 2 pest control points to exchange your points.");
				}
				break;
			case HITPOINTS:
				if(c.pcPoints > 1) {
					c.getAssistant().addSkillXP(c.playerLevel[Constants.HITPOINTS] * c.playerLevel[Constants.HITPOINTS]/17.5 * 4, Constants.HITPOINTS);
					c.sendMessage("You have been rewarded hitpoints experience.");
					c.pcPoints -= 2;
				} else {
					c.sendMessage("You need at least 2 pest control points to exchange your points.");
				}
				break;
			case PRAYER:
				if(c.pcPoints > 1) {
					c.getAssistant().addSkillXP(c.playerLevel[Constants.PRAYER] * c.playerLevel[Constants.PRAYER]/8.75 * 4, Constants.PRAYER);
					c.sendMessage("You have been rewarded prayer experience.");
					c.pcPoints -= 2;
				} else {
					c.sendMessage("You need at least 2 pest control points to exchange your points.");
				}
				break;
			}
			
			c.getAssistant().sendFrame126("Points: "+c.pcPoints, 18783);
			break;
		}
	}

}
