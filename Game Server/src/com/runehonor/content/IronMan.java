package com.runehonor.content;

import com.runehonor.game.players.Player;


/** 
 * Stores data and methods for IronMan mode.
 * @author Chris
 * @reference http://2007.runescape.wikia.com/wiki/Ironman_Mode
 *
 */
public class IronMan {
	
	/** 
	 * Ironman players are not able to do the following:
		Trade with other players (except certain quest items from Shield of Arrav and Heroes Quest)
		Picking up drops from other players kills, including PvP
		No experience gain from Player-versus-player encounters (base magic experience from casting spells is still gained)
		See monster drops if the monster isn't dealt 100% damage
		Buy items from other players through shops
		Play the Fishing Trawler minigame
		Receive items via balloons in the Falador Party Room
		Staking in the Duel Arena
		Play Nightmare Zone (only solo mode, and cannot purchase resources from the reward chest)
	 */
	public IronMan(Player p) { 
		
	}
	
	public static String ironTrade = "You are an Iron Man. You stand alone.";
	
	private void setIronMan(Player p) { 
		//c.ironMan = true;
		//TODO: Local player variable & implementation.
	}

}
