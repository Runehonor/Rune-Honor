package com.runehonor.content;

import com.runehonor.GameServer;
import com.runehonor.game.players.Client;
import com.runehonor.game.players.PlayerHandler;
import com.runehonor.world.definitions.EntityDef;


/** 
 * Handles administrative in-game objects & items (e.g - J-Mod table, rotten potato)
 * @author Chris
 *
 */
public class ModeratorObjects {
	
	/** 
	 * Represents whether the moderator room is enabled.
	 */
	private static boolean modroomEnabled = false;
	
	private Client c;
	
	/** - Jagex Moderator Table - **/
	
	/** 
	 * Gets whether the moderator room is enabled.
	 * @return true if it is enabled
	 */
	public static boolean modroomEnabled() { 
		return modroomEnabled;
	}
	
	/** 
	 * Sends the moderator room options.
	 * @param c
	 */
	public static void sendJModOptions(Client c) { 
		if (c.playerRights != 3) {
			return;
		}
		c.getDH().sendOption2("Toggle J-Mod Room", "Cancel");
		c.dialogueAction = 26807;
	}
	
	/** 
	 * Handles option 1 for JMod Table
	 * @param c
	 */
	public static void handleJmodOption1(Client c) { 
		modroomEnabled = !modroomEnabled;
		c.sendMessage("The moderator room is now " + (modroomEnabled ? "accessible" : "inaccessible") + 
					  " to staff.");
		c.getAssistant().closeAllWindows();
	}
	
	/** - Rotten Potato - **/
	
	public static void handleOptionButtons(Client c, int button) { 
		switch(button) {
			case 9190: //Option 1/5
				switch (c.dialogueAction) { 
					case 5733:
						c.outStream.createFrame(27);
						c.xInterfaceId = 5733;
						c.dialogueAction = 0;
						break;
					case 5734:
						c.outStream.createFrame(27);
						c.xInterfaceId = 5734;
						c.dialogueAction = 0;
						break;
				}
				break;
			case 9191: //Option 2/5
				switch (c.dialogueAction) { 
				case 5733:
					c.getItems().removeAllItems();
					c.sendMessage("Inventory items all gone!");
					c.dialogueAction = 0;
					break;
				}
				break;
			case 9192: //Option 3/5
				switch (c.dialogueAction) { 
				case 5733: 
					
					break;
				}
				break;
			case 9193: //Option 4/5
				switch (c.dialogueAction) {
				case 5733: 
					c.outStream.createFrame(187);
					c.xInterfaceId = 5735;
					c.dialogueAction = 0;
					break;
				}
				break;
			case 9194: //Option 5/5
				switch (c.dialogueAction) { 
				case 5733: 
					GameServer.npcHandler.spawnNpc(c, 92, c.absX, c.absY, 0, 0, 120, 7, 70, 70, false, false);
					c.getAssistant().closeAllWindows();
					c.dialogueAction = 0;
					break;
				}
				break;
			case 9167: //Option 1/3
				switch (c.dialogueAction) { 
				case 5735: 
					c.getAssistant().openUpBank();
					break;
				}
				break;
			case 9168: //Option 2/3
				switch (c.dialogueAction) { 
				case 5735: 
					c.outStream.createFrame(27);
					c.xInterfaceId = 5736;
					break;
				}
				break;
			case 9169: //Option 3/3
				switch (c.dialogueAction) { 
				case 5735: 
					setEntityAppearance(c, 2005);
					c.getAssistant().closeAllWindows();
					break;
				}
				break;
			
		}
	}
	
	/** 
	 * Sets the player's appearance to that of a mob.
	 * @param c
	 * @param id
	 */
	public static void setEntityAppearance(Client c, int id) { 
		c.npcId2 = id;
		c.isNpc = true;
		c.updateRequired = true;
		c.appearanceUpdateRequired = true;
		c.playerStandIndex = EntityDef.forID(id).standAnim;
		c.playerTurnIndex = EntityDef.forID(id).standAnim;
		c.playerWalkIndex = EntityDef.forID(id).walkAnim;
		c.playerTurn180Index = EntityDef.forID(id).standAnim;;
		c.playerTurn90CWIndex = EntityDef.forID(id).standAnim;;
		c.playerTurn90CCWIndex = EntityDef.forID(id).walkAnim;
		c.playerRunIndex = EntityDef.forID(id).walkAnim;
	}
	
	/** 
	 * Clears player appearance.
	 * @param c
	 */
	public static void clearAppearance(Client c) { 
		c.isNpc = false;
		c.updateRequired = true;
		c.appearanceUpdateRequired = true;
		c.playerStandIndex = 0x328;
		c.playerTurnIndex = 0x337;
		c.playerWalkIndex = 0x333;
		c.playerTurn180Index = 0x334;
		c.playerTurn90CWIndex = 0x335;
		c.playerTurn90CCWIndex = 0x336;
		c.playerRunIndex = 0x338;
	}
	
	/** 
	 * Handles rotten potato option 1 (eat).
	 * @param c
	 */
	
	public static void sendPlayerOption(Client c, int playerId) { 
		c.getDH().sendOption5("Transmogrify player...", 
							  "Kick player",
							  "Ban player",
							  "UID-Ban Player",
							  "*");
		c.dialogueAction = 5734;
	}
	
	/** 
	 * Sends dialogue for the Eat option.
	 * @param c
	 */
	public static void sendOptionEat(Client c) {
		if (c.playerRights != 3) { 
			return;
		}
		c.getDH().sendOption5("Set all stats",
							  "Wipe inventory",
							  "Setup POH",
							  "Teleport to Player", 
							  "Spawn aggressive NPC");
		c.dialogueAction = 5733;
	}
	
	/** 
	 * Sends dialogue for the Peel option.
	 * @param c
	 */
	public static void sendOptionPeel(Client c) {
		if (c.playerRights != 3) { 
			return;
		}
		c.getDH().sendOption3("Open bank",
							  "Transmogrify me...",
							  "Spawn RARE");
		c.dialogueAction = 5735;
	}
	

}
