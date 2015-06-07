// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class RSInterface {
	
    public static void addTransparentSprite(int id, int spriteId, String spriteName, int op)
    {
        RSInterface tab = interfaceCache[id] = new RSInterface();
        tab.id = id;
        tab.parentID = id;
        tab.type = 10;
        tab.atActionType = 0;
        tab.contentType = 0;
        tab.mOverInterToTrigger = 52;
        tab.sprite1 = imageLoader(spriteId, spriteName);
        tab.sprite2 = imageLoader(spriteId, spriteName);
        tab.width = 512;
        tab.height = 334;
        tab.aByte254 = (byte)op;
        tab.drawsTransparent = true;
    }

	public void swapInventoryItems(int i, int j) {
		int k = inv[i];
		inv[i] = inv[j];
		inv[j] = k;
		k = invStackSizes[i];
		invStackSizes[i] = invStackSizes[j];
		invStackSizes[j] = k;
	}

	public static void unpack(StreamLoader streamLoader,TextDrawingArea textDrawingAreas[], StreamLoader streamLoader_1) {
		aMRUNodes_238 = new MRUNodes(50000);
		Stream stream = new Stream(streamLoader.getDataForName("data"));
		int i = -1;
		int j = stream.readUnsignedWord();
		interfaceCache = new RSInterface[j + 999999];
		while (stream.currentOffset < stream.buffer.length) {
			int k = stream.readUnsignedWord();
			if (k == 65535) {
				i = stream.readUnsignedWord();
				k = stream.readUnsignedWord();
			}
			RSInterface rsInterface = interfaceCache[k] = new RSInterface();
			rsInterface.id = k;
			rsInterface.parentID = i;
			rsInterface.type = stream.readUnsignedByte();
			rsInterface.atActionType = stream.readUnsignedByte();
			rsInterface.contentType = stream.readUnsignedWord();
			rsInterface.width = stream.readUnsignedWord();
			rsInterface.height = stream.readUnsignedWord();
			rsInterface.aByte254 = (byte) stream.readUnsignedByte();
			rsInterface.mOverInterToTrigger = stream.readUnsignedByte();
			if (rsInterface.mOverInterToTrigger != 0)
				rsInterface.mOverInterToTrigger = (rsInterface.mOverInterToTrigger - 1 << 8)
						+ stream.readUnsignedByte();
			else
				rsInterface.mOverInterToTrigger = -1;
			int i1 = stream.readUnsignedByte();
			if (i1 > 0) {
				rsInterface.anIntArray245 = new int[i1];
				rsInterface.anIntArray212 = new int[i1];
				for (int j1 = 0; j1 < i1; j1++) {
					rsInterface.anIntArray245[j1] = stream.readUnsignedByte();
					rsInterface.anIntArray212[j1] = stream.readUnsignedWord();
				}

			}
			int k1 = stream.readUnsignedByte();
			if (k1 > 0) {
				rsInterface.valueIndexArray = new int[k1][];
				for (int l1 = 0; l1 < k1; l1++) {
					int i3 = stream.readUnsignedWord();
					rsInterface.valueIndexArray[l1] = new int[i3];
					for (int l4 = 0; l4 < i3; l4++)
						rsInterface.valueIndexArray[l1][l4] = stream
								.readUnsignedWord();

				}

			}
			if (rsInterface.type == 0) {
				rsInterface.drawsTransparent = false;
				rsInterface.scrollMax = stream.readUnsignedWord();
				rsInterface.isMouseoverTriggered = stream.readUnsignedByte() == 1;
				int i2 = stream.readUnsignedWord();
				rsInterface.children = new int[i2];
				rsInterface.childX = new int[i2];
				rsInterface.childY = new int[i2];
				for (int j3 = 0; j3 < i2; j3++) {
					rsInterface.children[j3] = stream.readUnsignedWord();
					rsInterface.childX[j3] = stream.readSignedWord();
					rsInterface.childY[j3] = stream.readSignedWord();
				}
			}
			if (rsInterface.type == 1) {
				stream.readUnsignedWord();
				stream.readUnsignedByte();
			}
			if (rsInterface.type == 2) {
				rsInterface.inv = new int[rsInterface.width
						* rsInterface.height];
				rsInterface.invStackSizes = new int[rsInterface.width
						* rsInterface.height];
				rsInterface.aBoolean259 = stream.readUnsignedByte() == 1;
				rsInterface.isInventoryInterface = stream.readUnsignedByte() == 1;
				rsInterface.usableItemInterface = stream.readUnsignedByte() == 1;
				rsInterface.aBoolean235 = stream.readUnsignedByte() == 1;
				rsInterface.invSpritePadX = stream.readUnsignedByte();
				rsInterface.invSpritePadY = stream.readUnsignedByte();
				rsInterface.spritesX = new int[20];
				rsInterface.spritesY = new int[20];
				rsInterface.sprites = new Sprite[20];
				for (int j2 = 0; j2 < 20; j2++) {
					int k3 = stream.readUnsignedByte();
					if (k3 == 1) {
						rsInterface.spritesX[j2] = stream.readSignedWord();
						rsInterface.spritesY[j2] = stream.readSignedWord();
						String s1 = stream.readString();
						if (streamLoader_1 != null && s1.length() > 0) {
							int i5 = s1.lastIndexOf(",");
							rsInterface.sprites[j2] = method207(
									Integer.parseInt(s1.substring(i5 + 1)),
									streamLoader_1, s1.substring(0, i5));
						}
					}
				}
				rsInterface.actions = new String[5];
				for (int l3 = 0; l3 < 5; l3++) {
					rsInterface.actions[l3] = stream.readString();
					if (rsInterface.actions[l3].length() == 0)
						rsInterface.actions[l3] = null;
					if(rsInterface.parentID == 3824)
                		rsInterface.actions[4] = "Buy 50";
					if (rsInterface.parentID == 1644)
						rsInterface.actions[2] = "Operate";
				}
			}
			if (rsInterface.type == 3)
				rsInterface.aBoolean227 = stream.readUnsignedByte() == 1;
			if (rsInterface.type == 4 || rsInterface.type == 1) {
				rsInterface.centerText = stream.readUnsignedByte() == 1;
				int k2 = stream.readUnsignedByte();
				if (textDrawingAreas != null)
					rsInterface.textDrawingAreas = textDrawingAreas[k2];
				rsInterface.textShadow = stream.readUnsignedByte() == 1;
			}
			if (rsInterface.type == 4) {
				rsInterface.message = stream.readString();
				rsInterface.aString228 = stream.readString();
			}
			if (rsInterface.type == 1 || rsInterface.type == 3
					|| rsInterface.type == 4)
				rsInterface.textColor = stream.readDWord();
			if (rsInterface.type == 3 || rsInterface.type == 4) {
				rsInterface.anInt219 = stream.readDWord();
				rsInterface.anInt216 = stream.readDWord();
				rsInterface.anInt239 = stream.readDWord();
			}
			if (rsInterface.type == 5) {
				rsInterface.drawsTransparent = false;
				String s = stream.readString();
				if (streamLoader_1 != null && s.length() > 0) {
					int i4 = s.lastIndexOf(",");
					rsInterface.sprite1 = method207(
							Integer.parseInt(s.substring(i4 + 1)),
							streamLoader_1, s.substring(0, i4));
				}
				s = stream.readString();
				if (streamLoader_1 != null && s.length() > 0) {
					int j4 = s.lastIndexOf(",");
					rsInterface.sprite2 = method207(
							Integer.parseInt(s.substring(j4 + 1)),
							streamLoader_1, s.substring(0, j4));
				}
			}
			if (rsInterface.type == 6) {
				int l = stream.readUnsignedByte();
				if (l != 0) {
					rsInterface.anInt233 = 1;
					rsInterface.mediaID = (l - 1 << 8)
							+ stream.readUnsignedByte();
				}
				l = stream.readUnsignedByte();
				if (l != 0) {
					rsInterface.anInt255 = 1;
					rsInterface.anInt256 = (l - 1 << 8)
							+ stream.readUnsignedByte();
				}
				l = stream.readUnsignedByte();
				if (l != 0)
					rsInterface.anInt257 = (l - 1 << 8)
							+ stream.readUnsignedByte();
				else
					rsInterface.anInt257 = -1;
				l = stream.readUnsignedByte();
				if (l != 0)
					rsInterface.anInt258 = (l - 1 << 8)
							+ stream.readUnsignedByte();
				else
					rsInterface.anInt258 = -1;
				rsInterface.modelZoom = stream.readUnsignedWord();
				rsInterface.modelRotation1 = stream.readUnsignedWord();
				rsInterface.modelRotation2 = stream.readUnsignedWord();
			}
			if (rsInterface.type == 7) {
				rsInterface.inv = new int[rsInterface.width
						* rsInterface.height];
				rsInterface.invStackSizes = new int[rsInterface.width
						* rsInterface.height];
				rsInterface.centerText = stream.readUnsignedByte() == 1;
				int l2 = stream.readUnsignedByte();
				if (textDrawingAreas != null)
					rsInterface.textDrawingAreas = textDrawingAreas[l2];
				rsInterface.textShadow = stream.readUnsignedByte() == 1;
				rsInterface.textColor = stream.readDWord();
				rsInterface.invSpritePadX = stream.readSignedWord();
				rsInterface.invSpritePadY = stream.readSignedWord();
				rsInterface.isInventoryInterface = stream.readUnsignedByte() == 1;
				rsInterface.actions = new String[5];
				for (int k4 = 0; k4 < 5; k4++) {
					rsInterface.actions[k4] = stream.readString();
					if (rsInterface.actions[k4].length() == 0)
						rsInterface.actions[k4] = null;
				}

			}
			if (rsInterface.atActionType == 2 || rsInterface.type == 2) {
				rsInterface.selectedActionName = stream.readString();
				rsInterface.spellName = stream.readString();
				rsInterface.spellUsableOn = stream.readUnsignedWord();
			}

			if (rsInterface.type == 8)
				rsInterface.message = stream.readString();

			if (rsInterface.atActionType == 1 || rsInterface.atActionType == 4
					|| rsInterface.atActionType == 5
					|| rsInterface.atActionType == 6) {
				rsInterface.tooltip = stream.readString();
				if (rsInterface.tooltip.length() == 0) {
					if (rsInterface.atActionType == 1)
						rsInterface.tooltip = "Ok";
					if (rsInterface.atActionType == 4)
						rsInterface.tooltip = "Select";
					if (rsInterface.atActionType == 5)
						rsInterface.tooltip = "Select";
					if (rsInterface.atActionType == 6)
						rsInterface.tooltip = "Continue";
				}
			}
		}
		aClass44 = streamLoader;
		bank(textDrawingAreas);
		pollInterface(textDrawingAreas);
		suggestPollInterface(textDrawingAreas);
		accountInfoInterface(textDrawingAreas);
		questTab(textDrawingAreas);
		bountyShop(textDrawingAreas);
		Interfaces.loadInterfaces(streamLoader, textDrawingAreas);
		aMRUNodes_238 = null;
	}
	
	public static void drawTooltip(int id, String text) {
		RSInterface rsinterface = addTabInterface(id);
		rsinterface.parentID = id;
		rsinterface.type = 0;
		rsinterface.isMouseoverTriggered = true;
		rsinterface.mOverInterToTrigger = -1;
		addTooltipBox(id + 1, text);
		rsinterface.totalChildren(1);
		rsinterface.child(0, id + 1, 0, 0);
	}

	   public static void addTextButton(int i, String s, String tooltip, int k, boolean l, boolean m, TextDrawingArea[] TDA, int j, int w) {
	        RSInterface rsinterface = addInterface(i);
	        rsinterface.parentID = i;
	        rsinterface.id = i;
	        rsinterface.type = 4;
	        rsinterface.atActionType = 1;
	        rsinterface.width = w;
	        rsinterface.height = 16;
	        rsinterface.contentType = 0;
	        rsinterface.aByte254 = (byte)0xFF981F;
	        rsinterface.mOverInterToTrigger = -1;
	        rsinterface.centerText = l;
	        rsinterface.textShadow = m;
	        rsinterface.textDrawingAreas = TDA[j];
	        rsinterface.message = s;
	        rsinterface.aString228 = "";
	        rsinterface.anInt219 = 0xFF981F;
	        rsinterface.textColor = 0xFF981F;
	        rsinterface.tooltip = tooltip;
	    }
	   
	   /** 
	    * New methods for bank, poll, info, & quest.
	    * @param TDA
	    */
	   private static void bountyShop(TextDrawingArea[] tda) { 
		   RSInterface rsi = RSInterface.addInterface(45190);
		   addSprite(45191, 1, "/BountyHunter/bh");
		   addText(45192, "@yel@Bounties: 0", tda, 1, 0xD37E2A, false, true);
		   setChildren(2, rsi);
		   setBounds(45191, 21, 31, 0, rsi); 
		   setBounds(45192, 49, 31, 1, rsi); 
	   }
	   public static void questTab(TextDrawingArea[] tda) {
			 RSInterface tab = addTabInterface(638);
			 RSInterface scroll = addTabInterface(25006);
			 addSprite(25007, 6, "Quest/SPRITE");
			 addText(25008, "Free Quests", tda, 2, 0xD37E2A, false, true);
			 addText(25003, "Quest Points: 0", tda, 2, 0xEB981F, false, true);
			 addConfigButton(25004, 904, 2, 2, "Quest/SPRITE", 18, 18, "Swap to Minigames", 0, 5, 427);
			 addConfigButton(25005, 904, 1, 1, "Quest/SPRITE", 18, 18, "Swap to Achievement Diaries", 0, 5, 427);
			 addClickableText(25009, "Animal Magnetism", "Read Journal", tda, 0, 0xD30000, false, true, 150);
			 addClickableText(25010, "Desert Treasure", "Read Journal", tda, 0, 0xD30000, false, true, 150);
			 addClickableText(25011, "Dwarf Cannon", "Read Journal", tda, 0, 0xD30000, false, true, 150);
			 addClickableText(25012, "Gertrude's Cat", "Read Journal", tda, 0, 0xD30000, false, true, 150);
			 //addClickableText(25013, "Horror from the Deep", "Read Journal", tda, 2, 0xD30000, false, true, 150);
			 addText(25013, "Spawn Sets", tda, 2, 0xD37E2A, false, true);
			 addClickableText(25014, "Lost City", "Read Journal", tda, 0, 0xD30000, false, true, 150);
			 addClickableText(25015, "Monkey Madness", "Read Journal", tda, 0, 0xD30000, false, true, 150);
			 addClickableText(25016, "Recipe for Disaster", "Read Journal", tda, 0, 0xD30000, false, true, 150);
			 addClickableText(25017, "Recipe for Disaster", "Read Journal", tda, 0, 0xD30000, false, true, 150);
			 addClickableText(25018, "Recipe for Disaster", "Read Journal", tda, 0, 0xD30000, false, true, 150);
			 addClickableText(25019, "Recipe for Disaster", "Read Journal", tda, 0, 0xD30000, false, true, 150);
			 addClickableText(25020, "Recipe for Disaster", "Read Journal", tda, 0, 0xD30000, false, true, 150);
			 addClickableText(25021, "Recipe for Disaster", "Read Journal", tda, 0, 0xD30000, false, true, 150);
		     scroll.width = 174; scroll.height = 226; scroll.scrollMax = 227;
		     tab.totalChildren(19);
		     tab.child(0, 25003, 14, 4);
		     tab.child(1, 25004, 172, 4);
		     tab.child(2, 25005, 154, 4);
		     tab.child(3, 25006, -3, 24);
		     tab.child(4, 25007, 3, 24);
		     tab.child(5, 25008, 14, 34);
		     tab.child(6, 25009, 14, 54);
		     tab.child(7, 25010, 14, 69);
		     tab.child(8, 25011, 14, 84);
		     tab.child(9, 25012, 14, 99);
		     tab.child(10, 25013, 14, 111);
		     tab.child(11, 25014, 14, 129);
		     tab.child(12, 25015, 14, 144);
		     tab.child(13, 25016, 14, 159);
		     tab.child(14, 25017, 14, 174);
		     tab.child(15, 25018, 14, 189);
		     tab.child(16, 25019, 14, 204);
		     tab.child(17, 25020, 14, 219);
		     tab.child(18, 25021, 14, 234);
		     
		}
	   
	   public static void addClickableText(int id, String text, String tooltip, TextDrawingArea tda[], int idx, int color, boolean center, boolean shadow, int width) {
	        RSInterface tab = addTabInterface(id);
	        tab.parentID = id;
	        tab.id = id;
	        tab.type = 4;
	        tab.atActionType = 1;
	        tab.width = width;
	        tab.height = 11;
	        tab.contentType = 0;
	        tab.aByte254 = 0;
	        tab.hoverType = -1;
	        tab.centerText = center;
	        tab.textShadow = shadow;
	        tab.textDrawingAreas = tda[idx];
	        tab.message = text;
	        tab.aString228 = "";
	        tab.textColor = color;
	        tab.anInt219 = 0;
	        tab.anInt216 = 0xffffff;
	        tab.anInt239 = 0;
	        tab.tooltip = tooltip;
	    }
	   static void accountInfoInterface(TextDrawingArea[] rsfont) { 
		   RSInterface rsi = RSInterface.addInterface(45101);
		   RSInterface.addSprite(45102, 0, "/Interfaces/Account Info/SPRITE");
		   addText(45103, "RuneHonor Account Information", 0xFF981F, false, true, -1, rsfont, 2);
		   addHoverButton(45104, "Interfaces/Account Info/SPRITE", 3, 21, 21, "Close", -1, 45105, 3);
		   addHoveredButton(45105, "Interfaces/Account Info/SPRITE", 4, 21, 21, 45106);
		   addHoverButton(45107, "Interfaces/Account Info/SPRITE", 7, 21, 21, "Information", -1, 45108, 1);
		   addHoveredButton(45108, "Interfaces/Account Info/SPRITE", 8, 91, 21, 45109);
		   addText(45110, "Username:", 0xFF981F, false, true, -1, rsfont, 0);
		   addText(45111, "Rank:", 0xFF981F, false, true, -1, rsfont, 0);
		   addText(45112, "Donator Points:", 0xFF981F, false, true, -1, rsfont, 0);
		   addText(45113, "@gre@Latest Update:", 0xFF981F, false, true, -1, rsfont, 0);
		   addText(45114, "Misc Information", 0xFF981F, false, true, -1, rsfont, 1);
		   addText(45115, "Vote Points:", 0xFF981F, false, true, -1, rsfont, 0);
		   addText(45116, "Slayer Points:", 0xFF981F, false, true, -1, rsfont, 0);
		   addHoverButton(45117, "Interfaces/Account Info/SPRITE", 5, 90, 25, "Player-Killing Info", -1, 45118, 1);
		   addHoveredButton(45118, "Interfaces/Account Info/SPRITE", 6, 90, 25, 45119);
		   addHoverButton(45120, "Interfaces/Account Info/SPRITE", 9, 114, 22, "Request Help", -1, 45121, 1);
		   addHoveredButton(45121, "Interfaces/Account Info/SPRITE", 10, 114, 22, 45122);
		   addHoverButton(45123, "Interfaces/Account Info/SPRITE", 5, 90, 25, "Donate to RuneHonor", -1, 45124, 1);
		   addHoveredButton(45124, "Interfaces/Account Info/SPRITE", 6, 90, 25, 45125);
		   addText(45126, "PK Info", 0xFF981F, false, true, -1, rsfont, 0);
		   addText(45127, "Donate", 0xFF981F, false, true, -1, rsfont, 0);
		   addText(45128, "Request Help", 0xFF981F, false, true, -1, rsfont, 0);
		   setChildren(22, rsi);
		   setBounds(45102, 14, 2, 0, rsi); 
		   setBounds(45103, 176, 13, 1, rsi); 
		   setBounds(45104, 472, 10, 2, rsi); 
		   setBounds(45105, 472, 10, 3, rsi); 
		   setBounds(45107, 449, 10, 4, rsi); 
		   setBounds(45108, 449, 10, 5, rsi); 
		   setBounds(45110, 56, 94, 6, rsi); 
		   setBounds(45111, 56, 110, 7, rsi); 
		   setBounds(45112, 56, 126, 8, rsi); 
		   setBounds(45113, 130, 50, 9, rsi); 
		   setBounds(45114, 216, 146, 10, rsi); 
		   setBounds(45115, 216, 162, 11, rsi); 
		   setBounds(45116, 216, 176, 12, rsi); 
		   setBounds(45117, 40, 256, 13, rsi); 
		   setBounds(45118, 40, 256, 14, rsi);
		   setBounds(45120, 196, 256, 15, rsi);
		   setBounds(45121, 196, 256, 16, rsi);
		   setBounds(45123, 374, 256, 17, rsi);
		   setBounds(45124, 374, 256, 18, rsi);
		   setBounds(45126, 66, 264, 19, rsi);
		   setBounds(45127, 401, 264, 20, rsi);
		   setBounds(45128, 221, 262, 21, rsi);
	   }
	   static void suggestPollInterface(TextDrawingArea[] rsfont) {
			RSInterface rsi = RSInterface.addInterface(45200);
			RSInterface.addSprite(45201, 0, "/Interfaces/Poll/SPRITE");
			addText(45202, "Suggest a new poll topic with options", 0xFF981F, false, true, -1, rsfont, 2);
	        addHoverButton(45203, "Interfaces/Poll/SPRITE", 1, 16, 16, "Close", -1, 45204, 3);
			addHoveredButton(45204, "Interfaces/Poll/SPRITE", 2, 16, 16, 45205);
			addText(45206, "Title:", 0xFF981F, false, true, -1, rsfont, 2);
			addText(45207, "Option 1:", 0xFF981F, false, true, -1, rsfont, 2);
			addText(45208, "Option 2:", 0xFF981F, false, true, -1, rsfont, 2);
			addText(45209, "Option 3:", 0xFF981F, false, true, -1, rsfont, 2);
			addText(45210, "Option 4:", 0xFF981F, false, true, -1, rsfont, 2);
			addTextButton(45211, "Click to edit", "Edit Title", 0xFF981F, false, true, rsfont, 1, 300);
			addTextButton(45212, "Click to edit", "Edit Option 1", 0xFF981F, false, true, rsfont, 1, 300);
			addTextButton(45213, "Click to edit", "Edit Option 2", 0xFF981F, false, true, rsfont, 1, 300);
			addTextButton(45214, "Click to edit", "Edit Option 3", 0xFF981F, false, true, rsfont, 1, 300);
			addTextButton(45215, "Click to edit", "Edit Option 4", 0xFF981F, false, true, rsfont, 1, 300);
			addTextButton(45216, "Submit", "Submit", 0xFF981F, false, true, rsfont, 1, 300);
			addText(45217, "If you abuse this system in any way, shape or form you are subject", 0xFF981F, false, true, -1, rsfont, 0);
			addText(45218, "to the consequences defined by the player staff team.", 0xFF981F, false, true, -1, rsfont, 0);
			addTextButton(45219, "Back", "Back", 0xFF981F, false, true, rsfont, 1, 80);
			setChildren(18, rsi);
			setBounds(45001, 55, 60, 0, rsi);
			setBounds(45202, 63, 69, 1, rsi);
			setBounds(45203, 435, 68, 2, rsi);
			setBounds(45204, 435, 68, 3, rsi);
			setBounds(45206, 63, 95, 4, rsi);
			setBounds(45207, 63, 110, 5, rsi);
			setBounds(45208, 63, 125, 6, rsi);
			setBounds(45209, 63, 140, 7, rsi);
			setBounds(45210, 63, 155, 8, rsi);
			setBounds(45211, 125, 95, 9, rsi);
			setBounds(45212, 125, 110, 10, rsi);
			setBounds(45213, 125, 125, 11, rsi);
			setBounds(45214, 125, 140, 12, rsi);
			setBounds(45215, 125, 155, 13, rsi);
			setBounds(45216, 235, 245, 14, rsi);
			setBounds(45217, 63, 210, 15, rsi);
			setBounds(45218, 63, 223, 16, rsi);
			setBounds(45219, 390, 245, 17, rsi);
		}
		
		static void pollInterface(TextDrawingArea[] rsfont) {
			RSInterface rsi = RSInterface.addInterface(45000);
			RSInterface.addSprite(45001, 0, "/Interfaces/Poll/SPRITE");
			addText(45002, "Poll: -", 0xFF981F, false, true, -1, rsfont, 2);
	        addHoverButton(45003, "Interfaces/Poll/SPRITE", 1, 21, 21, "Close", -1, 45004, 3);
			addHoveredButton(45004, "Interfaces/Poll/SPRITE", 2, 21, 21, 45005);
			addTextButton(45006, "Option 1: Yes", "Select option 1", 0xFF981F, false, true, rsfont, 1, 300);
			addTextButton(45007, "Option 2: No", "Select option 2", 0xFF981F, false, true, rsfont, 1, 300);
			addTextButton(45008, "Option 3: Empty", "Select option 3", 0xFF981F, false, true, rsfont, 1, 300);
			addTextButton(45009, "Option 4: Empty", "Select option 4", 0xFF981F, false, true, rsfont, 1, 300);
			addText(45010, "0%", 0xFF981F, false, true, -1, rsfont, 1);
			addText(45011, "0%", 0xFF981F, false, true, -1, rsfont, 1);
			addText(45012, "0%", 0xFF981F, false, true, -1, rsfont, 1);
			addText(45013, "0%", 0xFF981F, false, true, -1, rsfont, 1);
			addText(45014, "Click any of the options and click submit. You cannot change your option.", 0xFF981F, false, true, -1, rsfont, 0);
			addHoverButton(45015, "Interfaces/Poll/SPRITE", 3, 85, 22, "Submit", -1, 45016, 1);
			addHoveredButton(45016, "Interfaces/Poll/SPRITE", 4, 85, 22, 45017);
			//addTextButton(45015, "Submit", "Submit", 0xFF981F, false, true, rsfont, 1, 80);
			addText(45018, "Votes: 10", 0xFF981F, false, true, -1, rsfont, 1);
			addTextButton(45019, "Suggest Poll", "Create a new poll", 0xFF981F, false, true, rsfont, 1, 90);
			addText(45020, "Submit", 0xFF981F, false, true, -1, rsfont, 0);
			addText(45300, "<col=FFFFFF>Only players with a skill total of 280 may vote.", 0xFF981F, false, true, -1, rsfont, 1);
			addText(45301, "Please note that all votes are final. Anything that is polled will be added in the", 0xFF981F, false, true, -1, rsfont, 1);
			addText(45302, "near or distant future. If you are caught vote-farming, you will receive", 0xFF981F, false, true, -1, rsfont, 1);
			addText(45303, "corresponding consequences. To vote, simply choose an option and click submit.", 0xFF981F, false, true, -1, rsfont, 1);
			setChildren(22, rsi);
			setBounds(45001, 14, 2, 0, rsi);
			setBounds(45002, 125, 13, 1, rsi);
			setBounds(45003, 472, 10, 2, rsi);
			setBounds(45004, 472, 10, 3, rsi);
			setBounds(45006, 63, 145, 4, rsi);
			setBounds(45007, 63, 160, 5, rsi);
			setBounds(45008, 63, 175, 6, rsi);
			setBounds(45009, 63, 190, 7, rsi);
			setBounds(45010, 385, 145, 8, rsi);
			setBounds(45011, 385, 160, 9, rsi);
			setBounds(45012, 385, 175, 10, rsi);
			setBounds(45013, 385, 190, 11, rsi);
			setBounds(45014, 63, 272, 12, rsi);
			setBounds(45015, 206, 301, 13, rsi);
			setBounds(45016, 206, 301, 14, rsi);
			setBounds(45018, 63, 253, 15, rsi);
			setBounds(45019, 365, 253, 16, rsi);
			setBounds(45020, 231, 307, 17, rsi);
			setBounds(45300, 32, 50, 18, rsi);
			setBounds(45301, 32, 65, 19, rsi);
			setBounds(45302, 32, 79, 20, rsi);
			setBounds(45303, 32, 92, 21, rsi);
			
		}
		
	   public static void addHoverBox(int id, int ParentID, String text, String text2, int configId, int configFrame) {
			RSInterface rsi = addTabInterface(id);
			rsi.id = id;
			rsi.parentID = ParentID;
			rsi.type = 8;
			rsi.aString228 = text;
			rsi.message = text2;
			rsi.anIntArray245 = new int[1];
			rsi.anIntArray212 = new int[1];
			rsi.anIntArray245[0] = 1;
			rsi.anIntArray212[0] = configId;
			rsi.valueIndexArray = new int[1][3];
			rsi.valueIndexArray[0][0] = 5;
			rsi.valueIndexArray[0][1] = configFrame;
			rsi.valueIndexArray[0][2] = 0;
		}

	   public static void addSprites(int ID, int i, int i2, String name,
	             int configId, int configFrame)
	     {
	             RSInterface Tab = addTabInterface(ID);
	             Tab.id = ID;
	             Tab.parentID = ID;
	             Tab.type = 5;
	             Tab.atActionType = 0;
	             Tab.contentType = 0;
	             Tab.width = 512;
	             Tab.height = 334;
	             Tab.aByte254 = (byte) 0;
	             Tab.hoverType = -1;
	             Tab.anIntArray245 = new int[1];
	             Tab.anIntArray212 = new int[1];
	             Tab.anIntArray245[0] = 1;
	             Tab.anIntArray212[0] = configId;
	             Tab.valueIndexArray = new int[1][3];
	             Tab.valueIndexArray[0][0] = 5;
	             Tab.valueIndexArray[0][1] = configFrame;
	             Tab.valueIndexArray[0][2] = 0;
	             Tab.sprite1 = imageLoader(i, name);
	             Tab.sprite2 = imageLoader(i2, name);
	     }
		
		 public static void addBankHover(int interfaceID, int actionType,
	             int hoverid, int spriteId, int spriteId2, String NAME, int Width,
	             int Height, int configFrame, int configId, String Tooltip,
	             int hoverId2, int hoverSpriteId, int hoverSpriteId2,
	             String hoverSpriteName, int hoverId3, String hoverDisabledText,
	             String hoverEnabledText, int X, int Y)
	     {
	             RSInterface hover = addTabInterface(interfaceID);
	             hover.id = interfaceID;
	             hover.parentID = interfaceID;
	             hover.type = 5;
	             hover.atActionType = actionType;
	             hover.contentType = 0;
	             hover.aByte254 = 0;
	             hover.hoverType = hoverid;
	             hover.sprite1 = imageLoader(spriteId, NAME);
	             hover.sprite2 = imageLoader(spriteId2, NAME);
	             hover.width = Width;
	             hover.tooltip = Tooltip;
	             hover.height = Height;
	             hover.anIntArray245 = new int[1];
	             hover.anIntArray212 = new int[1];
	             hover.anIntArray245[0] = 1;
	             hover.anIntArray212[0] = configId;
	             hover.valueIndexArray = new int[1][3];
	             hover.valueIndexArray[0][0] = 5;
	             hover.valueIndexArray[0][1] = configFrame;
	             hover.valueIndexArray[0][2] = 0;
	             hover = addTabInterface(hoverid);
	             hover.parentID = hoverid;
	             hover.id = hoverid;
	             hover.type = 0;
	             hover.atActionType = 0;
	             hover.width = 550;
	             hover.height = 334;
	             hover.isMouseoverTriggered = true;
	             hover.hoverType = -1;
	             addSprites(hoverId2, hoverSpriteId, hoverSpriteId2, hoverSpriteName,
	                     configId, configFrame);
	             addHoverBox(hoverId3, interfaceID, hoverDisabledText, hoverEnabledText,
	                     configId, configFrame);
	             setChildren(2, hover);
	             setBounds(hoverId2, 15, 60, 0, hover);
	             setBounds(hoverId3, X, Y, 1, hover);
	     }

	     public static void addBankHover1(int interfaceID, int actionType,
	             int hoverid, int spriteId, String NAME, int Width, int Height,
	             String Tooltip, int hoverId2, int hoverSpriteId,
	             String hoverSpriteName, int hoverId3, String hoverDisabledText,
	             int X, int Y)
	     {
	             RSInterface hover = addTabInterface(interfaceID);
	             hover.id = interfaceID;
	             hover.parentID = interfaceID;
	             hover.type = 5;
	             hover.atActionType = actionType;
	             hover.contentType = 0;
	             hover.aByte254 = 0;
	             hover.hoverType = hoverid;
	             hover.sprite1 = imageLoader(spriteId, NAME);
	             hover.width = Width;
	             hover.tooltip = Tooltip;
	             hover.height = Height;
	             hover = addTabInterface(hoverid);
	             hover.parentID = hoverid;
	             hover.id = hoverid;
	             hover.type = 0;
	             hover.atActionType = 0;
	             hover.width = 550;
	             hover.height = 334;
	             hover.isMouseoverTriggered = true;
	             hover.hoverType = -1;
	             addSprites(hoverId2, hoverSpriteId, hoverSpriteId, hoverSpriteName, 0,
	                     0);
	             addHoverBox(hoverId3, interfaceID, hoverDisabledText,
	                     hoverDisabledText, 0, 0);
	             setChildren(2, hover);
	             setBounds(hoverId2, 15, 60, 0, hover);
	             setBounds(hoverId3, X, Y, 1, hover);
	     }
	     
	     public static void bank(TextDrawingArea[] wid){
	 		RSInterface Interface = addTabInterface(5292);
	 		setChildren(42, Interface);
	 		addSprite(5293, 0, "Bank/BANK");
	 		setBounds(5293, 13, 1, 0, Interface);
	 		addHover(5384, 3, 0, 5380, 1, "Bank/BANK", 25, 25, "Close Window");
	 		addHovered(5380, 2, "Bank/BANK", 25, 25, 5379);
	 		setBounds(5384, 472, 8, 3, Interface);
	 		setBounds(5380, 472, 8, 4, Interface);	
	 		addHover(5294, 4, 0, 5295, 3, "Bank/BANK", 83, 25, "Insert");
	 		addHovered(5295, 4, "Bank/BANK", 114, 25, 5296);
	 		setBounds(5294, 104, 306, 5, Interface);
	 		setBounds(5295, 104, 306, 6, Interface);
	 		addBankHover(23000, 4, 23001, 5, 8, "Bank/BANK", 83, 25, 304, 1, "Swap", 23002, 7, 6, "Bank/BANK", 23003, "Switch to insert items \nmode", "Switch to swap items \nmode.", 12, 20);
	 		setBounds(23000, 19, 306, 7, Interface);
	 		setBounds(23001, 19, 306, 8, Interface);
	 		addBankHover(22004, 4, 22005, 13, 15, "Bank/BANK", 83, 25, 0, 1, "Item", 22006, 14, 16, "Bank/BANK", 22007, "Click here to search your \nbank", "Click here to search your \nbank", 12, 20);
	 		setBounds(22004, 199, 306, 9, Interface);
	 		setBounds(22005, 199, 306, 10, Interface);
	 		addBankHover(22008, 4, 22009, 9, 11, "Bank/BANK", 83, 25, 115, 1, "Note", 22010, 10, 12, "Bank/BANK", 22011, "Switch to note withdrawal \nmode", "Switch to item withdrawal \nmode", 12, 20);
	 		setBounds(22008, 284, 306, 11, Interface);
	 		setBounds(22009, 284, 306, 12, Interface);
	 		addBankHover1(22012, 5, 22013, 17, "Bank/BANK", 36, 36, "Search", 22014, 18, "Bank/BANK", 22015, "Empty your backpack into\nyour bank", 0, 20);
	 		setBounds(22012, 377, 290, 13, Interface);
	 		setBounds(22013, 362, 290, 14, Interface);
	 		addBankHover1(23016, 5, 23017, 19, "Bank/BANK", 36, 36, "Deposit inventory", 23018, 20, "Bank/BANK", 23019, "Empty the items your are\nwearing into your bank", 0, 20);
	 		setBounds(23016, 423, 290, 15, Interface);
	 		setBounds(23017, 423, 290, 16, Interface);
	 		addBankHover1(23020, 5, 23021, 21, "Bank/BANK", 36, 36, "Deposit worn items", 23022, 22, "Bank/BANK", 23023, "Empty your BoB's inventory\ninto your bank", 0, 20);
	 		setBounds(23020, 459, 290, 17, Interface);
	 		setBounds(23021, 459, 290, 18, Interface);
	 		setBounds(5383, 195, 11, 1, Interface);
	 		setBounds(5385, 27, 78, 2, Interface);
	 		addButton(23024, 0, "BANK/TAB", "View all items");
	 		setBounds(23024, 22 + 35, 36, 19, Interface);
	 		addButton(23025, 4, "BANK/TAB", "New tab");
	 		setBounds(23025, 70 + 27, 36 + 1, 20, Interface);
	 		addButton(23026, 4, "BANK/TAB", "New tab");
	 		setBounds(23026, 118 + 19, 36 + 1, 21, Interface);
	 		addButton(23027, 4, "BANK/TAB", "New tab");
	 		setBounds(23027, 166 + 11, 36 + 1, 22, Interface);
	 		addButton(23028, 4, "BANK/TAB", "New tab");
	 		setBounds(23028, 214 + 3, 36 + 1, 23, Interface);
	 		addButton(23029, 4, "BANK/TAB", "New tab");
	 		setBounds(23029, 262 - 5, 36 + 1, 24, Interface);
	 		addButton(23030, 4, "BANK/TAB", "New tab");
	 		setBounds(23030, 310 - 13, 36 + 1, 25, Interface);
	 		addButton(23031, 4, "BANK/TAB", "New tab");
	 		setBounds(23031, 358 - 21, 36 + 1, 26, Interface);
	 		addButton(23032, 4, "BANK/TAB", "New tab");
	 		setBounds(23032, 406 - 29, 36 + 1, 27, Interface);
	 		addText(22033, "134", wid, 0, 0xFF981F, true, true);
	 		setBounds(22033, 30, 7, 28, Interface);
	 		addText(22034, "496", wid, 0, 0xFF981F, true, true);
	 		setBounds(22034, 30, 19, 29, Interface);
	 		addBankItem(22035, false);
	 		setBounds(22035, 77 + 25, 39 + 1, 30, Interface);
	 		addBankItem(22036, false);
	 		setBounds(22036, 125 + 17, 39 + 1, 31, Interface);
	 		addBankItem(22037, false);
	 		setBounds(22037, 173 + 9, 39 + 1, 32, Interface);
	 		addBankItem(22038, false);
	 		setBounds(22038, 221 + 1, 39 + 1, 33, Interface);
	 		addBankItem(22039, false);
	 		setBounds(22039, 269 - 7, 39 + 1, 34, Interface);
	 		addBankItem(22040, false);
	 		setBounds(22040, 317 - 15, 39 + 1, 35, Interface);
	 		addBankItem(22041, false);
	 		setBounds(22041, 365 - 23, 39 + 1, 36, Interface);
	 		addBankItem(22042, false);
	 		setBounds(22042, 413 - 31, 39 + 1, 37, Interface);
	 		
	 		addText(27000, "0", 0xFF981F, false, true, 52, wid, 1);
	 		addText(27001, "0", 0xFF981F, false, true, 52, wid, 1);
	 		addText(27002, "0", 0xFF981F, false, true, 52, wid, 1);
	 		addText(22043, "__", wid, 0, 0xFF981F, true, true);
	 		setBounds(22043, 30, 10, 38, Interface);
	 		addSprite(22044, 24, "Bank/BANK");
	 		setBounds(22044, 463, 42, 39, Interface);
	 		addText(22045, "Withdraw as:", wid, 1, 0xFF981F, true, true);
	 		setBounds(22045, 283, 290, 40, Interface);
	 		addText(22046, "Rearrange mode:", wid, 1, 0xFF981F, true, true);
	 		setBounds(22046, 102, 290, 41, Interface);
	 		Interface = interfaceCache[5385];
	 		Interface.height = 206;
	 		Interface.width = 452;
	 		Interface = interfaceCache[5382];
	 		Interface.width = 8;
	 		Interface.invSpritePadX = 17;
	 		Interface.height = 35;
	 	}
	     
	     public boolean hasExamine = true;
	     
	     public static void addBankItem(int index, boolean hasOption)
	 	{
	 		RSInterface rsi = interfaceCache[index] = new RSInterface();
	 		rsi.actions = new String[5];
	 		rsi.spritesX = new int[20];
	 		rsi.invStackSizes = new int[30];
	 		rsi.inv = new int[30];
	 		rsi.spritesY = new int[20];
	 		rsi.children = new int[0];
	 		rsi.childX = new int[0];
	 		rsi.childY = new int[0];
	 		rsi.hasExamine = false;
	 		rsi.invSpritePadX = 24;
	 		rsi.invSpritePadY = 24;
	 		rsi.height = 5;
	 		rsi.width = 6;
	 		rsi.parentID = 5292;
	 		rsi.id = index;
	 		rsi.type = 2;
	 	}
	     
	   /* - END NEW METHODS */
	   
	   /*public static void bank(TextDrawingArea[] TDA) {
			RSInterface Tab = addTabInterface(23000);
			addText(23003, "", TDA, 0, 0xFFB000, false, false);
			addHover(23004, 3, 0, 23005, 1, "Bank/BANK", 16, 16, "Close");
			addHovered(23005, 2, "Bank/BANK", 16, 16, 23006);
			addHover(23007, 4, 0, 23008, 17, "Bank/BANK", 35, 25,
					"Deposit carried items");
			addHovered(23008, 18, "Bank/BANK", 35, 25, 23009);
			Tab.children = new int[7];
			Tab.childX = new int[7];
			Tab.childY = new int[7];
			Tab.children[0] = 5292;
			Tab.childX[0] = 0;
			Tab.childY[0] = 0;
			Tab.children[1] = 23003;
			Tab.childX[1] = 410;
			Tab.childY[1] = 30;
			Tab.children[2] = 23004;
			Tab.childX[2] = 472;
			Tab.childY[2] = 29;
			Tab.children[3] = 23005;
			Tab.childX[3] = 472;
			Tab.childY[3] = 29;
			Tab.children[4] = 23007;
			Tab.childX[4] = 450;
			Tab.childY[4] = 288;
			Tab.children[5] = 23008;
			Tab.childX[5] = 450;
			Tab.childY[5] = 288;
			Tab.children[6] = 23008;
			Tab.childX[6] = 3000;
			Tab.childY[6] = 5000;
			RSInterface rsi = interfaceCache[5292];
			addText(5384, "", TDA, 0, 0xFFB000, false, false);// cheap hax
			rsi.childX[90] = 410;
			rsi.childY[90] = 288;
		}*/
	   
	    public static void slayerInterface(TextDrawingArea[] tda) {
	        RSInterface rsInterface = addInterface(41000);
	        addSprite(41001, 1, "Interfaces/SlayerInterface/IMAGE");
	        addHoverButton(41002, "Interfaces/SlayerInterface/IMAGE", 4, 16, 16, "Close window", 0, 41003, 1);
	        addHoveredButton(41003, "Interfaces/SlayerInterface/IMAGE", 5, 16, 16, 41004);
	        addHoverButton(41005, "", 0, 85, 20, "Buy", 0, 41006, 1);
	        addHoverButton(41007, "", 0, 85, 20, "Learn", 0, 41008, 1);
	        addHoverButton(41009, "", 0, 85, 20, "Assignment", 0, 41010, 1);
	        addText(41011, "Slayer Points: ", tda, 3, 0xFF981F);
	        addTextButton(41012, "Slayer Experience                           50", "Buy Slayer Experience", 0xFF981F, false, true, tda, 1, 400);
	        addTextButton(41013, "Slayer's Respite                             25", "Buy Slayer's Respite", 0xFF981F, false, true, tda, 1, 401);
	        addTextButton(41014, "Slayer Darts                                     35", "Buy Slayer Darts", 0xFF981F, false, true, tda, 1, 402);
	        addTextButton(41015, "Broad Arrows                                    25", "Buy Broad Arrows", 0xFF981F, false, true, tda, 1, 403);
	        setChildren(11, rsInterface);
	        rsInterface.child(0, 41001, 12, 10);
	        rsInterface.child(1, 41002, 473, 20);
	        rsInterface.child(2, 41003, 473, 20);
	        rsInterface.child(3, 41005, 21, 23);
	        rsInterface.child(4, 41007, 107, 23);
	        rsInterface.child(5, 41009, 193, 23);
	        rsInterface.child(6, 41011, 98, 74);
	        rsInterface.child(7, 41012, 124, 128);
	        rsInterface.child(8, 41013, 125, 160);
	        rsInterface.child(9, 41014, 125, 190);
	        rsInterface.child(10, 41015, 124, 220);
	        
	    }
	    
	    public static void slayerInterfaceSub1(TextDrawingArea[] tda) {
	        RSInterface rsInterface = addInterface(41500);
	        addSprite(41501, 2, "Interfaces/SlayerInterface/IMAGE");
	        addHoverButton(41502, "Interfaces/SlayerInterface/IMAGE", 4, 16, 16, "Close window", 0, 41503, 1);
	        addHoveredButton(41503, "Interfaces/SlayerInterface/IMAGE", 5, 16, 16, 41504);
	        addHoverButton(41505, "", 0, 85, 20, "Buy", 0, 41506, 1);
	        addHoverButton(41507, "", 0, 85, 20, "Learn", 0, 41508, 1);
	        addHoverButton(41509, "", 0, 85, 20, "Assignment", 0, 41510, 1);
	        addText(41511, "Slayer Points: ", tda, 3, 0xFF981F);
	        setChildren(7, rsInterface);
	        rsInterface.child(0, 41501, 12, 10);
	        rsInterface.child(1, 41502, 473, 20);
	        rsInterface.child(2, 41503, 473, 20);
	        rsInterface.child(3, 41505, 21, 23);
	        rsInterface.child(4, 41507, 107, 23);
	        rsInterface.child(5, 41509, 193, 23);
	        rsInterface.child(6, 41511, 98, 74);
	    }
	    
	    public static void slayerInterfaceSub2(TextDrawingArea[] tda) {
	        RSInterface rsInterface = addInterface(42000);
	        addSprite(42001, 3, "Interfaces/SlayerInterface/IMAGE");
	        addHoverButton(42002, "Interfaces/SlayerInterface/IMAGE", 4, 16, 16, "Close window", 0, 42003, 1);
	        addHoveredButton(42003, "Interfaces/SlayerInterface/IMAGE", 5, 16, 16, 42004);
	        addHoverButton(42005, "", 0, 85, 20, "Buy", 0, 42006, 1);
	        addHoverButton(42007, "", 0, 85, 20, "Learn", 0, 42008, 1);
	        addHoverButton(42009, "", 0, 85, 20, "Assignment", 0, 42010, 1);
	        addText(42011, "Slayer Points: ", tda, 3, 0xFF981F);
	        addTextButton(42012, "Cancel Task", "Temporarily cancel your current slayer task", 0xFF981F, false, true, tda, 1, 300);
	        addTextButton(42013, "Remove Task permanently", "Permanently remove this monster as a task", 0xFF981F, false, true, tda, 1, 305);
	        addText(42014, "line 1", tda, 1, 0xFF981F);
	        addText(42015, "line 2", tda, 1, 0xFF981F);
	        addText(42016, "line 3", tda, 1, 0xFF981F);
	        addText(42017, "line 4", tda, 1, 0xFF981F);
	        addButton(42018, 6, "Interfaces/SlayerInterface/IMAGE", "Delete removed slayer task");
	        addButton(42019, 6, "Interfaces/SlayerInterface/IMAGE", "Delete removed slayer task");
	        addButton(42020, 6, "Interfaces/SlayerInterface/IMAGE", "Delete removed slayer task");
	        addButton(42021, 6, "Interfaces/SlayerInterface/IMAGE", "Delete removed slayer task");
	        setChildren(17, rsInterface);
	        rsInterface.child(0, 42001, 12, 10);
	        rsInterface.child(1, 42002, 473, 20);
	        rsInterface.child(2, 42003, 473, 20);
	        rsInterface.child(3, 42005, 21, 23);
	        rsInterface.child(4, 42007, 107, 23);
	        rsInterface.child(5, 42009, 193, 23);
	        rsInterface.child(6, 42011, 98, 74);
	        rsInterface.child(7, 42012, 71, 127);
	        rsInterface.child(8, 42013, 71, 146);
	        rsInterface.child(9, 42014, 71, 216);
	        rsInterface.child(10, 42015, 71, 234);
	        rsInterface.child(11, 42016, 71, 252);
	        rsInterface.child(12, 42017, 71, 270);
	        rsInterface.child(13, 42018, 303, 215);
	        rsInterface.child(14, 42019, 303, 233);
	        rsInterface.child(15, 42020, 303, 251);
	        rsInterface.child(16, 42021, 303, 269);
	    }
		public static void homeTeleport(){
	        RSInterface RSInterface = addInterface(30000);
	        RSInterface.tooltip = "Cast @gre@Lunar Home Teleport";
	        RSInterface.id = 30000;
	        RSInterface.parentID = 30000;
	        RSInterface.type = 5;
	        RSInterface.atActionType = 5;
	        RSInterface.contentType = 0;
	        RSInterface.aByte254 = 0;
	        RSInterface.mOverInterToTrigger = 30001;
	        RSInterface.sprite1 =  imageLoader(1, "Lunar/SPRITE");
	        RSInterface.width = 20;
	        RSInterface.height = 20;
	        RSInterface Int = addInterface(30001);
	        Int.isMouseoverTriggered = true;
	    	Int.mOverInterToTrigger = -1;
	        setChildren(1, Int);
	        addLunarSprite(30002, 0, "SPRITE");
	        setBounds(30002, 0, 0,0, Int);
		}
		
		public static void addLunarSprite(int i, int j, String name) {
	        RSInterface RSInterface = addInterface(i);
	        RSInterface.id = i;
	        RSInterface.parentID = i;
	        RSInterface.type = 5;
	        RSInterface.atActionType = 5;
	        RSInterface.contentType = 0;
	        RSInterface.aByte254 = 0;
	        RSInterface.mOverInterToTrigger = 52;
	        RSInterface.sprite1 = LoadLunarSprite(j, name);
	        RSInterface.width = 500;
	        RSInterface.height = 500;
	        RSInterface.tooltip = "";
	    }
		public static void drawRune(int i,int id, String runeName) {
	        RSInterface RSInterface = addInterface(i);
	        RSInterface.type = 5;
	        RSInterface.atActionType = 0;
	        RSInterface.contentType = 0;
	        RSInterface.aByte254 = 0;
	        RSInterface.mOverInterToTrigger = 52;
	        RSInterface.sprite1 = LoadLunarSprite(id, "RUNE");
	        RSInterface.width = 500;
	        RSInterface.height = 500;
	    }
		
		public static void addButtons(int id, int sid, String spriteName, String tooltip, int mOver, int atAction) {
			RSInterface rsinterface = interfaceCache[id] = new RSInterface();
			rsinterface.id = id;
			rsinterface.parentID = id;
			rsinterface.type = 5;
			rsinterface.atActionType = atAction;
			rsinterface.contentType = 0;
			rsinterface.aByte254 = (byte)0;
			rsinterface.mOverInterToTrigger = mOver;
			rsinterface.sprite1 = imageLoader(sid, spriteName);
			rsinterface.sprite2 = imageLoader(sid, spriteName);
			rsinterface.width = rsinterface.sprite1.myWidth;
			rsinterface.height = rsinterface.sprite2.myHeight;
			rsinterface.tooltip = tooltip;
			rsinterface.inventoryhover = true;
		}
		
		public static void addLunar2RunesSmallBox(int ID, int r1, int r2, int ra1, int ra2,int rune1, int lvl,String name, String descr,TextDrawingArea[] TDA,int sid,int suo,int type){
			RSInterface rsInterface = addInterface(ID);
			rsInterface.id = ID;
			rsInterface.parentID = 1151;
			rsInterface.type = 5;
			rsInterface.atActionType = type;
			rsInterface.contentType = 0;
			rsInterface.mOverInterToTrigger = ID+1;
			rsInterface.spellUsableOn = suo;
			rsInterface.selectedActionName = "Cast On";
			rsInterface.width = 20;
			rsInterface.height = 20;
			rsInterface.tooltip = "Cast @gre@"+name;
			rsInterface.spellName = name;
			rsInterface.anIntArray245 = new int[3];
			rsInterface.anIntArray212 = new int[3];
			rsInterface.anIntArray245[0] = 3;
			rsInterface.anIntArray212[0] = ra1;
			rsInterface.anIntArray245[1] = 3;
			rsInterface.anIntArray212[1] = ra2;
			rsInterface.anIntArray245[2] = 3;
			rsInterface.anIntArray212[2] = lvl;
			rsInterface.valueIndexArray = new int[3][];
			rsInterface.valueIndexArray[0] = new int[4];
			rsInterface.valueIndexArray[0][0] = 4;
			rsInterface.valueIndexArray[0][1] = 3214;
			rsInterface.valueIndexArray[0][2] = r1;
			rsInterface.valueIndexArray[0][3] = 0;
			rsInterface.valueIndexArray[1] = new int[4];
			rsInterface.valueIndexArray[1][0] = 4;
			rsInterface.valueIndexArray[1][1] = 3214;
			rsInterface.valueIndexArray[1][2] = r2;
			rsInterface.valueIndexArray[1][3] = 0;
			rsInterface.valueIndexArray[2] = new int[3];
			rsInterface.valueIndexArray[2][0] = 1;
			rsInterface.valueIndexArray[2][1] = 6;
			rsInterface.valueIndexArray[2][2] = 0;
			rsInterface.sprite2 =  imageLoader(sid, "Lunar/LUNARON");
			rsInterface.sprite1 =  imageLoader(sid, "Lunar/LUNAROFF");
			RSInterface INT = addInterface(ID+1);
			INT.isMouseoverTriggered = true;
			INT.mOverInterToTrigger = -1;
			//setChildren(7, INT);
			//addLunarSprite(ID+2, 0, "BOX");
			//setBounds(ID+2, 0, 0, 0, INT);
			//addText(ID+3, "Level "+(lvl+1)+": "+name, 0xFF981F, true, true, 52, TDA, 1);
			//setBounds(ID+3, 90, 4, 1, INT);
			//addText(ID+4, descr, 0xAF6A1A, true, true, 52, TDA, 0);	
			//setBounds(ID+4, 90, 19, 2, INT);
			//setBounds(30016, 37, 35, 3, INT);//Rune
			//setBounds(rune1, 112, 35, 4, INT);//Rune
			//addRuneText(ID+5, ra1+1, r1, TDA);
			//setBounds(ID+5, 50, 66, 5, INT);
			//addRuneText(ID+6, ra2+1, r2, TDA);
			//setBounds(ID+6, 123, 66, 6, INT);

		}
		
		public static void addRuneText(int ID, int runeAmount, int RuneID, TextDrawingArea[] font){
			RSInterface rsInterface = addInterface(ID);
			rsInterface.id = ID;
			rsInterface.parentID = 1151;
			rsInterface.type = 4;
			rsInterface.atActionType = 0;
			rsInterface.contentType = 0;
			rsInterface.width = 0;
			rsInterface.height = 14;
			rsInterface.aByte254 = 0;
			rsInterface.mOverInterToTrigger = -1;
			rsInterface.anIntArray245 = new int[1];
			rsInterface.anIntArray212 = new int[1];
			rsInterface.anIntArray245[0] = 3;
			rsInterface.anIntArray212[0] = runeAmount;
			rsInterface.valueIndexArray = new int[1][4];
			rsInterface.valueIndexArray[0][0] = 4;
			rsInterface.valueIndexArray[0][1] = 3214;
			rsInterface.valueIndexArray[0][2] = RuneID;
			rsInterface.valueIndexArray[0][3] = 0;
			rsInterface.centerText = true;
			rsInterface.textDrawingAreas = font[0];
			//rsInterface.textShadowed = true;
			rsInterface.message = "%1/"+runeAmount+"";
			rsInterface.message = "";
			//rsInterface.disabledColour = 12582912;
			//rsInterface.enabledColour = 49152;	
		}

		public static void addLunar3RunesSmallBox(int ID, int r1, int r2, int r3, int ra1, int ra2, int ra3,int rune1, int rune2, int lvl,String name, String descr,TextDrawingArea[] TDA, int sid,int suo,int type){
			RSInterface rsInterface = addInterface(ID);
			rsInterface.id = ID;
			rsInterface.parentID = 1151;
			rsInterface.type = 5;
			rsInterface.atActionType = type;
			rsInterface.contentType = 0;
			rsInterface.mOverInterToTrigger = ID+1;
			rsInterface.spellUsableOn = suo;
			rsInterface.selectedActionName = "Cast on";
			rsInterface.width = 20;
			rsInterface.height = 20;
			rsInterface.tooltip = "Cast @gre@"+name;
			rsInterface.spellName = name;
			rsInterface.anIntArray245 = new int[4];
			rsInterface.anIntArray212 = new int[4];
			rsInterface.anIntArray245[0] = 3;
			rsInterface.anIntArray212[0] = ra1;
			rsInterface.anIntArray245[1] = 3;
			rsInterface.anIntArray212[1] = ra2;
			rsInterface.anIntArray245[2] = 3;
			rsInterface.anIntArray212[2] = ra3;
			rsInterface.anIntArray245[3] = 3;
			rsInterface.anIntArray212[3] = lvl;
			rsInterface.valueIndexArray = new int[4][];
			rsInterface.valueIndexArray[0] = new int[4];
			rsInterface.valueIndexArray[0][0] = 4;
			rsInterface.valueIndexArray[0][1] = 3214;
			rsInterface.valueIndexArray[0][2] = r1;
			rsInterface.valueIndexArray[0][3] = 0;
			rsInterface.valueIndexArray[1] = new int[4];
			rsInterface.valueIndexArray[1][0] = 4;
			rsInterface.valueIndexArray[1][1] = 3214;
			rsInterface.valueIndexArray[1][2] = r2;
			rsInterface.valueIndexArray[1][3] = 0;
			rsInterface.valueIndexArray[2] = new int[4];
			rsInterface.valueIndexArray[2][0] = 4;
			rsInterface.valueIndexArray[2][1] = 3214;
			rsInterface.valueIndexArray[2][2] = r3;
			rsInterface.valueIndexArray[2][3] = 0;
			rsInterface.valueIndexArray[3] = new int[3];
			rsInterface.valueIndexArray[3][0] = 1;
			rsInterface.valueIndexArray[3][1] = 6;
			rsInterface.valueIndexArray[3][2] = 0;
			rsInterface.sprite2 =  imageLoader(sid, "Lunar/LUNARON");
			rsInterface.sprite1 =  imageLoader(sid, "Lunar/LUNAROFF");
			RSInterface INT = addInterface(ID+1);
			INT.isMouseoverTriggered = true;
			INT.mOverInterToTrigger = -1;
			//setChildren(9, INT);
			//addLunarSprite(ID+2, 0, "BOX");
			//setBounds(ID+2, 0, 0, 0, INT);
			//addText(ID+3, "Level "+(lvl+1)+": "+name, 0xFF981F, true, true, 52, TDA, 1);setBounds(ID+3, 90, 4, 1, INT);
			//addText(ID+4, descr, 0xAF6A1A, true, true, 52, TDA, 0);	setBounds(ID+4, 90, 19, 2, INT);
			//setBounds(30016, 14, 35, 3, INT);
			//setBounds(rune1, 74, 35, 4, INT);
			//setBounds(rune2, 130, 35, 5, INT);
			//addRuneText(ID+5, ra1+1, r1, TDA);
			//setBounds(ID+5, 26, 66, 6, INT);
			//addRuneText(ID+6, ra2+1, r2, TDA);
			//setBounds(ID+6, 87, 66, 7, INT);
			//addRuneText(ID+7, ra3+1, r3, TDA);
			//setBounds(ID+7, 142, 66, 8, INT);
		}

		public static void addLunar3RunesBigBox(int ID, int r1, int r2, int r3, int ra1, int ra2, int ra3,int rune1, int rune2, int lvl,String name, String descr,TextDrawingArea[] TDA, int sid,int suo,int type){
			RSInterface rsInterface = addInterface(ID);
			rsInterface.id = ID;
			rsInterface.parentID = 1151;
			rsInterface.type = 5;
			rsInterface.atActionType = type;
			rsInterface.contentType = 0;
			rsInterface.mOverInterToTrigger = ID+1;
			rsInterface.spellUsableOn = suo;
			rsInterface.selectedActionName = "Cast on";
			rsInterface.width = 20;
			rsInterface.height = 20;
			rsInterface.tooltip = "Cast @gre@"+name;
			rsInterface.spellName = name;
			rsInterface.anIntArray245 = new int[4];
			rsInterface.anIntArray212 = new int[4];
			rsInterface.anIntArray245[0] = 3;
			rsInterface.anIntArray212[0] = ra1;
			rsInterface.anIntArray245[1] = 3;
			rsInterface.anIntArray212[1] = ra2;
			rsInterface.anIntArray245[2] = 3;
			rsInterface.anIntArray212[2] = ra3;
			rsInterface.anIntArray245[3] = 3;
			rsInterface.anIntArray212[3] = lvl;
			rsInterface.valueIndexArray = new int[4][];
			rsInterface.valueIndexArray[0] = new int[4];
			rsInterface.valueIndexArray[0][0] = 4;
			rsInterface.valueIndexArray[0][1] = 3214;
			rsInterface.valueIndexArray[0][2] = r1;
			rsInterface.valueIndexArray[0][3] = 0;
			rsInterface.valueIndexArray[1] = new int[4];
			rsInterface.valueIndexArray[1][0] = 4;
			rsInterface.valueIndexArray[1][1] = 3214;
			rsInterface.valueIndexArray[1][2] = r2;
			rsInterface.valueIndexArray[1][3] = 0;
			rsInterface.valueIndexArray[2] = new int[4];
			rsInterface.valueIndexArray[2][0] = 4;
			rsInterface.valueIndexArray[2][1] = 3214;
			rsInterface.valueIndexArray[2][2] = r3;
			rsInterface.valueIndexArray[2][3] = 0;
			rsInterface.valueIndexArray[3] = new int[3];
			rsInterface.valueIndexArray[3][0] = 1;
			rsInterface.valueIndexArray[3][1] = 6;
			rsInterface.valueIndexArray[3][2] = 0;
			rsInterface.sprite2 =  imageLoader(sid, "Lunar/LUNARON");
			rsInterface.sprite1 =  imageLoader(sid, "Lunar/LUNAROFF");
			RSInterface INT = addInterface(ID+1);
			INT.isMouseoverTriggered = true;
			INT.mOverInterToTrigger = -1;
		//	setChildren(9, INT);
			//addLunarSprite(ID+2, 1, "BOX");
			//setBounds(ID+2, 0, 0, 0, INT);
			//addText(ID+3, "Level "+(lvl+1)+": "+name, 0xFF981F, true, true, 52, TDA, 1);setBounds(ID+3, 90, 4, 1, INT);
			//addText(ID+4, descr, 0xAF6A1A, true, true, 52, TDA, 0);	setBounds(ID+4, 90, 21, 2, INT);
			//setBounds(30016, 14, 48, 3, INT);
			//setBounds(rune1, 74, 48, 4, INT);
			//setBounds(rune2, 130, 48, 5, INT);
			//addRuneText(ID+5, ra1+1, r1, TDA);
			//setBounds(ID+5, 26, 79, 6, INT);
			//addRuneText(ID+6, ra2+1, r2, TDA);
			//setBounds(ID+6, 87, 79, 7, INT);
			//addRuneText(ID+7, ra3+1, r3, TDA);
			//setBounds(ID+7, 142, 79, 8, INT);
		}

		public static void addLunar3RunesLargeBox(int ID, int r1, int r2, int r3, int ra1, int ra2, int ra3,int rune1, int rune2, int lvl,String name, String descr,TextDrawingArea[] TDA, int sid,int suo,int type){
			RSInterface rsInterface = addInterface(ID);
			rsInterface.id = ID;
			rsInterface.parentID = 1151;
			rsInterface.type = 5;
			rsInterface.atActionType = type;
			rsInterface.contentType = 0;
			rsInterface.mOverInterToTrigger = ID+1;
			rsInterface.spellUsableOn = suo;
			rsInterface.selectedActionName = "Cast on";
			rsInterface.width = 20;
			rsInterface.height = 20;
			rsInterface.tooltip = "Cast @gre@"+name;
			rsInterface.spellName = name;
			rsInterface.anIntArray245 = new int[4];
			rsInterface.anIntArray212 = new int[4];
			rsInterface.anIntArray245[0] = 3;
			rsInterface.anIntArray212[0] = ra1;
			rsInterface.anIntArray245[1] = 3;
			rsInterface.anIntArray212[1] = ra2;
			rsInterface.anIntArray245[2] = 3;
			rsInterface.anIntArray212[2] = ra3;
			rsInterface.anIntArray245[3] = 3;
			rsInterface.anIntArray212[3] = lvl;
			rsInterface.valueIndexArray = new int[4][];
			rsInterface.valueIndexArray[0] = new int[4];
			rsInterface.valueIndexArray[0][0] = 4;
			rsInterface.valueIndexArray[0][1] = 3214;
			rsInterface.valueIndexArray[0][2] = r1;
			rsInterface.valueIndexArray[0][3] = 0;
			rsInterface.valueIndexArray[1] = new int[4];
			rsInterface.valueIndexArray[1][0] = 4;
			rsInterface.valueIndexArray[1][1] = 3214;
			rsInterface.valueIndexArray[1][2] = r2;
			rsInterface.valueIndexArray[1][3] = 0;
			rsInterface.valueIndexArray[2] = new int[4];
			rsInterface.valueIndexArray[2][0] = 4;
			rsInterface.valueIndexArray[2][1] = 3214;
			rsInterface.valueIndexArray[2][2] = r3;
			rsInterface.valueIndexArray[2][3] = 0;
			rsInterface.valueIndexArray[3] = new int[3];
			rsInterface.valueIndexArray[3][0] = 1;
			rsInterface.valueIndexArray[3][1] = 6;
			rsInterface.valueIndexArray[3][2] = 0;
			rsInterface.sprite2 =  imageLoader(sid, "Lunar/LUNARON");
			rsInterface.sprite1 =  imageLoader(sid, "Lunar/LUNAROFF");
			RSInterface INT = addInterface(ID+1);
			INT.isMouseoverTriggered = true;
			INT.mOverInterToTrigger = -1;
			//setChildren(9, INT);
			//addLunarSprite(ID+2, 2, "BOX");
			//setBounds(ID+2, 0, 0, 0, INT);
			//addText(ID+3, "Level "+(lvl+1)+": "+name, 0xFF981F, true, true, 52, TDA, 1);
			//setBounds(ID+3, 90, 4, 1, INT);
			//addText(ID+4, descr, 0xAF6A1A, true, true, 52, TDA, 0);	
			//setBounds(ID+4, 90, 34, 2, INT);
			//setBounds(30016, 14, 61, 3, INT);
			//setBounds(rune1, 74, 61, 4, INT);
			//setBounds(rune2, 130, 61, 5, INT);
			//addRuneText(ID+5, ra1+1, r1, TDA);
			//setBounds(ID+5, 26, 92, 6, INT);
			//addRuneText(ID+6, ra2+1, r2, TDA);
			//setBounds(ID+6, 87, 92, 7, INT);
			//addRuneText(ID+7, ra3+1, r3, TDA);
			//setBounds(ID+7, 142, 92, 8, INT);
		}
		
		private static Sprite LoadLunarSprite(int i, String s) {
			Sprite sprite = imageLoader(i,"/Lunar/" + s);
			return sprite;
		}

	public static void addActionButton(int id, int sprite, int sprite2,
			int width, int height, String s) {
		RSInterface rsi = interfaceCache[id] = new RSInterface();
		rsi.sprite1 = CustomSpriteLoader(sprite, "");
		if (sprite2 == sprite)
			rsi.sprite2 = CustomSpriteLoader(sprite, "a");
		else
			rsi.sprite2 = CustomSpriteLoader(sprite2, "");
		rsi.tooltip = s;
		rsi.contentType = 0;
		rsi.atActionType = 1;
		rsi.width = width;
		rsi.mOverInterToTrigger = 52;
		rsi.parentID = id;
		rsi.id = id;
		rsi.type = 5;
		rsi.height = height;
	}

	public static void addButton(int id, int sid, String spriteName,
			String tooltip, int mOver, int atAction, int width, int height) {
		RSInterface tab = interfaceCache[id] = new RSInterface();
		tab.id = id;
		tab.parentID = id;
		tab.type = 5;
		tab.atActionType = atAction;
		tab.contentType = 0;
		tab.aByte254 = 0;
		tab.mOverInterToTrigger = mOver;
		tab.sprite1 = imageLoader(sid, spriteName);
		tab.sprite2 = imageLoader(sid, spriteName);
		tab.width = width;
		tab.height = height;
		tab.tooltip = tooltip;
		tab.inventoryhover = true;
	}

	public static void addText(int id, String text, TextDrawingArea wid[],
			int idx, int color) {
		RSInterface rsinterface = addTab(id);
		rsinterface.id = id;
		rsinterface.parentID = id;
		rsinterface.type = 4;
		rsinterface.atActionType = 0;
		rsinterface.width = 174;
		rsinterface.height = 11;
		rsinterface.contentType = 0;
		rsinterface.aByte254 = 0;
		rsinterface.mOverInterToTrigger = -1;
		rsinterface.centerText = false;
		rsinterface.textShadow = true;
		rsinterface.textDrawingAreas = wid[idx];
		rsinterface.message = text;
		rsinterface.aString228 = "";
		rsinterface.textColor = color;
		rsinterface.anInt219 = 0;
		rsinterface.anInt216 = 0;
		rsinterface.anInt239 = 0;
	}

	public static void sprite1(int id, int sprite) {
		RSInterface class9 = interfaceCache[id];
		class9.sprite1 = CustomSpriteLoader(sprite, "");
	}

	public static RSInterface addInterface(int id) {
		RSInterface rsi = interfaceCache[id] = new RSInterface();
		rsi.id = id;
		rsi.parentID = id;
		rsi.width = 512;
		rsi.height = 334;
		return rsi;
	}

	public static void addHoverText(int id, String text, String tooltip,
			TextDrawingArea tda[], int idx, int color, boolean center,
			boolean textShadowed, int width) {
		RSInterface rsinterface = addInterface(id);
		rsinterface.id = id;
		rsinterface.parentID = id;
		rsinterface.type = 4;
		rsinterface.atActionType = 1;
		rsinterface.width = width;
		rsinterface.height = 11;
		rsinterface.contentType = 0;
		rsinterface.aByte254 = 0;
		rsinterface.mOverInterToTrigger = -1;
		rsinterface.centerText = center;
		rsinterface.textShadow = textShadowed;
		rsinterface.textDrawingAreas = tda[idx];
		rsinterface.message = text;
		rsinterface.aString228 = "";
		rsinterface.textColor = color;
		rsinterface.anInt219 = 0;
		rsinterface.anInt216 = 0xffffff;
		rsinterface.anInt239 = 0;
		rsinterface.tooltip = tooltip;
	}

	public static RSInterface addTab(int i) {
		RSInterface rsinterface = interfaceCache[i] = new RSInterface();
		rsinterface.id = i;
		rsinterface.parentID = i;
		rsinterface.type = 0;
		rsinterface.atActionType = 0;
		rsinterface.contentType = 0;
		rsinterface.width = 512;
		rsinterface.height = 334;
		rsinterface.aByte254 = 0;
		rsinterface.mOverInterToTrigger = 0;
		return rsinterface;
	}

	public static void addConfigButton(int ID, int pID, int bID, int bID2,
			String bName, int width, int height, String tT, int configID,
			int aT, int configFrame) {
		RSInterface Tab = addTabInterface(ID);
		Tab.parentID = pID;
		Tab.id = ID;
		Tab.type = 5;
		Tab.atActionType = aT;
		Tab.contentType = 0;
		Tab.width = width;
		Tab.height = height;
		Tab.aByte254 = 0;
		Tab.mOverInterToTrigger = -1;
		Tab.anIntArray245 = new int[1];
		Tab.anIntArray212 = new int[1];
		Tab.anIntArray245[0] = 1;
		Tab.anIntArray212[0] = configID;
		Tab.valueIndexArray = new int[1][3];
		Tab.valueIndexArray[0][0] = 5;
		Tab.valueIndexArray[0][1] = configFrame;
		Tab.valueIndexArray[0][2] = 0;
		Tab.sprite1 = imageLoader(bID, bName);
		Tab.sprite2 = imageLoader(bID2, bName);
		Tab.tooltip = tT;
	}

	public static void drawBlackBox(int xPos, int yPos) {
		// /Light Coloured Borders\\\
		DrawingArea.drawPixels(71, yPos - 1, xPos - 2, 0x726451, 1); // Left
																		// line
		DrawingArea.drawPixels(69, yPos, xPos + 174, 0x726451, 1); // Right line
		DrawingArea.drawPixels(1, yPos - 2, xPos - 2, 0x726451, 178); // Top
																		// Line
		DrawingArea.drawPixels(1, yPos + 68, xPos, 0x726451, 174); // Bottom
																	// Line

		// /Dark Coloured Borders\\\
		DrawingArea.drawPixels(71, yPos - 1, xPos - 1, 0x2E2B23, 1); // Left
																		// line
		DrawingArea.drawPixels(71, yPos - 1, xPos + 175, 0x2E2B23, 1); // Right
																		// line
		DrawingArea.drawPixels(1, yPos - 1, xPos, 0x2E2B23, 175); // Top line
		DrawingArea.drawPixels(1, yPos + 69, xPos, 0x2E2B23, 175); // Top line

		// /Black Box\\\
		DrawingArea.method335(0x000000, yPos, 174, 68, 220, xPos); // Yes
																	// method335
																	// is
																	// galkons
																	// opacity
																	// method
	}

	public Sprite disabledHover;
	public Sprite enabledHover;

	public static void addPrayer(int i, int configId, int configFrame,
			int requiredValues, int spriteID, String prayerName) {
		RSInterface tab = addTabInterface(i);
		tab.id = i;
		tab.parentID = 5608;
		tab.type = 5;
		tab.atActionType = 4;
		tab.contentType = 0;
		tab.aByte254 = 0;
		tab.mOverInterToTrigger = -1;
		tab.sprite1 = imageLoader(0, "PRAYERGLOW");
		tab.sprite2 = imageLoader(1, "PRAYERGLOW");
		tab.width = 34;
		tab.height = 34;
		tab.anIntArray245 = new int[1];
		tab.anIntArray212 = new int[1];
		tab.anIntArray245[0] = 1;
		tab.anIntArray212[0] = configId;
		tab.valueIndexArray = new int[1][3];
		tab.valueIndexArray[0][0] = 5;
		tab.valueIndexArray[0][1] = configFrame;
		tab.valueIndexArray[0][2] = 0;
		// tab.tooltip = "Activate@or2@ " + prayerName;
		tab.tooltip = "Select";
		RSInterface tab2 = addTabInterface(i + 1);
		tab2.id = i + 1;
		tab2.parentID = 5608;
		tab2.type = 5;
		tab2.atActionType = 0;
		tab2.contentType = 0;
		tab2.aByte254 = 0;
		tab2.mOverInterToTrigger = -1;
		tab2.sprite1 = imageLoader(spriteID, "Prayer/PRAYON");
		tab2.sprite2 = imageLoader(spriteID, "Prayer/PRAYOFF");
		tab2.width = 34;
		tab2.height = 34;
		tab2.anIntArray245 = new int[1];
		tab2.anIntArray212 = new int[1];
		tab2.anIntArray245[0] = 2;
		tab2.anIntArray212[0] = requiredValues + 1;
		tab2.valueIndexArray = new int[1][3];
		tab2.valueIndexArray[0][0] = 2;
		tab2.valueIndexArray[0][1] = 5;
		tab2.valueIndexArray[0][2] = 0;
	}

	public static void addToggleButton(int id, int sprite, int setconfig,
			int width, int height, String s) {
		RSInterface rsi = addInterface(id);
		rsi.sprite1 = CustomSpriteLoader(sprite, "");
		rsi.sprite2 = CustomSpriteLoader(sprite, "a");
		rsi.anIntArray212 = new int[1];
		rsi.anIntArray212[0] = 1;
		rsi.anIntArray245 = new int[1];
		rsi.anIntArray245[0] = 1;
		rsi.valueIndexArray = new int[1][3];
		rsi.valueIndexArray[0][0] = 5;
		rsi.valueIndexArray[0][1] = setconfig;
		rsi.valueIndexArray[0][2] = 0;
		rsi.atActionType = 4;
		rsi.width = width;
		rsi.mOverInterToTrigger = -1;
		rsi.parentID = id;
		rsi.id = id;
		rsi.type = 5;
		rsi.height = height;
		rsi.tooltip = s;
	}

	public static void removeSomething(int id) {
@SuppressWarnings("unused")
RSInterface rsi = interfaceCache[id] = new RSInterface();
	}

	public static void setBounds(int ID, int X, int Y, int frame,
			RSInterface RSinterface) {
		RSinterface.children[frame] = ID;
		RSinterface.childX[frame] = X;
		RSinterface.childY[frame] = Y;
	}

	public static void textSize(int id, TextDrawingArea tda[], int idx) {
		RSInterface rsi = interfaceCache[id];
		rsi.textDrawingAreas = tda[idx];
	}

	/**
	 * Adds your current character to an interface.
	 **/

	protected static void addOldPrayer(int id, String prayerName) {
		RSInterface rsi = interfaceCache[id];
		rsi.tooltip = "Activate@or2@ " + prayerName;
	}

	public static void addPrayerHover(int i, int hoverID, int prayerSpriteID,
			String hoverText) {
		RSInterface Interface = addTabInterface(i);
		Interface.id = i;
		Interface.parentID = 5608;
		Interface.type = 5;
		Interface.atActionType = 0;
		Interface.contentType = 0;
		Interface.aByte254 = 0;
		Interface.mOverInterToTrigger = hoverID;
		Interface.sprite2 = imageLoader(0, "tabs/prayer/hover/PRAYERH");
		Interface.sprite1 = imageLoader(0, "tabs/prayer/hover/PRAYERH");
		Interface.width = 34;
		Interface.height = 34;

		Interface = addTabInterface(hoverID);
		Interface.id = hoverID;
		Interface.parentID = 5608;
		Interface.type = 0;
		Interface.atActionType = 0;
		Interface.contentType = 0;
		Interface.aByte254 = 0;
		Interface.mOverInterToTrigger = -1;
		Interface.width = 512;
		Interface.height = 334;
		Interface.isMouseoverTriggered = true;
		addBox(hoverID + 1, 0, false, 0x000000, hoverText);
		setChildren(1, Interface);
		setBounds(hoverID + 1, 0, 0, 0, Interface);
	}

	public static void addChar(int ID) {
		RSInterface t = interfaceCache[ID] = new RSInterface();
		t.id = ID;
		t.parentID = ID;
		t.type = 6;
		t.atActionType = 0;
		t.contentType = 328;
		t.width = 136;
		t.height = 168;
		t.aByte254 = 0;
		t.mOverInterToTrigger = 0;
		t.modelZoom = 560;
		t.modelRotation1 = 150;
		t.modelRotation2 = 0;
		t.anInt257 = -1;
		t.anInt258 = -1;
	}

	public static void addCacheSprite(int id, int sprite1, int sprite2,
			String sprites) {
		RSInterface rsi = interfaceCache[id] = new RSInterface();
		rsi.sprite1 = method207(sprite1, aClass44, sprites);
		rsi.sprite2 = method207(sprite2, aClass44, sprites);
		rsi.parentID = id;
		rsi.id = id;
		rsi.type = 5;
	}

	public void specialBar(int id, TextDrawingArea[] tda) // 7599
	{
		addActionButton(id - 12, 7587, -1, 150, 26, "Use @gre@Special Attack");
		for (int i = id - 11; i < id; i++)
			removeSomething(i);

		RSInterface rsi = interfaceCache[id - 12];
		rsi.width = 150;
		rsi.height = 26;
		rsi.mOverInterToTrigger = 40005;

		rsi = interfaceCache[id];
		rsi.width = 150;
		rsi.height = 26;

		rsi.child(0, id - 12, 0, 0);

		rsi.child(12, id + 1, 3, 7);

		rsi.child(23, id + 12, 16, 8);

		for (int i = 13; i < 23; i++) {
			rsi.childY[i] -= 1;
		}

		rsi = interfaceCache[id + 1];
		rsi.type = 5;
		rsi.sprite1 = CustomSpriteLoader(7600, "");

		for (int i = id + 2; i < id + 12; i++) {
			rsi = interfaceCache[i];
			rsi.type = 5;
		}

		sprite1(id + 2, 7601);
		sprite1(id + 3, 7602);
		sprite1(id + 4, 7603);
		sprite1(id + 5, 7604);
		sprite1(id + 6, 7605);
		sprite1(id + 7, 7606);
		sprite1(id + 8, 7607);
		sprite1(id + 9, 7608);
		sprite1(id + 10, 7609);
		sprite1(id + 11, 7610);

		rsi = addInterface(40005);
		rsi.isMouseoverTriggered = true;
		rsi.type = 0;
		rsi.atActionType = 0;
		rsi.mOverInterToTrigger = -1;
		rsi.parentID = 40005;
		rsi.id = 40005;
		addBox(40006, 0, false, 0x000000,
				"Select to perform a special\nattack.");
		setChildren(1, rsi);
		setBounds(40006, 0, 0, 0, rsi);
	}

	public static void addAttackHover(int id, int hoverID, String hoverText,
			TextDrawingArea[] TDA) {
		RSInterface rsi = interfaceCache[id];
		rsi.mOverInterToTrigger = hoverID;

		rsi = addInterface(hoverID);
		rsi.isMouseoverTriggered = true;
		rsi.type = 0;
		rsi.atActionType = 0;
		rsi.mOverInterToTrigger = -1;
		rsi.parentID = hoverID;
		rsi.id = hoverID;
		addBox(hoverID + 1, 0, false, 0x000000, hoverText);
		setChildren(1, rsi);
		setBounds(hoverID + 1, 0, 0, 0, rsi);
	}

	public static void addAttackText(int id, String text,
			TextDrawingArea tda[], int idx, int color, boolean centered) {
		RSInterface rsi = interfaceCache[id] = new RSInterface();
		if (centered)
			rsi.centerText = true;
		rsi.textShadow = true;
		rsi.textDrawingAreas = tda[idx];
		rsi.message = text;
		rsi.textColor = color;
		rsi.id = id;
		rsi.type = 4;
	}

	public static void addAttackStyleButton2(int id, int sprite, int setconfig,
			int width, int height, String s, int hoverID, int hW, int hH,
			String hoverText, TextDrawingArea[] TDA) {
		RSInterface rsi = addInterface(id);
		rsi.sprite1 = CustomSpriteLoader(sprite, "");
		rsi.sprite2 = CustomSpriteLoader(sprite, "a");
		rsi.anIntArray245 = new int[1];
		rsi.anIntArray245[0] = 1;
		rsi.anIntArray212 = new int[1];
		rsi.anIntArray212[0] = 1;
		rsi.valueIndexArray = new int[1][3];
		rsi.valueIndexArray[0][0] = 5;
		rsi.valueIndexArray[0][1] = setconfig;
		rsi.valueIndexArray[0][2] = 0;
		rsi.atActionType = 4;
		rsi.width = width;
		rsi.mOverInterToTrigger = hoverID;
		rsi.parentID = id;
		rsi.id = id;
		rsi.type = 5;
		rsi.height = height;
		rsi.tooltip = s;
		rsi = addInterface(hoverID);
		rsi.isMouseoverTriggered = true;
		rsi.type = 0;
		rsi.atActionType = 0;
		rsi.mOverInterToTrigger = -1;
		rsi.parentID = hoverID;
		rsi.id = hoverID;
		addBox(hoverID + 1, 0, false, 0x000000, hoverText);
		setChildren(1, rsi);
		setBounds(hoverID + 1, 0, 0, 0, rsi);
	}

	public static void addBox(int id, int byte1, boolean filled, int color,
			String text) {
		RSInterface Interface = addInterface(id);
		Interface.id = id;
		Interface.parentID = id;
		Interface.type = 9;
		Interface.aByte254 = (byte) byte1;
		Interface.aBoolean227 = filled;
		Interface.mOverInterToTrigger = -1;
		Interface.atActionType = 0;
		Interface.contentType = 0;
		Interface.textColor = color;
		Interface.message = text;
	}

	public static void setChildren(int total, RSInterface i) {
		i.children = new int[total];
		i.childX = new int[total];
		i.childY = new int[total];
	}

	protected static Sprite CustomSpriteLoader(int id, String s) {
		long l = (TextClass.method585(s) << 8) + (long) id;
		Sprite sprite = (Sprite) aMRUNodes_238.insertFromCache(l);
		if (sprite != null) {
			return sprite;
		}
		try {
			sprite = new Sprite("/Attack/" + id + s);
			aMRUNodes_238.removeFromCache(sprite, l);
		} catch (Exception exception) {
			return null;
		}
		return sprite;
	}

	public static void addTooltipBox(int id, String text) {
		RSInterface rsi = addInterface(id);
		rsi.id = id;
		rsi.parentID = id;
		rsi.type = 9;
		rsi.message = text;
	}

	public static void addTooltip(int id, String text) {
		RSInterface rsi = addInterface(id);
		rsi.id = id;
		rsi.type = 0;
		rsi.isMouseoverTriggered = true;
		rsi.mOverInterToTrigger = -1;
		addTooltipBox(id + 1, text);
		rsi.totalChildren(1);
		rsi.child(0, id + 1, 0, 0);
	}

	public static void addText(int i, String s, int k, boolean l, boolean m,
			int a, TextDrawingArea[] TDA, int j) {
		RSInterface RSInterface = addInterface(i);
		RSInterface.parentID = i;
		RSInterface.id = i;
		RSInterface.type = 4;
		RSInterface.atActionType = 0;
		RSInterface.width = 0;
		RSInterface.height = 0;
		RSInterface.contentType = 0;
		RSInterface.aByte254 = 0;
		RSInterface.mOverInterToTrigger = a;
		RSInterface.centerText = l;
		RSInterface.textShadow = m;
		RSInterface.textDrawingAreas = TDA[j];
		RSInterface.message = s;
		RSInterface.aString228 = "";
		RSInterface.textColor = k;
	}

	public static void addSprite(int i, int j, int k) {
		RSInterface rsinterface = interfaceCache[i] = new RSInterface();
		rsinterface.id = i;
		rsinterface.parentID = i;
		rsinterface.type = 5;
		rsinterface.atActionType = 1;
		rsinterface.contentType = 0;
		rsinterface.width = 20;
		rsinterface.height = 20;
		rsinterface.aByte254 = 0;
		rsinterface.mOverInterToTrigger = 52;
		rsinterface.sprite1 = imageLoader(j, "Equipment/SPRITE");
		rsinterface.sprite2 = imageLoader(k, "Equipment/SPRITE");
	}

	public static void addHover(int i, int aT, int cT, int hoverid, int sId,
			String NAME, int W, int H, String tip) {
		RSInterface rsinterfaceHover = addInterface(i);
		rsinterfaceHover.id = i;
		rsinterfaceHover.parentID = i;
		rsinterfaceHover.type = 5;
		rsinterfaceHover.atActionType = aT;
		rsinterfaceHover.contentType = cT;
		rsinterfaceHover.mOverInterToTrigger = hoverid;
		rsinterfaceHover.sprite1 = imageLoader(sId, NAME);
		rsinterfaceHover.sprite2 = imageLoader(sId, NAME);
		rsinterfaceHover.width = W;
		rsinterfaceHover.height = H;
		rsinterfaceHover.tooltip = tip;
	}

	public static void addHovered(int i, int j, String imageName, int w, int h,
			int IMAGEID) {
		RSInterface rsinterfaceHover = addInterface(i);
		rsinterfaceHover.parentID = i;
		rsinterfaceHover.id = i;
		rsinterfaceHover.type = 0;
		rsinterfaceHover.atActionType = 0;
		rsinterfaceHover.width = w;
		rsinterfaceHover.height = h;
		rsinterfaceHover.isMouseoverTriggered = true;
		rsinterfaceHover.mOverInterToTrigger = -1;
		addSprite(IMAGEID, j, imageName);
		setChildren(1, rsinterfaceHover);
		setBounds(IMAGEID, 0, 0, 0, rsinterfaceHover);
	}

	public static void addText(int id, String text, TextDrawingArea tda[],
			int idx, int color, boolean center, boolean shadow) {
		RSInterface tab = addTabInterface(id);
		tab.parentID = id;
		tab.id = id;
		tab.type = 4;
		tab.atActionType = 0;
		tab.width = 0;
		tab.height = 11;
		tab.contentType = 0;
		tab.aByte254 = 0;
		tab.mOverInterToTrigger = -1;
		tab.centerText = center;
		tab.textShadow = shadow;
		tab.textDrawingAreas = tda[idx];
		tab.message = text;
		tab.aString228 = "";
		tab.textColor = color;
		tab.anInt219 = 0;
		tab.anInt216 = 0;
		tab.anInt239 = 0;
	}

	public String hoverText;

	public static void addHoverBox(int id, String text) {
		RSInterface rsi = interfaceCache[id];// addTabInterface(id);
		rsi.id = id;
		rsi.parentID = id;
		rsi.isMouseoverTriggered = true;
		rsi.type = 8;
		rsi.hoverText = text;
	}

	public static void addButton(int id, int sid, String spriteName,
			String tooltip) {
		RSInterface tab = interfaceCache[id] = new RSInterface();
		tab.id = id;
		tab.parentID = id;
		tab.type = 5;
		tab.atActionType = 1;
		tab.contentType = 0;
		tab.aByte254 = (byte) 0;
		tab.mOverInterToTrigger = 52;
		tab.sprite1 = imageLoader(sid, spriteName);
		tab.sprite2 = imageLoader(sid, spriteName);
		tab.width = tab.sprite1.myWidth;
		tab.height = tab.sprite2.myHeight;
		tab.tooltip = tooltip;
	}

	public static void addSprite(int id, int spriteId, String spriteName) {
		RSInterface tab = interfaceCache[id] = new RSInterface();
		tab.id = id;
		tab.parentID = id;
		tab.type = 5;
		tab.atActionType = 0;
		tab.contentType = 0;
		tab.aByte254 = (byte) 0;
		tab.mOverInterToTrigger = 52;
		tab.sprite1 = imageLoader(spriteId, spriteName);
		tab.sprite2 = imageLoader(spriteId, spriteName);
		tab.width = 512;
		tab.height = 334;
	}

	public static void addHoverButton(int i, String imageName, int j,
			int width, int height, String text, int contentType, int hoverOver,
			int aT) {// hoverable button
		RSInterface tab = addTabInterface(i);
		tab.id = i;
		tab.parentID = i;
		tab.type = 5;
		tab.atActionType = aT;
		tab.contentType = contentType;
		tab.aByte254 = 0;
		tab.mOverInterToTrigger = hoverOver;
		tab.sprite1 = imageLoader(j, imageName);
		tab.sprite2 = imageLoader(j, imageName);
		tab.width = width;
		tab.height = height;
		tab.tooltip = text;
	}

	public static void addHoveredButton(int i, String imageName, int j, int w,
			int h, int IMAGEID) {// hoverable button
		RSInterface tab = addTabInterface(i);
		tab.parentID = i;
		tab.id = i;
		tab.type = 0;
		tab.atActionType = 0;
		tab.width = w;
		tab.height = h;
		tab.isMouseoverTriggered = true;
		tab.aByte254 = 0;
		tab.mOverInterToTrigger = -1;
		tab.scrollMax = 0;
		addHoverImage(IMAGEID, j, j, imageName);
		tab.totalChildren(1);
		tab.child(0, IMAGEID, 0, 0);
	}

	public static void addHoverImage(int i, int j, int k, String name) {
		RSInterface tab = addTabInterface(i);
		tab.id = i;
		tab.parentID = i;
		tab.type = 5;
		tab.atActionType = 0;
		tab.contentType = 0;
		tab.width = 512;
		tab.height = 334;
		tab.aByte254 = 0;
		tab.mOverInterToTrigger = 52;
		tab.sprite1 = imageLoader(j, name);
		tab.sprite2 = imageLoader(k, name);
	}

	public static void addTransparentSprite(int id, int spriteId,
			String spriteName) {
		RSInterface tab = interfaceCache[id] = new RSInterface();
		tab.id = id;
		tab.parentID = id;
		tab.type = 5;
		tab.atActionType = 0;
		tab.contentType = 0;
		tab.aByte254 = (byte) 0;
		tab.mOverInterToTrigger = 52;
		tab.sprite1 = imageLoader(spriteId, spriteName);
		tab.sprite2 = imageLoader(spriteId, spriteName);
		tab.width = 512;
		tab.height = 334;
		tab.drawsTransparent = true;
	}

	public static RSInterface addScreenInterface(int id) {
		RSInterface tab = interfaceCache[id] = new RSInterface();
		tab.id = id;
		tab.parentID = id;
		tab.type = 0;
		tab.atActionType = 0;
		tab.contentType = 0;
		tab.width = 512;
		tab.height = 334;
		tab.aByte254 = (byte) 0;
		tab.mOverInterToTrigger = 0;
		return tab;
	}

	public static RSInterface addTabInterface(int id) {
		RSInterface tab = interfaceCache[id] = new RSInterface();
		tab.id = id;// 250
		tab.parentID = id;// 236
		tab.type = 0;// 262
		tab.atActionType = 0;// 217
		tab.contentType = 0;
		tab.width = 512;// 220
		tab.height = 700;// 267
		tab.aByte254 = (byte) 0;
		tab.mOverInterToTrigger = -1;// Int 230
		return tab;
	}

	protected static Sprite imageLoader(int i, String s) {
		long l = (TextClass.method585(s) << 8) + (long) i;
		Sprite sprite = (Sprite) aMRUNodes_238.insertFromCache(l);
		if (sprite != null)
			return sprite;
		try {
			sprite = new Sprite(s + " " + i);
			aMRUNodes_238.removeFromCache(sprite, l);
		} catch (Exception exception) {
			return null;
		}
		return sprite;
	}

	public void child(int id, int interID, int x, int y) {
		children[id] = interID;
		childX[id] = x;
		childY[id] = y;
	}

	public void totalChildren(int t) {
		children = new int[t];
		childX = new int[t];
		childY = new int[t];
	}

	private Model method206(int i, int j) {
		Model model = (Model) aMRUNodes_264.insertFromCache((i << 16) + j);
		if (model != null)
			return model;
		if (i == 1)
			model = Model.method462(j);
		if (i == 2)
			model = EntityDef.forID(j).method160();
		if (i == 3)
			model = AJ.myPlayer.method453();
		if (i == 4)
			model = ItemDef.forID(j).method202(50);
		if (i == 5)
			model = null;
		if (model != null)
			aMRUNodes_264.removeFromCache(model, (i << 16) + j);
		return model;
	}

	private static Sprite method207(int i, StreamLoader streamLoader, String s) {
		long l = (TextClass.method585(s) << 8) + (long) i;
		Sprite sprite = (Sprite) aMRUNodes_238.insertFromCache(l);
		if (sprite != null)
			return sprite;
		try {
			sprite = new Sprite(streamLoader, s, i);
			aMRUNodes_238.removeFromCache(sprite, l);
		} catch (Exception _ex) {
			return null;
		}
		return sprite;
	}

	public static void method208(boolean flag, Model model) {
		int i = 0;// was parameter
		int j = 5;// was parameter
		if (flag)
			return;
		aMRUNodes_264.unlinkAll();
		if (model != null && j != 4)
			aMRUNodes_264.removeFromCache(model, (j << 16) + i);
	}

	public Model method209(int j, int k, boolean flag) {
		Model model;
		if (flag)
			model = method206(anInt255, anInt256);
		else
			model = method206(anInt233, mediaID);
		if (model == null)
			return null;
		if (k == -1 && j == -1 && model.anIntArray1640 == null)
			return model;
		Model model_1 = new Model(true, Class36.method532(k)
				& Class36.method532(j), false, model);
		if (k != -1 || j != -1)
			model_1.method469();
		if (k != -1)
			model_1.method470(k);
		if (j != -1)
			model_1.method470(j);
		model_1.method479(64, 768, -50, -10, -50, true);
		return model_1;
	}

	public RSInterface() {
	}

	public static StreamLoader aClass44;
	public boolean drawsTransparent;
	public Sprite sprite1;
	public int anInt208;
	public Sprite sprites[];
	public static RSInterface interfaceCache[];
	public int anIntArray212[];
	public int contentType;// anInt214
	public int spritesX[];
	public int anInt216;
	public int atActionType;
	public String spellName;
	public int anInt219;
	public int width;
	public String tooltip;
	public String selectedActionName;
	public boolean centerText;
	public int scrollPosition;
	public String actions[];
	public int valueIndexArray[][];
	public boolean aBoolean227;
	public String aString228;
	public int mOverInterToTrigger;
	public int invSpritePadX;
	public int hoverType;
	public int textColor;
	public int anInt233;
	public int mediaID;
	public boolean aBoolean235;
	public int parentID;
	public int spellUsableOn;
	private static MRUNodes aMRUNodes_238;
	public int anInt239;
	public int children[];
	public int childX[];
	public boolean usableItemInterface;
	public TextDrawingArea textDrawingAreas;
	public int invSpritePadY;
	public int anIntArray245[];
	public int anInt246;
	public int spritesY[];
	public String message;
	public boolean isInventoryInterface;
	public int id;
	public int invStackSizes[];
	public int inv[];
	public byte aByte254;
	private int anInt255;
	private int anInt256;
	public int anInt257;
	public int anInt258;
	public boolean aBoolean259;
	public Sprite sprite2;
	public int scrollMax;
	public int type;
	public int anInt263;
	private static final MRUNodes aMRUNodes_264 = new MRUNodes(30);
	public int anInt265;
	public boolean isMouseoverTriggered;
	public int height;
	public boolean textShadow;
	public int modelZoom;
	public int modelRotation1;
	public int modelRotation2;
	public int childY[];
	public boolean inventoryhover;

}
