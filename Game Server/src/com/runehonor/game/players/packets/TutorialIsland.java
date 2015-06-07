package com.runehonor.game.players.packets;

import com.runehonor.content.skills.misc.SkillConstants;
import com.runehonor.game.players.Client;

public class TutorialIsland
{
	public Client client;
	public TutorialIsland(Client client) {
		this.client = client;
	}

	public static void ATTACK(Client client, int i) {
		int skillcape[] = {9748};
		String master[] = {"Vannaka"};
		String place[] = {"Edgeville Dungeon"};
		String skill[] = {"attack"};
		client.getAssistant().sendFrame246(4901, 290, skillcape[i]);
        client.getAssistant().sendFrame126("", 4902);
        client.getAssistant().sendQuest("Congratulations! You are now a master of Attack!", 4903);
        client.getAssistant().sendQuest("Why not visit " + master[i] + " at " + place[i] + "?", 4904);
        client.getAssistant().sendQuest("He has something special that is only", 4905);
        client.getAssistant().sendQuest("available to true masters of the " + skill[i] + " skill!", 4906);
        client.getAssistant().sendFrame164(4900);
	}
	public static void DEFENCE(Client client, int i) {
		int skillcape[] = {9754};
		String master[] = {"Defence Master"};
		String place[] = {"Varrock Palace"};
		String skill[] = {"defence"};
		client.getAssistant().sendFrame246(4901, 290, skillcape[i]);
        client.getAssistant().sendFrame126("", 4902);
        client.getAssistant().sendQuest("Congratulations! You are now a master of Defence!", 4903);
        client.getAssistant().sendQuest("Why not visit " + master[i] + " at " + place[i] + "?", 4904);
        client.getAssistant().sendQuest("He has something special that is only", 4905);
        client.getAssistant().sendQuest("available to true masters of the " + skill[i] + " skill!", 4906);
        client.getAssistant().sendFrame164(4900);
	}
	public static void STRENGTH(Client client, int i) {
		int skillcape[] = {9751};
		String master[] = {"Sloane"};
		String place[] = {"Warrior Guild"};
		String skill[] = {"strength"};
		client.getAssistant().sendFrame246(4901, 290, skillcape[i]);
        client.getAssistant().sendFrame126("", 4902);
        client.getAssistant().sendQuest("Congratulations! You are now a master of Strength!", 4903);
        client.getAssistant().sendQuest("Why not visit " + master[i] + " at " + place[i] + "?", 4904);
        client.getAssistant().sendQuest("He has something special that is only", 4905);
        client.getAssistant().sendQuest("available to true masters of the " + skill[i] + " skill!", 4906);
        client.getAssistant().sendFrame164(4900);
	}
	public static void HITPOINTS(Client client, int i) {
		int skillcape[] = {9769};
		String master[] = {"Surgeon General"};
		String place[] = {"Duel Arena"};
		String skill[] = {"hitpoints"};
		client.getAssistant().sendFrame246(4901, 290, skillcape[i]);
        client.getAssistant().sendFrame126("", 4902);
        client.getAssistant().sendQuest("Congratulations! You are now a master of Hitpoints!", 4903);
        client.getAssistant().sendQuest("Why not visit " + master[i] + " at " + place[i] + "?", 4904);
        client.getAssistant().sendQuest("He has something special that is only", 4905);
        client.getAssistant().sendQuest("available to true masters of the " + skill[i] + " skill!", 4906);
        client.getAssistant().sendFrame164(4900);
	}
	public static void RANGING(Client client, int i) {
		int skillcape[] = {9757};
		String master[] = {"Armour salesman"};
		String place[] = {"Rangers Guild"};
		String skill[] = {"ranging"};
		client.getAssistant().sendFrame246(4901, 290, skillcape[i]);
        client.getAssistant().sendFrame126("", 4902);
        client.getAssistant().sendQuest("Congratulations! You are now a master of Ranging!", 4903);
        client.getAssistant().sendQuest("Why not visit " + master[i] + " at " + place[i] + "?", 4904);
        client.getAssistant().sendQuest("He has something special that is only", 4905);
        client.getAssistant().sendQuest("available to true masters of the " + skill[i] + " skill!", 4906);
        client.getAssistant().sendFrame164(4900);
	}
	public static void PRAYER(Client client, int i) {
		int skillcape[] = {9760};
		String master[] = {"Brother Jered"};
		String place[] = {"Prayer Guild"};
		String skill[] = {"prayer"};
		client.getAssistant().sendFrame246(4901, 290, skillcape[i]);
        client.getAssistant().sendFrame126("", 4902);
        client.getAssistant().sendQuest("Congratulations! You are now a master of Ranging!", 4903);
        client.getAssistant().sendQuest("Why not visit " + master[i] + " at " + place[i] + "?", 4904);
        client.getAssistant().sendQuest("He has something special that is only", 4905);
        client.getAssistant().sendQuest("available to true masters of the " + skill[i] + " skill!", 4906);
        client.getAssistant().sendFrame164(4900);
	}
	public static void MAGIC(Client client, int i) {
		int skillcape[] = {9763};
		String master[] = {"Robe Store Owner"};
		String place[] = {"Yanille"};
		String skill[] = {"magic"};
		client.getAssistant().sendFrame246(4901, 290, skillcape[i]);
        client.getAssistant().sendFrame126("", 4902);
        client.getAssistant().sendQuest("Congratulations! You are now a master of Magic!", 4903);
        client.getAssistant().sendQuest("Why not visit " + master[i] + " at " + place[i] + "?", 4904);
        client.getAssistant().sendQuest("He has something special that is only", 4905);
        client.getAssistant().sendQuest("available to true masters of the " + skill[i] + " skill!", 4906);
        client.getAssistant().sendFrame164(4900);
	}
	public static void COOKING(Client client, int i) {
		int skillcape[] = {9802};
		String master[] = {"Head Chef"};
		String place[] = {"Cooking Guild"};
		String skill[] = {"cooking"};
		client.getAssistant().sendFrame246(4901, 290, skillcape[i]);
        client.getAssistant().sendFrame126("", 4902);
        client.getAssistant().sendQuest("Congratulations! You are now a master of Cooking!", 4903);
        client.getAssistant().sendQuest("Why not visit " + master[i] + " at " + place[i] + "?", 4904);
        client.getAssistant().sendQuest("He has something special that is only", 4905);
        client.getAssistant().sendQuest("available to true masters of the " + skill[i] + " skill!", 4906);
        client.getAssistant().sendFrame164(4900);
	}
	public static void WOODCUTTING(Client client, int i) {
		int skillcape[] = {9808};
		String master[] = {"Woodsman Tutor"};
		String place[] = {"Lumbridge"};
		String skill[] = {"woodcutting"};
		client.getAssistant().sendFrame246(4901, 290, skillcape[i]);
        client.getAssistant().sendFrame126("", 4902);
        client.getAssistant().sendQuest("Congratulations! You are now a master of Woodcutting!", 4903);
        client.getAssistant().sendQuest("Why not visit " + master[i] + " at " + place[i] + "?", 4904);
        client.getAssistant().sendQuest("He has something special that is only", 4905);
        client.getAssistant().sendQuest("available to true masters of the " + skill[i] + " skill!", 4906);
        client.getAssistant().sendFrame164(4900);
	}
    public static void maxmessage(Client client, int i) {
        int skillcape[] = {9748,9754,9751,2701,2686,2689,2692,2731,2734,2716,2728,2695,2713,2725,2722,2707,2704,2710,2719,2737,2698};
        String master[] = {"Vannaka", "Defence Master", "Sloane", "Surgeon General", "Armour salesman", "Brother Jered", "Robe Store Owner","Head Chef","Woodsman Tutor","Hickton","Master Fisher","Ignatius Vulcan","The Master Crafter","Thurgo","Dwarf","Kaqemeex","Cap'n Izzy No-Beard","Martin Thwait","Duradel","Martin the Master Gardener","Aubury:"};
        String place[] = {"Edgeville dungeon", "Varrock Palace", "warrior guild", "Duel Arena", "Rangers Guild", "Prayers Guild", "Yanille","Cooking Guild","Lumbridge","Catherby","Fishing Guild","Lumbridge Swamp","Crafting Guild","Port Sarim","Mining Guild","Taverly","Brimhaven","Burthupe","Canafis","Draynor Village","Varrock"};
        client.getAssistant().sendFrame246(4901, 290, skillcape[i]);
        client.getAssistant().sendFrame126("", 4902);
        client.getAssistant().sendQuest("Congratulations! You are now a master of " + SkillConstants.SKILL_NAMES[i] + "!", 4903);
        client.getAssistant().sendQuest("Why not visit " + master[i] + " at " + place[i] + "?", 4904);
        client.getAssistant().sendQuest("He has something special that is only", 4905);
        client.getAssistant().sendQuest("available to true masters of the " + SkillConstants.SKILL_NAMES[i] + " skill!", 4906);
        client.getAssistant().sendFrame164(4900);
    }
}