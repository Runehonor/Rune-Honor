package com.runehonor.content.poll;

import java.text.DecimalFormat;

import com.runehonor.game.players.Client;
/**
 * 
 * @author Jason http://www.rune-server.org/members/jason
 * @date Mar 10, 2014
 */
public class PollInterface {
	
	public static void open(Client player) {
		if(PollAssistant.currentPoll == null) {
			player.sendMessage("The poll is currently closed, please come back later.");
			return;
		}
		player.pollOption = 0;
		update(player);
		player.getAssistant().showInterface(45000);
	}
	
	public static void clickButton(Client player, int buttonId) {
		if(PollAssistant.currentPoll == null) {
			player.sendMessage("The poll is currently closed, please come back later.");
			return;
		}
		switch(buttonId) {
			case 175206:
				player.pollOption = 1;
				break;
			case 175207:
				player.pollOption = 2;
				break;
			case 175208:
				if(PollAssistant.currentPoll.getOptions().length > 2
						&& PollAssistant.currentPoll.getOptions()[2] != null
							&& !PollAssistant.currentPoll.getOptions()[2].contains("null"))
					player.pollOption = 3;
				else
					player.sendMessage("This option is not available.");
				break;
			case 175209:
				if(PollAssistant.currentPoll.getOptions().length > 3
						&& PollAssistant.currentPoll.getOptions()[3] != null
							&& !PollAssistant.currentPoll.getOptions()[3].contains("null"))
					player.pollOption = 4;
				else
					player.sendMessage("This option is not available.");
				break;
				
			case 175215:
				if(player.pollOption > PollAssistant.currentPoll.getOptions().length) {
					player.sendMessage("This option is not available.");
					return;
				}
				if(player.pollOption == 0) {
					player.sendMessage("Please select an option by clicking on the text first.");
					return;
				}
				PollAssistant.currentPoll.addVote(player, new Vote(player.playerName, player.pollOption));
				break;
				
			case 175219:
				player.sendMessage("This is currently disabled until further notice.");
				/*player.pollTitle = "Click to edit";
				player.pollOption1 = "Click to edit";
				player.pollOption2 = "Click to edit";
				player.pollOption3 = "Click to edit";
				player.pollOption4 = "Click to edit";
				player.getPA().sendFrame126(player.pollTitle, 45211);
				player.getPA().sendFrame126(player.pollOption1, 45212);
				player.getPA().sendFrame126(player.pollOption2, 45213);
				player.getPA().sendFrame126(player.pollOption3, 45214);
				player.getPA().sendFrame126(player.pollOption4, 45215);
				player.getPA().showInterface(45200);*/
				break;
				
			case 176163:
				player.getAssistant().showInterface(45000);
				break;
				
			case 176160:
				player.sendMessage("This is currently disabled until further notice.");
				/*if(System.currentTimeMillis() - player.lastPollSuggestion < 21600000) {
					player.sendMessage("You can only create a poll suggestion every 6 hours.");
					return;
				}
				if(player.pollTitle.isEmpty() || player.pollTitle.equalsIgnoreCase("Click to edit")) {
					player.sendMessage("The poll title must be edited.");
					return;
				}
				if(player.pollOption1.length() < 2 || player.pollOption2.length() < 2) {
					player.sendMessage("Options 1 & 2 must contain atleast 2 characters.");
					return;
				}
				if(player.pollOption1.equalsIgnoreCase("Click to edit") 
						|| player.pollOption2.equalsIgnoreCase("Click to edit") || player.pollOption1.isEmpty() || player.pollOption2.isEmpty()) {
					player.sendMessage("Options 1 & 2 must be edited.");
					return;
				}
				player.lastPollSuggestion = System.currentTimeMillis();
				PollAssistant.writeSuggestion(player.playerName,
						player.pollTitle,
						player.pollOption1,
						player.pollOption2,
						player.pollOption3,
						player.pollOption4
				);
				player.sendMessage("Your suggestion has been sent, thank you for taking the time to voice your thoughts.", 255);*/
				
				break;
				
			case 176155:
			case 176156:
			case 176157:
			case 176158:
			case 176159:
				if(buttonId == 176155)
					player.pollLineEdit = 1;
				else if(buttonId == 176156)
					player.pollLineEdit = 2;
				else if(buttonId == 176157)
					player.pollLineEdit = 3;
				else if(buttonId == 176158)
					player.pollLineEdit = 4;
				else if(buttonId == 176159)
					player.pollLineEdit = 5;
				player.getOutStream().createFrame(188);
				player.flushOutStream();
				break;
		}
		update(player);
	}
	
	public static void update(Client player) {
		if(PollAssistant.currentPoll == null)
			return;
		Poll poll = PollAssistant.currentPoll;
		player.getAssistant().sendFrame126(poll.getQuestion(), 45002);
		player.getAssistant().sendFrame126("Option 1: "+poll.getOptions()[0], 45006);
		player.getAssistant().sendFrame126("Option 2: "+poll.getOptions()[1], 45007);
		if(poll.getOptions().length > 2 
				&& poll.getOptions()[2] != null
					&& !poll.getOptions()[2].contains("null"))
			player.getAssistant().sendFrame126("Option 3: "+poll.getOptions()[2], 45008);
		else
			player.getAssistant().sendFrame126("", 45008);
		if(poll.getOptions().length > 3
				&& poll.getOptions()[3] != null
					&& !poll.getOptions()[3].contains("null"))
			player.getAssistant().sendFrame126("Option 4: "+poll.getOptions()[3], 45009);
		else
			player.getAssistant().sendFrame126("", 45009);
		if(player.pollOption > 0)
			player.getAssistant().sendFrame126("@gre@Option "+player.pollOption+": "+poll.getOptions()[player.pollOption - 1], 45005 + player.pollOption);
		double votes[] = {
			poll.getVoteAmount(1),
			poll.getVoteAmount(2),
			poll.getVoteAmount(3),
			poll.getVoteAmount(4)	
		};
		DecimalFormat format = new DecimalFormat("#.##");
		int total = 0;
		for(double i : votes)
			total += i;
		double modifier = 100.0 / total;
		for(int i = 0; i < votes.length; i++) {
			votes[i] = votes[i] * modifier;
		}
		player.getAssistant().sendFrame126(votes[0] > 0 ? format.format(votes[0]) + "%" : "0%", 45010);
		player.getAssistant().sendFrame126(votes[1] > 0 ? format.format(votes[1]) + "%" : "0%", 45011);
		if(poll.getOptions().length > 2
				&& poll.getOptions()[2] != null
					&& !poll.getOptions()[2].contains("null"))
			player.getAssistant().sendFrame126(votes[2] > 0 ? format.format(votes[2]) + "%" : "0%", 45012);
		else
			player.getAssistant().sendFrame126("", 45012);
		if(poll.getOptions().length > 3
				&& poll.getOptions()[3] != null
					&& !poll.getOptions()[3].contains("null"))
			player.getAssistant().sendFrame126(votes[3] > 0 ? format.format(votes[3]) + "%" : "0%", 45013);
		else
			player.getAssistant().sendFrame126("", 45013);
		player.getAssistant().sendFrame126("<col=FFFFFF>Votes: "+total, 45018);
	}

}
