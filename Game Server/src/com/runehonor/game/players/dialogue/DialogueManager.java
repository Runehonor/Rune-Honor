package com.runehonor.game.players.dialogue;


/** 
 * Manages in-game NPC interactions.
 * @author Chris
 *
 */
public class DialogueManager {
	
	/** 
	 * Stores component id's to stream to the client interface.
	 * @author Chris
	 *
	 */
	private enum Emote { 
		CONFUSED(9827), CALM(9760), CRYING(9765), SHY(9770),
		SAD(9775), SCARED(9780), MAD(9785), ANGRY(9760), CRAZY(9795),
		CRAZY_2(9000), SAYS_NOTHING(9805), JUST_TALKS_NO_ANIMATION(9810), YEAH(9815),
		DISGUSTED(9820), NOWAY(9823), DRUNK(9835), LAUGH(9840),
		HEAD_SWAY_TALK(9845), HAPPY_TALK(9850), STIFF(9855), STIFF_EYES_MOVE(9860),
		PRIDEFULL(9865), DEMENTED(9870);
		
		private int componentId;
		
		/** 
		 * Constructs a new { @Code componentId }
		 * @param componentId the component's id to stream to the interface
		 */
		private Emote(int componentId) { 
			this.componentId = componentId;
		}
	}
	
	public static final int 
	HAPPY = 588, CALM = 589, CALM_CONTINUED = 590, CONTENT = 591, EVIL = 592, 
	EVIL_CONTINUED = 593, DELIGHTED_EVIL = 594, ANNOYED = 595, DISTRESSED = 596, 
	DISTRESSED_CONTINUED = 597, NEAR_TEARS = 598,SAD = 599, DISORIENTED_LEFT = 600, 
	DISORIENTED_RIGHT = 601, UNINTERESTED = 602, SLEEPY = 603, PLAIN_EVIL = 604, 
	LAUGHING = 605, LONGER_LAUGHING = 606, LONGER_LAUGHING_2 = 607, LAUGHING_2 = 608, 
	EVIL_LAUGH_SHORT = 609, SLIGHTLY_SAD = 610, VERY_SAD = 611, OTHER = 612, 
	NEAR_TEARS_2 = 613, ANGRY_1 = 614, ANGRY_2 = 615, ANGRY_3 = 616, 
	ANGRY_4 = 617;
	
	public static final Object[][] RANDOM_NPC_CHAT = {
			{"How's it going?", HAPPY},
			{"We don't see many adventurers around these parts.", HAPPY},
			{"The staff is there to help you, use them.", CALM},
	};
	
	/*public static void sendDialogueForNpcId(Client player, int npcId) {
		switch (npcId) {
			case 0:
				player.setNpcDialogue(new Hans());
				player.getNpcDialogue().sendDialogue(player, 0);
				break;
			default:
				Object[] randomMessage = RANDOM_NPC_CHAT[Misc.random(RANDOM_NPC_CHAT.length)];
				sendNpcChat1(player, npcId, (String) randomMessage[0], (Integer) randomMessage[1]);
				player.setNpcDialogue(null);
				break;
		}
	}*/
	
