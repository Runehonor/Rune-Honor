package com.runehonor.content.achievementdiary;

import com.runehonor.game.players.Client;


/** 
 * Stores data for achievements.
 * @author Chris
 * @ids - 12140 and 297 for completion.
 *
 */
public enum AchievementRepository {
	/* 
	 * SYNTAX 
	 * name { ID, POINTS, COMPONENT ID, INTERFACE STRING, NAME, COMPLETION REQUIREMENT, SET COMPLETION REQ }
	 */
	
	HUNTER(0, 5, 8154, " - Kill 1500 players in the wilderness", "Hunter", 1500, 1);
	
	private int id;
	private int points;
	private int componentID;
	private String componentString;
	private String name;
	private int completeRequirement;
	private int stateRequirement;
	
	/** 
	 * Constructs a new { @code AchievementRepository }
	 * @param id the identification number of the achievement
	 * @param points the points yielded by completing the achievement
	 * @param componentID the interface component id to send the string to
	 * @param componentString the string to send for the component id
	 * @param name the unique nickname for the achievement
	 */
	private AchievementRepository(int id, 
								  int points, 
								  int componentID, 
								  String componentString, 
								  String name,
								  int completeRequirement,
								  int stateRequirement) {
		this.id = id;
		this.points = points;
		this.componentID = componentID;
		this.componentString = componentString;
		this.name = name;
		this.completeRequirement = completeRequirement;
		this.stateRequirement = stateRequirement;
		
	}
	
	/** 
	 * Gets the id of the achievement.
	 * @return id
	 */
	public int getId() {
		for (AchievementRepository Data : AchievementRepository.values()){	
			if (Data.id == id){
				return Data.id;
			}
		}
		return -1;	
	}
	
	/** 
	 * Gets the component id.
	 * @param id
	 * @return componentID
	 */
	public int getComponentID(int id) {
		for (AchievementRepository Data :AchievementRepository.values()){	
			if (Data.id == id){
				return Data.componentID;
			}
		}
		return -1;	
	}
	
	/** 
	 * Gets the component string.
	 * @param id
	 * @return componentString
	 */
	public String getComponentString(int id) {
		for (AchievementRepository Data :AchievementRepository.values()){	
			if (Data.id == id){
				return Data.componentString;
			}
		}
		return "";	
	}
	/** 
	 * Gets the name of the achievement.
	 * @return
	 */
	public String getName() {
		for (AchievementRepository Data :AchievementRepository.values()){	
			if (Data.id == id){
				return Data.name;
			}
		}
		return "";	
	}
	
	/** 
	 * Gets the point reward.
	 * @return points
	 */
	public int getPointreward() {
		for (AchievementRepository Data :AchievementRepository.values()){	
			if (Data.id == id){
				return Data.points;
			}
		}
		return -1;	
	}
	
	/** 
	 * Gets the number of the achievement required to complete it.
	 * @return completeRequirement
	 */
	public static int getRequirement(int id) {
		for (AchievementRepository Data :AchievementRepository.values()){	
			if (Data.id == id){
				return Data.completeRequirement;
			}
		}
		return -1;	
	}
	/** 
	 * Gets the number of the achievement required to complete the <b>task</b>.
	 * @return stateRequirement
	 */
	public static int getState(int id) {
		for (AchievementRepository Data :AchievementRepository.values()){	
			if (Data.id == id){
				return Data.stateRequirement;
			}
		}
		return -1;	
	}
	
	/** 
	 * Writes data to the achievement interface.
	 * @param c
	 */
	public static void writeAchievementTab(final Client c) {
    	for (AchievementRepository Data : AchievementRepository.values()){
    		c.getAssistant().sendFrame126((c.achievePoints == Data.stateRequirement ? 
    						"<s>" + Data.getName() + Data.getComponentString(Data.getId()) : 
    								Data.getName() + Data.getComponentString(Data.getId())), 
    								Data.getComponentID(Data.getId()));
    	}
    }

}
