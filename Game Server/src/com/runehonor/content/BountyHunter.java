package com.runehonor.content;

import com.runehonor.game.players.Client;

/** 
 * Variables that remain constant for Bounty Hunter-based content.
 * @author Chris
 *
 */
public class BountyHunter {
	
	private static Client c;
	
	public static int interfaceId = 45190;
	
	/** 
	 * Opens the Bounty Hunter shop.
	 */
	public static void openBHShop() { 
		//c.getPA().showInterface(interfaceId);
		c.getShops().openShop(82);
		c.getAssistant().walkableInterface(interfaceId);
	}

}
