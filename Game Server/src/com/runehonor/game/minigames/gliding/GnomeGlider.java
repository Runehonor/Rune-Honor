package com.runehonor.game.minigames.gliding;

import com.runehonor.event.CycleEvent;
import com.runehonor.event.CycleEventContainer;
import com.runehonor.event.CycleEventHandler;
import com.runehonor.game.players.Client;

public class GnomeGlider {

	private static final int[][] GLIDER_DATA = { 
		{3058, 2848, 3497, 0, 1}, //  TO MOUNTAIN
		{3057, 2465, 3501, 3, 2}, // TO GRAND TREE
		{3059, 3321, 3427, 0, 3}, // TO CASTLE
		{3060, 3278, 3212, 0, 4}, // TO DESERT
		{3056, 2894, 2730, 0, 8}, // TO CRASH ISLAND
		{48054, 2544, 2970, 0, 10}, // TO OGRE AREA
	};

	public static void flightButtons(Client c, int button) {
		for (int i = 0; i < getLength(); i++) {
			if (getButton(i) == button) {
				handleFlight(c, i);
			}
		}
	}

	public static void handleFlight(final Client c, final int flightId) {
		c.getAssistant().showInterface(802);
		c.getAssistant().sendFrame36(153, getMove(flightId));
		CycleEventHandler.addEvent(c, new CycleEvent() {
			@Override
			public void execute(CycleEventContainer container) {
				c.getAssistant().movePlayer(getX(flightId), getY(flightId),
						getH(flightId));
				container.stop();
			}
			@Override
			public void stop() {

			}
		}, 3);
		CycleEventHandler.addEvent(c, new CycleEvent() {
			@Override
			public void execute(CycleEventContainer container) {
				c.getAssistant().closeAllWindows();
				c.getAssistant().sendFrame36(153, -1);
				container.stop();
			}
			@Override
			public void stop() {

			}
		}, 4);

	}

	public static int getLength() {
		return GLIDER_DATA.length;
	}

	public static int getButton(int i) {
		return GLIDER_DATA[i][0];
	}

	public static int getX(int i) {
		return GLIDER_DATA[i][1];
	}

	public static int getY(int i) {
		return GLIDER_DATA[i][2];
	}

	public static int getH(int i) {
		return GLIDER_DATA[i][3];
	}

	public static int getMove(int i) {
		return GLIDER_DATA[i][4];
	}
}
