package com.runehonor.game.players.packets;

import com.runehonor.Constants;
import com.runehonor.GameServer;
import com.runehonor.clip.region.Region;
import com.runehonor.content.skills.Mining;
import com.runehonor.content.skills.Runecrafting;
import com.runehonor.event.CycleEvent;
import com.runehonor.event.CycleEventContainer;
import com.runehonor.event.CycleEventHandler;
import com.runehonor.game.minigames.castlewars.CastleWars;
import com.runehonor.game.objects.doors.Doors;
import com.runehonor.game.players.Client;
import com.runehonor.game.players.PacketType;

import core.util.Misc;
/**
 * Click Object
 */
public class ClickObject implements PacketType {

	public static final int FIRST_CLICK = 132, SECOND_CLICK = 252, THIRD_CLICK = 70;	
	@Override
	public void processPacket(final Client c, int packetType, int packetSize) {		
		c.clickObjectType = c.objectX = c.objectId = c.objectY = 0;
		c.objectYOffset = c.objectXOffset = 0;
		c.getAssistant().resetFollow();
		
		
		switch(packetType) {
			
			case FIRST_CLICK:
			c.objectX = c.getInStream().readSignedWordBigEndianA();
			c.objectId = c.getInStream().readUnsignedWord();
			c.objectY = c.getInStream().readUnsignedWordA();
			c.objectDistance = 1;
			if (!Region.objectExists(c.objectId, c.objectX, c.objectY, c.heightLevel)) {
				c.sendMessage("FAKE");
		        return;
			}
			//if(c.goodDistance(c.objectX+c.objectXOffset+2, c.objectY+c.objectYOffset+2, c.getX(), c.getY(), c.objectDistance)) {
			if(c.goodDistance(c.getX(), c.getY(), c.objectX, c.objectY, 1)) {
				if (Doors.getSingleton().handleDoor(c.objectId, c.objectX, c.objectY, c.heightLevel)) {
				}
			}				
			if(c.teleTimer > 0)
				return;
			if(c.playerRights >= 3) {
				Misc.println("objectId1: "+c.objectId+"  ObjectX: "+c.objectX+ "  objectY: "+c.objectY+" Xoff: "+ (c.getX() - c.objectX)+" Yoff: "+ (c.getY() - c.objectY)); 
			}
			if (Math.abs(c.getX() - c.objectX) > 25 || Math.abs(c.getY() - c.objectY) > 25) {
				c.resetWalkingQueue();
				break;
			}
			//if(CastleWarObjects.handleObject(c, c.objectId, c.objectX, c.objectY))
				//return;
			int[] altarID= {2478, 2479, 2480, 2481, 2482, 2483, 2484, 2485, 2486,
							2487, 2488, 30624};
			for (int i = 0; i < altarID.length; i++) {
				if (c.objectId == altarID[i]) {
					Runecrafting.craftRunes(c, c.objectId);
				}
			}
			switch(c.objectId) {
			/**
			 * Bounty Hunter
			 */
			case 28121:
				c.objectXOffset = 1;
				break;
				
			case 28119:
			case 28120:
				c.objectXOffset = 2;
				break;
				
			case 28122:
				c.objectDistance = 2;
				break;
            /*
             * CastleWars
             */
			case 4437:
				c.objectDistance = 2;
				break;
            case 4387:
                CastleWars.addToWaitRoom(c, 1); //saradomin
                break;
            case 4388:
                CastleWars.addToWaitRoom(c, 2); // zamorak
                break;
            case 4408:
                CastleWars.addToWaitRoom(c, 3); //guthix
                break;
            case 4389: //sara
            case 4390: //zammy waiting room portal
                CastleWars.leaveWaitingRoom(c);
                break;
			case 4420:
			if (c.getX() >= 2383 && c.getX() <= 2385){
				c.objectYOffset = 1;
			} else {
				c.objectYOffset = -2;
			}
			break;
                //end
                
                
			case 2491:
				Mining.mineEss(c, c.objectId);
				break;
			case 8966:
				c.getAssistant().movePlayer(2523, 3739, 0);
				break;
			case 8930:
				c.getAssistant().movePlayer(2545, 10143, 0);
			break;
			case 8929:
				c.getAssistant().movePlayer(2442, 10147, 0);
			break;
			case 5094:
				c.getAssistant().movePlayer(2643, 9594, 2);
				break;
			case 5096:
				c.getAssistant().movePlayer(2649, 9591, 0);
				break;
			case 5097:
				c.getAssistant().movePlayer(2636, 9510, 2);
				break;
				
			case 5098:
				c.getAssistant().movePlayer(2637, 9517, 0);
				break;
				
			case 26303:
				c.getAssistant().movePlayer(2872, 5269, 2);
				break;
			case 2804:
				c.getAssistant().movePlayer(1752, 5137, 0);
				break;
			case 5100:
				if(c.playerLevel[16] < 22) {
					c.sendMessage("You need an Agility level of 22 to pass this.");
					return;
				}
				if(c.objectX == 2655 && c.objectY == 9567) {
					c.getAssistant().movePlayer(2655, 9573, 0);
				} else if(c.objectX == 2655 && c.objectY == 9571) {
					c.getAssistant().movePlayer(2655, 9566, 0);
				}
				break;
			case 2513:
				c.getRG().fireAtTarget();
				break;
				
			case 7142:
			case 7143:
			case 7144:
			case 7145:
			case 7146:
			case 7147:
			case 7148:
			case 7149:
			case 7150:
			case 7151:
			case 7152:
			case 7153:
				c.getAssistant().movePlayer(3041, 4832, 0);
				break;
				
			case 9398://deposit
				c.getAssistant().sendFrame126("The Bank of " +Constants.SERVER_NAME + " - Deposit Box", 7421);
				c.getAssistant().sendFrame248(4465, 197);//197 just because you can't see it =\
				c.getItems().resetItems(7423);
			break;
			
				case 1733:
					c.objectYOffset = 2;
				break;
				
				case 2164:
				case 2165:
					GameServer.trawler.fixNet(c);
					break;
				
				case 3044:
					c.objectDistance = 3;
				break;
				
				case 245:
					c.objectYOffset = -1;
					c.objectDistance = 0;
				break;
				
				case 272:
					c.objectYOffset = 1;
					c.objectDistance = 0;
				break;
				
				case 273:
					c.objectYOffset = 1;
					c.objectDistance = 0;
				break;
				
				case 246:
					c.objectYOffset = 1;
					c.objectDistance = 0;
				break;
				
				case 4493:
				case 4494:
				case 4496:
				case 4495:
					c.objectDistance = 5;
				break;
				case 10229:
				case 6522:
					c.objectDistance = 2;
				break;
				case 8959:
					c.objectYOffset = 1;
				break;
				case 4417:
				if (c.objectX == 2425 && c.objectY == 3074)
					c.objectYOffset = 2;
				break;
				case 6552:
				case 409:
					c.objectDistance = 2;
				break;
				case 2879:
				case 2878:
					c.objectDistance = 3;
				break;
				case 2558:
					c.objectDistance = 0;
					if (c.absX > c.objectX && c.objectX == 3044)
						c.objectXOffset = 1;
					if (c.absY > c.objectY)
						c.objectYOffset = 1;
					if (c.absX < c.objectX && c.objectX == 3038)
						c.objectXOffset = -1;
				break;
				case 9356:
					c.objectDistance = 2;
				break;
				case 1815:
				case 1816:
					c.objectDistance = 0;
				break;
				
				case 9293:
					c.objectDistance = 2;
				break;
				case 4418:
				if (c.objectX == 2374 && c.objectY == 3131)
					c.objectYOffset = -2;
				else if (c.objectX == 2369 && c.objectY == 3126)
					c.objectXOffset = 2;
				else if (c.objectX == 2380 && c.objectY == 3127)
					c.objectYOffset = 2;
				else if (c.objectX == 2369 && c.objectY == 3126)
					c.objectXOffset = 2;
				else if (c.objectX == 2374 && c.objectY == 3131)
					c.objectYOffset = -2;
				break;
				case 9706:
					c.objectDistance = 0;
					c.objectXOffset = 1;
				break;
				case 9707:
					c.objectDistance = 0;
					c.objectYOffset = -1;
				break;
				//castlewars
				case 4419:
					if (c.absX >= 2414 && c.absX <= 2416)
						c.objectYOffset = 0;
					else
						c.objectYOffset = 2;
					break;
				case 6707: // verac
				c.objectYOffset = 3;
				break;
				case 6823:
				c.objectDistance = 2;
				c.objectYOffset = 1;
				break;
				
				case 6706: // torag
				c.objectXOffset = 2;
				break;
				case 6772:
				c.objectDistance = 2;
				c.objectYOffset = 1;
				break;
				
				case 6705: // karils
				c.objectYOffset = -1;
				break;
				case 6822:
				c.objectDistance = 2;
				c.objectYOffset = 1;
				break;
				
				case 6704: // guthan stairs
				c.objectYOffset = -1;
				break;
				case 6773:
				c.objectDistance = 2;
				c.objectXOffset = 1;
				c.objectYOffset = 1;
				break;
				
				case 6703: // dharok stairs
				c.objectXOffset = -1;
				break;
				case 6771:
				c.objectDistance = 2;
				c.objectXOffset = 1;
				c.objectYOffset = 1;
				break;
				
				case 6702: // ahrim stairs
				c.objectXOffset = -1;
				break;
				case 6821:
				c.objectDistance = 2;
				c.objectXOffset = 1;
				c.objectYOffset = 1;
				break;
				case 1276:
				case 1278://trees
				case 1281: //oak
				case 1308: //willow
				case 1307: //maple
				case 1309: //yew
				case 1306: //yew
				c.objectDistance = 3;
				break;
				default:
				c.objectDistance = 1;
				c.objectXOffset = 0;
				c.objectYOffset = 0;
				break;		
			}
			if(c.goodDistance(c.objectX+c.objectXOffset, c.objectY+c.objectYOffset, c.getX(), c.getY(), c.objectDistance)) {
				c.getActions().firstClickObject(c.objectId, c.objectX, c.objectY);
			} else {
				c.clickObjectType = 1;
				CycleEventHandler.addEvent(c, new CycleEvent() {
					@Override
					public void execute(CycleEventContainer container) {
						if(c.clickObjectType == 1 && c.goodDistance(c.objectX + c.objectXOffset, c.objectY + c.objectYOffset, c.getX(), c.getY(), c.objectDistance)) {
							c.getActions().firstClickObject(c.objectId, c.objectX, c.objectY);
							container.stop();
						}
						if(c.clickObjectType > 1 || c.clickObjectType == 0)
							container.stop();
					}
					@Override
					public void stop() {
						c.clickObjectType = 0;
					}
				}, 1);
			}
			break;
			
			case SECOND_CLICK:
			c.objectId = c.getInStream().readUnsignedWordBigEndianA();
			c.objectY = c.getInStream().readSignedWordBigEndian();
			c.objectX = c.getInStream().readUnsignedWordA();
			c.objectDistance = 1;
			if (!Region.objectExists(c.objectId, c.objectX, c.objectY, c.heightLevel))
		        return;
			if(c.playerRights >= 3) {
				Misc.println("objectId2: "+c.objectId+"  ObjectX: "+c.objectX+ "  objectY: "+c.objectY+" Xoff: "+ (c.getX() - c.objectX)+" Yoff: "+ (c.getY() - c.objectY)); 
			}
			
			switch(c.objectId) {
			case 6163:
			case 6165:
			case 6166:
			case 6164:
			case 6162:
				c.objectDistance = 2;
			break;
				default:
				c.objectDistance = 1;
				c.objectXOffset = 0;
				c.objectYOffset = 0;
				break;
				
			}
			if(c.goodDistance(c.objectX+c.objectXOffset, c.objectY+c.objectYOffset, c.getX(), c.getY(), c.objectDistance)) { 
				c.getActions().secondClickObject(c.objectId, c.objectX, c.objectY);
			} else {
				c.clickObjectType = 2;
				CycleEventHandler.addEvent(c, new CycleEvent() {
					@Override
					public void execute(CycleEventContainer container) {
						if(c.clickObjectType == 2 && c.goodDistance(c.objectX + c.objectXOffset, c.objectY + c.objectYOffset, c.getX(), c.getY(), c.objectDistance)) {
							c.getActions().secondClickObject(c.objectId, c.objectX, c.objectY);
							container.stop();
						}
						if(c.clickObjectType < 2 || c.clickObjectType > 2)
							container.stop();
					}
					@Override
					public void stop() {
						c.clickObjectType = 0;
					}
				}, 1);
			}
			break;
			
			case THIRD_CLICK:
			c.objectX = c.getInStream().readSignedWordBigEndian();
			c.objectY = c.getInStream().readUnsignedWord();
			c.objectId = c.getInStream().readUnsignedWordBigEndianA();
			if (!Region.objectExists(c.objectId, c.objectX, c.objectY, c.heightLevel))
		        return;
			if(c.playerRights >= 3) {
				Misc.println("objectId: "+c.objectId+"  ObjectX: "+c.objectX+ "  objectY: "+c.objectY+" Xoff: "+ (c.getX() - c.objectX)+" Yoff: "+ (c.getY() - c.objectY)); 
			}
			
			switch(c.objectId) {
				default:
				c.objectDistance = 1;
				c.objectXOffset = 0;
				c.objectYOffset = 0;
				break;		
			}
			if(c.goodDistance(c.objectX+c.objectXOffset, c.objectY+c.objectYOffset, c.getX(), c.getY(), c.objectDistance)) { 
				c.getActions().thirdClickObject(c.objectId, c.objectX, c.objectY);
			} else {
				c.clickObjectType = 3;
				CycleEventHandler.addEvent(c, new CycleEvent() {
					@Override
					public void execute(CycleEventContainer container) {
						if(c.clickObjectType == 3 && c.goodDistance(c.objectX + c.objectXOffset, c.objectY + c.objectYOffset, c.getX(), c.getY(), c.objectDistance)) {
							c.getActions().thirdClickObject(c.objectId, c.objectX, c.objectY);
							container.stop();
						}
						if(c.clickObjectType < 3)
							container.stop();
					}
					@Override
					public void stop() {
						c.clickObjectType = 0;
					}
				}, 1);
			}	
			break;
		}

	}
	public void handleSpecialCase(Client c, int id, int x, int y) {

	}

}
