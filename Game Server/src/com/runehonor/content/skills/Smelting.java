package com.runehonor.content.skills;

import com.runehonor.Constants;
import com.runehonor.event.CycleEvent;
import com.runehonor.event.CycleEventContainer;
import com.runehonor.event.CycleEventHandler;
import com.runehonor.game.items.ItemAssistant;
import com.runehonor.game.players.Client;
import com.runehonor.game.players.Player;

public class Smelting {
	
	/**
	 * Smelting Bars data
	 */
	public enum Bars {
		BRONZE(436,438,2349,1,6,2405,true,"bronze"),
		IRON(440,-1,2351,15,13,2406,false,"iron"),
		SILVER(442,-1,2355,20,14,2407,false,"silver"),
		STEEL(440,453,2353,30,18,2409,true,"steel"),
		GOLD(444,-1,2357,40,23,2410,false,"gold"),
		MITHRIL(447,453,2359,50,30,2411,true,"mithril"),
		ADAMANT(449,453,2361,70,38,2412,true,"adamant"),
		RUNE(451,453,2363,85,50,2413,true,"rune");
		
		private int ore1,ore2,bar,req,exp,frame;
		private boolean twoOres;
		private String type;
		
		public int getOre1(){
			return ore1;
		}
		public int getOre2(){
			return ore2;
		}
		public int getBar(){
			return bar;
		}
		public int getReq(){
			return req;
		}
		public int getExp(){
			return exp;
		}
		public int getFrame(){
			return frame;
		}
		public boolean twoOres(){
			return twoOres;
		}
		public String getType(){
			return type;
		}
		
		private Bars (int ore,int ore2,int bar,int req,int xp,int frame,boolean two,String type){
			this.ore1 = ore;
			this.ore2 = ore2;
			this.bar = bar;
			this.req = req;
			this.exp = xp;
			this.frame = frame;
			this.twoOres = two;
			this.type = type;
		}
		
		public static Bars forType(String type){
			for(Bars bar : Bars.values())
				if(bar.getType().equals(type))
					return bar;
			return null;
		}
	}
	
	/**
	 * Clicking Buttons data
	 */
	public static int[][] buttons = {
		//x1,x5,x10,xX
		{15147,15146,10247,9110},//Bronze
		{15151,15150,15149,15148},//Iron
		{15155,15154,15153,15152},//Silver
		{15159,15158,15157,15156},//Steel
		{15163,15162,15161,15160},//Gold
		{29017,29016,24253,16062},//Mithril
		{29022,29020,29019,29018},//Adamant
		{29026,29025,29024,29023},//Rune
	};
	
	/**
	 * Opens the smelting interface
	 */
	public static void openInterface(Client c){
		for(final Bars bar : Bars.values()){
			c.getAssistant().sendFrame246(bar.getFrame(), 150, bar.getBar());
		}
        c.getAssistant().sendFrame164(2400);
        c.isSmelting = true;
	}
	
	/**
	 * Starts Smelting
	 */
	public static void startSmelting(Client c,int button,int i1,int i2){
		c.barType = getType(i1);
		c.smeltAmount = getAmount(i2);
		c.bar = Bars.forType(c.barType);
		boolean hasItems = false;
		if(c.bar.twoOres())
			hasItems = hasItems(c,c.bar.getOre1(),c.bar.getOre2(),c.bar.getBar());
		else
			hasItems = hasItems(c,c.bar.getOre1(),-1,c.bar.getBar());
		if(hasItems)
			if(hasReqLvl(c,c.bar.getReq(),c.bar.getBar()))
				startCycle(c);
	}
	
	/**
	 * Starts the Smelting cycle
	 */
	public static void startCycle(final Client c){
		CycleEventHandler.addEvent(c.smeltEventId, c, new CycleEvent() {
			public void execute(CycleEventContainer e) {
				if(c.lastSmelt <= 0 || System.currentTimeMillis() - c.lastSmelt >= 1000){
				if(c.smeltAmount > 0)
						appendDelay(c);
					else
						e.stop();
				}
			}
			@Override
			public void stop() {
				resetSmelting(c);
			}
		}, 1);
	}
	
