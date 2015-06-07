package com.runehonor.game.players.packets;

import com.runehonor.Connection;
import com.runehonor.Constants;
import com.runehonor.game.players.Client;
import com.runehonor.game.players.PacketType;
import com.runehonor.game.players.PlayerHandler;

import core.util.Misc;

/**
 * Private messaging, friends etc
 **/
public class PrivateMessaging implements PacketType {

	public final int ADD_FRIEND = 188, SEND_PM = 126, REMOVE_FRIEND = 215, CHANGE_PM_STATUS = 95, REMOVE_IGNORE = 59, ADD_IGNORE = 133;
	@Override
	public void processPacket(Client c, int packetType, int packetSize) {
		switch(packetType) {
		
			case ADD_FRIEND:
			c.friendUpdate = true;
			long friendToAdd = c.getInStream().readQWord();
			boolean canAdd = true;

			for (int i1 = 0; i1 < c.friends.length; i1++) {
				if (c.friends[i1] != 0 && c.friends[i1] == friendToAdd) {
					canAdd = false;
					c.sendMessage(friendToAdd + " is already on your friends list.");
				}
			}
			if (canAdd == true) {
				for (int i1 = 0; i1 < c.friends.length; i1++) {
					if (c.friends[i1] == 0) {
						c.friends[i1] = friendToAdd;
						for (int i2 = 1; i2 < Constants.MAX_PLAYERS; i2++) {
							if (PlayerHandler.players[i2] != null && PlayerHandler.players[i2].isActive && Misc.playerNameToInt64(PlayerHandler.players[i2].playerName)== friendToAdd) {
								Client o = (Client)PlayerHandler.players[i2];
								if(o != null) {
									if (PlayerHandler.players[i2].privateChat == 0 || (PlayerHandler.players[i2].privateChat == 1 && o.getAssistant().isInPM(Misc.playerNameToInt64(c.playerName)))) {
										c.getAssistant().loadPM(friendToAdd, 1);
										break;
									}
								}
							}
						}
						break;
					}
				}
			}
			break;
			
			case SEND_PM:
			long sendMessageToFriendId = c.getInStream().readQWord();
            byte pmchatText[] = new byte[100];
            int pmchatTextSize = (byte) (packetSize - 8);
			c.getInStream().readBytes(pmchatText, pmchatTextSize, 0);
			if (Connection.isMuted(c))
				break;
            for (int i1 = 0; i1 < c.friends.length; i1++) {
                if (c.friends[i1] == sendMessageToFriendId) {
                    boolean pmSent = false;

                    for (int i2 = 1; i2 < Constants.MAX_PLAYERS; i2++) {
                        if (PlayerHandler.players[i2] != null && PlayerHandler.players[i2].isActive && Misc.playerNameToInt64(PlayerHandler.players[i2].playerName)== sendMessageToFriendId) {
                            Client o = (Client)PlayerHandler.players[i2];
							if(o != null) {
								if (PlayerHandler.players[i2].privateChat == 0 || (PlayerHandler.players[i2].privateChat == 1 && o.getAssistant().isInPM(Misc.playerNameToInt64(c.playerName)))) {
									o.getAssistant().sendPM(Misc.playerNameToInt64(c.playerName), c.playerRights, pmchatText, pmchatTextSize);
	                                pmSent = true;
	                            }
							}
                            break;
                        }
                    }
                    if (!pmSent) {
						c.sendMessage("That player is currently offline.");
						break;
                    }
                }
            }
            break;	
			
			
			case REMOVE_FRIEND:
			c.friendUpdate = true;
            long friendToRemove = c.getInStream().readQWord();

            for (int i1 = 0; i1 < c.friends.length; i1++) {
                if (c.friends[i1] == friendToRemove) {
					for (int i2 = 1; i2 < Constants.MAX_PLAYERS; i2++) {
						Client o = (Client)PlayerHandler.players[i2];		
						if(o != null) {
							if(c.friends[i1] == Misc.playerNameToInt64(PlayerHandler.players[i2].playerName)){
								o.getAssistant().updatePM(c.playerId, 0);
								break;
							}
						}
					}
					c.friends[i1] = 0;
                    break;
                }
            }
            break;
			
			case REMOVE_IGNORE:
				@SuppressWarnings("unused")
				int i = c.getInStream().readDWord();
				@SuppressWarnings("unused")
				int i2 = c.getInStream().readDWord();
				@SuppressWarnings("unused")
				int i3 = c.getInStream().readDWord();
				//for other status changing
				//c.getPA().handleStatus(i,i2,i3);
            break;
			
			case CHANGE_PM_STATUS:
            @SuppressWarnings("unused")
			int tradeAndCompete = c.getInStream().readUnsignedByte();
            c.privateChat = c.getInStream().readUnsignedByte();
            @SuppressWarnings("unused")
			int publicChat = c.getInStream().readUnsignedByte();
            for (int i1 = 1; i1 < Constants.MAX_PLAYERS; i1++) {
			   if (PlayerHandler.players[i1] != null && PlayerHandler.players[i1].isActive == true) {
                    Client o = (Client)PlayerHandler.players[i1];
					if(o != null) {
						o.getAssistant().updatePM(c.playerId, 1);
					}
                }
            }
            break;
			
			
			
			case ADD_IGNORE:
				//TODO: fix this so it works :)
				break;
            
		}
		
	}	
}
