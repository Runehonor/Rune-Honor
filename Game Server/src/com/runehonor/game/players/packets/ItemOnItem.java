package com.runehonor.game.players.packets;

/**
 * @author Ryan / Lmctruck30
 */

import com.runehonor.game.items.UseItem;
import com.runehonor.game.players.Client;
import com.runehonor.game.players.PacketType;

public class ItemOnItem implements PacketType {

	@Override
	public void processPacket(Client c, int packetType, int packetSize) {
		int usedWithSlot = c.getInStream().readUnsignedWord();
		int itemUsedSlot = c.getInStream().readUnsignedWordA();
		int useWith = c.playerItems[usedWithSlot] - 1;
		int itemUsed = c.playerItems[itemUsedSlot] - 1;
		if(!c.getItems().playerHasItem(useWith, 1, usedWithSlot) || !c.getItems().playerHasItem(itemUsed, 1, itemUsedSlot)) {
			return;
		}
		UseItem.ItemonItem(c, itemUsed, useWith);
		}
	}

