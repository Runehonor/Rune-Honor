package com.runehonor.game.players;

import com.runehonor.Constants;
import com.runehonor.GameServer;
import com.runehonor.content.ModeratorObjects;
import com.runehonor.content.PlayerClass;
import com.runehonor.game.npcs.NPCHandler;

import core.util.Misc;

public class DialogueHandler {

	private Client c;
	
	public DialogueHandler(Client client) {
		this.c = client;
	}
	
	/**
	 * Handles all talking
	 * @param dialogue The dialogue you want to use
	 * @param npcId The npc id that the chat will focus on during the chat
	 */
	public void sendDialogues(int dialogue, int npcId) {
		c.talkingNpc = npcId;
		switch(dialogue) {
		
		/** 
		 * Beta Holiday Event
		 */
		case 1050: 
			if (c.holidayEvent > 0) { 
				sendNpcChat2("Arr, if 't isn't " +c.playerName+ "! How goes 'yer hunt 'fer the", 
						 "*HIC* real treasure? 'Ye know. All o' them 'bugs'?", "Cap'n Hand", LAUGHING);
				c.nextChat = 1090;
			} else {
			sendNpcChat2("Ahoy, " +c.playerName+ "! Fancy 'yerself as one 'o them","beta testamajiggers'?", "Cap'n Hand", CALM);
			c.nextChat = 1051;
			}
			break;
		case 1090: 
			sendPlayerChat("I've still got some bugs to find. I may as well get to it!", CONTENT);
			c.nextChat = 0;
			break;
		case 1051:
			sendPlayerChat("A wh-what!?", DISTRESSED);
			c.nextChat = 1052;
			break;
		case 1052: 
			sendNpcChat2("Why, a beta tester, lad! 'Course since ye' be prancin' round ",
						 "RuneHonor, surely ye' must be a beta tester!", "Cap'n Hand", LAUGHING);
			c.nextChat = 1053;
			break;
		case 1053: 
			sendPlayerChat("Right... so, what would happen if I was?", CALM_CONTINUED);
			c.nextChat = 1054;
			break;
		case 1054: 
			sendNpcChat2("Why, ye'd get one of these here!", 
						 "Take an ickle peek for 'yerself!", "Cap'n Hand", HAPPY);
			c.nextChat = 1055;
			break;
		case 1055: 
			sendItemChat1("", "Cap'n Hand hands you a hat resembling his own.", 8950, 200);
			if (c.getItems().freeSlots() > 0) {
				c.getItems().addItem(8950, 1);
			} else {
				c.getItems().addItemToBank(8950, 1); 
			}
			c.sendMessage("Your item has been added to your " + 
			(c.getItems().freeSlots() > 0 ? "inventory" : "bank") + ".");
			c.holidayEvent = 1;
			c.nextChat = 1056;
			break;
		case 1056: 
			sendPlayerChat("Er, thanks I guess.", HAPPY);
			c.nextChat = 1057;
			break;
		case 1057: 
			sendNpcChat2("Don't *HIC* mention it laddeh'. Say, ye' might be of use", 
						 "to me after all!", "Cap'n Hand", HAPPY);
			c.nextChat = 1058;
			break;
		case 1058: 
			sendNpcChat2("Would yer' consider yerself a bright 'un? Full of ideas 'fer",
						 Constants.SERVER_NAME + "? Ye might be able te' help after all!", "Cap'n Hand", DISTRESSED);
			c.nextChat = 1059;
			break;
		case 1059: 
			sendPlayerChat("Hmm. I guess so. How can I help?", UNINTERESTED);
			c.nextChat = 1060;
			break;
		case 1060:
			sendNpcChat2("Report all bugs that 'ye may've found on the, er, message",
						 "board. Ye' landlubbers call it a 'forum'.", "Cap'n Hand", CALM);
			c.nextChat = 1061;
			break;
		case 1061: 
			sendPlayerChat("Sounds easy enough. Thanks for the advice, Captain!", DISORIENTED_LEFT);
			c.nextChat = 0;
			break;
			
		/** 
		 * Emblem Trader NPC
		 */
		case 1062: 
			sendPlayerChat1("Hey..?");
			c.nextChat = 1063;
			break;
		case 1063:
			sendNpcChat("Hello, wanderer.", 273, "Emblem Trader");
			c.nextChat = 1064;
			break;
		case 1064: 
			sendNpcChat2("Don't suppose you've come across any strange...", 
						"emblems along your journey?", 273, "Emblem Trader");
			c.nextChat = 1065;
			break;
		case 1065: 
			sendPlayerChat1("Not that I've seen.");
			c.nextChat = 1066;
			break;
		case 1066: 
			sendNpcChat2("If you do, please do let me know. I'll reward you", 
						 "handsomely.", 273, "Emblem Trader");
			c.nextChat = 1067;
			break;
		case 1067: 
			sendOption3("What rewards have you got?", 
						"Can I have a PK skull please?", 
						"That's nice.");
			c.dialogueAction = 1067;
			break;
		case 1068: 
			sendOption2("Give me a PK skull.", "Cancel");
			c.dialogueAction = 1068;
			break;
		case 1069: 
			sendNpcChat1("Ain't got shit my nigga.", 273, "Emblem Trader");
			c.nextChat = 0;
			break;
		/**
		 * rank switcher
		 */
		case 750:
			sendNpcChat2("Icons, icons... Oi, you there! Would you be interested in",
					"switching that there rank of yours?", c.talkingNpc, "Rank Switcher");
			c.nextChat = 751;	
			break;
		case 751:
			sendOption5("@cr3@<col=ff0000>Donator</col>","@cr4@<col=0101DF>Super Donator</col>","@cr5@<col=088A08>Extreme Donator</col>",
					"@cr6@<col=5F04B4>Respected</col>","Next ->");
			c.dialogueAction = 751;
			break;
			
		case 752:
			sendOption4("@cr7@<col=8A4B08>Veteran</col>", "@cr8@<col=B2B2B2>Iron Man</col>","Normal Player","- First Page -");
			c.dialogueAction = 752;
			break;
		
		/**
		 * Travelling NPC's
		 */
		case 555:
			sendNpcChat2("Hello. I can travel you around the world.",
					"Which spot do you want me to travel you to?", c.talkingNpc, "Traveler");
			c.nextChat = 556;	
			break;
		case 556:
			sendOption5("Varrock","Falador","Lumbridge","Draynor","Al-Kharid");
			c.dialogueAction = 556;
			break;
			
		case 557:
			sendNpcChat2("Hello. I can travel you around the world.",
					"Which spot do you want me to travel you to?", c.talkingNpc, "Traveler");
			c.nextChat = 558;	
			break;
		case 558:
			sendOption5("Kharidian Desert","Morytania","Karamja","Brimhaven","Taverley");
			c.dialogueAction = 558;
			break;
			
		case 559: //sailor 378
			sendNpcChat2("Hello. I can sail you around the world.",
					"Which spot do you want me to sail you to?", c.talkingNpc, "Sailor");
			c.nextChat = 560;	
			break;
		case 560:
			sendOption5("Musa Point (Karamja)","Brimhaven","Crandor","Entrana","Miscellania");
			c.dialogueAction = 560;
			break;
			
		case 561: //sailor 376
			sendNpcChat2("Hello. I can sail you around the world.",
					"Which spot do you want me to sail you to?", c.talkingNpc, "Sailor");
			c.nextChat = 562;	
			break;
		case 562:
			sendOption5("Fishing Platform","East Ardougne","Catherby","Rellekka","Waterbirth Island");
			c.dialogueAction = 562;
			break;
			
		case 563: //sailor 1704
			sendNpcChat2("Hello. I can sail you around the world.",
					"Which spot do you want me to sail you to?", c.talkingNpc, "Sailor");
			c.nextChat = 564;	
			break;
		case 564:
			sendOption2("Port Khazard","Port Phasmatys");
			c.dialogueAction = 564;
			break;
			
		case 565: //sailor 1304
			sendNpcChat2("Hello. I can sail you to Ape Atoll.",
					"Want me to take you to Ape Atoll?", c.talkingNpc, "Sailor");
			c.nextChat = 566;	
			break;
		case 566:
			sendOption2("Yes","No");
			c.dialogueAction = 566;
			break;
			
		case 567: //231
			sendNpcChat2("Hello. I can teleport you around the world.",
					"Which spot do you want me to teleport you to?", c.talkingNpc, "Traveler");
			c.nextChat = 568;	
			break;
		case 568:
			sendOption5("Barbarian Village","Troll Stronghold","Trollweis Mountain","Burthorpe","White Wolf Mountain");
			c.dialogueAction = 568;
			break;
			
		case 569: //263
			sendNpcChat2("Hello. I can teleport you around the world.",
					"Which spot do you want me to teleport you to?", c.talkingNpc, "Traveler");
			c.nextChat = 570;	
			break;
		case 570:
			sendOption5("Fremennik Slayer Dungeon","Tzhaar Cave + Karamja Dungeon","Catherby","Ardougne Zoo","Under Water");
			c.dialogueAction = 570;
			break;
			
		case 571: //2139
			sendNpcChat2("Hello. I can teleport you around the gnome city.",
					"Which spot do you want me to teleport you to?", c.talkingNpc, "Gnome");
			c.nextChat = 572;	
			break;
		case 572:
			sendOption4("Tree Gnome Stronghold","Grand Tree","Swamp","Treegnome Village");
			c.dialogueAction = 572;
			break;
			
		case 573: //1182
			sendNpcChat2("Hello. I can teleport you around the elves city.",
					"Which spot do you want me to teleport you to?", c.talkingNpc, "Elf");
			c.nextChat = 574;	
			break;
		case 574:
			sendOption3("Lletya","Tyras Camp","Elf Camp");
			c.dialogueAction = 574;
			break;
			
		case 575: //sailor 1304
			sendNpcChat2("Hello. I can take you to the Warriors' Guild.",
					"Want me to take you there?", c.talkingNpc, "Traveler");
			c.nextChat = 576;	
			break;
		case 576:
			sendOption2("Yes","No");
			c.dialogueAction = 576;
			break;
			
		case 577: //647
			sendNpcChat2("Hello. I can travel you around Varrock.",
					"Where do you want me to travel you to?", c.talkingNpc, "Traveler");
			c.nextChat = 578;	
			break;
		case 578:
			sendOption3("Varrock Sewers","Varrock Castle","Dark Wizards");
			c.dialogueAction = 578;
			break;
			
		case 579: //608
			sendNpcChat2("Hello. I can travel you around Falador.",
					"Where do you want me to travel you to?", c.talkingNpc, "Traveler");
			c.nextChat = 580;	
			break;
		case 580:
			sendOption4("Falador Castle","Dark Wizards' Tower","Goblin Village","Ice Mountain");
			c.dialogueAction = 580;
			break;
			
		case 581: //741
			sendNpcChat2("Hello. I can travel you around Lumbridge.",
					"Where do you want me to travel you to?", c.talkingNpc, "Traveler");
			c.nextChat = 582;	
			break;
		case 582:
			sendOption4("Lumbridge Swamp","Goblins","Cows","Chickens");
			c.dialogueAction = 582;
			break;
			
		case 583: //746
			sendNpcChat2("Hello. I can travel you around Draynor.",
					"Where do you want me to travel you to?", c.talkingNpc, "Traveler");
			c.nextChat = 584;	
			break;
		case 584:
			sendOption4("Draynor Manor","Draynor Jail","Wizards' Tower","Draynor Sewers");
			c.dialogueAction = 584;
			break;
			
		case 585: //1841
			sendNpcChat2("Hello. I can travel you around Al-Kharid.",
					"Where do you want me to travel you to?", c.talkingNpc, "Traveler");
			c.nextChat = 586;	
			break;
		case 586:
			sendOption4("Al-Kharid Bank","Al-Kharid Castle","Scorpions + Slash Bash","Shantay Pass");
			c.dialogueAction = 586;
			break;
			
		case 587: //2637
			sendNpcChat2("Hello. I can travel you around the Kharidian Desert.",
					"Where do you want me to travel you to?", c.talkingNpc, "Traveler");
			c.nextChat = 588;	
			break;
		case 588:
			sendOption5("Pollnivneach","Nardah","Sophanem","Bandit Camp","Uzer");
			c.dialogueAction = 588;
			break;
			
		case 589: //1704
			sendNpcChat2("Hello. I can travel you around Morytania.",
					"Where do you want me to travel you to?", c.talkingNpc, "Traveler");
			c.nextChat = 590;	
			break;
		case 590:
			sendOption5("Canifis","Mort'ton","Burgh de Rott","Port Phasmatys","Experiments");
			c.dialogueAction = 590;
			break;
			
		case 591: //511
			sendNpcChat2("Hello. I can travel you around Karamja.",
					"Where do you want me to travel you to?", c.talkingNpc, "Traveler");
			c.nextChat = 592;	
			break;
		case 592:
			sendOption4("Tai Bwo Wannai","Shilo Village","Kharazi Jungle","Moss Giant Isle");
			c.dialogueAction = 592;
			break;
			
		case 593: //510
			sendNpcChat2("Hello. I can travel you to Brimhaven Dungeon.",
					"Do you want me to take you there?", c.talkingNpc, "Traveler");
			c.nextChat = 594;	
			break;
		case 594:
			sendOption2("Yes","No");
			c.dialogueAction = 594;
			break;
			
		case 595: //2580
			sendNpcChat2("Hello. I can travel you to Taverley Dungeon.",
					"Do you want me to take you there?", c.talkingNpc, "Traveler");
			c.nextChat = 596;	
			break;
		case 596:
			sendOption2("Yes","No");
			c.dialogueAction = 596;
			break;
		/**
		 * reset
		 */
		case 553:
			sendOption2("Construction", "Hunter");
			if(c.rubbedLamp)
				c.getAssistant().sendFrame126("Level up:", 2460);
			else
				c.getAssistant().sendFrame126("Reset:", 2460);
			c.dialogueAction = 553;
			break;
			
		case 554:
			sendOption2("Skills Interface", "Construction or Hunter");
			c.dialogueAction = 554;
			break;
		
		/**
		 * Bounty Hunter
		 */
		case 505:
			sendNpcChat1("Welcome to Bounty Hunter.", c.talkingNpc, "Bounty Hunter Guard");
			c.nextChat = 506;
			break;
		case 506:
			sendNpcChat4("At this place you can kill other players in order to",
					"recieve BH Kills. With these kills you can be rewarded",
					"with money. You need atleast 10 Bounty Kills in order to",
					"claim this cash. What combat level are you?", c.talkingNpc, "Veteran Hervi");
			c.nextChat = 507;
			break;
		case 507:
			sendOption4("Combatlevel 3 - 55", "Combatlevel 50 - 100", "Combatlevel 95+", "Never mind.");
			c.dialogueAction = 507;
			break;
		case 511:
			sendNpcChat1("You need "+((c.killsMultiplier *10) - c.bountyKills)+" more kills before you can claim your prize.", c.talkingNpc, "Veteran Hervi");
			c.nextChat = 0;
			break;
		case 512:
			sendNpcChat1("Incompetent fool! Come back when you are more experienced!", c.talkingNpc, "Veteran Hervi");
			c.nextChat = 0;
			break;
		case 513:
			sendNpcChat1("Your reward has been added to your bank. Your future is bright, warrior.", c.talkingNpc, "Veteran Hervi");
			c.nextChat = 0;
			break;
				
		case 504: //2nd bosses
			sendOption5("Gu'Tanoth", "Sea Troll Queen + Barrelchest", "Mutant Tarn", "The Inadequacy", "Slash Bash");
			c.dialogueAction = 504;
			break;
		case 503: //interface
			c.dialogueAction = -1;
			c.teleAction = -1;
			c.isResetting = true;
			c.getDH().sendDialogues(554, -1);
			return;
		case 502: //stat resetter
			sendNpcChat("Hello, adventurer. Before your very eyes,", "I can roll the clock back on your stats.", "However, I am only able to reset only one stat at a time.", "Would you like to give it a go?", CALM_CONTINUED, "Stat Resetter");
			c.nextChat = 503;
			break;
		case 501: //minigames 2
			sendOption5("Tzhaar Cave", "Fishing Trawler", "Castle Wars", "Bounty Hunter", "- First Page -");
			c.dialogueAction = 501;
			break;
		case 500:
			sendOption4("Pure", "Berserker Pure", "Tanker", "Master");
			c.dialogueAction = 500;
			break;
		//ranging guild
		case 483: //competition judge
			sendNpcChat("Hello!", "I'm the competition judge of the Ranging Guild.", "You can buy shots from me and shoot the targets", "for points. You can exchange the points at me.", CALM_CONTINUED, "Judge");
			c.nextChat = 484;
			break;
			
		case 484: 
			sendNpcChat("What would you like to do/ask?", CALM_CONTINUED, "Judge");
			c.nextChat = 485;
			break;
			
		case 485:
			sendOption4("I would like to buy shots.", "I would like to exchange my points.", "How am I doing right now?", "Never mind.");
			c.dialogueAction = 485;
			break;
			
		//skills
		case 476:
			sendOption5("Firemaking", "Fishing", "Fletching", "Herblore", "Next ->");
			c.dialogueAction = 476;
			break;
			
		case 477:
			sendOption5("Mining", "Runecrafting", "Slayer", "Smithing", "Next ->");
			c.dialogueAction = 477;
			break;
			
		case 478:
			sendOption5("Thieving", "Woodcutting", "Construction", "Hunter", "Next ->");
			c.dialogueAction = 478;
			break;
			
		case 690:
			sendOption5("Strength/Attack", "Prayer", "Defence", "Ranging", "- First Page -");
			c.dialogueAction = 690;
			break;
			
			//monsters
		case 486:
			sendNpcChat("Hello!",
					"I can bring you to several training zones in the desert.",
					"Where can I take you to?", CALM_CONTINUED,	"Cart Traveler");
			c.nextChat = 479;
			break;
		case 479: //desert
			sendOption3("Scorpions", "Al-Kharid Warriors", "Bandit Camp");
			c.dialogueAction = 479;
			break;
			
		case 487:
			sendNpcChat("Hello!",
					"I can bring you to several training zones in the snow mountain.",
					"Where can I take you to?", CALM_CONTINUED,	"Traveler Joe");
			c.nextChat = 480;
			break;
		case 480: //snow mountain
			sendOption3("Ice Queen Lair", "Ice Warriors & Ice Giants", "Mithril Dragons");
			c.dialogueAction = 480;
			break;
			
		case 488:
			sendNpcChat("Hello!",
					"I can bring you to several training zones in the dungeons.",
					"Where can I take you to?", CALM_CONTINUED,	"Cart Traveler");
			c.nextChat = 481;
			break;
		case 481: //dungeons
			sendOption4("Brimhaven Dungeon", "Taverley Dungeon", "Fremennik Slayer Dungeon", "Edgeville Dungeon");
			c.dialogueAction = 481;
			break;
			
		case 490:
			sendNpcChat("Hello!",
					"I can sail you to several training zones.",
					"Where can I take you to?", CALM_CONTINUED,	"Sailor");
			c.nextChat = 482;
			break;
		case 482: //Boat
			sendOption5("Crandor", "Entrana", "Crash Island", "Musa Point/Karamja", "Rellekka");
			c.dialogueAction = 482;
			break;
			
			
		//Slayer
		case 400:
			sendNpcChat("Hello, and what are you after then?", EVIL, "Vannaka");
			c.nextChat = 401;
		break;
		
		case 401:
			sendOption4("I want to see the stuff you have for sale.",
					"I need another assignment!",
					"Where is the location of my task?",
					"Err... Never mind.");
			c.dialogueAction = 401;
			break;
			
		case 402:
			sendPlayerChat("I want to see the stuff you have for sale.", CALM);
			c.nextChat = 403;
			break;
			
		case 403:
			c.getSlayer().handleInterface("buy");
			c.nextChat = 0;
			break;
			
		case 404:
			sendPlayerChat("I need another assignment!", CALM_CONTINUED);
			c.nextChat = 405;
			break;
			
		case 405:
			c.getSlayer().generateTask();
			//c.nextChat = 0;
			break;
			
		case 406:
			sendNpcChat("Your new task is to kill "+c.taskAmount+" "+c.getSlayer().getTaskName(c.slayerTask)+". Good luck "+c.playerName+".", 602, "Vannaka");
			c.nextChat = 0;
			break;
			
		case 407:
			sendNpcChat("You currently have "+c.taskAmount+" "+c.getSlayer().getTaskName(c.slayerTask)+" to kill.", "If you would like I could give you an easier task.", "Although if I do this, you won't recieve as many points.", ANGRY_1, "Vannaka");
			c.nextChat = 408;
			break;
			
		case 408:
			sendOption2("Yes, I would like an easier task.", "No, I want to keep hunting on my current task.");
			c.dialogueAction = 408;
			//c.nextChat = 0;
			break;
			
		case 409:
			sendNpcChat("Sorry, but your current task is already easy.", "Please come back when you've finished it.", EVIL, "Vannaka");
			c.nextChat = 0;
			break;
			
		case 410:
			sendNpcChat("Your task can be found in the "+c.getSlayer().getLocation(c.slayerTask)+"", ANNOYED, "Vannaka");
			c.nextChat = 411;
			break;
			
		case 411:
			sendPlayerChat("Alright, thank you!", HAPPY);
			c.nextChat = 0;
			break;
			
			//skill teleports
		case 412:
			sendOption4("H.A.M. Camp", "Draynor", "Ardougne", "Menaphos/Sophanem");
			c.dialogueAction = 412;
			break;
			
		case 413:
			sendOption4("Essence", "Dwarven Mine", "Shilo Village", "Deep Wild Mine");
			c.dialogueAction = 413;
			break;
			
		case 414:
			sendOption5("Al-Kharid", "Shilo Village", "Karamja", "Catherby", "Piscatoris Fishing Colony"); 
			c.dialogueAction = 414;
			break;
			
			//Skill Master dialogues
			//HUNTER
		case 551:
			sendNpcChat("Hello, I'm the master of Hunter.",
					"What can I do for you?", CALM, "Skill Master");
			c.nextChat = 552;
			break;
			
		case 552:
			sendOption3("Show me your store.", "I achieved 99 Hunter.", "Never mind");
			c.dialogueAction = 552;
			break;
			//CONSTRUCTION
		case 549:
			sendNpcChat("Hello, I'm the master of Construction.",
					"What can I do for you?", CALM, "Skill Master");
			c.nextChat = 550;
			break;
			
		case 550:
			sendOption4("Show me your store.", "Teleport me to construction.", "I achieved 99 Construction.", "Never mind");
			c.dialogueAction = 550;
			break;
			//agility
		case 415:
			sendNpcChat("Hello, I'm the master of Agility.",
					"What can I do for you?", CALM, "Skill Master");
			c.nextChat = 416;
			break;
			
		case 416:
			sendOption4("Show me your store.", "Teleport me to Gnome Agility Course.", "I achieved 99 Agility.", "Never mind");
			c.dialogueAction = 416;
			break;
			
			//herblore
		case 417:
			sendNpcChat("Hello, I'm the master of Herblore.",
					"What can I do for you?", CALM, "Skill Master");
			c.nextChat = 418;
			break;
			
		case 418:
			sendOption3("Show me your store.", "I achieved 99 Herblore.", "Never mind");
			c.dialogueAction = 418;
			break;
			
			//thieving
		case 419:
			sendNpcChat("Hello, I'm the master of Thieving.",
					"What can I do for you?", CALM, "Skill Master");
			c.nextChat = 420;
			break;
			
		case 420:
			sendOption4("Show me your store.", "Bring me to another thieving place.", "I achieved 99 Thieving.", "Never mind");
			c.dialogueAction = 420;
			break;
			
			//Runecrafting
		case 421:
			sendNpcChat("Hello, I'm the master of Runecrafting.",
					"What can I do for you?", CALM, "Skill Master");
			c.nextChat = 422;
			break;
			
		case 422:
			sendOption4("Show me your store.", "Bring me to the abyss.", "I achieved 99 Runecrafting.", "Never mind");
			c.dialogueAction = 422;
			break;
			
			//Crafting
		case 423:
			sendNpcChat("Hello, I'm the master of Crafting.",
					"What can I do for you?", CALM, "Skill Master");
			c.nextChat = 424;
			break;
			
		case 424:
			sendOption3("Show me your store.", "I achieved 99 Crafting.", "Never mind");
			c.dialogueAction = 424;
			break;
			
			//Fletching
		case 425:
			sendNpcChat("Hello, I'm the master of Fletching.",
					"What can I do for you?", CALM, "Skill Master");
			c.nextChat = 426;
			break;
			
		case 426:
			sendOption3("Show me your store.", "I achieved 99 Fletching.", "Never mind");
			c.dialogueAction = 426;
			break;
			
			//Mining
		case 427:
			sendNpcChat("Hello, I'm the master of Mining.",
					"What can I do for you?", CALM, "Skill Master");
			c.nextChat = 428;
			break;
			
		case 428:
			sendOption4("Show me your store.", "Bring me to another mining place.", "I achieved 99 Mining.", "Never mind");
			c.dialogueAction = 428;
			break;
			
			//Smithing
		case 429:
			sendNpcChat("Hello, I'm the master of Smithing.",
					"What can I do for you?", CALM, "Skill Master");
			c.nextChat = 430;
			break;
			
		case 430:
			sendOption3("Show me your store.", "I achieved 99 Smithing.", "Never mind");
			c.dialogueAction = 430;
			break;
			
			//Fishing
		case 431:
			sendNpcChat("Hello, I'm the master of Fishing.",
					"What can I do for you?", CALM, "Skill Master");
			c.nextChat = 432;
			break;
			
		case 432:
			sendOption4("Show me your store.", "Bring me to another fishing place.", "I achieved 99 Fishing.", "Never mind");
			c.dialogueAction = 432;
			break;
			
			//Cooking
		case 433:
			sendNpcChat("Hello, I'm the master of Cooking.",
					"What can I do for you?", CALM, "Skill Master");
			c.nextChat = 434;
			break;
			
		case 434:
			sendOption3("Show me your store.", "I achieved 99 Cooking.", "Never mind");
			c.dialogueAction = 434;
			break;
			
			//firemaking
		case 435:
			sendNpcChat("Hello, I'm the master of Firemaking.",
					"What can I do for you?", CALM, "Skill Master");
			c.nextChat = 436;
			break;
			
		case 436:
			sendOption3("Show me your store.", "I achieved 99 Firemaking.", "Never mind");
			c.dialogueAction = 436;
			break;
			
			//Woodcutting
		case 437:
			sendNpcChat("Hello, I'm the master of Woodcutting.",
					"What can I do for you?", CALM, "Skill Master");
			c.nextChat = 438;
			break;
			
		case 438:
			sendOption3("Show me your store.", "I achieved 99 Woodcutting.", "Never mind");
			c.dialogueAction = 438;
			break;
			
			//farming
		case 439:
			sendNpcChat("Hello, I'm the master of Farming.",
					"What can I do for you?", CALM, "Skill Master");
			c.nextChat = 440;
			break;
			
		case 440:
			sendOption3("Show me your store.", "I achieved 99 Farming.", "Never mind");
			c.dialogueAction = 440;
			break;
			
			//slayer
		case 442:
			sendNpcChat("Hello, I'm the master of Slayer.",
					"What can I do for you?", CALM, "Skill Master");
			c.nextChat = 443;
			break;
			
		case 443:
			sendOption3("Show me your store.", "I achieved 99 Slayer.", "Never mind");
			c.dialogueAction = 443;
			break;
			
			//strength
		case 444:
			sendNpcChat("Hello, I'm the master of Strength.",
					"What can I do for you?", CALM, "Skill Master");
			c.nextChat = 441;
			break;
			
		case 441:
			sendOption3("Show me your store.", "I achieved 99 Strength.", "Never mind");
			c.dialogueAction = 441;
			break;
			
			//attack
		case 445:
			sendNpcChat("Hello, I'm the master of Attack.",
					"What can I do for you?", CALM, "Skill Master");
			c.nextChat = 446;
			break;
			
		case 446:
			sendOption3("Show me your store.", "I achieved 99 Attack.", "Never mind");
			c.dialogueAction = 446;
			break;
			
			//hp
		case 447:
			sendNpcChat("Hello, I'm the master of Hitpoints.",
					"What can I do for you?", CALM, "Skill Master");
			c.nextChat = 448;
			break;
			
		case 448:
			sendOption3("Show me your store.", "I achieved 99 Hitpoints.", "Never mind");
			c.dialogueAction = 448;
			break;
			
			//Defence
		case 449:
			sendNpcChat("Hello, I'm the master of Defence.",
					"What can I do for you?", CALM, "Skill Master");
			c.nextChat = 450;
			break;
			
		case 450:
			sendOption3("Show me your store.", "I achieved 99 Defence.", "Never mind");
			c.dialogueAction = 450;
			break;
			
			//Prayer
		case 451:
			sendNpcChat("Hello, I'm the master of Prayer.",
					"What can I do for you?", CALM, "Skill Master");
			c.nextChat = 452;
			break;
			
		case 452:
			sendOption3("Show me your store.", "I achieved 99 Prayer.", "Never mind");
			c.dialogueAction = 452;
			break;
			
			//Ranging
		case 453:
			sendNpcChat("Hello, I'm the master of Ranging.",
					"What can I do for you?", CALM, "Skill Master");
			c.nextChat = 454;
			break;
			
		case 454:
			sendOption3("Show me your store.", "I achieved 99 Ranging.", "Never mind");
			c.dialogueAction = 454;
			break;
			
			//Magic
		case 455:
			sendNpcChat("Hello, I'm the master of Magic.",
					"What can I do for you?", CALM, "Skill Master");
			c.nextChat = 456;
			break;
			
		case 456:
			sendOption3("Show me your store.", "I achieved 99 Magic.", "Never mind");
			c.dialogueAction = 456;
			break;
			
		case 9001:
			sendOption2("Teleport me to a random place!", "Leave me here.");
			c.dialogueAction = 9001;
			break;
		case 0:
			c.talkingNpc = -1;
			c.getAssistant().removeAllWindows();
			c.nextChat = 0;
			break;
		case 1:
			sendStatement("You found a hidden tunnel! Do you want to enter it?");
			c.dialogueAction = 1;
			c.nextChat = 2;
			break;
		case 2:
			sendOption2("Yes! I am fearless!",  "No way! That looks scary!");
			c.dialogueAction = 1;
			c.nextChat = 0;
			break;
		case 3:
			sendNpcChat1("'Ello, and what are you after then?", c.talkingNpc, "Chaeldar");
			c.nextChat = 4;
		break;
		case 5:
			sendNpcChat4("Hello adventurer.", "My name is Kolodion, the master of this mage bank.", "Would you like to play a minigame in order ", 
						"to earn points towards receiving magic related prizes?", c.talkingNpc, "Kolodion");
			c.nextChat = 6;
		break;
		case 6:
			sendNpcChat4("The way the game works as follows...", "You will be teleported to the wilderness,", 
			"You must kill mages to recieve points,","redeem points with the chamber guardian.", c.talkingNpc, "Kolodion");
			c.nextChat = 15;
		break;
		case 489:
			sendNpcChat1("You currently have "+c.pcPoints+" Pest Points", c.talkingNpc, "Void Knight");
			break;
		case 673:
			sendNpcChat3("Greetings, "+c.playerName+"! You haven't faced the KBD yet, have you?", "He is quite the dragon to boast of!", "But alas! You could obtain the Dragonfire Shield!", c.talkingNpc, "Squire");
			break;
		case 11:
			sendNpcChat1("'Ello, and what are you after then?", c.talkingNpc, "Chaeldar");
			c.nextChat = 12;
		break;
		case 300:
			sendOption2("Lock EXP", "Unlock EXP");
			c.dialogueAction = 300;
		break;
		case 310:
			if(c.lockedEXP == 1) {
			sendNpcChat1("Your EXP has been unlocked!",c.talkingNpc, "XP Lock");
		c.lockedEXP = 0;
		} else {
	sendNpcChat1("Your EXP is already unlocked!",c.talkingNpc, "XP Lock");
	}
			c.nextChat = 0;
		break;
		case 320:
		if(c.lockedEXP == 0) {
			sendNpcChat1("Your EXP has been locked!",c.talkingNpc, "XP Lock");
	c.lockedEXP = 1;
		} else {
	sendNpcChat1("Your EXP is already locked!",c.talkingNpc, "XP Lock");
	}
			c.nextChat = 0;
		break;
        /*
        * Slayer Gem
        */
        case 784:
        sendStatement("I currently have " + c.taskAmount + " " + GameServer.npcHandler.getNpcListName(c.slayerTask) + ".");
        c.nextChat = 0;
        break;
		case 12:
			sendOption2("I need an assignment.", "Err... nothing.");
			c.dialogueAction = 5;
		break;
		case 13:
			sendNpcChat1("'Ello, and what are you after then?", c.talkingNpc, "Chaeldar");
			c.nextChat = 14;
		break;
		case 14:
			sendOption2("I need another assignment.", "Err... nothing.");
			c.dialogueAction = 6;
		break;
		case 15:
			sendOption2("Yes I would like to play", "No, sounds too dangerous for me.");
			c.dialogueAction = 7;
		break;
		case 16:
			sendOption2("I would like to reset my barrows count.", "I would like to fix all my barrows");
			c.dialogueAction = 8;
		break;
		case 17:
			sendOption5("Air altar", "Mind altar", "Water altar", "Earth altar", "More");
			c.dialogueAction = 10;
			c.dialogueId = 17;
			c.teleAction = -1;
		break;
		case 18:
			sendOption5("Fire altar", "Body altar", "Cosmic altar", "Astral altar", "More");
			c.dialogueAction = 11;
			c.dialogueId = 18;
			c.teleAction = -1;
		break;
		case 19:
			sendOption5("Nature altar", "Law altar", "Death altar", "Blood altar", "More");
			c.dialogueAction = 12;
			c.dialogueId = 19;
			c.teleAction = -1;
		break;
		
		case 57:
			c.getAssistant().sendFrame126("Teleport to shops?", 2460);
			c.getAssistant().sendFrame126("Yes.", 2461);
			c.getAssistant().sendFrame126("No.", 2462);
			c.getAssistant().sendFrame164(2459);
			c.dialogueAction = 27;
		break;
		case 58:
			sendNpcChat1("Where would you like me to take you?", c.talkingNpc, "Sailor");
			c.nextChat = 59;
		break;
		case 59:
			sendOption3("Port Phasmatys", "Karamja", "Brimhaven");
			c.dialogueAction = 13;
			c.dialogueId = 59;
			c.teleAction = -1;
			break;
		case 60:
			sendNpcChat1("Welcome to the church of Entrana, my brother.", c.talkingNpc, "Brother Jered");
			c.nextChat = 61;
			break;
		case 61:
			sendPlayerChat1("Thanks, brother Jered.");
			c.nextChat = 0;
			break;
		case 62:
			sendStatement("This is your first time playing, welcome to Rune-Honor!");
			c.nextChat = 458;
			break;
		case 458:
			sendStatement("Use ::help if you want to request staff assistance.");
			c.nextChat = 459;
			break;
		case 459:
			sendStatement("Please speak to the RuneHonor Guide to begin your adventure!");
			c.nextChat = -1;
			break;
		case 460:
			sendNpcChat2("Greetings, noble adventurer.", "You seem quite dazed. Is everything alright?", 3123, "Rune-Honor Guide");
			c.nextChat = 461;
			break;
		case 461:
			sendPlayerChat1("Err... I can't seem to remember. Where am I?");
			c.nextChat = 462;
			break;
		case 462:
			sendNpcChat3("Why, you've stumbled upon the land of " +Constants.SERVER_NAME+ ".",
						 "This land has welcomed many an adventurer such as yourself.", 
						 "Alas, on with the point!", 3123, "RuneHonor Guide");
			c.nextChat = 463;
			break;
		case 463:
			sendNpcChat4("To the north lies the forbidden land of the wilderness. It should",
						"be mentioned that other players may attack you, so stay safe! You",
						"might even find it useful to pick up wealth at the legendary tombs", 
						"of the @blu@Barrows brothers@bla@, or even the fabled @blu@Castle Wars@bla@!", 
						3123, "Rune-Honor Guide");
			c.nextChat = 464;
			break;
		case 464:
			sendNpcChat4("Should you wish to train, the noble wizards of our land have provided", 
						 "extensive teleports that may be found in your @blu@Teleports @bla@tab.",
						 "You might find these useful, as " +Constants.SERVER_NAME+ " is quite a large land.", 
						 "Of course, you needn't any runes for this process.", 3123, "Rune-Honor Guide");
			c.nextChat = 465;
			break;
		case 465:
			sendNpcChat4("Ah, where was I? Precious coins may be obtained through trade", 
						 "and interaction with other players. Be aware of scams, as you may be",
						 "unable to re-obtain your items! However, looting other players may prove", 
						 "a worthy process in its own, should you play by the rules.", 3123, "Rune-Honor Guide");
		c.nextChat = 466;
		break;
		case 466:
			sendNpcChat4("Of course, you may also take into account that competition is key, and ",
						 "and you'll find that killing other players also yields @blu@PK Points,", 
						 "a currency accepted only by some of the most prestigious and treacherous", 
						 "of collectors.", 3123, "Rune-Honor Guide");
			c.nextChat = 467;
			break;
		case 467:
			//sendPlayerChat1("Hmm.. Seems rather interesting..");
			sendStatement("You begin to doze off as the guide rambles on...");
			c.nextChat = 468;
			break;
		case 468:
			sendNpcChat2("Blimey! Am I boring you quite to death? My deepest apologies",
						 Misc.formatPlayerName(c.playerName)+ ". I shall hasten my speech a bit!", 3123, "Rune-Honor Guide");
			c.nextChat = 470;
			break;
		case 470:
			sendNpcChat2("Allow me to give you a brief tour. By using your", 
						 "spellbook, you may travel almost anywhere in " +Constants.SERVER_NAME+ "!", 3123, "Rune-Honor Guide");
			c.nextChat = 599;
			break;
		case 599:
			c.fadeStarterTele(3094, 3478, 0);
			//c.nextChat = 597;
			break;
		case 700:
			c.fadeStarterTele2(3025, 3218, 0);
			//c.nextChat = 598;
			break;
		case 597:
			sendNpcChat2("This area is home to just a few of " + Constants.SERVER_NAME + "'s many shops.", 
						 "Here you will find most items you need to begin your adventure!", 3123, "Rune-Honor Guide");
			c.nextChat = 700;
			break;
		case 598:
			sendNpcChat2("Here you can sail to cities and monsters.", "Just talk to one of the NPCs which are standing here!", 3123, "Rune-Honor Guide");
			c.nextChat = 701;
			break;
		case 701:
			c.fadeStarterTele3(3087, 3505, 0);
			//c.nextChat = 471;
			break;
		case 471:
			sendNpcChat4("I believe that is all that I have to impart. If all else fails, ", 
						 "you may use the Clan Chat to ask other players for help, or you may", 
						 "contact a Player Moderator; they are always willing to help!",
						 "Guides may also be posted on the forums. Now, please choose a starter.", 3123, "Rune-Honor Guide"); //goodluck  
			c.nextChat = 472;
		break;
		case 472:
			sendStatement("Please choose a class type");
			c.nextChat = 515;
			break;
		case 515:
			sendOption4("Adventurer", "Pker", "Skiller", "@dre@NEW!@bla@ Iron Man");
			c.dialogueAction = 515;
			break;
		case 473:
			sendStatement("You have chosen " + (c.classType == PlayerClass.IRONMAN ? 
						  "@dre@IronMan Mode." : "the @dre@" + c.classType + " @bla@class."));
			c.nextChat = 516;
			c.completedTut = true;
			break;
		/** 
		 * Rune-Honor Guide
		 */
		case 474:
			if (c.playerRights < 1 && c.playerRights <= 3) {
				sendNpcChat1("Greetings, adventurer. How've you faired thus far?", 3123, "Rune-Honor Guide");
				c.nextChat = 475;
			} else {
				sendNpcChat1("Greetings, " +c.playerName+ ". Is there something I can assist you with?", 3123, "Rune-Honor Guide");
				c.nextChat = (c.playerRights == 1 && !ModeratorObjects.modroomEnabled() ? 475 : 495);
			}
			break;
		case 475: 
			sendPlayerChat1("I'm fine, thanks.");
			c.nextChat = 0;
			break;
		case 495: 
				sendOption2("Could you teleport me to the moderator room?", "No, thanks.");
				c.dialogueAction = 495;
			break;
		/** - END - **/
		case 516:
			sendNpcChat1("Fancy a makeover? Let's change your appearance!", 599, "Make-over mage");
			c.nextChat = 517;
			break;
		case 517:
			c.getAssistant().showInterface(3559); 
			c.canChangeAppearance = true;
			c.nextChat = 0;
			break;
		case 518:
			sendNpcChat1("Good luck in your ventures, "+c.playerName+".", 599, "Make-over mage");
			c.nextChat = 519;
			break;
		case 519:
			sendNpcChat1("Ah! I've almost forgotten!", 3123, "Rune-Honor Guide");
			c.nextChat = 520;
			break;
		case 520:
			sendNpcChat4("For optimal conditioning and safety reasons, you must",
						 "choose an Experience rate. Choose carefully, as",
						 "you will be unable to change your XP rate should you change",
						 "your mind.", 3123, "Rune-Honor Guide");
			c.nextChat = 521;
			break;
		case 521:
			sendStatement("Please choose an experience rate.");
			c.nextChat = 522;
			break;
		case 522:
			sendOption4("Easy", "Normal", "Hard", "Extreme (x4 Runescape's)");
			c.dialogueAction = 522;
		break;
		case 523:
			if(!c.canWalk) 
				if (c.classType != PlayerClass.IRONMAN) {
					c.canWalk = true;
				}
			c.getAssistant().setSidebarInterfaces(c, true);
			sendNpcChat1("Good luck, "+c.playerName+".", 3123, "Rune-Honor Guide");
			c.sendMessage("Good luck, "+c.playerName+"!");
			if (c.classType != PlayerClass.IRONMAN) {
			c.nextChat = 0;
			} else { 
				c.nextChat = 524;
			}
			break;
		case 524: 
			sendStatement3("@blu@Ironman Mode @bla@ is a mode in which you are unable to", 
						   "interact with other players. Please log out to receive", 
						   "your icon, then log back in.");
			c.playerRights = 9;
			c.canWalk = true;
			c.nextChat = 0;
			break;
		case 63:
			sendNpcChat1("Would you like to change your appearance?", c.talkingNpc, "Make-over mage");
			c.nextChat = 64;
			break;
		case 64:
			sendOption2("Yes please.", "No thanks.");
			c.dialogueAction = 14;
			c.dialogueId = 64;
			break;
		case 65:
			sendPlayerChat1("No thanks.");
			c.nextChat = 0;
			break;
		case 66:
			sendNpcChat1("Do you want to take a look at my fishing supplies?", c.talkingNpc, "Master fisher");
			c.nextChat = 67;
			break;
		case 67:
			sendOption2("Yes.", "No.");
			c.dialogueAction = 15;
			c.dialogueId = 67;
			break;
		case 68:
			sendOption3("Duel Arena", "Barrows", "The TzHaar City");
			c.dialogueAction = 16;
			c.dialogueId = 68;
			break;
		case 69:
			sendNpcChat2("You even defeated TzTok-Jad, I am most impressed!", "Please accept this gift as a reward.", c.talkingNpc, "Tzhaar-Mej-Tal");
			c.nextChat = -1;
			break;
		case 70:
			sendNpcChat2("Hey, do you want me to bring you into the icy cavern?", "I can't help you in there though, it's too dangerous.", c.talkingNpc, "Wizard Mizgog");
			c.nextChat = 71;
			break;
		case 71:
			sendStatement4("@red@WARNING!", "This cavern contains very dangerous monsters.", "You can only escape by teleporting.", "Do you really want to enter?");
			c.nextChat = 72;
			break;
		case 72:
			sendOption2("Yes, follow Mizgog into the cavern.", "No.");
			c.dialogueAction = 17;
			c.dialogueId = 69;
			break;
		case 73:
			sendNpcChat1("Hello " + Misc.capitalize(c.playerName) + ", take a look at my herblore supplies!", c.talkingNpc, "Kaqemeex");
			c.nextChat = 74;
			break;
		case 74:
			c.getShops().openShop(12);
			break;
		case 75:
			sendNpcChat2("Hello sir, I am specialized in tribal weaponry. Do you", "want to take a look at my shop?", c.talkingNpc, "Tribal Weapon Salesman");
			c.nextChat = 76;
			break;
		case 76:
			sendOption2("Sure, why not?", "Not right now.");
			c.dialogueAction = 18;
			c.dialogueId = 76;
			break;
		case 77:
			sendNpcChat1("Hello, do you want to take a look at my farming shop?", c.talkingNpc, "Farmer Brumty");
			c.nextChat = 78;
			break;
		case 78:
			sendOption2("Yes, I'm in need of farming supplies.", "No thanks.");
			c.dialogueAction = 19;
			c.dialogueId = 78;
			break;
		case 79:
			sendStatement2("The ship will take you to the river troll's island.", "Are you sure you want to go?");
			c.nextChat = 80;
			break;
		case 80:
			sendOption2("Yes!", "No.");
			c.dialogueAction = 20;
			c.dialogueId = 80;
			break;
		case 81:
			sendNpcChat1("Do you want me to teleport you to the slayer tower?", c.talkingNpc, "Old Man");
			c.nextChat = 82;
			break;
		case 82:
			sendOption2("Yes.", "No.");
			c.dialogueAction = 21;
			c.dialogueId = 82;
			break;
		case 83:
			sendOption2("Teleport to rock crabs.", "Nevermind.");
			c.dialogueAction = 22;
			c.dialogueId = 83;
			break;
		case 84:
			sendNpcChat2("Hello. I can provide you with equipment", 
						 "finely crafted by the dwarves themselves. Would you like to see?", 
						 c.talkingNpc, "Bandit shopkeeper");
			c.nextChat = 85;
			break;
		case 85:
			sendOption2("Sure.", "No thanks.");
			c.dialogueAction = 23;
			c.dialogueId = 85;
			break;
		case 86:
			sendNpcChat1("Pickaxes 'fer sale! Care 'tah look?", c.talkingNpc, "Nulodion");
			c.nextChat = 87;
			break;
		case 87:
			sendOption2("Yes.", "No thanks.");
			c.dialogueAction = 24;
			c.dialogueId = 87;
			break;
		case 88:
			sendNpcChat1("Do you want to go to the gnome agility course?", c.talkingNpc, "Gnome");
			c.nextChat = 89;
			break;
		case 89:
			sendOption2("Yes.", "No thanks.");
			c.dialogueAction = 25;
			c.dialogueId = 89;
			break;
	/*
	 * Banker dialogues
	 */
		case 1000:
		sendNpcChat1("Good day, how may I help you?", c.talkingNpc, "Banker");
		c.nextChat = 1001;
		break;
		case 1001:
		sendPlayerChat1("I would like to access my bank account.");
		c.nextChat = 1002;
		break;
		case 1002:
		sendNpcChat1("Only too happy to help you, sir.", c.talkingNpc, "Banker");
		c.nextChat = 1003;
		break;
		case 1003:
		c.getAssistant().openUpBank();
		c.nextChat = 0;
		c.dialogueAction = -1;
		c.teleAction = -1;
		break;
		
	/*
	 * Zaff dialogues
	 */
		case 1004:
		sendNpcChat1("Hello "+Misc.capitalize(c.playerName)+"!", c.talkingNpc, "Zaff");
		c.nextChat = 1005;
		break;
		case 1005:
		sendPlayerChat1("Hello Zaff.");
		c.nextChat = 1006;
		break;
		case 1006:
		sendNpcChat1("So how are you today?", c.talkingNpc, "Zaff");
		c.nextChat = 1007;
		break;
		case 1007:
		sendPlayerChat1("I'm fine!");
		c.nextChat = 0;
		break;
		
	/*
	 * Thessalia dialogues
	 */
		case 1008:
		sendNpcChat1("Hello.", c.talkingNpc, "Thessalia");
		c.nextChat = 1009;
		break;
		case 1009:
		sendPlayerChat1("Hello Thessalia, how are you?");
		c.nextChat = 1010;
		break;
		case 1010:
		sendNpcChat1("Quite alright, I guess. And yourself?", c.talkingNpc, "Thessalia");
		c.nextChat = 1011;
		break;
		case 1011:
		sendPlayerChat1("I'm alright.");
		c.nextChat = 1012;
		break;
		case 1012:
		sendNpcChat2("Would you like to buy", "fine-quality clothes?", c.talkingNpc, "Thessalia");
		c.nextChat = 1013;
		break;
		case 1013:
		sendPlayerChat1("Certainly!");
		c.nextChat = 0;
		break;

	/*
	 * Random.
	 */
	 	case 996:
		sendNpcChat1("I don't want to talk to people unexperienced with magic!", c.talkingNpc, "Aubury");
		c.nextChat = 0;
		break;
	 	case 997:
		sendNpcChat1("Take a look in the chest over there.", c.talkingNpc, "Tramp");
		c.nextChat = 0;
		break;
	 	case 999:
		sendNpcChat1("Hello!", c.talkingNpc, "Shop Keeper");
		c.nextChat = 0;
		break;
	 	case 998:
		sendNpcChat1("You have no business here!", c.talkingNpc, "Guard");
		c.nextChat = 0;
		break;
	 	case 2000:
	 		sendNpcChat1("Hello, how are you?", c.talkingNpc, "");
	 		c.nextChat = 2001;
	 	break;
	 	case 2001:
	 		sendPlayerChat1("I'm fine, thank you.");
	 		c.nextChat = 0;
	 		break;
		}
	}
	
	

	
	/*
	 * Information Box
	 */
	