	/**
	  * An information box.
	  */
	/*ublic static void sendInformationBox(Client player, String title, String line1, String line2, String line3, String line4) {//check
		player.getAssistant().sendFrame126(title, 6180);
		player.getAssistant().sendFrame126(line1, 6181);
		player.getAssistant().sendFrame126(line2, 6182);
		player.getAssistant().sendFrame126(line3, 6183);
		player.getAssistant().sendFrame126(line4, 6184);
		player.getAssistant().sendChatInterface(6179);
	}
	
	*//**
	  * Option selection.
	  *//*
	public static void sendOption2(Client player, String option1, String option2) {
		player.getAssistant().sendFrame126(option1, 2461);
		player.getAssistant().sendFrame126(option2, 2462);
		player.getAssistant().sendChatInterface(2459);
	}
	
	public static void sendOption3(Client player, String option1, String option2, String option3) {
		player.getAssistant().sendFrame126(option1, 2471);
		player.getAssistant().sendFrame126(option2, 2472);
		player.getAssistant().sendFrame126(option3, 2473);
		player.getAssistant().sendChatInterface(2469);
	}
	
	public static void sendOption4(Client player, String option1, String option2, String option3, String option4) {
		player.getAssistant().sendFrame126(option1, 2482);
		player.getAssistant().sendFrame126(option2, 2483);
		player.getAssistant().sendFrame126(option3, 2484);
		player.getAssistant().sendFrame126(option4, 2485);
		player.getAssistant().sendChatInterface(2480);
	}
	
	public static void sendOption5(Client player, String option1, String option2, String option3, String option4, String option5) {
		player.getAssistant().sendFrame126(option1, 2494);
		player.getAssistant().sendFrame126(option2, 2495);
		player.getAssistant().sendFrame126(option3, 2496);
		player.getAssistant().sendFrame126(option4, 2497);
		player.getAssistant().sendFrame126(option5, 2498);
		player.getAssistant().sendChatInterface(2492);
	}

	*//**
	  * Statements.
	  *//*
	public static void sendStatement1(Client player, String line1) {
		player.getAssistant().sendFrame126(line1, 357);
		player.getAssistant().sendChatInterface(356);
	}
	
	public static void sendStatement2(Client player, String line1, String line2) {
		player.getAssistant().sendFrame126(line1, 360);
		player.getAssistant().sendFrame126(line2, 361);
		player.getAssistant().sendChatInterface(359);
	}
	
	public static void sendStatement3(Client player, String line1, String line2, String line3) {
		player.getAssistant().sendFrame126(line1, 364);
		player.getAssistant().sendFrame126(line2, 365);
		player.getAssistant().sendFrame126(line3, 366);
		player.getAssistant().sendChatInterface(363);
	}
	
	public static void sendStatement4(Client player, String line1, String line2, String line3, String line4) {
		player.getAssistant().sendFrame126(line1, 369);
		player.getAssistant().sendFrame126(line2, 370);
		player.getAssistant().sendFrame126(line3, 371);
		player.getAssistant().sendFrame126(line4, 372);
		player.getAssistant().sendChatInterface(368);
	}
	
	public static void sendStatement5(Client player, String line1, String line2, String line3, String line4, String line5) {
		player.getAssistant().sendFrame126(line1, 375);
		player.getAssistant().sendFrame126(line2, 376);
		player.getAssistant().sendFrame126(line3, 377);
		player.getAssistant().sendFrame126(line4, 378);
		player.getAssistant().sendFrame126(line5, 379);
		player.getAssistant().sendChatInterface(374);
	}*/
	
