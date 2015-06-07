package com.runehonor.game.players.packets;

import com.runehonor.Constants;
import com.runehonor.GameServer;
import com.runehonor.game.players.Client;
import com.runehonor.game.players.PacketType;
import com.runehonor.game.players.PlayerHandler;
import com.runehonor.world.Clan;

import core.util.Misc;

public class JoinChat implements PacketType {
	@Override
	public void processPacket(Client paramClient, int paramInt1, int paramInt2) {
		String str = Misc.longToPlayerName2(
				paramClient.getInStream().readQWord()).replaceAll("_", " ");
		if ((str != null) && (str.length() > 0) && (paramClient.clan == null)) {
			Clan localClan = GameServer.clanManager.getClan(str);
			if (localClan != null)
				localClan.addMember(paramClient);
			else if (str.equalsIgnoreCase(paramClient.playerName))
				GameServer.clanManager.create(paramClient);
			else {
				paramClient.sendMessage(Misc.formatPlayerName(str)
						+ " has not created a clan yet.");
			}
		}
		
		switch (paramClient.xInterfaceId) { 
		case 5735: 
			for (int i = 0; i < Constants.MAX_PLAYERS; i++) {
				if (PlayerHandler.players[i] != null) {
					if (PlayerHandler.players[i].playerName.equalsIgnoreCase(str)) {
						paramClient.getAssistant().movePlayer(PlayerHandler.players[i].getX(), PlayerHandler.players[i].getY(), PlayerHandler.players[i].heightLevel);
					}
				}
			}	
			break;
		}
	}
}