	public void sendStartInfo(String text, String text1, String text2, String text3, String title) {
		c.getAssistant().sendFrame126(title, 6180);
		c.getAssistant().sendFrame126(text, 6181);
		c.getAssistant().sendFrame126(text1, 6182);
		c.getAssistant().sendFrame126(text2, 6183);
		c.getAssistant().sendFrame126(text3, 6184);
		c.getAssistant().sendFrame164(6179);
	}
	
	/*
	 * Item chat
	 */
	
	public void sendItemChat1(String header, String one, int item, int zoom) {
		c.getAssistant().sendFrame246(4883, zoom, item);
		c.getAssistant().sendFrame126(header, 4884);
		c.getAssistant().sendFrame126(one, 4885);
		c.getAssistant().sendFrame164(4882);
	}

	public void sendItemChat2(String header, String one, String two, int item, int zoom) {
		c.getAssistant().sendFrame246(4888, zoom, item);
		c.getAssistant().sendFrame126(header, 4889);
		c.getAssistant().sendFrame126(one, 4890);
		c.getAssistant().sendFrame126(two, 4891);
		c.getAssistant().sendFrame164(4887);
	}

	public void sendItemChat3(String header, String one, String two, String three, int item, int zoom) {
		c.getAssistant().sendFrame246(4894, zoom, item);
		c.getAssistant().sendFrame126(header, 4895);
		c.getAssistant().sendFrame126(one, 4896);
		c.getAssistant().sendFrame126(two, 4897);
		c.getAssistant().sendFrame126(three, 4898);
		c.getAssistant().sendFrame164(4893);
	}

