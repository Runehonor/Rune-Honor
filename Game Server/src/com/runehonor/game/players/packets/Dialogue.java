package com.runehonor.game.players.packets;

import com.runehonor.game.players.Client;
import com.runehonor.game.players.PacketType;


/**
 * Dialogue
 **/
public class Dialogue implements PacketType {

	@Override
	public void processPacket(Client c, int packetType, int packetSize) {
		
		if(c.nextChat > 0) {
			c.getDH().sendDialogues(c.nextChat, c.talkingNpc);
		} else {
			c.teleAction = -1;
			c.dialogueAction = -1;
			c.getDH().sendDialogues(0, -1);
		}
		
	}

}
