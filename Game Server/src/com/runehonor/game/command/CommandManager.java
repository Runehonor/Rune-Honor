package com.runehonor.game.command;

import java.util.HashMap;
import java.util.Map;

import com.runehonor.Constants;
import com.runehonor.game.players.Client;



/** 
 * Stores commands data in the map and manages command executions.
 * @author Chris
 *
 */

public class CommandManager {
	/**
	 * Location for all stored commands.
	 */
	private static final Map<String, Command> commands = new HashMap<String, Command>();
	
	/**
	 * Assigns each command to their own execution command.
	 * @usage: commands.put("command", new Command());
	 */
	public static void load() {
		
		/**
		 * Misc. Commands
		 */
		
		System.out.println("["+Constants.SERVER_NAME+"] Populated " +commands.size() + " commands to map.");
		
	}
	
	/**
	 * Executes and processes a command.
	 * 
	 * @param string
	 * @return command
	 * @param c
	 * @return player
	 */
	public static void execute(final String string, final Client c) {
		final String[] args = string.split(" ");
		final Command command = CommandManager.commands.get(args[0]
				.toLowerCase());
		if (command == null) {
		}

		else {
			if (!command.canExecute(c)) {
			} else {
				command.execute(string, c);
			}
		}
	}

	public static boolean isNumeric(String str) {
		return str.matches("\\d+");
	}


}
