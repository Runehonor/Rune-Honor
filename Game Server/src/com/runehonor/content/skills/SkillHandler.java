package com.runehonor.content.skills;

import com.runehonor.Constants;
import com.runehonor.game.items.ItemAssistant;
import com.runehonor.game.players.Client;

public class SkillHandler {

	public static final int WOODCUTTING_XP = Constants.WOODCUTTING_EXPERIENCE;

	public static final boolean view190 = true;

	public static String getLine(Client c) {
		return ("\\n\\n\\n\\n\\n");
	}

	public static boolean noInventorySpace(Client c, String skill) {
		if (c.getItems().freeSlots() == 0) {
			c.sendMessage("You haven't got enough inventory space to continue "+skill+"!");
			c.getAssistant().sendStatement("You haven't got enough inventory space to continue "+skill+"!");
			return false;
		}
		return true;
	}
	
	public static void send1Item(Client c, int itemId, boolean view190) {
		c.getAssistant().sendFrame246(1746, view190 ? 190 : 150, itemId);
		c.getAssistant().sendFrame126(getLine(c) + "" + ItemAssistant.getItemName(itemId) + "", 2799);
		c.getAssistant().sendFrame164(4429);
	}

	public static boolean hasRequiredLevel(Client c, int id, int lvlReq, String skill, String event) {
		if(c.playerLevel[id] < lvlReq) {
			c.sendMessage("You haven't got high enough "+skill+" level to "+event+"");
			c.sendMessage("You at least need the "+skill+" level of "+ lvlReq +".");
			c.getAssistant().sendStatement("You haven't got high enough "+skill+" level to "+event+"!");
			return false;
		}
		return true;
	}

	public static void deleteTime(Client c) {
		c.doAmount--;
	}
}