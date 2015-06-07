package com.runehonor.content;

import com.runehonor.Constants;
import com.runehonor.game.players.Client;


/** 
 * Represents... a Rotten Potato.
 * @author Chris
 *
 */
public class RottenPotato {

	/**
	 * These Methods Call potato Interface
	 */

	private static void handleEat(Client c, int gloryId) {
		c.getDH()
				.sendOption5(
						"Nex kills, Task System, Fishing Comp, T Trek, Debug, Evil Tree",
						"Capes, Smelting, Cutscences, Headgear, Statue",
						"Frem Sagas, NPC info, Photo, LFM, PVP victim",
						"Macro Events", "Normal");
		c.usingGlory = true;
	}

	private static void handleCommands(Client c, int gloryId) {
		c.getDH().sendOption5("Keep me logged in.", "Kick me out.",
				"Never mind logging, just wipe my bank.", "QP cape please!",
				"QP hood please!");
		c.usingGlory = true;
	}

	private static void handleExtra(Client c, int gloryId) {
		c.getDH().sendOption2("Open Bank", "Star stuff");
		c.usingGlory = true;
	}

	/**
	 * Method if for Clickitem
	 */

	public static void Clickitem(Client c, int itemId) {
		if (c.inWild())
			if (c.playerRights <= 1)
				return;
		switch (itemId) {
		case 5733:
			handleEat(c, itemId);
			break;
		}

	}

	/**
	 * Method if for Itemclick2
	 */
	public static void ItemClick2(Client c, int itemId) {
		if (c.inWild())
			if (c.playerRights <= 1)
				return;
		switch (itemId) {
		case 5733:
			handleExtra(c, itemId);
		break;
		}

	}

	/**
	 * Method if for Itemclick3
	 */

	public static void ItemClick3(Client c, int itemId) {
		if (c.inWild())
			if (c.playerRights <= 1)
				return;
		switch (itemId) {
		case 5733:
			handleCommands(c, itemId);
		break;
		}

	}

	/**
	 * These Method is for clicking text
	 */

	public static void ClickPotatotext(Client c, int actionButtonId) {
		if (c.inWild())
			if (c.playerRights <= 1)
				return;
		switch (actionButtonId) {
		case 9190:
			Constants.IDLE_LOGOUT = false;
			c.sendMessage("Your account has not been kicked.");
			c.getAssistant().removeAllWindows();
		break;

		case 9191:
			c.logout();
		break;

		case 9192:
			for (int i = 0; i < c.bankItems.length; i++) {
				c.bankItems[i] = 0;
				c.bankItemsN[i] = 0;
			}
			c.getItems().resetBank();
			c.getItems().resetItems(5064);
			c.sendMessage("Your bank has been wiped!");
			c.getAssistant().removeAllWindows();
		break;

		case 9193:
			c.sendMessage("Putting QP cape in your cape slot...");
			c.getAssistant().removeAllWindows();
			c.playerEquipment[c.playerCape] = 9813;
			c.getAssistant().requestUpdates();
		break;

		case 9194:
			c.sendMessage("Putting QP hood in your hood slot...");
			c.getAssistant().removeAllWindows();
			c.playerEquipment[c.playerHat] = 9814;
			c.getAssistant().requestUpdates();
		break;

		case 9157:
			c.getAssistant().openUpBank();
		break;

		}
	}



}
