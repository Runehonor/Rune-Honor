package com.runehonor.game.players.dialogue.impl;

import com.runehonor.game.players.Client;
import com.runehonor.game.players.dialogue.Dialogue;
import com.runehonor.game.players.dialogue.DialogueManager;


/** 
 * Dialogue for the Cap'n Hand beta holiday event NPC.
 * @author Chris
 *
 */
public class CapnHand extends Dialogue {
	
public static final int NPC_ID = 3323;
	
	@Override
	public void sendDialogue(Client player, int dialogueId) {
		switch (dialogueId) {
			/*case 0:
				DialogueManager.sendPlayerChat1(player, "This is a test of the new dialogue handling system.", DialogueManager.CALM);
				setNextDialogueId(1);
				break;
			case 1:
				player.getDH().sendNpcChat2(player, NPC_ID, "Nice to meet you.", DialogueManager.CALM,test");
				setNextDialogueId(-1);
				break;*/
		}
	}
	
	@Override
	public void executeOption(Client player, int optionId) {
		switch (optionId) {
			case 0:
				
				break;
		}
	}

}
