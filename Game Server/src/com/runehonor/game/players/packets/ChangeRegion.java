package com.runehonor.game.players.packets;

import com.runehonor.GameServer;
import com.runehonor.game.players.Client;
import com.runehonor.game.players.PacketType;

public class ChangeRegion implements PacketType {

	@Override
	public void processPacket(Client c, int packetType, int packetSize) {
		if(c.isAttackingGate)
			c.isAttackingGate = false;
		c.clearLists();
		GameServer.objectManager.loadObjects(c);
	}

}
