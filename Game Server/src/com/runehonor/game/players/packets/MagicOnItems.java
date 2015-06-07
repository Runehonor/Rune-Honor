package com.runehonor.game.players.packets;

import com.runehonor.game.players.Client;
import com.runehonor.game.players.PacketType;


/**
 * Magic on items
 **/
public class MagicOnItems implements PacketType {

	@Override
	public void processPacket(Client c, int packetType, int packetSize) {
		int slot = c.getInStream().readSignedWord();
		int itemId = c.getInStream().readSignedWordA();
		@SuppressWarnings("unused")
		int junk = c.getInStream().readSignedWord();
		int spellId = c.getInStream().readSignedWordA();
		if(!c.getItems().playerHasItem(itemId, 1, slot))
			return;
		c.usingMagic = true;
		c.getAssistant().magicOnItems(slot, itemId, spellId);
		c.usingMagic = false;

	}

}