	/**
	 * Applies Smelting delay
	 */
	public static void appendDelay(Client c){
		if(c.smeltAmount > 0){
			boolean hasItems = false;
			if(c.bar.twoOres())
				hasItems = hasItems(c,c.bar.getOre1(),c.bar.getOre2(),c.bar.getBar());
			else
				hasItems = hasItems(c,c.bar.getOre1(),-1,c.bar.getBar());
			if(hasItems){
				if(c.bar.twoOres()){
					c.startAnimation(899);
					c.getItems().deleteItem(c.bar.getOre1(), 1);
					c.getItems().deleteItem(c.bar.getOre2(), 1);
					c.getItems().addItem(c.bar.getBar(), 1);
					
					c.getAssistant().addSkillXP(c.bar.getExp() * Constants.SMITHING_EXPERIENCE, Player.playerSmithing);
					
					c.sendMessage("You smelt a "+ItemAssistant.getItemName(c.bar.getBar()));
				} else {
					c.startAnimation(899);
					c.getItems().deleteItem(c.bar.getOre1(), 1);
					c.getItems().addItem(c.bar.getBar(), 1);
					
					c.getAssistant().addSkillXP(c.bar.getExp() * Constants.SMITHING_EXPERIENCE, Player.playerSmithing);
					
					c.sendMessage("You smelt a "+ItemAssistant.getItemName(c.bar.getBar()));
				}
			}
		} else {
			resetSmelting(c);
			c.getAssistant().removeAllWindows();
			return;
		}
		c.lastSmelt = System.currentTimeMillis();
		c.smeltAmount--;
		c.getAssistant().removeAllWindows();
	}
	
	/**
	 * Resets Smelting variables
	 */
	public static void resetSmelting(Client c){
		c.smeltAmount = 0;
		c.barType = "";
		c.bar = null;
		c.isSmelting = false;
		c.lastSmelt = 0;
		CycleEventHandler.stopEvents(c, c.smeltEventId);
	}
	
	/**
	 * Checks if the player has the required level
	 */
	public static boolean hasReqLvl(Client c,int req,int bar){
		int level = c.getAssistant().getLevelForXP(c.playerXP[Player.playerSmithing]);
		if(level >= req)
			return true;
		else
			c.sendMessage("You need a Smithing level of "+req+" to smelt a "+ItemAssistant.getItemName(bar));
		resetSmelting(c);
		return false;
	}
	
	/**
	 * Checks if the player has the required items
	 */
	public static boolean hasItems(Client c,int item1,int item2,int bar){
		c.getItems();
		String n1 = ItemAssistant.getItemName(item1);
		c.getItems();
		String n2 = ItemAssistant.getItemName(item2);
		c.getItems();
		String n3 = ItemAssistant.getItemName(bar);
		if(item2 > 0){
			if(c.getItems().playerHasItem(item1) && c.getItems().playerHasItem(item2))
				return true;
		} else {
			if(c.getItems().playerHasItem(item1))
				return true;
		}
		if(item2 > 0)
			c.sendMessage("You need "+n1+" and "+n2+" to smelt a "+n3);
		else
			c.sendMessage("You need "+n1+" to smelt a "+n3);
		resetSmelting(c);
		return false;
	}
	
	/**
	 * Gets the smelting amount
	 */
	public static int getAmount(int index){
		if(index == 0)
			return 1;
		if(index == 1)
			return 5;
		if(index == 2)
			return 10;
		if(index == 3)
			return 28;
		return -1;
	}
	
	/**
	 * Gets the bar type
	 */
	public static String getType(int index){
		if(index == 0)
			return "bronze";
		if(index == 1)
			return "iron";
		if(index == 2)
			return "silver";
		if(index == 3)
			return "steel";
		if(index == 4)
			return "gold";
		if(index == 5)
			return "mithril";
		if(index == 6)
			return "adamant";
		if(index == 7)
			return "rune";
		return "";
	}
	
}
