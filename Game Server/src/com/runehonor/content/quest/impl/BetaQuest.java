package com.runehonor.content.quest.impl;

import com.runehonor.content.quest.Quest;
import com.runehonor.game.players.*;

/** 
 * Short beta quest.
 * @author Chris
 *
 */
public class BetaQuest extends Quest {
	
	/**
	 * Constructs a new {@code Beta} {@code Object}.
	 * @param player the player.
	 */
	public BetaQuest(final Client player) {
		super(player);
	}
	 
	private int completedState = 10;
	
	

}
