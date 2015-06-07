package com.runehonor.content.quest;

import java.util.HashMap;
import java.util.Map;

import com.runehonor.content.quest.Quest;
import com.runehonor.content.quest.impl.*;

/** 
 * Represents the Quest Repository.
 * @author Chris
 *
 */
public class QuestRepository {
	
	/** 
	 * Maps the quests.
	 */
	public static final Map<String, Quest> quests = new HashMap<String, Quest>();
	
	
	/** 
	 * Loads the quest repository.
	 */
	public static void loadQuests() { 
		//quests.put("Beta Quest", new BetaQuest());
		//quests.put("Wilderness Tasks", new WildernessTasks(player));
	}

}
