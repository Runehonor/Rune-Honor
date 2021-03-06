package com.runehonor.game.minigames.trawler;

import java.util.ArrayList;

import com.runehonor.event.CycleEvent;
import com.runehonor.event.CycleEventContainer;
import com.runehonor.event.CycleEventHandler;
import com.runehonor.game.players.Location;
import com.runehonor.game.players.Player;

public abstract class WaitingRoom {
	
	public int minimumPlayers;
	public ArrayList<Player> waiting = new ArrayList<Player>();
	private int wait_time;
	private int minutes_remaining;
	private boolean active;
	
	public abstract Location getLocation();
	public abstract boolean startGame();
	public abstract void onStart();
	public abstract void onLeave(Player p);
	public abstract void onJoin(Player p);
	public abstract void onTimeChange();
	public abstract boolean canStart();
	
	public WaitingRoom(int minutes, int minimum) {
		this.wait_time = minutes;
		this.minimumPlayers = minimum;
		this.minutes_remaining = wait_time;
		if(!firstStarted){
			startWaiting();
		} else {
			return;
		}
	}
	
	public void join(Player p) {
		if(!waiting.contains(p)) {
			onJoin(p);
			waiting.add(p);
		}
	}
	
	public void leave(Player p) {
		if(waiting.contains(p)) {
			onLeave(p);
			waiting.remove(p);
		}
	}
	
	public void reset() {
		minutes_remaining = wait_time;
		//startWaiting();
	}
	public static boolean firstStarted = false;
	
	public void startWaiting() {
		if(isActive()) {
			return;
		}
		setActive(true);
		CycleEventHandler.addEvent(100, this, new CycleEvent() {
			@Override
			public void execute(CycleEventContainer container) {
				firstStarted = true;
				if(minutes_remaining != 0) {
					minutes_remaining--;
					onTimeChange();
				} else {
					if(startGame()) {
						onStart();
						reset();
						setActive(false);
						container.stop();
					} else {
						messageWaiting("A minimum of "+minimumPlayers+" players are needed to start this minigame!");
						reset();
						startWaiting();
					}
				}
			}

			@Override
			public void stop() {

			}
		}, 80);
	}
	
	
	public void messageWaiting(String message) {
		for(Player p : waiting) {
			if(p != null) {
				p.asClient().sendMessage(message);
			}
		}
	}
	
	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public int getTimeRemaining() {
		return minutes_remaining;
	}
	
	
}