	public void sendItemChat4(String header, String one, String two, String three, String four, int item, int zoom) {
		c.getAssistant().sendFrame246(4901, zoom, item);
		c.getAssistant().sendFrame126(header, 4902);
		c.getAssistant().sendFrame126(one, 4903);
		c.getAssistant().sendFrame126(two, 4904);
		c.getAssistant().sendFrame126(three, 4905);
		c.getAssistant().sendFrame126(four, 4906);
		c.getAssistant().sendFrame164(4900);
	}

	/*
	 * Statements
	 */
	
	private void sendStatement2(String s, String s1) {
		c.getAssistant().sendFrame126(s, 360);
		c.getAssistant().sendFrame126(s1, 361);
		c.getAssistant().sendFrame126("Click here to continue", 362);
		c.getAssistant().sendFrame164(359);
	}
	
	@SuppressWarnings("unused")
	private void sendStatement3(String s, String s1, String s2) {
		c.getAssistant().sendFrame126(s, 364);
		c.getAssistant().sendFrame126(s1, 365);
		c.getAssistant().sendFrame126(s2, 366);
		c.getAssistant().sendFrame126("Click here to continue", 367);
		c.getAssistant().sendFrame164(363);
	}
	
	private void sendStatement4(String s, String s1, String s2, String s3) {
		c.getAssistant().sendFrame126(s, 369);
		c.getAssistant().sendFrame126(s1, 370);
		c.getAssistant().sendFrame126(s2, 371);
		c.getAssistant().sendFrame126(s3, 372);
		c.getAssistant().sendFrame126("Click here to continue", 373);
		c.getAssistant().sendFrame164(368);
	}
	
