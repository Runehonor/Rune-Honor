package com.runehonor.game.command;

import com.runehonor.game.players.Client;

/** 
 * A command interface; represents a command in the hashmap. 
 * @author Chris
 *
 */

public interface Command {
/** 
 * Executes a command.
 */
	public void execute(String command, Client c);
	
/** 
 * Validates that the user has clearance to execute the command.
 * 
 * @param command 
 * @return c
 * @return
 */
	public boolean canExecute(Client c);
}
