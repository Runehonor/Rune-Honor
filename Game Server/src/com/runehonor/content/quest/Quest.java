package com.runehonor.content.quest;

import com.runehonor.game.players.*;

/** 
 * Stores data and methods for the quest system.
 * @author Chris
 *
 */
public abstract class Quest {
	
	private int questState = 0;
	private int completedState = 0;
	
	private Client player;
	
	/**
	 * Constructs a new {@code Quest} {@code Object}.
	 * @param player the player.
	 */
	public Quest(Client player) {
		this.player = player;
	}
	
	/** 
	 * Gets whether the quest is complete.
	 * @param quest
	 * @return
	 */
	public boolean isComplete(Quest quest) { 
		if (questState >= completedState) { 
			return true;
		} 
		return false;
	}
	
	/** 
	 * Gets the quest state.
	 * @param quest the quest
	 * @param player the player
	 */
	public int getQuestState(Quest quest, Client player) { 
		return questState;
	}
	
	/** 
	 * Advances the player's quest state.
	 * @param quest
	 */
	public void advanceState(Quest quest) { 
		questState += 1;
	}
	
	/** 
	 * Completes the quest for the player.
	 * @param quest
	 * @param c
	 */
	public void completeQuest(Quest quest, Client c) { 
		if (questState < completedState) { 
			questState += (completedState -= questState);
		}
	}
	
	/** 
	 * Sets the state of a quest.
	 * @param quest the quest
	 * @param c the player
	 * @param questState the state of the quest to set to
	 */
	public void setState(Quest quest, Client c, int questState) { 
		this.questState = questState;
	}
}
