package com.runehonor.game.pvp;

import com.runehonor.game.players.Client;

/** 
 * Contains data for the Pk Point system
 * @author Chris
 *
 */
public class PkPoints {
	
	private int pkPoints = 0;
	
	/** 
	 * Increments the PK-Points.
	 * @param c the client
	 * @param pkPoints the pkpoints to increment by
	 */
	public void incrementPkP(Client c, int pkPoints) { 
		this.pkPoints += pkPoints;
	}
	
	/** 
	 * Decrements the PK-Points.
	 * @param c the client
	 * @param pkPoints the pkpoints to decrement by
	 */
	public void decrementPkP(Client c, int pkPoints) {
		this.pkPoints -= pkPoints;
	}
	
	/** 
	 * Sets the PK-Points.
	 * @param c
	 * @param pkpoints
	 */
	public void setPkP(Client c, int pkpoints) { 
		this.pkPoints = pkPoints;
	}

}