	@SuppressWarnings("unused")
	private void sendStatement5(String s, String s1, String s2, String s3, String s4) {
		c.getAssistant().sendFrame126(s, 375);
		c.getAssistant().sendFrame126(s1, 376);
		c.getAssistant().sendFrame126(s2, 377);
		c.getAssistant().sendFrame126(s3, 378);
		c.getAssistant().sendFrame126(s4, 379);
		c.getAssistant().sendFrame126("Click here to continue", 380);
		c.getAssistant().sendFrame164(374);
	}
	
	/*
	 * Npc Chatting
	 */
	
	private void sendNpcChat1(String s, int ChatNpc, String name) {
		c.getAssistant().sendFrame200(4883, 591);
		c.getAssistant().sendFrame126(name, 4884);
		c.getAssistant().sendFrame126(s, 4885);
		c.getAssistant().sendFrame75(ChatNpc, 4883);
		c.getAssistant().sendFrame164(4882);
	}
	
	public void sendNpcChat2(String s, String s1, int ChatNpc, String name) {
		c.getAssistant().sendFrame200(4888, 591);
		c.getAssistant().sendFrame126(name, 4889);
		c.getAssistant().sendFrame126(s, 4890);
		c.getAssistant().sendFrame126(s1, 4891);
		c.getAssistant().sendFrame75(ChatNpc, 4888);
		c.getAssistant().sendFrame164(4887);
	}