	/**
	  * Timed statements.
	  * These statements have no close/click options, so they should only be used with a timer.
	  */
	/*public static void sendTimedStatement1(Client player, String line1) {
		player.getAssistant().sendFrame126(line1, 12789);
		player.getAssistant().sendChatInterface(12788);
	}
	
	public static void sendTimedStatement2(Client player, String line1, String line2) {
		player.getAssistant().sendFrame126(line1, 12791);
		player.getAssistant().sendFrame126(line2, 12792);
		player.getAssistant().sendChatInterface(12790);
	}
	
	public static void sendTimedStatement3(Client player, String line1, String line2, String line3) {
		player.getAssistant().sendFrame126(line1, 12794);
		player.getAssistant().sendFrame126(line2, 12795);
		player.getAssistant().sendFrame126(line3, 12796);
		player.getAssistant().sendChatInterface(12793);
	}
	
	public static void sendTimedStatement4(Client player, String line1, String line2, String line3, String line4) {
		player.getAssistant().sendFrame126(line1, 12798);
		player.getAssistant().sendFrame126(line2, 12799);
		player.getAssistant().sendFrame126(line3, 12800);
		player.getAssistant().sendFrame126(line4, 12801);
		player.getAssistant().sendChatInterface(12797);
	}
	
	public static void sendTimedStatement5(Client player, String line1, String line2, String line3, String line4, String line5) {
		player.getAssistant().sendFrame126(line1, 12803);
		player.getAssistant().sendFrame126(line2, 12804);
		player.getAssistant().sendFrame126(line3, 12805);
		player.getAssistant().sendFrame126(line4, 12806);
		player.getAssistant().sendFrame126(line5, 12807);
		player.getAssistant().sendChatInterface(12802);
	}
	
	*//**
	  * NPC dialogue.
	  *//*
	public static void sendNpcChat1(Client player, int npcId, String line1, int emotion) {
		String npcName = Loader.getNpcDefinitions()[npcId].getNpcName();
		player.getAssistant().sendDialogueAnimation(4883, emotion);
		player.getAssistant().sendFrame126(npcName, 4884);
		player.getAssistant().sendFrame126(line1, 4885);
		player.getAssistant().sendNPCDialogueHead(npcId, 4883);
		player.getAssistant().sendChatInterface(4882);
	}
	
	public static void sendNpcChat2(Client player, int npcId, String line1, String line2, int emotion) {
		String npcName = Loader.getNpcDefinitions()[npcId].getNpcName();
		player.getAssistant().sendDialogueAnimation(4888, emotion);
		player.getAssistant().sendFrame126(npcName, 4889);
		player.getAssistant().sendFrame126(line1, 4890);
		player.getAssistant().sendFrame126(line2, 4891);
		player.getAssistant().sendNPCDialogueHead(npcId, 4888);
		player.getAssistant().sendChatInterface(4887);
	}
	
	public static void sendNpcChat3(Client player, int npcId, String line1, String line2, String line3, int emotion) {
		String npcName = Loader.getNpcDefinitions()[npcId].getNpcName();
		player.getAssistant().sendDialogueAnimation(4894, emotion);
		player.getAssistant().sendFrame126(npcName, 4895);
		player.getAssistant().sendFrame126(line1, 4896);
		player.getAssistant().sendFrame126(line2, 4897);
		player.getAssistant().sendFrame126(line3, 4898);
		player.getAssistant().sendNPCDialogueHead(npcId, 4894);
		player.getAssistant().sendChatInterface(4893);
	}
	
	public static void sendNpcChat4(Client player, int npcId, String line1, String line2, String line3, String line4, int emotion) {
	String npcName = Loader.getNpcDefinitions()[npcId].getNpcName();
		player.getAssistant().sendDialogueAnimation(4901, emotion);
		player.getAssistant().sendFrame126(npcName, 4902);
		player.getAssistant().sendFrame126(line1, 4903);
		player.getAssistant().sendFrame126(line2, 4904);
		player.getAssistant().sendFrame126(line3, 4905);
		player.getAssistant().sendFrame126(line4, 4906);
		player.getAssistant().sendNPCDialogueHead(npcId, 4901);
		player.getAssistant().sendChatInterface(4900);
	}
	
	*//**
	  * Timed NPC dialogue.
	  * These NPC dialogues have no close/click options, so should only be used with a timer.
	  *//*
	public static void sendTimedNpcChat2(Client player, int npcId, String line1, String line2, int emotion) {
		String npcName = Loader.getNpcDefinitions()[npcId].getNpcName();
		player.getAssistant().sendDialogueAnimation(12379, emotion);
		player.getAssistant().sendFrame126(npcName, 12380);
		player.getAssistant().sendFrame126(line1, 12381);
		player.getAssistant().sendFrame126(line2, 12382);
		player.getAssistant().sendNPCDialogueHead(npcId, 12379);
		player.getAssistant().sendChatInterface(12378);
	}
	
	public static void sendTimedNpcChat3(Client player, int npcId, String line1, String line2, String line3, int emotion) {
		String npcName = Loader.getNpcDefinitions()[npcId].getNpcName();
		player.getAssistant().sendDialogueAnimation(12384, emotion);
		player.getAssistant().sendFrame126(npcName, 12385);
		player.getAssistant().sendFrame126(line1, 12386);
		player.getAssistant().sendFrame126(line2, 12387);
		player.getAssistant().sendFrame126(line3, 12388);
		player.getAssistant().sendNPCDialogueHead(npcId, 12384);
		player.getAssistant().sendChatInterface(12383);
	}
	
	public static void sendTimedNpcChat4(Client player, int npcId, String line1, String line2, String line3, String line4, int emotion) {
		String npcName = Loader.getNpcDefinitions()[npcId].getNpcName();
		player.getAssistant().sendDialogueAnimation(11892, emotion);
		player.getAssistant().sendFrame126(npcName, 11893);
		player.getAssistant().sendFrame126(line1, 11894);
		player.getAssistant().sendFrame126(line2, 11895);
		player.getAssistant().sendFrame126(line3, 11896);
		player.getAssistant().sendFrame126(line4, 11897);
		player.getAssistant().sendNPCDialogueHead(npcId, 11892);
		player.getAssistant().sendChatInterface(11891);
	}
	
	*//**
	  * Player dialogue.
	  *//*
	public static void sendPlayerChat1(Client player, String line1, int emotion) {
		player.getAssistant().sendDialogueAnimation(969, emotion);
		player.getAssistant().sendFrame126(player.getUsername(), 970);
		player.getAssistant().sendFrame126(line1, 971);
		player.getAssistant().sendPlayerDialogueHead(969);
		player.getAssistant().sendChatInterface(968);
	}
	
	public static void sendPlayerChat2(Client player, String line1, String line2, int emotion) {
		player.getAssistant().sendDialogueAnimation(974, emotion);
		player.getAssistant().sendFrame126(player.getUsername(), 975);
		player.getAssistant().sendFrame126(line1, 976);
		player.getAssistant().sendFrame126(line2, 977);
		player.getAssistant().sendPlayerDialogueHead(974);
		player.getAssistant().sendChatInterface(973);
	}
	
	public static void sendPlayerChat3(Client player, String line1, String line2, String line3, int emotion) {
		player.getAssistant().sendDialogueAnimation(980, emotion);
		player.getAssistant().sendFrame126(player.getUsername(), 981);
		player.getAssistant().sendFrame126(line1, 982);
		player.getAssistant().sendFrame126(line2, 983);
		player.getAssistant().sendFrame126(line3, 984);
		player.getAssistant().sendPlayerDialogueHead(980);
		player.getAssistant().sendChatInterface(979);
	}
	
	public static void sendPlayerChat4(Client player, String line1, String line2, String line3, String line4, int emotion) {
		player.getAssistant().sendDialogueAnimation(987, emotion);
		player.getAssistant().sendFrame126(player.getUsername(), 988);
		player.getAssistant().sendFrame126(line1, 989);
		player.getAssistant().sendFrame126(line2, 990);
		player.getAssistant().sendFrame126(line3, 991);
		player.getAssistant().sendFrame126(line4, 992);
		player.getAssistant().sendPlayerDialogueHead(987);
		player.getAssistant().sendChatInterface(986);
	}
	
	*//**
	  * Timed player dialogue.
	  * These player dialogues have no close/click options, so should only be used with a timer.
	  *//*
	public static void sendTimedPlayerChat1(Client player, String line1, int emotion) {
		player.getAssistant().sendDialogueAnimation(12774, emotion);
		player.getAssistant().sendFrame126(player.getUsername(), 12775);
		player.getAssistant().sendFrame126(line1, 12776);
		player.getAssistant().sendPlayerDialogueHead(12774);
		player.getAssistant().sendChatInterface(12773);
	}
	
	public static void sendTimedPlayerChat2(Client player, String line1, String line2, int emotion) {
		player.getAssistant().sendDialogueAnimation(12778, emotion);
		player.getAssistant().sendFrame126(player.getUsername(), 12779);
		player.getAssistant().sendFrame126(line1, 12780);
		player.getAssistant().sendFrame126(line2, 12781);
		player.getAssistant().sendPlayerDialogueHead(12778);
		player.getAssistant().sendChatInterface(12777);
	}
	
	public static void sendTimedPlayerChat3(Client player, String line1, String line2, String line3, int emotion) {
		player.getAssistant().sendDialogueAnimation(12783, emotion);
		player.getAssistant().sendFrame126(player.getUsername(), 12784);
		player.getAssistant().sendFrame126(line1, 12785);
		player.getAssistant().sendFrame126(line2, 12786);
		player.getAssistant().sendFrame126(line3, 12787);
		player.getAssistant().sendPlayerDialogueHead(12783);
		player.getAssistant().sendChatInterface(12782);
	}
	
	public static void sendTimedPlayerChat4(Client player, String line1, String line2, String line3, String line4, int emotion) {
		player.getAssistant().sendDialogueAnimation(11885, emotion);
		player.getAssistant().sendFrame126(player.getUsername(), 11886);
		player.getAssistant().sendFrame126(line1, 11887);
		player.getAssistant().sendFrame126(line2, 11888);
		player.getAssistant().sendFrame126(line3, 11889);
		player.getAssistant().sendFrame126(line4, 11890);
		player.getAssistant().sendPlayerDialogueHead(11885);
		player.getAssistant().sendChatInterface(11884);
	}*/
	
}