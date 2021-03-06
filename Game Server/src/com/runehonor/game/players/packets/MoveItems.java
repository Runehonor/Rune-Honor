package com.runehonor.game.players.packets;

import com.runehonor.game.players.Client;
import com.runehonor.game.players.PacketType;

/**
 * Move Items
 **/
public class MoveItems implements PacketType {

	@Override
	public void processPacket(Client c, int packetType, int packetSize) {
		int somejunk = c.getInStream().readUnsignedWordA(); //junk
		int itemFrom =  c.getInStream().readUnsignedWordA();// slot1
		int itemTo = (c.getInStream().readUnsignedWordA() -128);// slot2
		//c.sendMessage("junk: " + somejunk);
		if(c.inTrade) {
                             		return;
                        	}
		if(c.tradeStatus == 1) {
                             		return;
                        	}
		if(c.duelStatus == 1) {
			return;
		}
		c.getItems().moveItems(itemFrom, itemTo, somejunk);
	}
}
