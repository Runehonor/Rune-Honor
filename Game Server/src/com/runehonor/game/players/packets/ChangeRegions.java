package com.runehonor.game.players.packets;

import com.runehonor.GameServer;
import com.runehonor.content.music.Music;
import com.runehonor.game.players.Client;
import com.runehonor.game.players.PacketType;

/**
 * Change Regions
 */
public class ChangeRegions implements PacketType {

	@Override
	public void processPacket(Client c, int packetType, int packetSize) {
		//if(!c.mapRegionDidChange)
			//return;
		if(c.isAttackingGate)
			c.isAttackingGate = false;
		Music.playMusic(c);
		GameServer.itemHandler.reloadItems(c);
		c.clearLists();
		GameServer.objectManager.loadObjects(c);
		
		c.saveFile = true;
		
		if(c.skullTimer > 0) {
			c.isSkulled = true;	
			c.headIconPk = 0;
			c.getAssistant().requestUpdates();
		}

	}
		
}