	private void sendNpcChat3(String s, String s1, String s2, int ChatNpc, String name) {
		c.getAssistant().sendFrame200(4894, 591);
		c.getAssistant().sendFrame126(name, 4895);
		c.getAssistant().sendFrame126(s, 4896);
		c.getAssistant().sendFrame126(s1, 4897);
		c.getAssistant().sendFrame126(s2, 4898);
		c.getAssistant().sendFrame75(ChatNpc, 4894);
		c.getAssistant().sendFrame164(4893);
	}
	
	private void sendNpcChat4(String s, String s1, String s2, String s3, int ChatNpc, String name) {
		c.getAssistant().sendFrame200(4901, 591);
		c.getAssistant().sendFrame126(name, 4902);
		c.getAssistant().sendFrame126(s, 4903);
		c.getAssistant().sendFrame126(s1, 4904);
		c.getAssistant().sendFrame126(s2, 4905);
		c.getAssistant().sendFrame126(s3, 4906);
		c.getAssistant().sendFrame75(ChatNpc, 4901);
		c.getAssistant().sendFrame164(4900);
	}
	
	/*
	 * Player Chating Back
	 */
	
	private void sendPlayerChat1(String s) {
		c.getAssistant().sendFrame200(969, 591);
		c.getAssistant().sendFrame126(Misc.capitalize(c.playerName), 970);
		c.getAssistant().sendFrame126(s, 971);
		c.getAssistant().sendFrame185(969);
		c.getAssistant().sendFrame164(968);
	}
	
