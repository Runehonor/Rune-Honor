package com.runehonor.game.players.dialogue;

import com.runehonor.game.players.Client;

/** 
 * Stores local data for type dialogue.
 * @author Chris
 *
 */
public abstract class Dialogue {

	private int nextDialogueId = 0;
	
	public abstract void sendDialogue(Client player, int dialogueId);
	
	/** 
	 * Executes the option.
	 * @param player
	 * @param optionId
	 */
	public abstract void executeOption(Client player, int optionId);
	
	/**
	 * Gets the next dialogue id.
	 * @return nextDialogueId
	 */
	public int getNextDialogueId() {
		return nextDialogueId;
	}
	
	/** 
	 * Sets the next dialogue id.
	 * @param nextDialogueId
	 */
	public void setNextDialogueId(int nextDialogueId) {
		this.nextDialogueId = nextDialogueId;
	}
	
}