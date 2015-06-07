package com.runehonor.game.players.packets;

import com.runehonor.game.players.Client;
import com.runehonor.game.players.PacketType;

/**
 * Trading
 */
public class Trade implements PacketType {

	@Override
	public void processPacket(Client c, int packetType, int packetSize) {
		int tradeId = c.getInStream().readSignedWordBigEndian();
		c.getAssistant().resetFollow();
		if(tradeId < 1)
			return;
		if(c.arenas()) {
			c.sendMessage("You can't trade inside the arena!");
			return;
		}
		if (tradeId != c.playerId)
			c.getTradeAndDuel().requestTrade(tradeId);
	}
		
}