	private void sendPlayerChat2(String s, String s1) {
		c.getAssistant().sendFrame200(974, 591);
		c.getAssistant().sendFrame126(Misc.capitalize(c.playerName), 975);
		c.getAssistant().sendFrame126(s, 976);
		c.getAssistant().sendFrame126(s1, 977);
		c.getAssistant().sendFrame185(974);
		c.getAssistant().sendFrame164(973);
	}
	
	private void sendPlayerChat3(String s, String s1, String s2) {
		c.getAssistant().sendFrame200(980, 591);
		c.getAssistant().sendFrame126(Misc.capitalize(c.playerName), 981);
		c.getAssistant().sendFrame126(s, 982);
		c.getAssistant().sendFrame126(s1, 983);
		c.getAssistant().sendFrame126(s2, 984);
		c.getAssistant().sendFrame185(980);
		c.getAssistant().sendFrame164(979);
	}
	
	@SuppressWarnings("unused")
	private void sendPlayerChat4(String s, String s1, String s2, String s3) {
		c.getAssistant().sendFrame200(987, 591);
		c.getAssistant().sendFrame126(Misc.capitalize(c.playerName), 988);
		c.getAssistant().sendFrame126(s, 989);
		c.getAssistant().sendFrame126(s1, 990);
		c.getAssistant().sendFrame126(s2, 991);
		c.getAssistant().sendFrame126(s3, 992);
		c.getAssistant().sendFrame185(987);
		c.getAssistant().sendFrame164(986);
	}
	
