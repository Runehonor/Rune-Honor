package com.runehonor.game.players.dialogue.impl;

import com.runehonor.game.players.Client;
import com.runehonor.game.players.dialogue.*;

/** 
 * A dialogue for the Hans NPC.
 * @author Chris
 *
 */
public class Hans extends Dialogue {

	public static final int NPC_ID = 0;
	
	@Override
	public void sendDialogue(Client player, int dialogueId) {
		switch (dialogueId) {
			/*case 0:
				DialogueManager.sendPlayerChat1(player, "Hello!", DialogueManager.CALM);
				setNextDialogueId(1);
				break;
			case 1:
				DialogueManager.sendNpcChat1(player, NPC_ID, "Nice to meet you.", DialogueManager.CALM);
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