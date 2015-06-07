package com.runehonor.content.poll;

import com.runehonor.game.players.Client;
/**
 * 
 * @author Jason http://www.rune-server.org/members/jason
 * @date Mar 10, 2014
 */
public class Poll {
	
	private String question;
	private String name;
	private String[] options;
	private Vote[] votes = new Vote[5000];
	
	public Poll() {
		this.name = null;
		this.question = null;
		this.options = new String[PollAssistant.MAX_OPTIONS];
	}
	
	public Poll(String name, String question, String[] options) {
		this.setName(name);
		this.setQuestion(question);
		this.setOptions(options);
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOptions()[] {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}
	
	public void setOptions(int option, String name) {
		if(option > (this.getOptions().length - 1))
			return;
		this.options[option] = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean addVote(Client player, Vote vote) {
		if(player == null || vote == null || PollAssistant.currentPoll == null) {
			player.sendMessage("The polling system is closed right now, please come back later.");
			return false;
		}
		for(Vote v : votes) {
			if(v != null) {
				if(v.getName().equalsIgnoreCase(vote.getName())) {
					player.sendMessage("You have already voted in this poll!");
					return false;
				}
			}
		}
		if(player.pTime < (6000 * PollAssistant.REQUIRED_HOURS)) {
			//player.sendMessage("You must have played for at least 3 hours ingame to vote on this poll.");
			//return false;
		}
		for(int i = 0; i < votes.length; i++) {
			if(votes[i] == null) {
				votes[i] = vote;
				player.sendMessage("You have voted "+vote.getOption()+". Thank-you for your input.");
				break;
			}
		}
		PollAssistant.write(PollAssistant.currentPoll);
		return true;
	}
	
	public void addVote(Vote vote) {
		for(int i = 0; i < votes.length; i++) {
			if(votes[i] == null) {
				votes[i] = vote;
				break;
			}
		}
	}
	
	public Vote[] getVotes() {
		return votes;
	}
	
	public int getVoteAmount(int option) {
		int voteAmount = 0;
		for(Vote v : votes) {
			if(v != null && v.getOption() == option)
				voteAmount++;
		}
		return voteAmount;
	}

}
