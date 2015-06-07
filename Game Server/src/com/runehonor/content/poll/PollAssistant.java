package com.runehonor.content.poll;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import com.runehonor.event.CycleEvent;
import com.runehonor.event.CycleEventContainer;
import com.runehonor.event.CycleEventHandler;
import com.runehonor.game.players.Client;
import com.runehonor.game.players.Player;
import com.runehonor.game.players.PlayerHandler;

import core.util.Misc;
/**
 * 
 * @author Jason http://www.rune-server.org/members/jason
 * @date Mar 10, 2014
 */
public class PollAssistant {
	
	static PollAssistant assistant = new PollAssistant();
	public static final int REQUIRED_HOURS = 3;
	public static final int MAX_OPTIONS = 4;
	static final String PATH = "./Data/polls/";
	static ArrayList<Poll> polls = new ArrayList<Poll>();
	static String[] suggestions = new String[1000];
	public static Poll currentPoll;
	
	public static void initialize() {
		read();
		currentPoll = getPoll("content poll 1");
		createEvent();
	}
	
	static void createEvent() {
		CycleEventHandler.stopEvents(assistant);
		if(polls.size() == 0) {
			currentPoll = null;
			return;
		}
		CycleEventHandler.addEvent(assistant, new CycleEvent() {

			@Override
			public void execute(CycleEventContainer container) {
				if(polls.size() == 0) {
					currentPoll = null;
					container.stop();
					return;
				}
				Poll poll = null;
				int attempts = 0;
				while(poll == null) {
					Poll temp = null;
					attempts++;
					if(attempts > 25)
						break;
					temp = polls.get(Misc.random(polls.size() - 1));
					if(temp != currentPoll || currentPoll == null)
						poll = temp;
				}
				if(poll != null)
					currentPoll = poll;
				if(currentPoll != null) {
					for(Player player : PlayerHandler.players) {
						if(player != null) {
							Client p = (Client) player;
							p.sendMessage("<img=7><col=ff0000>Poll: "+currentPoll.getQuestion());
						}
					}
				} else 
					container.stop();
				
			}

			@Override
			public void stop() {
				// TODO Auto-generated method stub
				
			}
			
		}, 12000);
	}
	
	public static Poll getPoll(String name) {
		for(Poll poll : polls)
			if(poll != null && poll.getName().equalsIgnoreCase(name))
				return poll;
		return polls.get(0);
	}
	
	public static void setPoll(Client player, String name) {
		boolean found = false;
		for(Poll poll : polls) {
			if(poll != null) {
				if(poll.getName().equalsIgnoreCase(name)) {
					currentPoll = poll;
					player.sendMessage("The current poll has been set to: "+name);
					found = true;
					break;
				}
			}
		}
		if(!found)
			player.sendMessage("The poll cannot be found thus the current poll has not changed.");
	}
	
	public static void listPollNames(Client player) {
		for(Poll poll : polls) {
			if(poll != null)
				player.sendMessage("[Name] '"+poll.getName()+"' [Question] "+poll.getQuestion());
		}
	}
	
	public static void write(Poll poll) {
		try {
			File file = new File(PATH + poll.getName());
			if(!file.exists()) {
				file.createNewFile();
			}
			try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
				writer.write("Name: "+poll.getName());
				writer.newLine();
				writer.write("Question: "+poll.getQuestion());
				writer.newLine();
				for(int i = 0; i < poll.getOptions().length; i++) {
					writer.write("Option ("+(i + 1)+") = "+poll.getOptions()[i]);
					writer.newLine();
				}
				writer.newLine();
				writer.write("POLL VOTERS");
				writer.newLine();
				writer.newLine();
				for(Vote vote : poll.getVotes()) {
					if(vote != null) {
						writer.write("vote = "+vote.getOption()+"\t"+vote.getName());
						writer.newLine();
					}
				}
				writer.close();
			}
		} catch (Exception e) { 
			e.printStackTrace();
		}
	}
	
	public static void read() {
		try {
			File[] folder = new File(PATH).listFiles();
			for(File file : folder) {
				if(file != null) {
					String line = null;
					String name = null;
					String question = null;
					HashMap<Integer, String> options = new HashMap<Integer, String>();
					Poll poll = new Poll();
					try (BufferedReader read = new BufferedReader(new FileReader(file))) {
						while((line = read.readLine()) != null) {
							String line2 = line.toLowerCase();
							if(line2.startsWith("name"))
								name = line.substring(6);
							else if(line2.startsWith("question"))
								question = line.substring(10);
							else if(line2.startsWith("option")) {
								int optionId = Integer.parseInt(line.substring(8, 9)) - 1;
								String option = line.substring(line.indexOf("=") + 1);
								options.put(optionId, option);
							} else if(line2.startsWith("vote")) {
								line = line.substring(7);
								String[] contents = line.split("\t");
								int option = Integer.parseInt(contents[0]);
								String voteName = contents[1];
								poll.addVote(new Vote(voteName, option));
							}
						}
						poll.setName(name);
						poll.setQuestion(question);
						for(Entry<Integer, String> entry : options.entrySet()) {
							poll.setOptions(entry.getKey(), entry.getValue());
						}
						polls.add(poll);
						read.close();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void writeSuggestion(String playerName, String title, String option1, String option2, String option3, String option4) {
		try {
			File file = new File("./Data/pollsuggestions/"+title);
			file.createNewFile();
			try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File("./Data/pollsuggestions/"+title)))) {
				writer.write("Suggested by: "+playerName); writer.newLine();
				writer.write("Title: "+title); writer.newLine();
				writer.write("Option 1: "+option1); writer.newLine();
				writer.write("Option 2: "+option2); writer.newLine();
				writer.write("Option 3: "+option3); writer.newLine();
				writer.write("Option 4: "+option4); writer.newLine();
				writer.close();
			}
		} catch (Exception e) { 
			e.printStackTrace();
		}
	}

}