	public String npcName(){
	String npcName;
	if(c.talkingNpc <1 ){
	npcName = "";}
	else {
	npcName = NPCHandler.NpcList[c.talkingNpc].npcName;}
	return npcName;
	}
       
     public void sendPlayerChat(String[] lineamount, int emote){
     switch(lineamount.length){
     case 1 :
                sendPlayerChat(lineamount[0], emote);
                break;
            case 2 :
                sendPlayerChat(lineamount[0], lineamount[1], emote);
                break;
            case 3 :
                sendPlayerChat(lineamount[0], lineamount[1], lineamount[2], emote);
                break;
            case 4 :
                sendPlayerChat(lineamount[0], lineamount[1], lineamount[2], lineamount[3], emote);
                break;
     }
     }
	 public void sendOption(String[] lineamount){
	 switch(lineamount.length){
     case 2 :
                sendOption2(lineamount[0], lineamount[1]);
                break;
            case 3 :
                sendOption3(lineamount[0], lineamount[1], lineamount[2]);
                break;
            case 4 :
                sendOption4(lineamount[0], lineamount[1], lineamount[2], lineamount[3]);
                break;
            case 5 :
                sendOption5(lineamount[0], lineamount[1], lineamount[2], lineamount[3], lineamount[4]);
                break;
     }
	 }
	
