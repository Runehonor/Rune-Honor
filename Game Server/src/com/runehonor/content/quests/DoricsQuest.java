package com.runehonor.content.quests;

import com.runehonor.game.players.Client;

/**
* Doric's Quest
* @author Acquittal
*/

public class DoricsQuest {

	public Client client;
	
	public DoricsQuest(Client client) {
		this.client = client;
	}
	public void doricReward() {
		client.getAssistant().sendFrame126("You have completed Doric's Quest!" ,12144);
		client.getAssistant().sendFrame126(""+(client.questPoints) ,12147);
		client.questPoints += 1;
		client.getAssistant().sendFrame126("You are awarded:" ,12150);
		client.getAssistant().sendFrame126("180 coins." ,12151);
		client.getAssistant().sendFrame126("1300 mining experience." ,12152);
		client.getAssistant().sendFrame126("The ability to use Doric's anvils." ,12153);
		client.getAssistant().sendFrame126("1 bronze pickaxe." ,12154);
		client.getPlayerAssistant().sendFrame246(12145, 250, 1265);
		client.getAssistant().showInterface(12140);
		client.getItems().addItem(995, 180);
		client.getItems().addItem(1265, 1);
		client.getAssistant().addSkillXP(1300, 14);
		client.doricQuest = 100;
	}
	
	public void showInformation() {
		for(int i = 8144; i < 8195; i++) {
			client.getAssistant().sendFrame126("", i);
		}
		client.getAssistant().sendFrame126("@dre@Doric's Quest", 8144);
		client.getAssistant().sendFrame126("", 8145);
		if(client.doricQuest == 0) {
			client.getAssistant().sendFrame126("To start the quest, you should talk with Doric", 8147);
			client.getAssistant().sendFrame126("He is in his home north of Falador.", 8148);
			client.getAssistant().sendFrame126("A mining level of 15 is reccomended.", 8149);
		} else if(client.doricQuest == 5) {
			client.getAssistant().sendFrame126("@str@To start the quest, you should talk with Doric", 8147);
			client.getAssistant().sendFrame126("@str@He is in his home north of Falador.", 8148);
			client.getAssistant().sendFrame126("", 8149);
			client.getAssistant().sendFrame126("Doric has asked you to get the following materials:", 8150);
			client.getAssistant().sendFrame126("6 lumps of clay", 8151);
			client.getAssistant().sendFrame126("4 copper ores", 8152);
			client.getAssistant().sendFrame126("2 iron ores", 8153);
		} else if(client.cooksA == 2) {
			client.getAssistant().sendFrame126("@str@To start the quest, you should talk with Doric", 8147);
			client.getAssistant().sendFrame126("@str@He is in his home north of Falador.", 8148);
			client.getAssistant().sendFrame126("", 8149);
			client.getAssistant().sendFrame126("@str@Doric has asked you to get the following materials:", 8150);
			client.getAssistant().sendFrame126("@str@6 lumps of clay", 8151);
			client.getAssistant().sendFrame126("@str@4 copper ores", 8152);
			client.getAssistant().sendFrame126("@str@2 iron ores", 8153);
		} else if(client.doricQuest == 100) {
			client.getAssistant().sendFrame126("@str@To start the quest, you should talk with Doric", 8147);
			client.getAssistant().sendFrame126("@str@He is in his home north of Falador.", 8148);
			client.getAssistant().sendFrame126("", 8149);
			client.getAssistant().sendFrame126("@str@Doric has asked you to get the following materials:", 8150);
			client.getAssistant().sendFrame126("@str@6 lumps of clay", 8151);
			client.getAssistant().sendFrame126("@str@4 copper ores", 8152);
			client.getAssistant().sendFrame126("@str@2 iron ores", 8153);
			client.getAssistant().sendFrame126("", 8154);
			client.getAssistant().sendFrame126("You have completed this quest!", 8155);
		}
		client.getAssistant().showInterface(8134);
	}
	
}
