package com.runehonor.game.npcs;

import com.runehonor.GameServer;
import com.runehonor.event.CycleEvent;
import com.runehonor.event.CycleEventContainer;
import com.runehonor.event.CycleEventHandler;
import com.runehonor.game.players.Client;

public class KalphiteQueen {
	
	public static void spawnSecondForm(Client c, final int i) {
		NPCHandler.npcs[i].gfx0(1055);
		CycleEventHandler.addEvent(c, new CycleEvent() {
			@Override
			public void execute(CycleEventContainer container) {
					container.stop();
			}
			@Override
			public void stop() {
				GameServer.npcHandler.spawnNpc2(1160, NPCHandler.npcs[i].absX, NPCHandler.npcs[i].absY, 0, 1, 230, 45, 500, 300);
			}
		}, 5);
	}
	
	
	/**
	* kq respawn first form
	*/
	public static void spawnFirstForm(Client c, final int i) {
	CycleEventHandler.addEvent(c, new CycleEvent() {
		@Override
		public void execute(CycleEventContainer container) {
				container.stop();
		}
		@Override
		public void stop() {
			GameServer.npcHandler.spawnNpc2(1158, NPCHandler.npcs[i].absX, NPCHandler.npcs[i].absY, 0, 1, 230, 45, 500, 300);
		}
	}, 17);
	}
	
	public static boolean KQnpc(int i) {
		switch (NPCHandler.npcs[i].npcType) {
			case 1158:
			return true;	
		}
		return false;	
	}
	
	public static boolean fullVerac(Client c) {
		return c.playerEquipment[c.playerHat] == 4753 && c.playerEquipment[c.playerLegs] == 4759 && c.playerEquipment[c.playerChest] == 4757 && c.playerEquipment[c.playerWeapon] == 4755;
	}

}
