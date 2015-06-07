package server.content.achievementdiary;

import server.game.players.Client;

/** 
 * Methods for the achievement system.
 * @author Chris
 *
 */
public class Achievement {
	
	/** 
	 * Loads the wilderness achievement tab.
	 * @param player
	 */
	public static void loadWilderness(Client player) { 
		player.getPA().sendFrame126("@dre@Achievement Diary - Wilderness - @blu@Members Only", 8144);
		player.getPA().sendFrame126("", 8145);
		player.getPA().sendFrame126("", 8146);
		player.getPA().sendFrame126("@dre@Wilderness Area Tasks", 8147);
		player.getPA().sendFrame126("To begin the Wilderness achievement diary, simply begin", 8148);
		player.getPA().sendFrame126("a task in the area. Please note that you must complete", 8149);
		player.getPA().sendFrame126("the tasks in order.", 8150);
		player.getPA().sendFrame126("", 8151);
		player.getPA().sendFrame126(player.achievePoints <= 0 ? "@dre@Easy" : 
			 						player.achievePoints == AchievementRepository.getState(0) ? 
			 						"@gre@Easy" : "@yel@Easy", 8152);
		player.getPA().sendFrame126("", 8153);
		AchievementRepository.writeAchievementTab(player);
		for (int i = 8155; i <= 8244; i++) { 
			player.getPA().sendFrame126("", i);
		}
		player.getPA().showInterface(8134);
	}

}
