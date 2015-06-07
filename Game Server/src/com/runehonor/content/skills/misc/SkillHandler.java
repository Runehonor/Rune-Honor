package com.runehonor.content.skills.misc;

import com.runehonor.Constants;
import com.runehonor.game.players.Client;

public class SkillHandler {

	public static final int WOODCUTTING_XP = Constants.WOODCUTTING_EXPERIENCE;
	public static final int FIREMAKING_XP = Constants.FIREMAKING_EXPERIENCE;
	public static final int COOKING_XP = Constants.COOKING_EXPERIENCE;
	public static final int MINING_XP = Constants.MINING_EXPERIENCE;
	public static final int FLETCHING_XP = Constants.FLETCHING_EXPERIENCE;

	public static final boolean view190 = true;

	public static void resetPlayerSkillVariables(Client c) {
		if (c.playerIsMining) {
			for (int i = 0; i < 2; i++) {
				c.miningProp[i] = -1;
			}
		} else if (c.playerIsCooking) {
			for (int i2 = 0; i2 < 6; i2++) {
				c.cookingProp[i2] = -1;

			}
		}
	}

	public static boolean noInventorySpace(Client c, String skill) {
		if (c.getItems().freeSlots() == 0) {
			c.sendMessage("You haven't got enough inventory space to continue "
					+ skill + "!");
			return false;
		}
		return true;
	}

	public static boolean hasRequiredLevel(final Client c, int id, int lvlReq,
			String skill, String event) {
		if (c.playerLevel[id] < lvlReq) {
			c.getAssistant().closeAllWindows();
			c.sendMessage("You don't have a high enough " + skill + " level to " + event + ".");
			return false;
		}
		return true;
	}

	public static void deleteTime(Client c) {
		c.doAmount--;
	}
}