	public void sendNpcChat(String[] lineamount, int emote, String name){
	switch(lineamount.length){
            case 1 :
                sendNpcChat(lineamount[0], emote, name);
                break;
            case 2 :
                sendNpcChat(lineamount[0], lineamount[1], emote, name);
                break;
            case 3 :
                sendNpcChat(lineamount[0], lineamount[1], lineamount[2], emote, name);
                break;
            case 4 :
                sendNpcChat(lineamount[0], lineamount[1], lineamount[2], lineamount[3], emote, name);
                break;
      
     }
	}

	public void sendOption(String s) {
		c.getAssistant().sendFrame126("Select an Option", 2470);
	 	c.getAssistant().sendFrame126(s, 2471);
		c.getAssistant().sendFrame126("Click here to continue", 2473);
		c.getAssistant().sendFrame164(13758);
	}	
	
	public void sendOption2(String s, String s1) {
		c.getAssistant().sendFrame126("Select an Option", 2460);
		c.getAssistant().sendFrame126(s, 2461);
		c.getAssistant().sendFrame126(s1, 2462);
		c.getAssistant().sendFrame164(2459);
	}
	
	public void sendOption3(String s, String s1, String s2) {
		c.getAssistant().sendFrame126("Select an Option", 2470);
		c.getAssistant().sendFrame126(s, 2471);
		c.getAssistant().sendFrame126(s1, 2472);
		c.getAssistant().sendFrame126(s2, 2473);
		c.getAssistant().sendFrame164(2469);
	}
	
	public void sendOption4(String s, String s1, String s2, String s3) {
		c.getAssistant().sendFrame126("Select an Option", 2481);
		c.getAssistant().sendFrame126(s, 2482);
		c.getAssistant().sendFrame126(s1, 2483);
		c.getAssistant().sendFrame126(s2, 2484);
		c.getAssistant().sendFrame126(s3, 2485);
		c.getAssistant().sendFrame164(2480);
	}
	
	public void sendOption5(String s, String s1, String s2, String s3, String s4) {
		c.getAssistant().sendFrame126("Select an Option", 2493);
		c.getAssistant().sendFrame126(s, 2494);
		c.getAssistant().sendFrame126(s1, 2495);
		c.getAssistant().sendFrame126(s2, 2496);
		c.getAssistant().sendFrame126(s3, 2497);
		c.getAssistant().sendFrame126(s4, 2498);
		c.getAssistant().sendFrame164(2492);
	}

	public void sendStatement(String s) { // 1 line click here to continue chat box interface
		c.nextChat = 0;
		c.getAssistant().sendFrame126(s, 357);
		c.getAssistant().sendFrame126("Click here to continue", 358);
		c.getAssistant().sendFrame164(356);
	}

	public void sendNpcChat(String s, int emote, String name) {
		c.getAssistant().sendFrame200(4883, emote);
		c.getAssistant().sendFrame126(name, 4884);
		c.getAssistant().sendFrame126(s, 4885);
		c.getAssistant().sendFrame75(c.npcType, 4883);
		c.getAssistant().sendFrame164(4882);
	}
	
	public void sendNpcChat(String s, String s1, int emote, String name) {
		c.getAssistant().sendFrame200(4888, emote);
		c.getAssistant().sendFrame126(name, 4889);
		c.getAssistant().sendFrame126(s, 4890);
		c.getAssistant().sendFrame126(s1, 4891);
		c.getAssistant().sendFrame75(c.npcType, 4888);
		c.getAssistant().sendFrame164(4887);
	}
	
	public void sendNpcChat2(String s, String s1, String name, int emote) {
		c.getAssistant().sendFrame200(4888, emote);
		c.getAssistant().sendFrame126(name, 4889);
		c.getAssistant().sendFrame126(s, 4890);
		c.getAssistant().sendFrame126(s1, 4891);
		c.getAssistant().sendFrame75(c.npcType, 4888);
		c.getAssistant().sendFrame164(4887);
	}

	private void sendNpcChat(String s, String s1, String s2, int emote, String name) {
		c.getAssistant().sendFrame200(4894, emote);
		c.getAssistant().sendFrame126(name, 4895);
		c.getAssistant().sendFrame126(s, 4896);
		c.getAssistant().sendFrame126(s1, 4897);
		c.getAssistant().sendFrame126(s2, 4898);
		c.getAssistant().sendFrame75(c.npcType, 4894);
		c.getAssistant().sendFrame164(4893);
	}
	
	private void sendNpcChat(String s, String s1, String s2, String s3, int emote, String name) {
		c.getAssistant().sendFrame200(4901, emote);
		c.getAssistant().sendFrame126(name, 4902);
		c.getAssistant().sendFrame126(s, 4903);
		c.getAssistant().sendFrame126(s1, 4904);
		c.getAssistant().sendFrame126(s2, 4905);
		c.getAssistant().sendFrame126(s3, 4906);
		c.getAssistant().sendFrame75(c.npcType, 4901);
		c.getAssistant().sendFrame164(4900);
	}
	
	public void sendPlayerChat(String s, int emote) {
		c.getAssistant().sendFrame200(969, emote);
		c.getAssistant().sendFrame126(c.playerName, 970);
		c.getAssistant().sendFrame126(s, 971);
		c.getAssistant().sendFrame185(969);
		c.getAssistant().sendFrame164(968);
	}
	
	private void sendPlayerChat(String s, String s1, int emote) {
		c.getAssistant().sendFrame200(974, emote);
		c.getAssistant().sendFrame126(c.playerName, 975);
		c.getAssistant().sendFrame126(s, 976);
		c.getAssistant().sendFrame126(s1, 977);
		c.getAssistant().sendFrame185(974);
		c.getAssistant().sendFrame164(973);
	}
	
	private void sendPlayerChat(String s, String s1, String s2, int emote) {
		c.getAssistant().sendFrame200(980, emote);
		c.getAssistant().sendFrame126(c.playerName, 981);
		c.getAssistant().sendFrame126(s, 982);
		c.getAssistant().sendFrame126(s1, 983);
		c.getAssistant().sendFrame126(s2, 984);
		c.getAssistant().sendFrame185(980);
		c.getAssistant().sendFrame164(979);
	}
	
	private void sendPlayerChat(String s, String s1, String s2, String s3, int emote) {
		c.getAssistant().sendFrame200(987, emote);
		c.getAssistant().sendFrame126(c.playerName, 988);
		c.getAssistant().sendFrame126(s, 989);
		c.getAssistant().sendFrame126(s1, 990);
		c.getAssistant().sendFrame126(s2, 991);
		c.getAssistant().sendFrame126(s3, 992);
		c.getAssistant().sendFrame185(987);
		c.getAssistant().sendFrame164(986);
	}
	
	public final int 
HAPPY = 588, 
CALM = 589, 
CALM_CONTINUED = 590, 
CONTENT = 591, 
EVIL = 592, 
EVIL_CONTINUED = 593, 
DELIGHTED_EVIL = 594, 
ANNOYED = 595, 
DISTRESSED = 596, 
DISTRESSED_CONTINUED = 597, 
NEAR_TEARS = 598,
SAD = 599, 
DISORIENTED_LEFT = 600, 
DISORIENTED_RIGHT = 601, 
UNINTERESTED = 602, 
SLEEPY = 603, 
PLAIN_EVIL = 604, 
LAUGHING = 605, 
LONGER_LAUGHING = 606, 
LONGER_LAUGHING_2 = 607, 
LAUGHING_2 = 608, 
EVIL_LAUGH_SHORT = 609, 
SLIGHTLY_SAD = 610, 
VERY_SAD = 611, 
OTHER = 612, 
NEAR_TEARS_2 = 613, 
ANGRY_1 = 614, 
ANGRY_2 = 615, 
ANGRY_3 = 616, 
ANGRY_4 = 617;
}
