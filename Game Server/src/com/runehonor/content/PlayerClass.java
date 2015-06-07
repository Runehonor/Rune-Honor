package com.runehonor.content;

import com.runehonor.game.players.Client;

/**
 * Represents player class types.
 * @author Chris
 *
 */
public enum PlayerClass {
	
	DEFAULT(0),
	ADVENTURER(1),
	PKER(2),
	SKILLER(3),
	IRONMAN(4);
	
	private int classID;
	
	/** 
	 * Constructs a new { @Code PlayerClass }.
	 * @param classID the identification integer for the class
	 */
	private PlayerClass(int classID) { 
		//this.formatString = nameString;
		this.classID = classID;
	}
	
	/** 
	 * Gets the id of the class type.
	 * @param classtype
	 * @return classID the identification number of the class.
	 */
	public int getID(PlayerClass classtype) { 
		return classID;
	}
	
	/** 
	 * Parses a specified integer to a PlayerClass value.
	 * @param x
	 * @return the class type
	 */
	public static PlayerClass parseInt(String x) {
        switch(x) {
        case "0":
            return DEFAULT;
        case "1":
            return ADVENTURER;
        case "2": 
        	return PKER;
        case "3": 
        	return SKILLER;
        case "4": 
        	return IRONMAN;
        }
        return null;
    }

}
