package com.runehonor.world;
/*package server.world;

import server.game.players.Client;
import server.game.players.PlayerHandler;
import core.util.Misc;


public class ClanChatHandler {

	public ClanChatHandler() {

	}

	public Clan[] clans = new Clan[100];

	public void handleClanChat(Client c, String name) {
		for (int j = 0; j < clans.length; j++) {
			if (clans[j] != null) {
				if (clans[j].name.equalsIgnoreCase(name)) {
					addToClan(c.playerId, j);
					return;
				}
			}
		}
		makeClan(c, name);
	}

	public void makeClan(Client c, String name) {
		if (openClan() >= 0) {
			if (validName(name)) {
				c.clanId = openClan();
				clans[c.clanId] = new Clan(c, name);
				addToClan(c.playerId, c.clanId);
			} else {
				c.sendMessage("A clan with this name already exists.");
			}
		} else {
			c.sendMessage("Your clan chat request could not be completed.");
		}
	}

	public void updateClanChat(int clanId) {
		for (int j = 0; j < clans[clanId].members.length; j++) {
			if (clans[clanId].members[j] <= 0)
				continue;
			if (PlayerHandler.players[clans[clanId].members[j]] != null) {
				Client c = (Client) PlayerHandler.players[clans[clanId].members[j]];
				c.getPA().sendFrame126(
						"Talking in: @whi@"
								+ Misc.formatPlayerName(clans[clanId].name),
						18139);
				c.getPA().sendFrame126(
						"Owner: @whi@"
								+ Misc.formatPlayerName(clans[clanId].owner),
						18140);
				int slotToFill = 18144;
				for (int i = 0; i < clans[clanId].members.length; i++) {
					if (clans[clanId].members[i] > 0) {
						if (PlayerHandler.players[clans[clanId].members[i]] != null) {
							c.getPA()
									.sendFrame126(
											Misc.formatPlayerName(PlayerHandler.players[clans[clanId].members[i]].playerName),
											slotToFill);
							slotToFill++;
						}
					}
				}
				for (int k = slotToFill; k < 18244; k++)
					c.getPA().sendFrame126("", k);
			}
		}
	}

	public int openClan() {
		for (int j = 0; j < clans.length; j++) {
			if (clans[j] == null || clans[j].owner == "")
				return j;
		}
		return -1;
	}

	public boolean validName(String name) {
		for (int j = 0; j < clans.length; j++) {
			if (clans[j] != null) {
				if (clans[j].name.equalsIgnoreCase(name))
					return false;
			}
		}
		return true;
	}

	public void addToClan(int playerId, int clanId) {
		if (clans[clanId] != null) {
			for (int j = 0; j < clans[clanId].members.length; j++) {
				if (clans[clanId].members[j] <= 0) {
					clans[clanId].members[j] = playerId;
					PlayerHandler.players[playerId].clanId = clanId;
					@SuppressWarnings("unused")
					Client c = (Client) PlayerHandler.players[playerId];
					// c.sendMessage("You have joined the clan chat: " +
					// clans[clanId].name);
					messageToClan(
							Misc.formatPlayerName(PlayerHandler.players[playerId].playerName)
									+ " has joined the channel.", clanId);
					updateClanChat(clanId);
					return;
				}
			}
		}
	}

	public void leaveClan(int playerId, int clanId) {
		if (clanId < 0) {
			Client c = (Client) PlayerHandler.players[playerId];
			c.sendMessage("You are not in a clan.");
			return;
		}
		if (clans[clanId] != null) {
			if (PlayerHandler.players[playerId].playerName
					.equalsIgnoreCase(clans[clanId].owner)) {
				messageToClan("The clan has been deleted by the owner.", clanId);
				destructClan(PlayerHandler.players[playerId].clanId);
				return;
			}
			for (int j = 0; j < clans[clanId].members.length; j++) {
				if (clans[clanId].members[j] == playerId) {
					clans[clanId].members[j] = -1;
				}
			}
			if (PlayerHandler.players[playerId] != null) {
				Client c = (Client) PlayerHandler.players[playerId];
				PlayerHandler.players[playerId].clanId = -1;
				c.sendMessage("You have left the clan.");
				c.getPA().clearClanChat();
			}
			updateClanChat(clanId);
		} else {
			Client c = (Client) PlayerHandler.players[playerId];
			PlayerHandler.players[playerId].clanId = -1;
			c.sendMessage("You are not in a clan.");
		}
	}

	public void destructClan(int clanId) {
		if (clanId < 0)
			return;
		for (int j = 0; j < clans[clanId].members.length; j++) {
			if (clanId < 0)
				continue;
			if (clans[clanId].members[j] <= 0)
				continue;
			if (PlayerHandler.players[clans[clanId].members[j]] != null) {
				Client c = (Client) PlayerHandler.players[clans[clanId].members[j]];
				c.clanId = -1;
				c.getPA().clearClanChat();
			}
		}
		clans[clanId].members = new int[50];
		clans[clanId].owner = "";
		clans[clanId].name = "";
	}

	public void messageToClan(String message, int clanId) {
		if (clanId < 0)
			return;
		for (int j = 0; j < clans[clanId].members.length; j++) {
			if (clans[clanId].members[j] < 0)
				continue;
			if (PlayerHandler.players[clans[clanId].members[j]] != null) {
				Client c = (Client) PlayerHandler.players[clans[clanId].members[j]];
				c.sendMessage("@red@" + message);
			}
		}
	}

	public void playerMessageToClan(int playerId, String message, int clanId) {
		if (clanId < 0)
			return;
		for (int j = 0; j < clans[clanId].members.length; j++) {
			if (clans[clanId].members[j] <= 0)
				continue;
			if (PlayerHandler.players[clans[clanId].members[j]] != null) {
				Client c = (Client) PlayerHandler.players[clans[clanId].members[j]];
				//c.sendClan(
						//Misc.formatPlayerName(PlayerHandler.players[playerId].playerName),
						//Misc.formatPlayerName(message), Misc
						//		.formatPlayerName(clans[clanId].name),
						//PlayerHandler.players[playerId].playerRights);
				c.sendMessage("@red@["+Misc.formatPlayerName(clans[clanId].name)+"]@bla@"+Misc.formatPlayerName(PlayerHandler.players[playerId].playerName)+": "+Misc.formatPlayerName(message)+"");
			}
		}
	}

	public void sendLootShareMessage(int clanId, String message) {
		if (clanId >= 0) {
			for (int j = 0; j < clans[clanId].members.length; j++) {
				if (clans[clanId].members[j] <= 0)
					continue;
				if (PlayerHandler.players[clans[clanId].members[j]] != null) {
					Client c = (Client) PlayerHandler.players[clans[clanId].members[j]];
					c.sendClan("Lootshare", Misc.formatPlayerName(message),
							Misc.formatPlayerName(clans[clanId].name), 2);
				}
			}
		}
	}

	public int[] unallowed = { 592, 530, 526, 536, 1333, 995, 1247, 1089, 1047,
			1319 };

	public void handleLootShare(Client c, int item, int amount) {
		for (int i = 0; i < unallowed.length; i++) {
			if (item == unallowed[i])
				return;
		}
		if (c.getShops().getItemShopValue(item, 1,
				c.getItems().getItemSlot(item)) > 5000)
			sendLootShareMessage(
					c.clanId,
					Misc.formatPlayerName(c.playerName) + " has received "
							+ amount + "x "
							+ server.game.items.Item.getItemName(item)
							+ ". Price: "
							+ (c.getShops().getItemShopValue(item) * amount)
							+ ".");
	}

}*/