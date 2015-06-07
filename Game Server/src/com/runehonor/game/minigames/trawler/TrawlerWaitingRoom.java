package com.runehonor.game.minigames.trawler;

import com.runehonor.content.IronMan;
import com.runehonor.content.PlayerClass;
import com.runehonor.game.players.Location;
import com.runehonor.game.players.Player;

public class TrawlerWaitingRoom extends WaitingRoom {

	private Trawler trawler;
	private Location boat = new Location(2668,2674,3165,3185);
	//private Location boat = new Location(2808, 2811,3415,3425);
	
	
	public TrawlerWaitingRoom(Trawler trawler) {
		super(2, 1);
		this.trawler = trawler;
	}

	@Override
	public boolean startGame() {
		if(trawler.inProgress()) {
			return false;
		}
		if(waiting.size() < minimumPlayers) {
			return false;
		}
		return true;
	}

	@Override
	public void onStart() {
		trawler.players.clear();
		/*for(Iterator<Player> i = waiting.iterator(); i.hasNext();) {
		    Player p = i.next(); 
		    if(!boat.playerInArea(p)) {
		        i.remove(); // Allowed with an iterator
		    }
		}*/
	
		for(Player p : waiting) {
			trawler.players.add(p);
		}
		
		trawler.start();
		waiting.clear();
	}

	@Override
	public void onLeave(Player p) {
		//p.asClient().getPA().movePlayer(2804, 3421, 0);
		p.asClient().getAssistant().movePlayer(2676, 3170, 0);
	}

	@Override
	public void onJoin(Player p) {
		if (p.classType == PlayerClass.IRONMAN) { 
			p.asClient().sendMessage(IronMan.ironTrade);
			return;
		}
		p.asClient().getAssistant().movePlayer(2672, 3170, 1);
		if(!isActive()) {
			p.asClient().sendMessage(trawler.getGameTime() == 0 ? "The trawler will be returning in less than a minute!" : "The trawler will return in "+trawler.getGameTime() + (trawler.getGameTime() == 1 ? " minute" : " minutes")+"!");
		} else {
			p.asClient().sendMessage(getTimeRemaining() == 0 ? "The trawler will be leaving in less than a minute!" : "The trawler will leave in "+ getTimeRemaining() + (getTimeRemaining() == 1 ? " minute" : " minutes")+"!");
		}
	}

	@Override
	public Location getLocation() {
		return boat;
	}

	@Override
	public void onTimeChange() {
		for(Player p : waiting) {
			if(!isActive()) {
				p.asClient().sendMessage(trawler.getGameTime() == 0 ? "The trawler will be returning in less than a minute!" : "The trawler will return in "+trawler.getGameTime() + (trawler.getGameTime() == 1 ? " minute" : " minutes")+"!");
			} else {
				p.asClient().sendMessage(getTimeRemaining() == 0 ? "The trawler will be leaving in less than a minute!" : "The trawler will leave in "+ getTimeRemaining() + (getTimeRemaining() == 1 ? " minute" : " minutes")+"!");
			}
		}
	}

	@Override
	public boolean canStart() {
		if(trawler.inProgress()) {
			return false;
		}
		if(waiting.size() < minimumPlayers) {
			return false;
		}
		return true;
	}

}

