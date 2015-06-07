import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ItemDef_2 {

	
	public static void Items(int i) {
		ItemDef itemDef = ItemDef.forID(i);
		switch (i) {
		
		case 20080:
			itemDef.itemActions = new String[5];
			itemDef.modelID = 62374;
			itemDef.modelZoom = 1460;
			itemDef.modelRotationY = 499;
			itemDef.modelRotationX = 1926;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 = 0;
			itemDef.name = "Magic fang";
			itemDef.description = "This can be attached to a Staff of the Dead or a Trident of the Seas.".getBytes();
		break;
		
		case 20078:
		       itemDef.name = "Toxic staff of the dead";
		       itemDef.itemActions = new String[5];
		       itemDef.itemActions[1] = "Wield";
		       itemDef.description = "A ghastly weapon with evil origins, with a toxic fang attached.".getBytes();
		       itemDef.modelID = 62373;
		       itemDef.anInt165 = 62372;
		       itemDef.anInt200 = 62372;
		       itemDef.modelRotationY = 148;
		       itemDef.modelRotationX = 1300;
		       itemDef.modelZoom = 1420;
		       itemDef.modelOffset1 = -5;
		       itemDef.modelOffset2 = 2;
		       break;
		       
		case 20076:
			itemDef.name = "Trident of the swamp";
			itemDef.modelZoom = 2350;
			itemDef.modelRotationY = 1505;
			itemDef.modelRotationX = 1850;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wield", "Check", "Uncharge", "Drop" };
			itemDef.modelID = 62371;
			itemDef.anInt165 = 62370;
			itemDef.anInt200 = 62370;
			break;
		
		case 20074:
		    itemDef.itemActions = new String[5];
		    itemDef.itemActions[1] = "Wear";
		    itemDef.originalModelColors = new int[1];
		    itemDef.modifiedModelColors = new int[1];
		    itemDef.originalModelColors[0] = 6020;
		    itemDef.modifiedModelColors[0] = 933;
		    itemDef.modelID = 2537;
		    itemDef.modelZoom = 540;
		    itemDef.modelRotationY = 72;
		    itemDef.modelRotationX = 136;
		    itemDef.anInt204 = 0;
		    itemDef.modelOffset1 = 0;
		    itemDef.modelOffset2 = 0;
		    itemDef.anInt165 = 189;
		    itemDef.anInt200 = 366;
		    itemDef.anInt188 = -1;
		    itemDef.anInt164 = -1;
		    itemDef.anInt175 = -1;
		    itemDef.anInt197 = -1;
		    itemDef.name = "Black santa hat";
		    itemDef.description = "It's a Black santa hat.".getBytes();
        break;
		
		case 20073: 
			itemDef.name = "Red beret";
            itemDef.modelZoom = 560;
            itemDef.modelRotationY = 136;
            itemDef.modelRotationX = 1936;
            itemDef.modelOffset1 = -4;
            itemDef.originalModelColors = new int[] { -93 };
            itemDef.modifiedModelColors = new int[] { 10659 };
            itemDef.itemActions = new String[5];
			itemDef.itemActions[1] = "Wear";
            itemDef.modelID = 62369;
            itemDef.anInt165 = 62370;
            itemDef.anInt200 = 62371;
            itemDef.description = "A colourful beret given to me by Santa.".getBytes();
            break;
		
		case 20072: 
            itemDef.name = "Dragon defender";
            itemDef.modelZoom = 592;
            itemDef.modelRotationX = 323;
            itemDef.modelRotationY = 1845;
            itemDef.modelOffset1 = -5;
            itemDef.itemActions = (new String[] {
                null, "Wield", null, null, "Drop"
            });
            itemDef.modelID = 62368;
            itemDef.anInt165 = 62367;
            itemDef.anInt200 = 62367;
            break;
		
		case 13263:
			itemDef.itemActions = new String[5];
			itemDef.itemActions[1] = "Wield";
			itemDef.modelZoom = 789;
			itemDef.modelRotationY = 69;
			itemDef.modelRotationX = 1743;
			itemDef.modelOffset1 = -4;
			itemDef.modelOffset2 = -3;
			itemDef.modelID = 34411;
			itemDef.anInt165 = 6775; // male wield model
			itemDef.anInt200 = 14112; // femArmModel
			itemDef.name = "Slayer helmet";
			itemDef.description = "You don't want to wear it inside-out.".getBytes();// examine.
			break;
		case 11951:
			itemDef.name = "Extended antifire (4)";
			itemDef.modelZoom = 550;
			itemDef.modelRotationY = 84;
			itemDef.modelRotationX = 1996;
			itemDef.modelOffset2 = -1;
			itemDef.originalModelColors = new int[] { -18622 };
			itemDef.modifiedModelColors = new int[] { 61 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { "Drink", null, null, "Empty", "Drop" };
			itemDef.modelID = 2789;
			break;
			
		case 13399:
		      itemDef.itemActions = new String[5];
		      itemDef.itemActions[1] = "Wield";
		      itemDef.anInt200 = 56042;
		      itemDef.modelZoom = 1400;
		      itemDef.modelRotationX = 337;
		      itemDef.anInt165 = 56042;
		      itemDef.modelID = 54520;
		      itemDef.anInt164 = -1;
			  itemDef.aByte205 = -12;
			  itemDef.aByte154 = -12;
		      itemDef.name = "Primal maul";
		      itemDef.description = "A maul used to claim life from those who don't deserve it. (Tier 11)".getBytes();
		      break;

		    
		    case 15574:
		      itemDef.itemActions = new String[5];
		      itemDef.itemActions[1] = "Wield";
		      itemDef.anInt200 = 56163;
		      itemDef.modelOffset1 = 3;
		      itemDef.modelOffset2 = 0;
		      itemDef.modelZoom = 1650;
		      itemDef.modelRotationX = 1300;
		      itemDef.modelRotationY = 498;
		      itemDef.anInt165 = 56100;
			  
				itemDef.aByte205 = -12;
					itemDef.aByte154 = -12;
		      itemDef.modelID = 54437;
		      itemDef.anInt164 = -1;
		      itemDef.name = "Primal longsword";
		      itemDef.description = "A razor-sharp longsword. (Tier 11)".getBytes();
		      break;
			  
		    case 15662:
		      itemDef.itemActions = new String[5];
		      itemDef.itemActions[1] = "Wield";
		      itemDef.anInt200 = 56227;
		      itemDef.modelOffset1 = 9;
		      itemDef.modelOffset2 = 13;
		      itemDef.modelZoom = 1425;
		      itemDef.modelRotationX = 1300;
		      itemDef.modelRotationY = 700;
		      itemDef.anInt165 = 56227;
		      itemDef.modelID = 54202;
			  
				itemDef.aByte205 = -12;
					itemDef.aByte154 = -12;
		      itemDef.anInt164 = -1;
		      itemDef.name = "Primal rapier";
		      itemDef.description = "A razor-sharp rapier. (Tier 11)".getBytes();
		      break;

				
		    case 15041: 
	            itemDef.itemActions = new String[5];
	            itemDef.itemActions[1] = "Wield";
	            itemDef.anInt200 = 56307;
				itemDef.anInt165 = 56307;
	            itemDef.modelOffset1 = -1;
	            itemDef.modelOffset2 = 0;
	            itemDef.modelZoom = 898;
	            itemDef.modelRotationX = 1049;
	            itemDef.modelRotationY = 1221;
	            itemDef.modelID = 35092;
	            itemDef.name = "Chaotic crossbow";
	            itemDef.anInt188 = -1;
	            itemDef.anInt164 = -1;
	            itemDef.aByte205 = -26;
	            itemDef.aByte154 = -14;
	            itemDef.description = "A destructive crossbow. (It doesnt look in good condition.)".getBytes();
	            break;

				case 6644:
				itemDef.name = "Power crystal";
				itemDef.description = "Can be used on: abyssal whip, partyhats or dragon chianbody.".getBytes();
				break;
					case 962:
					itemDef.itemActions = new String[5];
					itemDef.itemActions[0] = "Pull";
					break;
					case 8013:
					itemDef.name = "Teleport multiTab";
					itemDef.itemActions = new String[5];
					itemDef.itemActions[0] = "Home";
					itemDef.itemActions[1] = "Shops";
					itemDef.itemActions[2] = "Wildy Chest";
					itemDef.itemActions[3] = "Mage Bank";
					break;
			
		    case 15049:
		      itemDef.itemActions[1] = "Wear";
		      itemDef.modelID = 44576;
		      itemDef.modelZoom = 1300;
		      itemDef.modelRotationY = 400;
		      itemDef.modelRotationX = 0;
		      itemDef.modelOffset1 = 0;
		      itemDef.modelOffset2 = 10;
		      itemDef.anInt165 = 40207;
		      itemDef.anInt200 = 40207;
		      itemDef.aByte154 = -10;
		      itemDef.anInt188 = -1;
		      itemDef.anInt164 = -1;
		      itemDef.name = "Dragon platebody";
			break;

				case 13887:
					itemDef.name = "Vesta's chainbody";
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wear";
					itemDef.modelID = 42593;
					itemDef.modelZoom = 1440;
					itemDef.modelRotationY = 545;
					itemDef.modelRotationX = 2;
					itemDef.modelOffset2 = 5;
					itemDef.modelOffset1 = 4;
					itemDef.anInt204 = 0;
					itemDef.anInt165 = 42624;
					itemDef.anInt200 = 42644;
					itemDef.description = "Vesta's chainbody, a reward from PVP.".getBytes();
					break;

				case 13893:
					itemDef.name = "Vesta's plateskirt";
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wear";
					itemDef.modelID = 42581;
					itemDef.modelZoom = 1753;
					itemDef.modelRotationY = 562;
					itemDef.modelRotationX = 1;
					itemDef.modelOffset2 = 11;
					itemDef.modelOffset1 = -3;
					itemDef.anInt204 = 0;
					itemDef.anInt165 = 42633;
					itemDef.anInt200 = 42647;
					itemDef.description = "Vesta's plateskirt, a reward from PVP.".getBytes();
					break;
				case 13899:
					itemDef.name = "Vesta's longsword";
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Equip";
					itemDef.modelID = 42597;
					itemDef.modelZoom = 1744;
					itemDef.modelRotationY = 738;
					itemDef.modelRotationX = 1985;
					itemDef.modelOffset2 = 0;
					itemDef.modelOffset1 = 0;
					
				itemDef.aByte205 = -12;
					itemDef.aByte154 = -12;
					itemDef.anInt204 = 0;
					itemDef.anInt165 = 42615;
					itemDef.anInt200 = 42615;
					itemDef.description = "Vesta's longsword, a reward from PVP.".getBytes();
					break;

				case 13858:
					itemDef.name = "Zuriel's robe top";
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wear";
					itemDef.modelID = 42591;
					itemDef.modelZoom = 1373;
					itemDef.modelRotationY = 373;
					itemDef.modelRotationX = 0;
					itemDef.modelOffset2 = -7;
					itemDef.modelOffset1 = 0;
					itemDef.anInt204 = 0;
					itemDef.anInt165 = 42627;
					itemDef.anInt200 = 42642;
					itemDef.description = "Zuriel's robe top, a reward from PVP.".getBytes();
					break;
				case 13861:
					itemDef.name = "Zuriel's robe bottom";
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wear";
					itemDef.modelID = 42588;
					itemDef.modelZoom = 1697;
					itemDef.modelRotationY = 512;
					itemDef.modelRotationX = 0;
					itemDef.modelOffset2 = -9;
					itemDef.modelOffset1 = 2;
					itemDef.anInt204 = 0;
					itemDef.anInt165 = 42634;
					itemDef.anInt200 = 42645;
					itemDef.description = "Zuriel's robe bottom, a reward from PVP.".getBytes();
					break;
				case 13864:
					itemDef.name = "Zuriel's hood";
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wear";
					itemDef.modelID = 42604;
					itemDef.modelZoom = 720;
					itemDef.modelRotationY = 28;
					itemDef.modelRotationX = 0;
					itemDef.modelOffset2 = 1;
					itemDef.modelOffset1 = 1;
					itemDef.anInt204 = 0;
					itemDef.anInt165 = 42638;
					itemDef.anInt200 = 42653;
					itemDef.description = "Zuriel's hood, a reward from PVP.".getBytes();
					break;
				case 13884:
					itemDef.name = "Statius's platebody";
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wear";
					itemDef.modelID = 42602;
					itemDef.modelZoom = 1312;//1312
					itemDef.modelRotationY = 272;
					itemDef.modelRotationX = 2047;
					itemDef.modelOffset2 = 39;
					itemDef.modelOffset1 = -2;
					itemDef.anInt204 = 0;
					itemDef.anInt165 = 42625;
					itemDef.anInt200 = 42641;
					itemDef.description = "Statius's platebody, a reward from PVP.".getBytes();
					break;
				case 13890:
					itemDef.name = "Statius's platelegs";
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wear";
					itemDef.modelID = 42590;
					itemDef.modelZoom = 1625;
					itemDef.modelRotationY = 355;
					itemDef.modelRotationX = 2046;
					itemDef.modelOffset2 = -11;
					itemDef.modelOffset1 = 0;
					itemDef.anInt204 = 0;
					itemDef.anInt165 = 42632;
					itemDef.anInt200 = 42649;
					itemDef.description = "Statius's platelegs, a reward from PVP.".getBytes();
					break;

				case 13896:
					itemDef.name = "Statius's full helm";
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wear";
					itemDef.modelID = 42596;
					itemDef.modelZoom = 789;
					itemDef.modelRotationY = 96;
					itemDef.modelRotationX = 2039;
					itemDef.modelOffset2 = -7;
					itemDef.modelOffset1 = 2;
					itemDef.anInt204 = 0;
					itemDef.anInt165 = 42639;
					itemDef.anInt200 = 42655;
					itemDef.description = "Statius's full helm, a reward from PVP.".getBytes();
					break;
				case 13902:
					itemDef.name = "Statius's warhammer";
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wield";
					itemDef.modelID = 42577;
					itemDef.modelZoom = 1360;
					itemDef.modelRotationY = 507;
					itemDef.modelRotationX = 27;
					itemDef.modelOffset2 = 6;
					itemDef.modelOffset1 = 7;
					
				itemDef.aByte205 = -12;
					itemDef.aByte154 = -12;
					itemDef.anInt204 = 0;
					itemDef.anInt165 = 42623;
					itemDef.anInt200 = 42623;
					itemDef.description = "Statius's warhammer, a reward from PVP.".getBytes();
					break;
				case 13870:
					itemDef.name = "Morrigan's leather body";
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wear";
					itemDef.modelID = 42578;
					itemDef.modelZoom = 1184;
					itemDef.modelRotationY = 545;
					itemDef.modelRotationX = 2;
					itemDef.modelOffset2 = 5;
					itemDef.modelOffset1 = 4;
					itemDef.anInt204 = 0;
					itemDef.anInt165 = 42626;
					itemDef.anInt200 = 42643;
					itemDef.description = "Morrigan's leather body, a reward from PVP.".getBytes();
					break;

				case 13873:
					itemDef.name = "Morrigan's leather chaps";
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wear";
					itemDef.modelID = 42603;
					itemDef.modelZoom = 1753;
					itemDef.modelRotationY = 482;
					itemDef.modelRotationX = 1;
					itemDef.modelOffset2 = 11;
					itemDef.modelOffset1 = -3;
					itemDef.anInt204 = 0;
					itemDef.anInt165 = 42631;
					itemDef.anInt200 = 42646;
					itemDef.description = "Morrigan's leather chaps, a reward from PVP.".getBytes();
					break;

				case 13876:
					itemDef.name = "Morrigan's coif";
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wear";
					itemDef.modelID = 42583;
					itemDef.modelZoom = 592;
					itemDef.modelRotationY = 537;
					itemDef.modelRotationX = 5;
					itemDef.modelOffset2 = 6;
					itemDef.modelOffset1 = -3;
					itemDef.anInt204 = 0;
					itemDef.anInt165 = 42636;
					itemDef.anInt200 = 42652;
					itemDef.description = "Morrigan's coif, a reward from PVP.".getBytes();
					break;
				case 13738:
					itemDef.itemActions = new String[5];//menu
					itemDef.itemActions[1] = "Wield";
					itemDef.modelID = 40922;//inventory/drop model
					itemDef.modelZoom = 1616;//Model Zoom
					itemDef.modelRotationY = 396;//rotation 1
					itemDef.modelRotationX = 1050;//rotation 2
					itemDef.modelOffset1 = -3;//model offset 1
					itemDef.modelOffset2 = 4;//model offset 2
					itemDef.anInt165 = 40944;//male wield ModelId
					itemDef.anInt200 = 40944;//female wield ModelId
					itemDef.anInt188 = -1;//female sleeve
					itemDef.anInt164 = -1;//male sleeve
					itemDef.aByte154 = -10;
					itemDef.aByte205 = -10;
					itemDef.name = "Arcane spirit shield";//name
					itemDef.description = "It's a Arcane spirit shield.".getBytes();//name
				break;
				case 13744:
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wield";
					itemDef.modelID = 40920;
					itemDef.modelZoom = 1616; 
					itemDef.modelRotationY = 396;
					itemDef.modelRotationX = 1050;
					itemDef.modelOffset1 = -3;
					itemDef.modelOffset2 = 4;
					itemDef.anInt165 = 40940;
					itemDef.anInt200 = 40940;
					itemDef.anInt188 = -1;
					itemDef.anInt164 = -1;
					itemDef.aByte154 = -10;
					itemDef.aByte205 = -10;
					itemDef.name = "Spectral spirit shield";
					itemDef.description = "It's a Spectral spirit shield.".getBytes();
				break;
				case 13740:
					itemDef.itemActions = new String[5];//menu
					itemDef.itemActions[1] = "Wield";
					itemDef.modelID = 40921;//inventory/drop model
					itemDef.modelZoom = 1616;//Model Zoom
					itemDef.modelRotationY = 396;//rotation 1
					itemDef.modelRotationX = 1050;//rotation 2
					itemDef.modelOffset1 = -3;//model offset 1
					itemDef.modelOffset2 = 4;//model offset 2
					itemDef.anInt165 = 40939;//male wield ModelId
					itemDef.anInt200 = 40939;//female wield ModelId
					itemDef.anInt188 = -1;//female sleeve
					itemDef.anInt164 = -1;//male sleeve
					itemDef.aByte154 = -10;
					itemDef.aByte205 = -10;
					itemDef.name = "Divine spirit shield";//name
					itemDef.description = "It's a Divine spirit shield.".getBytes();//name
				break;
				case 13734:
					itemDef.itemActions = new String[5];//menu
					itemDef.itemActions[1] = "Wield";
					itemDef.modelID = 40919;//inventory/drop model
					itemDef.modelZoom = 1616;//Model Zoom
					itemDef.modelRotationY = 396;//rotation 1
					itemDef.modelRotationX = 1050;//rotation 2
					itemDef.modelOffset1 = -3;//model offset 1
					itemDef.modelOffset2 = 4;//model offset 2
					itemDef.anInt165 = 40943;//male wield ModelId
					itemDef.anInt200 = 40943;//female wield ModelId
					itemDef.anInt188 = -1;//female sleeve
					itemDef.anInt164 = -1;//male sleeve
					itemDef.aByte154 = -10;
					itemDef.aByte205 = -10;
					itemDef.name = "Spirit shield";//name
					itemDef.description = "It's a Spirit shield.".getBytes();//name
				break;
				case 13736:
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wield";
					itemDef.modelID = 40913;
					itemDef.modelZoom = 1616;
					itemDef.modelRotationY = 396;
					itemDef.modelRotationX = 1050;
					itemDef.modelOffset1 = -3;
					itemDef.modelOffset2 = 4;
					itemDef.anInt165 = 40941;
					itemDef.anInt200 = 40941;
					itemDef.anInt188 = -1;
					itemDef.anInt164 = -1;
					itemDef.aByte154 = -10;
					itemDef.aByte205 = -10;
					itemDef.name = "Blessed spirit shield";
					itemDef.description = "It's a Blessed spirit shield.".getBytes();
				break;
				case 13742:
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wield";
					itemDef.modelID = 40915;
					itemDef.modelZoom = 1616;
					itemDef.modelRotationY = 396;
					itemDef.modelRotationX = 1050;
					itemDef.modelOffset1 = -3;
					itemDef.modelOffset2 = 4;
					itemDef.anInt165 = 40942;
					itemDef.anInt200 = 40942;
					itemDef.anInt188 = -1;
					itemDef.anInt164 = -1;
					itemDef.aByte154 = -10;
					itemDef.aByte205 = -10;
					itemDef.name = "Elysian spirit shield";
					itemDef.description = "It's an Elysian spirit shield.".getBytes();
				break;
				case 15272:
					itemDef.itemActions = new String[5];
					itemDef.itemActions[0] = "Eat";
					itemDef.modelID = 48728;
					itemDef.modelZoom = 1460;
					itemDef.modelRotationY = 499;
					itemDef.modelRotationX = 1926;
					itemDef.modelOffset1 = 3;
					itemDef.modelOffset2 = 0;
					itemDef.name = "Rocktail";
					itemDef.description = "Some nicely cooked rocktail.".getBytes();
				break;
				case 15273:
				itemDef.itemActions = new String[5];
		                	itemDef.itemActions[4] = "Drop";
		itemDef.modelID = 2429;
		itemDef.modelZoom = 760;
		itemDef.modelRotationY = 552;
		itemDef.modelRotationX = 28;
		itemDef.modelOffset1 = -1;
		itemDef.modelOffset2 = -1;
		itemDef.certID = 15272;
		itemDef.certTemplateID = 799;
					itemDef.name = "Rocktail";
					itemDef.stackable = true;
					itemDef.description = "Exchange this at any bank for Rocktail.".getBytes();
				break;
				case 15271:
					itemDef.itemActions = new String[5];
					itemDef.modelID = 48722;
					itemDef.modelZoom = 1460;
					itemDef.modelRotationY = 499;
					itemDef.modelRotationX = 1926;
					itemDef.modelOffset1 = 3;
					itemDef.modelOffset2 = 0;
					itemDef.name = "Raw rocktail";
					itemDef.description = "I should try cooking this.".getBytes();
				break;
				case 15274:
					itemDef.itemActions = new String[5];
					itemDef.modelID = 48725;
					itemDef.modelZoom = 1460;
					itemDef.modelRotationY = 499;
					itemDef.modelRotationX = 1926;
					itemDef.modelOffset1 = 3;
					itemDef.modelOffset2 = 0;
					itemDef.name = "Burnt rocktail";
					itemDef.description = "Oops! Maybe a little less heat next time.".getBytes();
				break;
				
				case 14998:
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wear";
					itemDef.anInt200 = 56505;
					itemDef.modelOffset1 = 5;
					itemDef.modelOffset2 = -12;
					itemDef.modelZoom = 976;
					itemDef.modelRotationX = 51;
					itemDef.modelRotationY = 510;
					itemDef.anInt165 = 55825;
					itemDef.modelID = 56779;
					itemDef.name = "Arcane stream necklace";
					itemDef.description = "The energy from this necklace is unlike anything you have ever felt.".getBytes();
				break;
				case 14997:
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wield";
					itemDef.anInt200 = 51802;//female
					itemDef.modelOffset1 = -5;
					itemDef.modelOffset2 = 2;
					itemDef.modelZoom = 1490;
					itemDef.modelRotationX = 1400;
					itemDef.modelRotationY = 148;
					itemDef.anInt165 = 51800;
					itemDef.modelID = 51799;
					itemDef.name = "Staff of light";
					itemDef.description = "Humming with power.".getBytes();
				break;
				
				case 4067:
					itemDef.name = "Donator ticket";
					itemDef.description = "Higher currency.".getBytes();
				break;
				
				case 626:
				case 627:
					itemDef.name = "Epic boots";
					itemDef.description = "They're like Fire capes.. On my feet!".getBytes();
				break;
				
				case 11728:
				case 11729:
					itemDef.name = "Heroic boots";
					itemDef.description = "Boots made for a true hero.".getBytes();
				break;
				
				case 10362:
				case 10363:
					itemDef.name = "Heroic amulet";
					itemDef.description = "An amulet made for a true hero.".getBytes();
				break;
				
				case 14484:
		                	itemDef.itemActions = new String[5];
		                	itemDef.itemActions[1] = "Wield";
		                	itemDef.modelID = 44590;
		                	itemDef.anInt165 = 43660;//anInt165
		                	itemDef.anInt200 = 43660;//anInt200
		                	itemDef.modelZoom = 789;
		                	itemDef.modelRotationY = 240;
		                	itemDef.modelRotationX = 60;
		                	itemDef.modelOffset1 = -1;
		                	itemDef.modelOffset2 = -23;
		                	itemDef.name = "Dragon claws";
		                	itemDef.description = "A set of fighting claws.".getBytes();
		                break;
				case 15037:
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wield";
					itemDef.anInt200 = 35085;//female
					itemDef.modelOffset1 = 9;
					itemDef.modelOffset2 = 13;
					itemDef.modelZoom = 1425;
					itemDef.modelRotationX = 1300;
					itemDef.modelRotationY = 700;
					itemDef.anInt165 = 35085;
					itemDef.modelID = 35084;
					itemDef.name = "Chaotic rapier";
					itemDef.aByte205 = -12;
					itemDef.aByte154 = -12;
					itemDef.anInt188 = -1;//female sleeve
					itemDef.anInt164 = -1;//male sleeve
					itemDef.description = "A razor-sharp rapier. (It doesnt look in good condition.)".getBytes();
				break;
				


				case 15038:
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wield";
					itemDef.anInt200 = 35087;//female
					itemDef.modelOffset1 = 3;
					itemDef.modelOffset2 = 0;
					itemDef.modelZoom = 1650;
					itemDef.modelRotationX = 1300;
					itemDef.modelRotationY = 498;
					itemDef.anInt165 = 35087;
					itemDef.modelID = 35086;
				    itemDef.aByte205 = -12;
					itemDef.aByte154 = -12;
					itemDef.name = "Chaotic longsword";
					itemDef.anInt188 = -1;//female sleeve
					itemDef.anInt164 = -1;//male sleeve
					itemDef.description = "A dangerously-sharp longsword. (It doesnt look in good condition.)".getBytes();
				break;
				case 15039:
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wield";
					itemDef.anInt200 = 35089;//female
					itemDef.modelOffset1 = 4;
					itemDef.modelOffset2 = 2;
					itemDef.modelZoom = 1360;
					itemDef.modelRotationX = 354;
					itemDef.modelRotationY = 498;
					itemDef.anInt165 = 35089;
					itemDef.modelID = 35088;
				    itemDef.aByte205 = -12;
					itemDef.aByte154 = -12;
					itemDef.name = "Chaotic maul";
					itemDef.anInt188 = -1;//female sleeve
					itemDef.anInt164 = -1;//male sleeve
		            itemDef.aByte205 = -10; 
		            itemDef.aByte154 = -10;
					itemDef.description = "A dangerously-blunt maul. (It doesnt look in good condition.)".getBytes();
				break;
				case 15040:
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wield";
					itemDef.anInt200 = 35091;//female
					itemDef.modelOffset1 = 5;
					itemDef.modelOffset2 = 0;
					itemDef.modelZoom = 1711;
					itemDef.modelRotationX = 365;
					itemDef.modelRotationY = 350;
					itemDef.anInt165 = 35091;
					itemDef.modelID = 35090;
				    itemDef.aByte205 = -12;
					itemDef.aByte154 = -12;
					itemDef.name = "Chaotic staff";
					itemDef.aByte205 = -10;
					itemDef.aByte154 = -10;
					itemDef.anInt188 = -1;//female sleeve
					itemDef.anInt164 = -1;//male sleeve
					itemDef.description = "A staff used by the greatest of wizards. (It doesnt look in good condition.)".getBytes();
				break;
			

		case 11953:
			itemDef.name = "Extended antifire (3)";
			itemDef.modelZoom = 550;
			itemDef.modelRotationY = 84;
			itemDef.modelRotationX = 1996;
			itemDef.modelOffset2 = -1;
			itemDef.originalModelColors = new int[] { -18622 };
			itemDef.modifiedModelColors = new int[] { 61 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { "Drink", null, null, "Empty", "Drop" };
			itemDef.modelID = 2697;
			break;

		case 11955:
			itemDef.name = "Extended antifire (2)";
			itemDef.modelZoom = 550;
			itemDef.modelRotationY = 84;
			itemDef.modelRotationX = 1996;
			itemDef.modelOffset2 = -1;
			itemDef.originalModelColors = new int[] { -18622 };
			itemDef.modifiedModelColors = new int[] { 61 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { "Drink", null, null, "Empty", "Drop" };
			itemDef.modelID = 2384;
			break;

		case 11957:
			itemDef.name = "Extended antifire (1)";
			itemDef.modelZoom = 550;
			itemDef.modelRotationY = 84;
			itemDef.modelRotationX = 1996;
			itemDef.modelOffset2 = -1;
			itemDef.originalModelColors = new int[] { -18622 };
			itemDef.modifiedModelColors = new int[] { 61 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { "Drink", null, null, "Empty", "Drop" };
			itemDef.modelID = 2621;
			break;
		

		case 11934:
			itemDef.name = "Raw dark crab";
			itemDef.modelZoom = 1300;
			itemDef.modelRotationY = 222;
			itemDef.modelRotationX = 1805;
			itemDef.modelOffset1 = 14;
			itemDef.modelOffset2 = 25;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 28251;
			break;

		case 11936:
			itemDef.name = "Dark crab";
			itemDef.modelZoom = 1300;
			itemDef.modelRotationY = 222;
			itemDef.modelRotationX = 1805;
			itemDef.modelOffset1 = 14;
			itemDef.modelOffset2 = 25;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { "Eat", null, null, null, "Drop" };
			itemDef.modelID = 28253;
			break;
		case 7975:
			itemDef.name = "Crawling hand";
			itemDef.modelZoom = 2384;
			itemDef.modelRotationY = 339;
			itemDef.modelRotationX = 246;
			itemDef.modelOffset1 = -1;
			itemDef.modelOffset2 = 13;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 12343;
			break;

		case 7976:
			itemDef.name = "Cockatrice head";
			itemDef.modelZoom = 1872;
			itemDef.modelRotationY = 603;
			itemDef.modelRotationX = 1964;
			itemDef.modelOffset1 = -8;
			itemDef.modelOffset2 = 1;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 12341;
			break;

		case 7977:
			itemDef.name = "Basilisk head";
			itemDef.modelZoom = 1360;
			itemDef.modelRotationY = 432;
			itemDef.modelRotationX = 1976;
			itemDef.modelOffset1 = 3;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 12337;
			break;

		case 7978:
			itemDef.name = "Kurask head";
			itemDef.modelZoom = 1616;
			itemDef.modelRotationY = 539;
			itemDef.modelRotationX = 2019;
			itemDef.modelOffset1 = -4;
			itemDef.modelOffset2 = -8;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 12349;
			break;

		case 7979:
			itemDef.name = "Abyssal head";
			itemDef.modelRotationY = 648;
			itemDef.modelRotationX = 321;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 12335;
			break;

		case 7980:
			itemDef.name = "Kbd heads";
			itemDef.modelZoom = 2256;
			itemDef.modelRotationY = 444;
			itemDef.modelRotationX = 45;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = 1;
			itemDef.originalModelColors = new int[] { 8 };
			itemDef.modifiedModelColors = new int[] { 61 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 12347;
			break;

		case 7981:
			itemDef.name = "Kq head";
			itemDef.modelZoom = 1901;
			itemDef.modelRotationY = 111;
			itemDef.modelRotationX = 1881;
			itemDef.modelOffset1 = -11;
			itemDef.modelOffset2 = -22;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 24590;
			break;

		case 7982:
			itemDef.name = "Crawling hand";
			itemDef.modelZoom = 2128;
			itemDef.modelRotationY = 339;
			itemDef.modelRotationX = 246;
			itemDef.modelOffset1 = -1;
			itemDef.modelOffset2 = 13;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 12344;
			break;

		case 7983:
			itemDef.name = "Cockatrice head";
			itemDef.modelZoom = 1872;
			itemDef.modelRotationY = 510;
			itemDef.modelRotationX = 255;
			itemDef.modelOffset1 = -8;
			itemDef.modelOffset2 = 1;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 12342;
			break;

		case 7984:
			itemDef.name = "Basilisk head";
			itemDef.modelZoom = 1360;
			itemDef.modelRotationY = 90;
			itemDef.modelRotationX = 1850;
			itemDef.modelOffset1 = 8;
			itemDef.modelOffset2 = -1;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 12338;
			break;

		case 7985:
			itemDef.name = "Kurask head";
			itemDef.modelZoom = 1488;
			itemDef.modelRotationY = 608;
			itemDef.modelOffset1 = 5;
			itemDef.modelOffset2 = -9;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 12350;
			break;

		case 7986:
			itemDef.name = "Abyssal head";
			itemDef.modelRotationY = 624;
			itemDef.modelRotationX = 402;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 12336;
			break;

		case 7987:
			itemDef.name = "Kbd heads";
			itemDef.modelZoom = 2384;
			itemDef.modelRotationY = 186;
			itemDef.modelRotationX = 336;
			itemDef.modelOffset1 = 5;
			itemDef.modelOffset2 = -52;
			itemDef.originalModelColors = new int[] { 8 };
			itemDef.modifiedModelColors = new int[] { 61 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 12348;
			break;

		case 7988:
			itemDef.name = "Kq head";
			itemDef.modelZoom = 2285;
			itemDef.modelRotationY = 111;
			itemDef.modelRotationX = 1853;
			itemDef.modelOffset1 = -11;
			itemDef.modelOffset2 = -27;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 24589;
			break;

		case 7989:
			itemDef.name = "Big bass";
			itemDef.modelZoom = 1852;
			itemDef.modelRotationY = 464;
			itemDef.modelRotationX = 1920;
			itemDef.modelOffset1 = -3;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 12339;
			break;

		case 7990:
			itemDef.name = "Big bass";
			itemDef.modelZoom = 1724;
			itemDef.modelRotationY = 464;
			itemDef.modelRotationX = 1920;
			itemDef.modelOffset2 = 3;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 12340;
			break;

		case 7991:
			itemDef.name = "Big swordfish";
			itemDef.modelZoom = 1710;
			itemDef.modelRotationY = 572;
			itemDef.modelRotationX = 1723;
			itemDef.modelOffset1 = -4;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 12353;
			break;

		case 7992:
			itemDef.name = "Big swordfish";
			itemDef.modelZoom = 1710;
			itemDef.modelRotationY = 356;
			itemDef.modelRotationX = 1903;
			itemDef.modelOffset1 = -14;
			itemDef.modelOffset2 = 24;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 12354;
			break;

		case 7993:
			itemDef.name = "Big shark";
			itemDef.modelZoom = 1860;
			itemDef.modelRotationY = 344;
			itemDef.modelRotationX = 12;
			itemDef.modelOffset1 = 5;
			itemDef.modelOffset2 = 20;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 12351;
			break;

		case 7994:
			itemDef.name = "Big shark";
			itemDef.modelZoom = 1860;
			itemDef.modelRotationY = 344;
			itemDef.modelRotationX = 12;
			itemDef.modelOffset1 = 5;
			itemDef.modelOffset2 = 20;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 12352;
			break;

		case 11938:
			itemDef.name = "Burnt dark crab";
			itemDef.modelZoom = 1300;
			itemDef.modelRotationY = 222;
			itemDef.modelRotationX = 1805;
			itemDef.modelOffset1 = 14;
			itemDef.modelOffset2 = 25;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 28254;
			break;

		case 11940:
			itemDef.name = "Dark fishing bait";
			itemDef.modelZoom = 650;
			itemDef.modelRotationY = 236;
			itemDef.modelRotationX = 1840;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = -6;
			itemDef.originalModelColors = new int[] { 19753 };
			itemDef.modifiedModelColors = new int[] { 7112 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 2436;
			break;

		case 11850:
			itemDef.name = "Graceful hood";
			itemDef.modelZoom = 730;
			itemDef.modelRotationX = 2036;
			itemDef.originalModelColors = new int[] { 3288, 6348, 3288 };
			itemDef.modifiedModelColors = new int[] { -22477, 8596, 8741 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 5419;
			itemDef.anInt165 = 5430;
			itemDef.anInt200 = 5435;
			break;

		case 11851:
			itemDef.name = "Graceful hood";
			itemDef.modelZoom = 730;
			itemDef.modelRotationX = 2036;
			itemDef.originalModelColors = new int[] { 3288, 6348, 3288 };
			itemDef.modifiedModelColors = new int[] { -22477, 8596, 8741 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 5419;
			itemDef.anInt165 = 5430;
			itemDef.anInt200 = 5435;
			break;

		case 11852:
			itemDef.name = "Graceful cape";
			itemDef.modelZoom = 2140;
			itemDef.modelRotationY = 400;
			itemDef.modelRotationX = 948;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 = 6;
			itemDef.originalModelColors = new int[] { 5314, 3288, 5314 };
			itemDef.modifiedModelColors = new int[] { 7700, 11200, 926 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 2603;
			itemDef.anInt165 = 323;
			itemDef.anInt200 = 481;
			break;

		case 11853:
			itemDef.name = "Graceful cape";
			itemDef.modelZoom = 2140;
			itemDef.modelRotationY = 400;
			itemDef.modelRotationX = 948;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 = 6;
			itemDef.originalModelColors = new int[] { 5314, 3288, 5314 };
			itemDef.modifiedModelColors = new int[] { 7700, 11200, 926 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 2603;
			itemDef.anInt165 = 323;
			itemDef.anInt200 = 481;
			break;

		case 11854:
			itemDef.name = "Graceful top";
			itemDef.modelZoom = 1300;
			itemDef.modelRotationY = 364;
			itemDef.modelRotationX = 212;
			itemDef.modelOffset2 = 16;
			itemDef.originalModelColors = new int[] { 5314, 3288, 6348 };
			itemDef.modifiedModelColors = new int[] { 6430, 10378, 10270 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 7552;
			itemDef.anInt165 = 7610;
			itemDef.anInt165 = 7605;
			itemDef.anInt200 = 7617;
			itemDef.anInt200 = 7612;
			break;

		case 11855:
			itemDef.name = "Graceful top";
			itemDef.modelZoom = 1300;
			itemDef.modelRotationY = 364;
			itemDef.modelRotationX = 212;
			itemDef.modelOffset2 = 16;
			itemDef.originalModelColors = new int[] { 5314, 3288, 6348 };
			itemDef.modifiedModelColors = new int[] { 6430, 10378, 10270 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 7552;
			itemDef.anInt165 = 7610;
			itemDef.anInt165 = 7605;
			itemDef.anInt200 = 7617;
			itemDef.anInt200 = 7612;
			break;

		case 11856:
			itemDef.name = "Graceful legs";
			itemDef.modelZoom = 1140;
			itemDef.modelRotationY = 388;
			itemDef.modelRotationX = 2036;
			itemDef.modelOffset2 = 4;
			itemDef.originalModelColors = new int[] { 5314, 3288, 5314, 5314 };
			itemDef.modifiedModelColors = new int[] { 6430, 10378, 10270, 10258 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 7551;
			itemDef.anInt165 = 7609;
			itemDef.anInt200 = 7616;
			break;

		case 11857:
			itemDef.name = "Graceful legs";
			itemDef.modelZoom = 1140;
			itemDef.modelRotationY = 388;
			itemDef.modelRotationX = 2036;
			itemDef.modelOffset2 = 4;
			itemDef.originalModelColors = new int[] { 5314, 3288, 5314, 5314 };
			itemDef.modifiedModelColors = new int[] { 6430, 10378, 10270, 10258 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 7551;
			itemDef.anInt165 = 7609;
			itemDef.anInt200 = 7616;
			break;

		case 11858:
			itemDef.name = "Graceful gloves";
			itemDef.modelZoom = 740;
			itemDef.modelRotationY = 376;
			itemDef.modelRotationX = 60;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 = 7;
			itemDef.originalModelColors = new int[] { 5314, 3288 };
			itemDef.modifiedModelColors = new int[] { 6430, 10378 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 7549;
			itemDef.anInt165 = 7606;
			itemDef.anInt200 = 7613;
			break;

		case 11859:
			itemDef.name = "Graceful gloves";
			itemDef.modelZoom = 740;
			itemDef.modelRotationY = 376;
			itemDef.modelRotationX = 60;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 = 7;
			itemDef.originalModelColors = new int[] { 5314, 3288 };
			itemDef.modifiedModelColors = new int[] { 6430, 10378 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 7549;
			itemDef.anInt165 = 7606;
			itemDef.anInt200 = 7613;
			break;

		case 11860:
			itemDef.name = "Graceful boots";
			itemDef.modelZoom = 870;
			itemDef.modelRotationY = 184;
			itemDef.modelRotationX = 204;
			itemDef.originalModelColors = new int[] { 5314, 3288 };
			itemDef.modifiedModelColors = new int[] { 6430, 10378 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 7548;
			itemDef.anInt165 = 7607;
			itemDef.anInt200 = 7614;
			break;

		case 11861:
			itemDef.name = "Graceful boots";
			itemDef.modelZoom = 870;
			itemDef.modelRotationY = 184;
			itemDef.modelRotationX = 204;
			itemDef.originalModelColors = new int[] { 5314, 3288 };
			itemDef.modifiedModelColors = new int[] { 6430, 10378 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 7548;
			itemDef.anInt165 = 7607;
			itemDef.anInt200 = 7614;
			break;

		

		case 11864:
			itemDef.name = "Slayer helmet";
			itemDef.modelZoom = 975;
			itemDef.modelRotationY = 69;
			itemDef.modelRotationX = 1743;
			itemDef.modelOffset1 = -4;
			itemDef.modelOffset2 = -3;
			itemDef.originalModelColors = new int[] { 33, 10320, 59, 59, 47, 47 };
			itemDef.modifiedModelColors = new int[] { -27611, 10332, -15292, -15292, -15309, -11225 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, "Disassemble", "Drop" };
			itemDef.modelID = 16269;
			itemDef.anInt165 = 16274;
			itemDef.anInt200 = 16276;
			break;

		case 11865:
			itemDef.name = "Slayer helmet (i)";
			itemDef.modelZoom = 975;
			itemDef.modelRotationY = 69;
			itemDef.modelRotationX = 1743;
			itemDef.modelOffset1 = -4;
			itemDef.modelOffset2 = -3;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, "Disassemble", "Drop" };
			itemDef.modelID = 16269;
			itemDef.anInt165 = 16274;
			itemDef.anInt200 = 16276;
			break;

		case 11866:
			itemDef.name = "Slayer ring (8)";
			itemDef.modelZoom = 830;
			itemDef.modelRotationY = 322;
			itemDef.modelRotationX = 135;
			itemDef.modelOffset1 = -1;
			itemDef.modelOffset2 = 1;
			itemDef.originalModelColors = new int[] { -21930 };
			itemDef.modifiedModelColors = new int[] { 127 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", "Rub", "Check", "Drop" };
			itemDef.modelID = 2677;
			break;

		case 11867:
			itemDef.name = "Slayer ring (7)";
			itemDef.modelZoom = 830;
			itemDef.modelRotationY = 322;
			itemDef.modelRotationX = 135;
			itemDef.modelOffset1 = -1;
			itemDef.modelOffset2 = 1;
			itemDef.originalModelColors = new int[] { -21930 };
			itemDef.modifiedModelColors = new int[] { 127 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", "Rub", "Check", "Drop" };
			itemDef.modelID = 2677;
			break;

		case 11868:
			itemDef.name = "Slayer ring (6)";
			itemDef.modelZoom = 830;
			itemDef.modelRotationY = 322;
			itemDef.modelRotationX = 135;
			itemDef.modelOffset1 = -1;
			itemDef.modelOffset2 = 1;
			itemDef.originalModelColors = new int[] { -21930 };
			itemDef.modifiedModelColors = new int[] { 127 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", "Rub", "Check", "Drop" };
			itemDef.modelID = 2677;
			break;

		case 11869:
			itemDef.name = "Slayer ring (5)";
			itemDef.modelZoom = 830;
			itemDef.modelRotationY = 322;
			itemDef.modelRotationX = 135;
			itemDef.modelOffset1 = -1;
			itemDef.modelOffset2 = 1;
			itemDef.originalModelColors = new int[] { -21930 };
			itemDef.modifiedModelColors = new int[] { 127 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", "Rub", "Check", "Drop" };
			itemDef.modelID = 2677;
			break;

		case 11870:
			itemDef.name = "Slayer ring (4)";
			itemDef.modelZoom = 830;
			itemDef.modelRotationY = 322;
			itemDef.modelRotationX = 135;
			itemDef.modelOffset1 = -1;
			itemDef.modelOffset2 = 1;
			itemDef.originalModelColors = new int[] { -21930 };
			itemDef.modifiedModelColors = new int[] { 127 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", "Rub", "Check", "Drop" };
			itemDef.modelID = 2677;
			break;

		case 11871:
			itemDef.name = "Slayer ring (3)";
			itemDef.modelZoom = 830;
			itemDef.modelRotationY = 322;
			itemDef.modelRotationX = 135;
			itemDef.modelOffset1 = -1;
			itemDef.modelOffset2 = 1;
			itemDef.originalModelColors = new int[] { -21930 };
			itemDef.modifiedModelColors = new int[] { 127 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", "Rub", "Check", "Drop" };
			itemDef.modelID = 2677;
			break;

		case 11872:
			itemDef.name = "Slayer ring (2)";
			itemDef.modelZoom = 830;
			itemDef.modelRotationY = 322;
			itemDef.modelRotationX = 135;
			itemDef.modelOffset1 = -1;
			itemDef.modelOffset2 = 1;
			itemDef.originalModelColors = new int[] { -21930 };
			itemDef.modifiedModelColors = new int[] { 127 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", "Rub", "Check", "Drop" };
			itemDef.modelID = 2677;
			break;

		case 11873:
			itemDef.name = "Slayer ring (1)";
			itemDef.modelZoom = 830;
			itemDef.modelRotationY = 322;
			itemDef.modelRotationX = 135;
			itemDef.modelOffset1 = -1;
			itemDef.modelOffset2 = 1;
			itemDef.originalModelColors = new int[] { -21930 };
			itemDef.modifiedModelColors = new int[] { 127 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", "Rub", "Check", "Drop" };
			itemDef.modelID = 2677;
			break;

		case 11874:
			itemDef.name = "Broad arrowheads";
			itemDef.modelZoom = 1330;
			itemDef.modelRotationY = 300;
			itemDef.modelRotationX = 128;
			itemDef.modelOffset1 = 6;
			itemDef.modelOffset2 = 30;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 16273;
			break;

		case 11875:
			itemDef.name = "Broad bolts";
			itemDef.modelZoom = 850;
			itemDef.modelRotationY = 477;
			itemDef.modelRotationX = 117;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 = 6;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wield", null, null, "Drop" };
			itemDef.modelID = 16256;
			break;

		case 11876:
			itemDef.name = "Unfinished broad bolts";
			itemDef.modelZoom = 850;
			itemDef.modelRotationY = 477;
			itemDef.modelRotationX = 117;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 = 6;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 16268;
			break;


		case 11893:
			itemDef.name = "Decorative armour";
			itemDef.modelZoom = 1100;
			itemDef.modelRotationY = 620;
			itemDef.modelRotationX = 0;
			itemDef.modelOffset1 = 5;
			itemDef.modelOffset2 = 5;
			itemDef.originalModelColors = new int[] { 937, -21591, -21591 };
			itemDef.modifiedModelColors = new int[] { 61, 25238, 908 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 2542;
			itemDef.anInt165 = 266;
			itemDef.anInt200 = 430;
			break;

		case 11894:
			itemDef.name = "Decorative armour";
			itemDef.modelZoom = 1100;
			itemDef.modelRotationY = 620;
			itemDef.modelRotationX = 0;
			itemDef.modelOffset1 = 5;
			itemDef.modelOffset2 = 5;
			itemDef.originalModelColors = new int[] { 94, -22087, -22087 };
			itemDef.modifiedModelColors = new int[] { 61, 25238, 908 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 2542;
			itemDef.anInt165 = 266;
			itemDef.anInt200 = 430;
			break;

		case 11895:
			itemDef.name = "Decorative armour";
			itemDef.modelZoom = 1100;
			itemDef.modelRotationY = 620;
			itemDef.modelRotationX = 0;
			itemDef.modelOffset1 = 5;
			itemDef.modelOffset2 = 5;
			itemDef.originalModelColors = new int[] { 10929, -22256, -22256 };
			itemDef.modifiedModelColors = new int[] { 61, 25238, 908 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 2542;
			itemDef.anInt165 = 266;
			itemDef.anInt200 = 430;
			break;

		case 11896:
			itemDef.name = "Decorative armour";
			itemDef.modelZoom = 1400;
			itemDef.modelRotationY = 637;
			itemDef.modelRotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 16285;
			itemDef.anInt165 = 28226;
			itemDef.anInt165 = 28224;
			itemDef.anInt200 = 28853;
			itemDef.anInt200 = 28850;
			break;

		case 11897:
			itemDef.name = "Decorative armour";
			itemDef.modelRotationY = 637;
			itemDef.modelRotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 28219;
			itemDef.anInt165 = 28223;
			itemDef.anInt200 = 28849;
			break;

		case 11898:
			itemDef.name = "Decorative armour";
			itemDef.modelZoom = 1400;
			itemDef.modelOffset1 = -4;
			itemDef.modelOffset2 = -12;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 16284;
			itemDef.anInt165 = 28220;
			itemDef.anInt200 = 28220;
			break;

		case 11899:
			itemDef.name = "Decorative armour";
			itemDef.modelZoom = 1400;
			itemDef.modelRotationY = 637;
			itemDef.modelRotationX = 0;
			itemDef.modelOffset2 = 9;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 28217;
			itemDef.anInt165 = 28227;
			itemDef.anInt165 = 28225;
			itemDef.anInt200 = 28852;
			itemDef.anInt200 = 28851;
			break;
		case 11847:
			itemDef.name = "Black h'ween mask";
			itemDef.modelZoom = 730;
			itemDef.modelRotationY = 516;
			itemDef.modelRotationX = 0;
			itemDef.modelOffset2 = -10;
			itemDef.originalModelColors = new int[] { 8, 9152 };
			itemDef.modifiedModelColors = new int[] { 926, 0 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Destroy" };
			itemDef.modelID = 2438;
			itemDef.anInt165 = 3188;
			itemDef.anInt200 = 3192;
			break;




case 11862:
	itemDef.name = "Black partyhat";
	itemDef.modelZoom = 440;
	itemDef.modelRotationY = 76;
	itemDef.modelRotationX = 1852;
	itemDef.modelOffset1 = 1;
	itemDef.modelOffset2 = 1;
	itemDef.originalModelColors = new int[] { 0 };
	itemDef.modifiedModelColors = new int[] { 926 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Destroy" };
	itemDef.modelID = 2635;
	itemDef.anInt165 = 187;
	itemDef.anInt200 = 363;
	break;

case 11863:
	itemDef.name = "Rainbow partyhat";
	itemDef.modelZoom = 440;
	itemDef.modelRotationY = 76;
	itemDef.modelRotationX = 1852;
	itemDef.modelOffset1 = 1;
	itemDef.modelOffset2 = 1;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Destroy" };
	itemDef.modelID = 16252;
	itemDef.anInt165 = 16246;
	itemDef.anInt200 = 16248;
	break;

case 11740:
	itemDef.name = "Scroll of redirection";
	itemDef.modelZoom = 1000;
	itemDef.modelRotationY = 340;
	itemDef.modelRotationX = 680;
	itemDef.modelOffset1 = 1;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { "Read", null, null, "Refund", "Drop" };
	itemDef.modelID = 3374;
	break;

case 11742:
	itemDef.name = "Rimmington teleport";
	itemDef.modelZoom = 465;
	itemDef.modelRotationY = 373;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -1;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { "Break", null, null, "Revert", "Drop" };
	itemDef.modelID = 12324;
	break;

case 11744:
	itemDef.name = "Taverley teleport";
	itemDef.modelZoom = 465;
	itemDef.modelRotationY = 373;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -1;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { "Break", null, null, "Revert", "Drop" };
	itemDef.modelID = 12324;
	break;

case 11746:
	itemDef.name = "Pollnivneach teleport";
	itemDef.modelZoom = 465;
	itemDef.modelRotationY = 373;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -1;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { "Break", null, null, "Revert", "Drop" };
	itemDef.modelID = 12324;
	break;

case 11748:
	itemDef.name = "Rellekka teleport";
	itemDef.modelZoom = 465;
	itemDef.modelRotationY = 373;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -1;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { "Break", null, null, "Revert", "Drop" };
	itemDef.modelID = 12324;
	break;

case 11750:
	itemDef.name = "Brimhaven teleport";
	itemDef.modelZoom = 465;
	itemDef.modelRotationY = 373;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -1;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { "Break", null, null, "Revert", "Drop" };
	itemDef.modelID = 12324;
	break;

case 11752:
	itemDef.name = "Yanille teleport";
	itemDef.modelZoom = 465;
	itemDef.modelRotationY = 373;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -1;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { "Break", null, null, "Revert", "Drop" };
	itemDef.modelID = 12324;
	break;

case 11754:
	itemDef.name = "Trollheim teleport";
	itemDef.modelZoom = 465;
	itemDef.modelRotationY = 373;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -1;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { "Break", null, null, "Revert", "Drop" };
	itemDef.modelID = 12324;
	break;

case 11789:
	itemDef.name = "Mystic steam staff";
	itemDef.modelZoom = 1490;
	itemDef.modelRotationY = 148;
	itemDef.modelRotationX = 1400;
	itemDef.modelOffset1 = -5;
	itemDef.modelOffset2 = 2;
	itemDef.originalModelColors = new int[] { -32537 };
	itemDef.modifiedModelColors = new int[] { -22419 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wield", null, null, "Drop" };
	itemDef.modelID = 2810;
	itemDef.anInt165 = 534;
	itemDef.anInt165 = 567;
	itemDef.anInt200 = 534;
	itemDef.anInt200 = 567;
	break;

		case 11900:
			itemDef.name = "Decorative armour";
			itemDef.modelRotationY = 637;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 28218;
			itemDef.anInt165 = 28222;
			itemDef.anInt200 = 28848;
			break;

		case 11901:
			itemDef.name = "Decorative armour";
			itemDef.modelZoom = 800;
			itemDef.modelOffset1 = -5;
			itemDef.modelOffset2 = -8;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 28216;
			itemDef.anInt165 = 28221;
			itemDef.anInt200 = 28221;
			break;

		case 11902:
			itemDef.name = "Leaf-bladed sword";
			itemDef.modelZoom = 1650;
			itemDef.modelRotationY = 500;
			itemDef.modelRotationX = 1300;
			itemDef.modelOffset1 = -20;
			itemDef.modelOffset2 = -20;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wield", null, null, "Drop" };
			itemDef.modelID = 28229;
			itemDef.anInt165 = 28228;
			itemDef.anInt200 = 28228;
			break;
		
		case 11918:
			itemDef.name = "Present";
			itemDef.modelZoom = 1300;
			itemDef.modelRotationY = 97;
			itemDef.modelRotationX = 235;
			itemDef.modelOffset1 = 6;
			itemDef.modelOffset2 = 10;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { "Open", null, null, null, "Drop" };
			itemDef.modelID = 28243;
			break;

		case 11919:
			itemDef.name = "Cow mask";
			itemDef.modelZoom = 820;
			itemDef.modelRotationY = 2036;
			itemDef.modelRotationX = 1908;
			itemDef.modelOffset1 = -2;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Destroy" };
			itemDef.modelID = 28250;
			itemDef.anInt165 = 28235;
			itemDef.anInt200 = 28237;
			break;
		case 15002:
		      itemDef.name = "TokHaar-Kal";
            itemDef.value = 60000;
            itemDef.anInt165 = 62575;
            itemDef.anInt200 = 62582;
            itemDef.groundActions = new String[5];
            itemDef.groundActions[2] = "Take";
            itemDef.modelOffset1 = -4;
            itemDef.modelID = 62592;
            itemDef.description = "A cape made of ancient, enchanted rocks.".getBytes();
            itemDef.modelZoom = 1616;
            itemDef.aByte205 = 5;
            itemDef.aByte154 = 5;
            itemDef.itemActions = new String[5];
            itemDef.itemActions[1] = "Wear";
            itemDef.itemActions[4] = "Drop";
            itemDef.modelOffset2 = 0;
            itemDef.modelRotationY = 339;
            itemDef.modelRotationX = 192;
            break;
		case 15110:
		       itemDef.name = "Staff of the dead";
		       itemDef.itemActions = new String[5];
		       itemDef.itemActions[1] = "Wield";
		       itemDef.description = "A ghastly weapon with evil origins.".getBytes();
		       itemDef.modelID = 2810;
		       itemDef.anInt165 = 5232;
		       itemDef.anInt200 = 5232;
		       itemDef.modelRotationY = 148;
		       itemDef.modelRotationX = 1300;
		       itemDef.modelZoom = 1420;
		       itemDef.modelOffset1 = -5;
		       itemDef.modelOffset2 = 2;
		       break;
        case 15003:
        	itemDef.name = "Armadyl crossbow";
        	itemDef.modelZoom = 1325;
        	itemDef.modelRotationY = 240;
        	itemDef.modelRotationX = 110;
        	itemDef.modelOffset1 = -6;
        	itemDef.modelOffset2 = -40;
        	itemDef.originalModelColors = new int[] { 115, 107, 10167, 10171 };
        	itemDef.modifiedModelColors = new int[] { 5409, 5404, 6449, 7390 };
        	itemDef.groundActions = new String[] { null, null, "Take", null, null };
        	itemDef.itemActions = new String[] { null, "Wield", null, null, "Drop" };
        	itemDef.modelID = 19967;
        	itemDef.anInt165 = 19839;
        	itemDef.anInt200 = 19839;
        	break;
        case 15004:
        	itemDef.modelID = 65270;
        	itemDef.name = "Completionist cape(yellow)";
        	itemDef.modelZoom = 1316;
        	itemDef.modelRotationY = 252;
        	itemDef.modelRotationX = 1020;
        	itemDef.modelOffset1 = -1;
        	itemDef.modelOffset2 = 24;
        	itemDef.anInt165 = 65297;
        	itemDef.anInt200 = 65297;
        	itemDef.groundActions = new String[5];
        	itemDef.groundActions[2] = "Take";
        	itemDef.itemActions = new String[5];
        	itemDef.itemActions[1] = "Wear";
        	itemDef.itemActions[2] = "Customize";
        	itemDef.modifiedModelColors = new int[4];
        	itemDef.originalModelColors = new int[4];
        	itemDef.modifiedModelColors[0] = 65214; //red
        	itemDef.modifiedModelColors[1] = 65200; // darker red
        	itemDef.modifiedModelColors[2] = 65186; //dark red
        	itemDef.modifiedModelColors[3] = 62995; //darker red
        	itemDef.originalModelColors[0] = 11200;
        	itemDef.originalModelColors[1] = 11200;
        	itemDef.originalModelColors[2] = 6073;
        	itemDef.originalModelColors[3] = 11200;
        	break;

        	case 15005:
        	itemDef.modelID = 65270;
        	itemDef.name = "Completionist cape(blue)";
        	itemDef.modelZoom = 1316;
        	itemDef.modelRotationY = 252;
        	itemDef.modelRotationX = 1020;
        	itemDef.modelOffset1 = -1;
        	itemDef.modelOffset2 = 24;
        	itemDef.anInt165 = 65297;
        	itemDef.anInt200 = 65297;
        	itemDef.groundActions = new String[5];
        	itemDef.groundActions[2] = "Take";
        	itemDef.itemActions = new String[5];
        	itemDef.itemActions[1] = "Wear";
        	itemDef.itemActions[2] = "Customize";
        	itemDef.modifiedModelColors = new int[4];
        	itemDef.originalModelColors = new int[4];
        	itemDef.modifiedModelColors[0] = 65214; //red
        	itemDef.modifiedModelColors[1] = 65200; // darker red
        	itemDef.modifiedModelColors[2] = 65186; //dark red
        	itemDef.modifiedModelColors[3] = 62995; //darker red
        	itemDef.originalModelColors[0] = 44988;//cape
        	itemDef.originalModelColors[1] = 44988;//cape
        	itemDef.originalModelColors[2] = 32463;//outline
        	itemDef.originalModelColors[3] = 44988;//cape
        	break;

        	case 15006:
        	itemDef.modelID = 65270;
        	itemDef.name = "Completionist cape(green)";
        	itemDef.modelZoom = 1316;
        	itemDef.modelRotationY = 252;
        	itemDef.modelRotationX = 1020;
        	itemDef.modelOffset1 = -1;
        	itemDef.modelOffset2 = 24;
        	itemDef.anInt165 = 65297;
        	itemDef.anInt200 = 65297;
        	itemDef.groundActions = new String[5];
        	itemDef.groundActions[2] = "Take";
        	itemDef.itemActions = new String[5];
        	itemDef.itemActions[1] = "Wear";
        	itemDef.itemActions[2] = "Customize";
        	itemDef.modifiedModelColors = new int[4];
        	itemDef.originalModelColors = new int[4];
        	itemDef.modifiedModelColors[0] = 65214; //red
        	itemDef.modifiedModelColors[1] = 65200; // darker red
        	itemDef.modifiedModelColors[2] = 65186; //dark red
        	itemDef.modifiedModelColors[3] = 62995; //darker red
        	itemDef.originalModelColors[0] = 22456;//cape
        	itemDef.originalModelColors[1] = 22456;//cape
        	itemDef.originalModelColors[2] = 21420;//outline
        	itemDef.originalModelColors[3] = 22456;//cape
        	break;

        	case 15007:
        	itemDef.modelID = 65270;
        	itemDef.name = "Completionist cape(cyan)";
        	itemDef.modelZoom = 1316;
        	itemDef.modelRotationY = 252;
        	itemDef.modelRotationX = 1020;
        	itemDef.modelOffset1 = -1;
        	itemDef.modelOffset2 = 24;
        	itemDef.anInt165 = 65297;
        	itemDef.anInt200 = 65297;
        	itemDef.groundActions = new String[5];
        	itemDef.groundActions[2] = "Take";
        	itemDef.itemActions = new String[5];
        	itemDef.itemActions[1] = "Wear";
        	itemDef.itemActions[2] = "Customize";
        	itemDef.modifiedModelColors = new int[4];
        	itemDef.originalModelColors = new int[4];
        	itemDef.modifiedModelColors[0] = 65214; //red
        	itemDef.modifiedModelColors[1] = 65200; // darker red
        	itemDef.modifiedModelColors[2] = 65186; //dark red
        	itemDef.modifiedModelColors[3] = 62995; //darker red
        	itemDef.originalModelColors[0] = 32466;//cape
        	itemDef.originalModelColors[1] = 32466;//cape
        	itemDef.originalModelColors[2] = 42989;//outline
        	itemDef.originalModelColors[3] = 32466;//cape
        	break;
			  case 15000:
	        itemDef.modelID = 65270;
	        itemDef.name = "Completionist cape";
	        itemDef.modelZoom = 1316;
	        itemDef.modelRotationY = 252;
	        itemDef.modelRotationX = 1020;
	        itemDef.modelOffset1 = -1;
	        itemDef.modelOffset2 = 24;
	        itemDef.value = 5000000;
	        itemDef.anInt165 = 65297;
	        itemDef.anInt200 = 65316;
	        itemDef.groundActions = new String[5];
	        itemDef.groundActions[2] = "Take";
	        itemDef.itemActions = new String[5];
	        itemDef.itemActions[1] = "Wear";
	        itemDef.itemActions[2] = "Customise";
	        itemDef.itemActions[3] = "Features";
	        itemDef.itemActions[4] = "Destroy";
	        itemDef.modifiedModelColors = new int[4];
	        itemDef.originalModelColors = new int[4];
	        itemDef.modifiedModelColors[0] = -322;
	        itemDef.modifiedModelColors[1] = -336;
	        itemDef.modifiedModelColors[2] = -350;
	        itemDef.modifiedModelColors[3] = -2541;
	        itemDef.originalModelColors[0] = -322;
	        itemDef.originalModelColors[1] = -336;
	        itemDef.originalModelColors[2] = -350;
	        itemDef.originalModelColors[3] = -2541;
	    break;


				case 15126: 
		            itemDef.name = "Amulet of ranging";
		            itemDef.modelZoom = 848;
		            itemDef.modelRotationY = 310;
		            itemDef.modelRotationX = 175;
		            itemDef.groundActions = (new String[] {
		                null, null, "Take", null, null
		            });
		            itemDef.itemActions = (new String[] {
		                null, "Wear", null, null, "Drop"
		            });
		            itemDef.modelID = 48185;
		            itemDef.anInt165 = 48183;
		            itemDef.anInt200 = 48184;
		            itemDef.anInt196 = 25;
		            itemDef.anInt184 = 125;
		            break;
				
		case 15001:
	        itemDef.modelID = 65273;
	        itemDef.name = "Completionist hood";
	        itemDef.modelZoom = 760;
	        itemDef.modelRotationY = 11;
	        itemDef.modelRotationX = 81;
	        itemDef.modelOffset1 = 1;
	        itemDef.modelOffset2 = -3;
	        itemDef.anInt165 = 65292;
	        itemDef.anInt200 = 65310;
	        itemDef.groundActions = new String[5];
	        itemDef.groundActions[2] = "Take";
	        itemDef.itemActions = new String[5];
	        itemDef.itemActions[1] = "Wear";
	        itemDef.itemActions[4] = "Drop";
	        itemDef.modifiedModelColors = new int[4];
	        itemDef.originalModelColors = new int[4];
	        itemDef.modifiedModelColors[0] = -322;
	        itemDef.modifiedModelColors[1] = -336;
	        itemDef.modifiedModelColors[2] = -350;
	        itemDef.modifiedModelColors[3] = -2541;
	        itemDef.originalModelColors[0] = -322;
	        itemDef.originalModelColors[1] = -336;
	        itemDef.originalModelColors[2] = -350;
	        itemDef.originalModelColors[3] = -2541;
	    break;

		 case 11905:
				itemDef.name = "Trident of the seas (full)";
				itemDef.modelZoom = 2350;
				itemDef.modelRotationY = 1505;
				itemDef.modelRotationX = 1850;
				itemDef.groundActions = new String[] { null, null, "Take", null, null };
				itemDef.itemActions = new String[] { null, "Wield", "Check", "Uncharge", "Drop" };
				itemDef.modelID = 28232;
				itemDef.anInt165 = 28230;
				itemDef.anInt200 = 28230;
				break;

			case 11907:
				itemDef.name = "Trident of the seas";
				itemDef.modelZoom = 2350;
				itemDef.modelRotationY = 1505;
				itemDef.modelRotationX = 1850;
				itemDef.groundActions = new String[] { null, null, "Take", null, null };
				itemDef.itemActions = new String[] { null, "Wield", "Check", "Uncharge", "Drop" };
				itemDef.modelID = 28232;
				itemDef.anInt165 = 28230;
				itemDef.anInt200 = 28230;
				break;

			case 11908:
				itemDef.name = "Uncharged trident";
				itemDef.modelZoom = 2350;
				itemDef.modelRotationY = 1505;
				itemDef.modelRotationX = 1850;
				itemDef.groundActions = new String[] { null, null, "Take", null, null };
				itemDef.itemActions = new String[] { null, "Wield", "Check", null, "Drop" };
				itemDef.modelID = 28232;
				itemDef.anInt165 = 28230;
				itemDef.anInt200 = 28230;
				break;
			case 11998:
				itemDef.name = "Smoke battlestaff";
				itemDef.modelZoom = 2611;
				itemDef.modelRotationY = 360;
			    itemDef.modelRotationX = 1550;
			    itemDef.modelZoom = 2905;
			    itemDef.modelOffset2 = -1;
			    itemDef.modelOffset1 = -4;
				itemDef.groundActions = new String[] { null, null, "Take", null, null };
				itemDef.itemActions = new String[] { null, "Wield", null, null, "Drop" };
				itemDef.modelID = 28440;
				itemDef.anInt165 = 28447;
				itemDef.anInt200 = 28447;
				break;

			

			case 12002:
				itemDef.name = "Occult necklace";
				itemDef.modelZoom = 589;
				itemDef.modelRotationY = 431;
				itemDef.modelRotationX = 81;
				itemDef.modelOffset1 = 3;
				itemDef.modelOffset2 = 21;
				itemDef.groundActions = new String[] { null, null, "Take", null, null };
				itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
				itemDef.modelID = 28438;
				itemDef.anInt165 = 28445;
				itemDef.anInt200 = 28445;
				break;

			case 12006:
				itemDef.name = "Kraken tentacle";
				itemDef.modelZoom = 1095;
				itemDef.modelRotationY = 593;
				itemDef.modelRotationX = 741;
				itemDef.modelOffset2 = 4;
				itemDef.originalModelColors = new int[] { 8097, 9121, 8092, 9118 };
				itemDef.modifiedModelColors = new int[] { 11148, 10772, 10652, 10533 };
				itemDef.groundActions = new String[] { null, null, "Take", null, null };
				itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
				itemDef.modelID = 28437;
				break;
			case 11928:
				itemDef.name = "Odium shard 1";
				itemDef.modelZoom = 1000;
				itemDef.modelRotationY = 1100;
				itemDef.modelRotationX = 1469;
				itemDef.modelOffset1 = -10;
				itemDef.modelOffset2 = 13;
				itemDef.originalModelColors = new int[] { 15252 };
				itemDef.modifiedModelColors = new int[] { 908 };
				itemDef.groundActions = new String[] { null, null, "Take", null, null };
				itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
				itemDef.modelID = 28316;
				break;

			case 11929:
				itemDef.name = "Odium shard 2";
				itemDef.modelZoom = 1000;
				itemDef.modelRotationY = 1100;
				itemDef.modelRotationX = 1469;
				itemDef.modelOffset1 = -16;
				itemDef.modelOffset2 = -11;
				itemDef.originalModelColors = new int[] { 15252 };
				itemDef.modifiedModelColors = new int[] { 908 };
				itemDef.groundActions = new String[] { null, null, "Take", null, null };
				itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
				itemDef.modelID = 28316;
				break;

			case 11930:
				itemDef.name = "Odium shard 3";
				itemDef.modelZoom = 1000;
				itemDef.modelRotationX = 504;
				itemDef.modelOffset1 = 11;
				itemDef.modelOffset2 = -18;
				itemDef.originalModelColors = new int[] { 15252 };
				itemDef.modifiedModelColors = new int[] { 908 };
				itemDef.groundActions = new String[] { null, null, "Take", null, null };
				itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
				itemDef.modelID = 28316;
				break;

			case 11931:
				itemDef.name = "Malediction shard 1";
				itemDef.modelZoom = 1000;
				itemDef.modelRotationY = 1100;
				itemDef.modelRotationX = 1469;
				itemDef.modelOffset1 = -10;
				itemDef.modelOffset2 = 13;
				itemDef.originalModelColors = new int[] { -21608 };
				itemDef.modifiedModelColors = new int[] { 908 };
				itemDef.groundActions = new String[] { null, null, "Take", null, null };
				itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
				itemDef.modelID = 28316;
				break;

			case 11932:
				itemDef.name = "Malediction shard 2";
				itemDef.modelZoom = 1000;
				itemDef.modelRotationY = 1100;
				itemDef.modelRotationX = 1469;
				itemDef.modelOffset1 = -16;
				itemDef.modelOffset2 = -11;
				itemDef.originalModelColors = new int[] { -21608 };
				itemDef.modifiedModelColors = new int[] { 908 };
				itemDef.groundActions = new String[] { null, null, "Take", null, null };
				itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
				itemDef.modelID = 28316;
				break;

			case 11933:
				itemDef.name = "Malediction shard 3";
				itemDef.modelZoom = 1000;
				itemDef.modelRotationX = 504;
				itemDef.modelOffset1 = 11;
				itemDef.modelOffset2 = -18;
				itemDef.originalModelColors = new int[] { -21608 };
				itemDef.modifiedModelColors = new int[] { 908 };
				itemDef.groundActions = new String[] { null, null, "Take", null, null };
				itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
				itemDef.modelID = 28316;
				break;
			case 11924:
				itemDef.name = "Malediction ward";
				itemDef.modelZoom = 1200;
				itemDef.modelRotationY = 568;
				itemDef.modelRotationX = 1836;
				itemDef.modelOffset2 = 3;
				itemDef.originalModelColors = new int[] { -21608 };
				itemDef.modifiedModelColors = new int[] { 908 };
				itemDef.groundActions = new String[] { null, null, "Take", null, null };
				itemDef.itemActions = new String[] { null, "Wield", null, null, "Drop" };
				itemDef.modelID = 9354;
				itemDef.anInt165 = 9347;
				itemDef.anInt200 = 9347;
				break;

			case 11926:
				itemDef.name = "Odium ward";
				itemDef.modelZoom = 1200;
				itemDef.modelRotationY = 568;
				itemDef.modelRotationX = 1836;
				itemDef.modelOffset2 = 3;
				itemDef.originalModelColors = new int[] { 15252 };
				itemDef.modifiedModelColors = new int[] { 908 };
				itemDef.groundActions = new String[] { null, null, "Take", null, null };
				itemDef.itemActions = new String[] { null, "Wield", null, null, "Drop" };
				itemDef.modelID = 9354;
				itemDef.anInt165 = 9347;
				itemDef.anInt200 = 9347;
				break;
			case 15107:
				itemDef.name = "Abyssal tentacle";
				itemDef.modelZoom = 840;
				itemDef.modelRotationY = 280;
				itemDef.modelRotationX = 121;
				itemDef.modelOffset2 = 56;
				itemDef.groundActions = new String[] { null, null, "Take", null, null };
				itemDef.itemActions = new String[] { null, "Wield", null, "Check", "Dissolve" };
				itemDef.modelID = 28439;
				itemDef.anInt165 = 28446;
				itemDef.anInt200 = 28446;
				break;
		       
		        case 11920:
		        	itemDef.name = "Dragon pickaxe";
		        	itemDef.modelZoom = 1070;
		        	itemDef.modelRotationY = 224;
		        	itemDef.modelRotationX = 1056;
		        	itemDef.modelOffset1 = -2;
		        	itemDef.modelOffset2 = -19;
		        	itemDef.groundActions = new String[] { null, null, "Take", null, null };
		        	itemDef.itemActions = new String[] { null, "Wield", null, null, "Drop" };
		        	itemDef.modelID = 28315;
		        	itemDef.anInt165 = 28288;
		        	itemDef.anInt200 = 28288;
		        	break;
			
		case 12637:
			itemDef.name = "Saradomin halo";
			itemDef.modelZoom = 550;
			itemDef.modelRotationY = 228;
			itemDef.modelRotationX = 141;
			itemDef.modelOffset1 = 3;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 28844;
			itemDef.anInt165 = 27630;
			itemDef.anInt200 = 28833;
			break;

		case 12638:
			itemDef.name = "Zamorak halo";
			itemDef.modelZoom = 528;
			itemDef.modelRotationY = 327;
			itemDef.modelRotationX = 213;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 = 12;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 28838;
			itemDef.anInt165 = 27643;
			itemDef.anInt200 = 28832;
			break;

		case 12639:
			itemDef.name = "Guthix halo";
			itemDef.modelZoom = 528;
			itemDef.modelRotationY = 294;
			itemDef.modelRotationX = 123;
			itemDef.modelOffset2 = 20;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 28837;
			itemDef.anInt165 = 27642;
			itemDef.anInt200 = 28831;
			break;

		
		case 11770:
			itemDef.name = "Seers ring (i)";
			itemDef.modelZoom = 620;
			itemDef.modelRotationY = 340;
			itemDef.modelRotationX = 1940;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 = -13;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, "Uncharge", "Drop" };
			itemDef.modelID = 9932;
			break;

		case 11771:
			itemDef.name = "Archers ring (i)";
			itemDef.modelZoom = 630;
			itemDef.modelRotationY = 332;
			itemDef.modelRotationX = 1904;
			itemDef.modelOffset1 = 4;
			itemDef.modelOffset2 = -14;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, "Uncharge", "Drop" };
			itemDef.modelID = 9930;
			break;

		case 11772:
			itemDef.name = "Warrior ring (i)";
			itemDef.modelZoom = 570;
			itemDef.modelRotationY = 348;
			itemDef.modelRotationX = 1776;
			itemDef.modelOffset1 = 2;
			itemDef.modelOffset2 = -6;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, "Uncharge", "Drop" };
			itemDef.modelID = 9933;
			break;

		case 11773:
			itemDef.name = "Berserker ring (i)";
			itemDef.modelZoom = 600;
			itemDef.modelRotationY = 324;
			itemDef.modelRotationX = 1916;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 = -15;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, "Uncharge", "Drop" };
			itemDef.modelID = 9931;
			break;

		case 11784:
			itemDef.name = "Black mask";
			itemDef.modelZoom = 854;
			itemDef.modelRotationY = 387;
			itemDef.modelRotationX = 1892;
			itemDef.modelOffset1 = -1;
			itemDef.modelOffset2 = 3;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, "Uncharge", "Drop" };
			itemDef.modelID = 15615;
			itemDef.anInt165 = 15935;
			itemDef.anInt200 = 15946;
			break;
			
		case 12598:
			itemDef.name = "Holy sandals";
			itemDef.modelZoom = 848;
			itemDef.modelRotationY = 363;
			itemDef.modelRotationX = 120;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 28815;
			itemDef.anInt165 = 28811;
			itemDef.anInt200 = 28814;
			break;

		case 12600:
			itemDef.name = "Druidic wreath";
			itemDef.modelZoom = 526;
			itemDef.modelRotationY = 2047;
			itemDef.modelRotationX = 916;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = -1;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", "Check rank", null, "Destroy" };
			itemDef.modelID = 28822;
			itemDef.anInt165 = 28817;
			itemDef.anInt200 = 28818;
			break;

		case 12601:
			itemDef.name = "Ring of the gods";
			itemDef.modelZoom = 900;
			itemDef.modelRotationY = 393;
			itemDef.modelRotationX = 1589;
			itemDef.modelOffset1 = -9;
			itemDef.modelOffset2 = -12;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 28824;
			break;
		case 11943:
			itemDef.name = "Lava dragon bones";
			itemDef.modelZoom = 1830;
			itemDef.modelRotationY = 216;
			itemDef.modelRotationX = 648;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { "Bury", null, null, null, "Drop" };
			itemDef.modelID = 28318;
			break;
		case 11980:
			itemDef.name = "Ring of wealth (5)";
			itemDef.modelZoom = 830;
			itemDef.modelRotationY = 322;
			itemDef.modelRotationX = 135;
			itemDef.modelOffset1 = -1;
			itemDef.modelOffset2 = 1;
			itemDef.originalModelColors = new int[] { -14425 };
			itemDef.modifiedModelColors = new int[] { 127 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, "Rub", "Drop" };
			itemDef.modelID = 2677;
			break;

		case 11982:
			itemDef.name = "Ring of wealth (4)";
			itemDef.modelZoom = 830;
			itemDef.modelRotationY = 322;
			itemDef.modelRotationX = 135;
			itemDef.modelOffset1 = -1;
			itemDef.modelOffset2 = 1;
			itemDef.originalModelColors = new int[] { -14425 };
			itemDef.modifiedModelColors = new int[] { 127 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, "Rub", "Drop" };
			itemDef.modelID = 2677;
			break;

		case 11984:
			itemDef.name = "Ring of wealth (3)";
			itemDef.modelZoom = 830;
			itemDef.modelRotationY = 322;
			itemDef.modelRotationX = 135;
			itemDef.modelOffset1 = -1;
			itemDef.modelOffset2 = 1;
			itemDef.originalModelColors = new int[] { -14425 };
			itemDef.modifiedModelColors = new int[] { 127 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, "Rub", "Drop" };
			itemDef.modelID = 2677;
			break;

		case 11986:
			itemDef.name = "Ring of wealth (2)";
			itemDef.modelZoom = 830;
			itemDef.modelRotationY = 322;
			itemDef.modelRotationX = 135;
			itemDef.modelOffset1 = -1;
			itemDef.modelOffset2 = 1;
			itemDef.originalModelColors = new int[] { -14425 };
			itemDef.modifiedModelColors = new int[] { 127 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, "Rub", "Drop" };
			itemDef.modelID = 2677;
			break;

		case 11988:
			itemDef.name = "Ring of wealth (1)";
			itemDef.modelZoom = 830;
			itemDef.modelRotationY = 322;
			itemDef.modelRotationX = 135;
			itemDef.modelOffset1 = -1;
			itemDef.modelOffset2 = 1;
			itemDef.originalModelColors = new int[] { -14425 };
			itemDef.modifiedModelColors = new int[] { 127 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, "Rub", "Drop" };
			itemDef.modelID = 2677;
			break;
		case 14007: 
			itemDef.name = "Pet chaos elemental"; 
			 itemDef.modelZoom = 5500;
             itemDef.modelRotationY = 175;
             itemDef.modelRotationX = 200;
             itemDef.modelOffset1 = 0;
             itemDef.modelOffset2 = 0;
             itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
             itemDef.description = "D'aw look at the liddle...".getBytes();
             itemDef.modelID = 11216;
             break;
	    case 14000: 
	        itemDef.name = "Pet kree'arra";
	        itemDef.itemActions = new String[] { null, null, null, null, "Hatch" };
	        itemDef.modelZoom = 550;
	        itemDef.modelRotationY = 76;
	        itemDef.modelRotationX = 16;
	        itemDef.modelOffset1 = 0;
	        itemDef.modelOffset2 = 0;
	        itemDef.modelID = 7171;
	        itemDef.modifiedModelColors = new int[] { 476 };
	        itemDef.originalModelColors = new int[] { 491770 };
	        break;
	      case 14001: 
	        itemDef.name = "Pet general graardor";
	        itemDef.itemActions = new String[] { null, null, null, null, "Hatch" };
	        itemDef.modelZoom = 550;
	        itemDef.modelRotationY = 76;
	        itemDef.modelRotationX = 16;
	        itemDef.modelOffset1 = 0;
	        itemDef.modelOffset2 = 0;
	        itemDef.modelID = 7171;
	        itemDef.modifiedModelColors = new int[] { 476 };
	        itemDef.originalModelColors = new int[] { 479770 };
	        break;
	      case 14002: 
	        itemDef.name = "Pet k'ril tsutsaroth ";
	        itemDef.itemActions = new String[] { null, null, null, null, "Hatch" };
	        itemDef.modelZoom = 550;
	        itemDef.modelRotationY = 76;
	        itemDef.modelRotationX = 16;
	        itemDef.modelOffset1 = 0;
	        itemDef.modelOffset2 = 0;
	        itemDef.modelID = 7171;
	        break;
	      case 14003: 
	        itemDef.name = "Pet zilyana";
	        itemDef.itemActions = new String[] { null, null, null, null, "Hatch" };
	        itemDef.modelZoom = 550;
	        itemDef.modelRotationY = 76;
	        itemDef.modelRotationX = 16;
	        itemDef.modelOffset1 = 0;
	        itemDef.modelOffset2 = 0;
	        itemDef.modelID = 7171;
	        itemDef.modifiedModelColors = new int[] { 476 };
	        itemDef.originalModelColors = new int[] { 428770 };
	        break;
	      case 14004: 
	        itemDef.name = "Prince black dragon";
	        itemDef.itemActions = new String[] { null, null, null, null, "Hatch" };
	        itemDef.modelZoom = 550;
	        itemDef.modelRotationY = 76;
	        itemDef.modelRotationX = 16;
	        itemDef.modelOffset1 = 0;
	        itemDef.modelOffset2 = 0;
	        itemDef.modelID = 7171;
	        itemDef.modifiedModelColors = new int[] { 476 };
	        itemDef.originalModelColors = new int[] { 0 };
	        break;
	    
	      case 14010: 
	        itemDef.name = "Pet kraken";
	        itemDef.itemActions = new String[] { null, null, null, null, "Hatch" };
	        itemDef.modelZoom = 550;
	        itemDef.modelRotationY = 76;
	        itemDef.modelRotationX = 16;
	        itemDef.modelOffset1 = 0;
	        itemDef.modelOffset2 = 0;
	        itemDef.modelID = 7171;
	        itemDef.modifiedModelColors = new int[] { 476 };
	        itemDef.originalModelColors = new int[] { 419770 };
	        break;
	      case 14011: 
		        itemDef.name = "Pet ahrim";
		        itemDef.itemActions = new String[] { null, null, null, null, "Hatch" };
		        itemDef.modelZoom = 550;
		        itemDef.modelRotationY = 76;
		        itemDef.modelRotationX = 16;
		        itemDef.modelOffset1 = 0;
		        itemDef.modelOffset2 = 0;
		        itemDef.modelID = 7171;
		        itemDef.modifiedModelColors = new int[] { 476 };
		        itemDef.originalModelColors = new int[] { 129770 };
		        break;
	      case 14012: 
		        itemDef.name = "Pet verac";
		        itemDef.itemActions = new String[] { null, null, null, null, "Hatch" };
		        itemDef.modelZoom = 550;
		        itemDef.modelRotationY = 76;
		        itemDef.modelRotationX = 16;
		        itemDef.modelOffset1 = 0;
		        itemDef.modelOffset2 = 0;
		        itemDef.modelID = 7171;
		        itemDef.modifiedModelColors = new int[] { 476 };
		        itemDef.originalModelColors = new int[] { 429770 };
		        break;
	      case 14013: 
		        itemDef.name = "Pet guthan";
		        itemDef.itemActions = new String[] { null, null, null, null, "Hatch" };
		        itemDef.modelZoom = 550;
		        itemDef.modelRotationY = 76;
		        itemDef.modelRotationX = 16;
		        itemDef.modelOffset1 = 0;
		        itemDef.modelOffset2 = 0;
		        itemDef.modelID = 7171;
		        itemDef.modifiedModelColors = new int[] { 476 };
		        itemDef.originalModelColors = new int[] { 549770 };
		        break;
	      case 14014: 
		        itemDef.name = "Pet torag";
		        itemDef.itemActions = new String[] { null, null, null, null, "Hatch" };
		        itemDef.modelZoom = 550;
		        itemDef.modelRotationY = 76;
		        itemDef.modelRotationX = 16;
		        itemDef.modelOffset1 = 0;
		        itemDef.modelOffset2 = 0;
		        itemDef.modelID = 7171;
		        itemDef.modifiedModelColors = new int[] { 476 };
		        itemDef.originalModelColors = new int[] { 479770 };
		        break;
	      case 14015: 
		        itemDef.name = "Pet dharok";
		        itemDef.itemActions = new String[] { null, null, null, null, "Hatch" };
		        itemDef.modelZoom = 550;
		        itemDef.modelRotationY = 76;
		        itemDef.modelRotationX = 16;
		        itemDef.modelOffset1 = 0;
		        itemDef.modelOffset2 = 0;
		        itemDef.modelID = 7171;
		        itemDef.modifiedModelColors = new int[] { 476 };
		        itemDef.originalModelColors = new int[] { 459770 };
		        break;
	      case 14016: 
		        itemDef.name = "Pet karil";
		        itemDef.itemActions = new String[] { null, null, null, null, "Hatch" };
		        itemDef.modelZoom = 550;
		        itemDef.modelRotationY = 76;
		        itemDef.modelRotationX = 16;
		        itemDef.modelOffset1 = 0;
		        itemDef.modelOffset2 = 0;
		        itemDef.modelID = 7171;
		        itemDef.modifiedModelColors = new int[] { 476 };
		        itemDef.originalModelColors = new int[] { 439770 };
		        break;
	      case 13081: 
	          itemDef.name = "Accessory Mystery Box";
	          itemDef.modelZoom = 1180;
	          itemDef.modelRotationY = 160;
	          itemDef.modelRotationX = 172;
	          itemDef.modifiedModelColors = new int[] { 22410, 2999 };
	          itemDef.originalModelColors = new int[] { 302770, 296770 };
	          itemDef.modelOffset2 = -10;
	          itemDef.groundActions = new String[] { null, null, "Take", null, null };
	          itemDef.itemActions = new String[] { "Open", null, null, null, "Drop" };
	          itemDef.modelID = 2426;
	          break;
	        case 13082: 
	          itemDef.name = "Weapon Mystery Box";
	          itemDef.modelZoom = 1180;
	          itemDef.modelRotationY = 160;
	          itemDef.modelRotationX = 172;
	          itemDef.modifiedModelColors = new int[] { 22410, 2999 };
	          itemDef.originalModelColors = new int[] { 130770, 353770 };
	          itemDef.modelOffset2 = -10;
	          itemDef.groundActions = new String[] { null, null, "Take", null, null };
	          itemDef.itemActions = new String[] { "Open", null, null, null, "Drop" };
	          itemDef.modelID = 2426;
	          break;
	        case 13083: 
	          itemDef.name = "Armour Mystery Box";
	          itemDef.modelZoom = 1180;
	          itemDef.modelRotationY = 160;
	          itemDef.modelRotationX = 172;
	          itemDef.modifiedModelColors = new int[] { 22410, 2999 };
	          itemDef.originalModelColors = new int[] { 210770, 311770 };
	          itemDef.modelOffset2 = -10;
	          itemDef.groundActions = new String[] { null, null, "Take", null, null };
	          itemDef.itemActions = new String[] { "Open", null, null, null, "Drop" };
	          itemDef.modelID = 2426;
	          break;
	        case 13084: 
	          itemDef.name = "Special Mystery Box";
	          itemDef.modelZoom = 1180;
	          itemDef.modelRotationY = 160;
	          itemDef.modelRotationX = 172;
	          itemDef.modifiedModelColors = new int[] { 22410, 2999 };
	          itemDef.originalModelColors = new int[] { 374770, 87770 };
	          itemDef.modelOffset2 = -10;
	          itemDef.groundActions = new String[] { null, null, "Take", null, null };
	          itemDef.itemActions = new String[] { "Open", null, null, null, "Drop" };
	          itemDef.modelID = 2426;
	          break;
	        case 13085: 
	          itemDef.name = "Barrows Mystery Box";
	          itemDef.modelZoom = 1180;
	          itemDef.modelRotationY = 160;
	          itemDef.modelRotationX = 172;
	          itemDef.modifiedModelColors = new int[] { 22410, 2999 };
	          itemDef.originalModelColors = new int[] { 356770, 266770 };
	          itemDef.modelOffset2 = -10;
	          itemDef.groundActions = new String[] { null, null, "Take", null, null };
	          itemDef.itemActions = new String[] { "Open", null, null, null, "Drop" };
	          itemDef.modelID = 2426;
	          break;
	        case 5520: 
	        	itemDef.name = "Vote book";
	        	itemDef.itemActions = new String[] { null, "Claim", null, null, "Drop" };
	            break;
case 12193:
	itemDef.name = "Ancient robe top";
	itemDef.modelZoom = 1221;
	itemDef.modelRotationY = 619;
	itemDef.modelRotationX = 0;
	itemDef.originalModelColors = new int[] { -21612, -21620, -22221 };
	itemDef.modifiedModelColors = new int[] { 916, 908, 307 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28747;
	itemDef.anInt165 = 28536;
	itemDef.anInt188 = 28527;
	itemDef.anInt200 = 28600;
	itemDef.anInt164 = 28594;
	break;

case 12195:
	itemDef.name = "Ancient robe legs";
	itemDef.modelRotationY = 525;
	itemDef.modelRotationX = 0;
	itemDef.originalModelColors = new int[] { -21612, -21620, -22221 };
	itemDef.modifiedModelColors = new int[] { 916, 908, 307 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28655;
	itemDef.anInt165 = 28500;
	itemDef.anInt200 = 28571;
	break;

case 12197:
	itemDef.name = "Ancient cloak";
	itemDef.modelZoom = 1827;
	itemDef.modelRotationY = 364;
	itemDef.modelRotationX = 992;
	itemDef.modelOffset1 = 3;
	itemDef.modelOffset2 = 12;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28728;
	itemDef.anInt165 = 28490;
	itemDef.anInt200 = 28563;
	break;

case 12199:
	itemDef.name = "Ancient crozier";
	itemDef.modelZoom = 2151;
	itemDef.modelRotationY = 567;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = 3;
	itemDef.modelOffset2 = 4;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wield", null, null, "Drop" };
	itemDef.modelID = 28690;
	itemDef.anInt165 = 28624;
	itemDef.anInt200 = 28624;
	break;

case 12201:
	itemDef.name = "Ancient stole";
	itemDef.modelZoom = 1697;
	itemDef.modelRotationY = 373;
	itemDef.modelRotationX = 73;
	itemDef.modelOffset1 = 9;
	itemDef.modelOffset2 = -8;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28652;
	itemDef.anInt165 = 28481;
	itemDef.anInt200 = 28559;
	break;

case 12203:
	itemDef.name = "Ancient mitre";
	itemDef.modelZoom = 659;
	itemDef.modelRotationY = 184;
	itemDef.modelRotationX = 225;
	itemDef.modelOffset1 = -3;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28701;
	itemDef.anInt165 = 28511;
	itemDef.anInt188 = 230;
	itemDef.anInt164 = 403;
	break;

case 12205:
	itemDef.name = "Bronze platebody (g)";
	itemDef.modelZoom = 1180;
	itemDef.modelRotationY = 452;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = -1;
	itemDef.originalModelColors = new int[] { 5652, 7050, 7114 };
	itemDef.modifiedModelColors = new int[] { 61, 41, 24 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2378;
	itemDef.anInt165 = 3379;
	itemDef.anInt188 = 164;
	itemDef.anInt200 = 3383;
	itemDef.anInt164 = 344;
	break;
   

case 12207:
	itemDef.name = "Bronze platelegs (g)";
	itemDef.modelZoom = 1740;
	itemDef.modelRotationY = 444;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -8;
	itemDef.originalModelColors = new int[] { 5652, 7050, 7114 };
	itemDef.modifiedModelColors = new int[] { 61, 41, 57 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2582;
	itemDef.anInt165 = 268;
	itemDef.anInt200 = 432;
	break;

case 12209:
	itemDef.name = "Bronze plateskirt (g)";
	itemDef.modelZoom = 1100;
	itemDef.modelRotationY = 620;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = 5;
	itemDef.modelOffset2 = 5;
	itemDef.originalModelColors = new int[] { 5652, 7050, 7114, 7050 };
	itemDef.modifiedModelColors = new int[] { 61, 41, 57, 25238 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 4208;
	itemDef.anInt165 = 4206;
	itemDef.anInt200 = 4207;
	break;

case 12211:
	itemDef.name = "Bronze full helm (g)";
	itemDef.modelZoom = 800;
	itemDef.modelRotationY = 160;
	itemDef.modelRotationX = 152;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = 6;
	itemDef.originalModelColors = new int[] { 5652, 7114 };
	itemDef.modifiedModelColors = new int[] { 61, 926 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2813;
	itemDef.anInt165 = 218;
	itemDef.anInt200 = 394;
	break;

case 12213:
	itemDef.name = "Bronze kiteshield (g)";
	itemDef.modelZoom = 1560;
	itemDef.modelRotationY = 344;
	itemDef.modelRotationX = 1104;
	itemDef.modelOffset1 = -6;
	itemDef.modelOffset2 = -14;
	itemDef.originalModelColors = new int[] { 5652, 7114, 7114 };
	itemDef.modifiedModelColors = new int[] { 61, 7054, 57 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2339;
	itemDef.anInt165 = 486;
	itemDef.anInt200 = 486;
	break;

case 12215:
	itemDef.name = "Bronze platebody (t)";
	itemDef.modelZoom = 1180;
	itemDef.modelRotationY = 452;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = -1;
	itemDef.originalModelColors = new int[] { 5652, 7050, 9758 };
	itemDef.modifiedModelColors = new int[] { 61, 41, 24 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2378;
	itemDef.anInt165 = 3379;
	itemDef.anInt188 = 164;
	itemDef.anInt200 = 3383;
	itemDef.anInt164 = 344;
	break;

case 12217:
	itemDef.name = "Bronze platelegs (t)";
	itemDef.modelZoom = 1740;
	itemDef.modelRotationY = 444;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -8;
	itemDef.originalModelColors = new int[] { 5652, 7050, 9758 };
	itemDef.modifiedModelColors = new int[] { 61, 41, 57 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2582;
	itemDef.anInt165 = 268;
	itemDef.anInt200 = 432;
	break;

case 12219:
	itemDef.name = "Bronze plateskirt (t)";
	itemDef.modelZoom = 1100;
	itemDef.modelRotationY = 620;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = 5;
	itemDef.modelOffset2 = 5;
	itemDef.originalModelColors = new int[] { 5652, 7050, 9758, 7050 };
	itemDef.modifiedModelColors = new int[] { 61, 41, 57, 25238 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 4208;
	itemDef.anInt165 = 4206;
	itemDef.anInt200 = 4207;
	break;

case 12221:
	itemDef.name = "Bronze full helm (t)";
	itemDef.modelZoom = 800;
	itemDef.modelRotationY = 160;
	itemDef.modelRotationX = 152;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = 6;
	itemDef.originalModelColors = new int[] { 5652, 9758 };
	itemDef.modifiedModelColors = new int[] { 61, 926 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2813;
	itemDef.anInt165 = 218;
	itemDef.anInt200 = 394;
	break;

case 12223:
	itemDef.name = "Bronze kiteshield (t)";
	itemDef.modelZoom = 1560;
	itemDef.modelRotationY = 344;
	itemDef.modelRotationX = 1104;
	itemDef.modelOffset1 = -6;
	itemDef.modelOffset2 = -14;
	itemDef.originalModelColors = new int[] { 5652, 9758, 9758 };
	itemDef.modifiedModelColors = new int[] { 61, 7054, 57 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2339;
	itemDef.anInt165 = 486;
	itemDef.anInt200 = 486;
	break;

case 12225:
	itemDef.name = "Iron platebody (t)";
	itemDef.modelZoom = 1180;
	itemDef.modelRotationY = 452;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = -1;
	itemDef.originalModelColors = new int[] { 33, -22502, 0 };
	itemDef.modifiedModelColors = new int[] { 61, 41, 24 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2378;
	itemDef.anInt165 = 3379;
	itemDef.anInt188 = 164;
	itemDef.anInt200 = 3383;
	itemDef.anInt164 = 344;
	break;

case 12227:
	itemDef.name = "Iron platelegs (t)";
	itemDef.modelZoom = 1740;
	itemDef.modelRotationY = 444;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -8;
	itemDef.originalModelColors = new int[] { 33, 24, 0 };
	itemDef.modifiedModelColors = new int[] { 61, 41, 57 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2582;
	itemDef.anInt165 = 268;
	itemDef.anInt200 = 432;
	break;

case 12229:
	itemDef.name = "Iron plateskirt (t)";
	itemDef.modelZoom = 1100;
	itemDef.modelRotationY = 620;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = 5;
	itemDef.modelOffset2 = 5;
	itemDef.originalModelColors = new int[] { 33, 24, 0, 24 };
	itemDef.modifiedModelColors = new int[] { 61, 41, 57, 25238 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 4208;
	itemDef.anInt165 = 4206;
	itemDef.anInt200 = 4207;
	break;

case 12231:
	itemDef.name = "Iron full helm (t)";
	itemDef.modelZoom = 800;
	itemDef.modelRotationY = 160;
	itemDef.modelRotationX = 152;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = 6;
	itemDef.originalModelColors = new int[] { 33, 0 };
	itemDef.modifiedModelColors = new int[] { 61, 926 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2813;
	itemDef.anInt165 = 218;
	itemDef.anInt200 = 394;
	break;

case 12233:
	itemDef.name = "Iron kiteshield (t)";
	itemDef.modelZoom = 1560;
	itemDef.modelRotationY = 344;
	itemDef.modelRotationX = 1104;
	itemDef.modelOffset1 = -6;
	itemDef.modelOffset2 = -14;
	itemDef.originalModelColors = new int[] { 33, 0, 0 };
	itemDef.modifiedModelColors = new int[] { 61, 7054, 57 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2339;
	itemDef.anInt165 = 486;
	itemDef.anInt200 = 486;
	break;

case 12235:
	itemDef.name = "Iron platebody (g)";
	itemDef.modelZoom = 1180;
	itemDef.modelRotationY = 452;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = -1;
	itemDef.originalModelColors = new int[] { 33, -22502, 7114 };
	itemDef.modifiedModelColors = new int[] { 61, 41, 24 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2378;
	itemDef.anInt165 = 3379;
	itemDef.anInt188 = 164;
	itemDef.anInt200 = 3383;
	itemDef.anInt164 = 344;
	break;

case 12237:
	itemDef.name = "Iron platelegs (g)";
	itemDef.modelZoom = 1740;
	itemDef.modelRotationY = 444;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -8;
	itemDef.originalModelColors = new int[] { 33, 24, 7114 };
	itemDef.modifiedModelColors = new int[] { 61, 41, 57 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2582;
	itemDef.anInt165 = 268;
	itemDef.anInt200 = 432;
	break;

case 12239:
	itemDef.name = "Iron plateskirt (g)";
	itemDef.modelZoom = 1100;
	itemDef.modelRotationY = 620;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = 5;
	itemDef.modelOffset2 = 5;
	itemDef.originalModelColors = new int[] { 33, 24, 7114, 24 };
	itemDef.modifiedModelColors = new int[] { 61, 41, 57, 25238 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 4208;
	itemDef.anInt165 = 4206;
	itemDef.anInt200 = 4207;
	break;

case 12241:
	itemDef.name = "Iron full helm (g)";
	itemDef.modelZoom = 800;
	itemDef.modelRotationY = 160;
	itemDef.modelRotationX = 152;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = 6;
	itemDef.originalModelColors = new int[] { 33, 7114 };
	itemDef.modifiedModelColors = new int[] { 61, 926 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2813;
	itemDef.anInt165 = 218;
	itemDef.anInt200 = 394;
	break;

case 12243:
	itemDef.name = "Iron kiteshield (g)";
	itemDef.modelZoom = 1560;
	itemDef.modelRotationY = 344;
	itemDef.modelRotationX = 1104;
	itemDef.modelOffset1 = -6;
	itemDef.modelOffset2 = -14;
	itemDef.originalModelColors = new int[] { 33, 7114, 7114 };
	itemDef.modifiedModelColors = new int[] { 61, 7054, 57 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2339;
	itemDef.anInt165 = 486;
	itemDef.anInt200 = 486;
	break;



case 12247:
	itemDef.name = "Red beret";
	itemDef.modelZoom = 560;
	itemDef.modelRotationY = 136;
	itemDef.modelRotationX = 1936;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = -4;
	itemDef.originalModelColors = new int[] { -93 };
	itemDef.modifiedModelColors = new int[] { 10659 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 3373;
	itemDef.anInt165 = 198;
	itemDef.anInt200 = 373;
	break;


case 12253:
	itemDef.name = "Armadyl robe top";
	itemDef.modelZoom = 1190;
	itemDef.modelRotationY = 476;
	itemDef.modelRotationX = 0;
	itemDef.originalModelColors = new int[] { -21612, -21620, -22221 };
	itemDef.modifiedModelColors = new int[] { 916, 908, 307 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28695;
	itemDef.anInt165 = 28542;
	itemDef.anInt165 = 28529;
	itemDef.anInt200 = 28604;
	itemDef.anInt200 = 28593;
	break;

case 12255:
	itemDef.name = "Armadyl robe legs";
	itemDef.modelZoom = 1957;
	itemDef.modelRotationY = 444;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -5;
	itemDef.originalModelColors = new int[] { -21612, -21620, -22221 };
	itemDef.modifiedModelColors = new int[] { 916, 908, 307 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28689;
	itemDef.anInt165 = 28501;
	itemDef.anInt200 = 28564;
	break;

case 12259:
	itemDef.name = "Armadyl mitre";
	itemDef.modelZoom = 659;
	itemDef.modelRotationY = 184;
	itemDef.modelRotationX = 225;
	itemDef.modelOffset1 = -3;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28683;
	itemDef.anInt165 = 28510;
	itemDef.anInt188 = 230;
	itemDef.anInt200 = 28579;
	itemDef.anInt164 = 403;
	break;

case 12261:
	itemDef.name = "Armadyl cloak";
	itemDef.modelZoom = 1827;
	itemDef.modelRotationY = 364;
	itemDef.modelRotationX = 992;
	itemDef.modelOffset1 = 3;
	itemDef.modelOffset2 = 12;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28673;
	itemDef.anInt165 = 28484;
	itemDef.anInt200 = 28562;
	break;

case 12263:
	itemDef.name = "Armadyl crozier";
	itemDef.modelZoom = 2151;
	itemDef.modelRotationY = 567;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = 3;
	itemDef.modelOffset2 = 4;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wield", null, null, "Drop" };
	itemDef.modelID = 28680;
	itemDef.anInt165 = 28620;
	itemDef.anInt200 = 28620;
	break;

case 12265:
	itemDef.name = "Bandos robe top";
	itemDef.modelZoom = 1190;
	itemDef.modelRotationY = 476;
	itemDef.modelRotationX = 0;
	itemDef.originalModelColors = new int[] { -21612, -21620, -22221 };
	itemDef.modifiedModelColors = new int[] { 916, 908, 307 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28722;
	itemDef.anInt165 = 28533;
	itemDef.anInt188 = 28523;
	itemDef.anInt200 = 28605;
	itemDef.anInt164 = 28596;
	break;

case 12267:
	itemDef.name = "Bandos robe legs";
	itemDef.modelZoom = 1957;
	itemDef.modelRotationY = 444;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -5;
	itemDef.originalModelColors = new int[] { -21612, -21620, -22221 };
	itemDef.modifiedModelColors = new int[] { 916, 908, 307 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28686;
	itemDef.anInt165 = 28496;
	itemDef.anInt200 = 28572;
	break;

case 12269:
	itemDef.name = "Bandos stole";
	itemDef.modelZoom = 1697;
	itemDef.modelRotationY = 373;
	itemDef.modelRotationX = 73;
	itemDef.modelOffset1 = 9;
	itemDef.modelOffset2 = -8;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28688;
	itemDef.anInt165 = 28482;
	itemDef.anInt200 = 28557;
	break;

case 12271:
	itemDef.name = "Bandos mitre";
	itemDef.modelZoom = 659;
	itemDef.modelRotationY = 184;
	itemDef.modelRotationX = 225;
	itemDef.modelOffset1 = -3;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28740;
	itemDef.anInt165 = 28513;
	itemDef.anInt188 = 230;
	itemDef.anInt200 = 28580;
	itemDef.anInt164 = 403;
	break;

case 12273:
	itemDef.name = "Bandos cloak";
	itemDef.modelZoom = 1827;
	itemDef.modelRotationY = 364;
	itemDef.modelRotationX = 992;
	itemDef.modelOffset1 = 3;
	itemDef.modelOffset2 = 12;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28677;
	itemDef.anInt165 = 28489;
	itemDef.anInt200 = 28561;
	break;

case 12275:
	itemDef.name = "Bandos crozier";
	itemDef.modelZoom = 2151;
	itemDef.modelRotationY = 567;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = 3;
	itemDef.modelOffset2 = 4;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wield", null, null, "Drop" };
	itemDef.modelID = 28640;
	itemDef.anInt165 = 28627;
	itemDef.anInt200 = 28627;
	break;

case 12277:
	itemDef.name = "Mithril platebody (g)";
	itemDef.modelZoom = 1180;
	itemDef.modelRotationY = 452;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = -1;
	itemDef.originalModelColors = new int[] { -22239, -22254, 7114 };
	itemDef.modifiedModelColors = new int[] { 61, 41, 24 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2378;
	itemDef.anInt165 = 3379;
	itemDef.anInt188 = 164;
	itemDef.anInt200 = 3383;
	itemDef.anInt164 = 344;
	break;

case 12279:
	itemDef.name = "Mithril platelegs (g)";
	itemDef.modelZoom = 1740;
	itemDef.modelRotationY = 444;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -8;
	itemDef.originalModelColors = new int[] { -22239, -22254, 7114 };
	itemDef.modifiedModelColors = new int[] { 61, 41, 57 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2582;
	itemDef.anInt165 = 268;
	itemDef.anInt200 = 432;
	break;

case 12281:
	itemDef.name = "Mithril kiteshield (g)";
	itemDef.modelZoom = 1560;
	itemDef.modelRotationY = 344;
	itemDef.modelRotationX = 1104;
	itemDef.modelOffset1 = -6;
	itemDef.modelOffset2 = -14;
	itemDef.originalModelColors = new int[] { -22239, 7114, 7114 };
	itemDef.modifiedModelColors = new int[] { 61, 57, 7054 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2339;
	itemDef.anInt165 = 486;
	itemDef.anInt200 = 486;
	break;

case 12283:
	itemDef.name = "Mithril full helm (g)";
	itemDef.modelZoom = 800;
	itemDef.modelRotationY = 160;
	itemDef.modelRotationX = 152;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = 6;
	itemDef.originalModelColors = new int[] { -22239, 7114 };
	itemDef.modifiedModelColors = new int[] { 61, 926 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2813;
	itemDef.anInt165 = 218;
	itemDef.anInt200 = 394;
	break;

case 12285:
	itemDef.name = "Mithril plateskirt (g)";
	itemDef.modelZoom = 1100;
	itemDef.modelRotationY = 620;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = 5;
	itemDef.modelOffset2 = 5;
	itemDef.originalModelColors = new int[] { -22239, -22254, 7114 };
	itemDef.modifiedModelColors = new int[] { 61, 25238, 57 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 4208;
	itemDef.anInt165 = 4206;
	itemDef.anInt200 = 4207;
	break;

case 12287:
	itemDef.name = "Mithril platebody (t)";
	itemDef.modelZoom = 1250;
	itemDef.modelRotationY = 488;
	itemDef.modelRotationX = 0;//yeh but what does the 0 do indeed
	itemDef.modelOffset1 = -1;
	itemDef.originalModelColors = new int[] { -22239, -22254, -27310 };
	itemDef.modifiedModelColors = new int[] { 61, 41, 24 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2378;
	itemDef.anInt165 = 3379;
	itemDef.anInt188 = 164;
	itemDef.anInt200 = 3383;
	itemDef.anInt164 = 344;
	break;

case 12289:
	itemDef.name = "Mithril platelegs (t)";
	itemDef.modelZoom = 1740;
	itemDef.modelRotationY = 444;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -8;
	itemDef.originalModelColors = new int[] { -22239, -22254, -27310 };
	itemDef.modifiedModelColors = new int[] { 61, 41, 57 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2582;
	itemDef.anInt165 = 268;
	itemDef.anInt200 = 432;
	break;

case 12291:
	itemDef.name = "Mithril kiteshield (t)";
	itemDef.modelZoom = 1560;
	itemDef.modelRotationY = 344;
	itemDef.modelRotationX = 1104;
	itemDef.modelOffset1 = -6;
	itemDef.modelOffset2 = -14;
	itemDef.originalModelColors = new int[] { -22239, -27310, -27310 };
	itemDef.modifiedModelColors = new int[] { 61, 57, 7054 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2339;
	itemDef.anInt165 = 486;
	itemDef.anInt200 = 486;
	break;
case 12414:
	itemDef.name = "Dragon chainbody (g)";
	itemDef.modelZoom = 1100;
	itemDef.modelRotationY = 568;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = 2;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Dismantle" };
	itemDef.modelID = 28712;
	itemDef.anInt165 = 28540;
	itemDef.anInt188 = 156;
	itemDef.anInt200 = 28614;
	itemDef.anInt164 = 337;
	break;

case 12415:
	itemDef.name = "Dragon platelegs (g)";
	itemDef.modelZoom = 1740;
	itemDef.modelRotationY = 444;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -8;
	itemDef.originalModelColors = new int[] { 7114, 7114 };
	itemDef.modifiedModelColors = new int[] { 912, 908 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Dismantle" };
	itemDef.modelID = 5026;
	itemDef.anInt165 = 5024;
	itemDef.anInt200 = 5025;
	break;
//useless
case 12416:
	itemDef.name = "Dragon plateskirt (g)";
	itemDef.modelZoom = 1230;
	itemDef.modelRotationY = 584;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = 4;
	itemDef.modelOffset2 = 15;
	itemDef.originalModelColors = new int[] { 7114, 7114 };
	itemDef.modifiedModelColors = new int[] { 918, 908 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Dismantle" };
	itemDef.modelID = 6032;
	itemDef.anInt165 = 6029;
	itemDef.anInt200 = 6030;
	break;

case 12417:
	itemDef.name = "Dragon full helm (g)";
	itemDef.modelZoom = 789;
	itemDef.modelRotationY = 135;
	itemDef.modelRotationX = 123;
	itemDef.modelOffset1 = -1;
	itemDef.originalModelColors = new int[] { 7114, 7114, 7114, 7114 };
	itemDef.modifiedModelColors = new int[] { 914, 902, 10314, 10306 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Dismantle" };
	itemDef.modelID = 26662;
	itemDef.anInt165 = 26632;
	itemDef.anInt200 = 26658;
	break;

case 12418:
	itemDef.name = "Dragon sq shield (g)";
	itemDef.modelZoom = 1730;
	itemDef.modelRotationY = 352;
	itemDef.modelRotationX = 120;
	itemDef.modelOffset1 = 1;
	itemDef.modelOffset2 = 10;
	itemDef.originalModelColors = new int[] { 7114, 7114 };
	itemDef.modifiedModelColors = new int[] { 7054, 37 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wield", null, null, "Dismantle" };
	itemDef.modelID = 2840;
	itemDef.anInt165 = 565;
	itemDef.anInt200 = 565;
	break;

case 12419:
	itemDef.name = "Light infinity hat";
	itemDef.modelZoom = 1150;
	itemDef.modelRotationY = 112;
	itemDef.modelRotationX = 68;
	itemDef.originalModelColors = new int[] { 107, 7114, 5239, 6253, 7114 };
	itemDef.modifiedModelColors = new int[] { 695, -9559, 9152, -23616, 17979 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Dismantle" };
	itemDef.modelID = 10583;
	itemDef.anInt165 = 10684;
	itemDef.anInt200 = 10691;
	break;

case 12420:
	itemDef.name = "Light infinity top";
	itemDef.modelZoom = 1380;
	itemDef.modelRotationY = 468;
	itemDef.modelRotationX = 2044;
	itemDef.modelOffset1 = -1;
	itemDef.originalModelColors = new int[] { 107, 7114, 6622, 6253, 5239, 7114 };
	itemDef.modifiedModelColors = new int[] { 695, -9559, 24512, -19520, 9152, -7220 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Dismantle" };
	itemDef.modelID = 10586;
	itemDef.anInt165 = 10687;
	itemDef.anInt165 = 10681;
	itemDef.anInt200 = 10694;
	itemDef.anInt200 = 10688;
	break;

case 12421:
	itemDef.name = "Light infinity bottoms";
	itemDef.modelZoom = 1760;
	itemDef.modelRotationY = 304;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = 30;
	itemDef.originalModelColors = new int[] { 107, 7114, 6622, 6253, 7114 };
	itemDef.modifiedModelColors = new int[] { 695, -9559, 24512, -19520, -7220 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Dismantle" };
	itemDef.modelID = 10585;
	itemDef.anInt165 = 10686;
	itemDef.anInt200 = 10693;
	break;

case 12422:
	itemDef.name = "3rd age wand";
	itemDef.modelZoom = 1347;
	itemDef.modelRotationY = 1468;
	itemDef.modelRotationX = 1805;
	itemDef.modelOffset2 = 1;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wield", null, null, "Drop" };
	itemDef.modelID = 28654;
	itemDef.anInt165 = 28619;
	itemDef.anInt200 = 28619;
	break;

case 12424:
	itemDef.name = "3rd age bow";
	itemDef.modelZoom = 1979;
	itemDef.modelRotationY = 1589;
	itemDef.modelRotationX = 768;
	itemDef.modelOffset1 = -20;
	itemDef.modelOffset2 = -14;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wield", null, null, "Drop" };
	itemDef.modelID = 28678;
	itemDef.anInt165 = 28622;
	itemDef.anInt200 = 28622;
	break;

case 12426:
	itemDef.name = "3rd age longsword";
	itemDef.modelZoom = 1726;
	itemDef.modelRotationY = 1576;
	itemDef.modelRotationX = 242;
	itemDef.modelOffset1 = 5;
	itemDef.modelOffset2 = 4;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wield", null, null, "Drop" };
	itemDef.modelID = 28633;
	itemDef.anInt165 = 28618;
	itemDef.anInt200 = 28618;
	break;

case 12436:
	itemDef.name = "Amulet of fury (or)";
	itemDef.modelZoom = 550;
	itemDef.modelRotationY = 340;
	itemDef.modelRotationX = 26;
	itemDef.modelOffset1 = 1;
	itemDef.modelOffset2 = 29;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Dismantle" };
	itemDef.modelID = 28715;
	itemDef.anInt165 = 28480;
	itemDef.anInt200 = 28558;
	break;

case 12437:
	itemDef.name = "3rd age cloak";
	itemDef.modelRotationY = 282;
	itemDef.modelRotationX = 962;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28648;
	itemDef.anInt165 = 28483;
	itemDef.anInt200 = 28560;
	break;

case 12460:
	itemDef.name = "Ancient platebody";
	itemDef.modelZoom = 1180;
	itemDef.modelRotationY = 452;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = -1;
	itemDef.originalModelColors = new int[] { -29403, -28266, -10854 };
	itemDef.modifiedModelColors = new int[] { 61, 41, 24 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28657;
	itemDef.anInt165 = 3379;
	itemDef.anInt188 = 164;
	itemDef.anInt200 = 3383;
	itemDef.anInt164 = 344;
	break;

case 12462:
	itemDef.name = "Ancient platelegs";
	itemDef.modelZoom = 1740;
	itemDef.modelRotationY = 444;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -8;
	itemDef.originalModelColors = new int[] { -29403, -28266, -10854 };
	itemDef.modifiedModelColors = new int[] { 61, 41, 57 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2582;
	itemDef.anInt165 = 268;
	itemDef.anInt200 = 432;
	break;

case 12464:
	itemDef.name = "Ancient plateskirt";
	itemDef.modelZoom = 1100;
	itemDef.modelRotationY = 620;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = 5;
	itemDef.modelOffset2 = 5;
	itemDef.originalModelColors = new int[] { -29403, -28266, -10854, -30316 };
	itemDef.modifiedModelColors = new int[] { 61, 41, 57, 25238 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 4208;
	itemDef.anInt165 = 4206;
	itemDef.anInt200 = 4207;
	break;

case 12466:
	itemDef.name = "Ancient full helm";
	itemDef.modelZoom = 800;
	itemDef.modelRotationY = 160;
	itemDef.modelRotationX = 152;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = 6;
	itemDef.originalModelColors = new int[] { -29403, -10854 };
	itemDef.modifiedModelColors = new int[] { 61, 926 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2813;
	itemDef.anInt165 = 218;
	itemDef.anInt200 = 394;
	break;

case 12468:
	itemDef.name = "Ancient kiteshield";
	itemDef.modelZoom = 1560;
	itemDef.modelRotationY = 344;
	itemDef.modelRotationX = 1104;
	itemDef.modelOffset1 = -6;
	itemDef.modelOffset2 = -14;
	itemDef.originalModelColors = new int[] { -29403, -10854, -10854 };
	itemDef.modifiedModelColors = new int[] { 61, 7054, 57 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2339;
	itemDef.anInt165 = 486;
	itemDef.anInt200 = 486;
	break;

case 12470:
	itemDef.name = "Armadyl platebody";
	itemDef.modelZoom = 1180;
	itemDef.modelRotationY = 452;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = -1;
	itemDef.originalModelColors = new int[] { -29403, -28266, 53 };
	itemDef.modifiedModelColors = new int[] { 61, 41, 24 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28725;
	itemDef.anInt165 = 3379;
	itemDef.anInt188 = 164;
	itemDef.anInt200 = 3383;
	itemDef.anInt164 = 344;
	break;

case 12472:
	itemDef.name = "Armadyl platelegs";
	itemDef.modelZoom = 1740;
	itemDef.modelRotationY = 444;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -8;
	itemDef.originalModelColors = new int[] { -29403, -28266, 53 };
	itemDef.modifiedModelColors = new int[] { 61, 41, 57 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2582;
	itemDef.anInt165 = 268;
	itemDef.anInt200 = 432;
	break;

case 12474:
	itemDef.name = "Armadyl plateskirt";
	itemDef.modelZoom = 1100;
	itemDef.modelRotationY = 620;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = 5;
	itemDef.modelOffset2 = 5;
	itemDef.originalModelColors = new int[] { -29403, -28266, 53, -30316 };
	itemDef.modifiedModelColors = new int[] { 61, 41, 57, 25238 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 4208;
	itemDef.anInt165 = 4206;
	itemDef.anInt200 = 4207;
	break;

case 12476:
	itemDef.name = "Armadyl full helm";
	itemDef.modelZoom = 800;
	itemDef.modelRotationY = 160;
	itemDef.modelRotationX = 152;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = 6;
	itemDef.originalModelColors = new int[] { -29403, 53 };
	itemDef.modifiedModelColors = new int[] { 61, 926 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2813;
	itemDef.anInt165 = 218;
	itemDef.anInt200 = 394;
	break;

case 12478:
	itemDef.name = "Armadyl kiteshield";
	itemDef.modelZoom = 1560;
	itemDef.modelRotationY = 344;
	itemDef.modelRotationX = 1104;
	itemDef.modelOffset1 = -6;
	itemDef.modelOffset2 = -14;
	itemDef.originalModelColors = new int[] { -29403, 53, 53 };
	itemDef.modifiedModelColors = new int[] { 61, 7054, 57 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2339;
	itemDef.anInt165 = 486;
	itemDef.anInt200 = 486;
	break;

case 12480:
	itemDef.name = "Bandos platebody";
	itemDef.modelZoom = 1180;
	itemDef.modelRotationY = 452;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = -1;
	itemDef.originalModelColors = new int[] { -29403, -28266, 7845 };
	itemDef.modifiedModelColors = new int[] { 61, 41, 24 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28704;
	itemDef.anInt165 = 3379;
	itemDef.anInt188 = 164;
	itemDef.anInt200 = 3383;
	itemDef.anInt164 = 344;
	break;

case 12482:
	itemDef.name = "Bandos platelegs";
	itemDef.modelZoom = 1740;
	itemDef.modelRotationY = 444;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -8;
	itemDef.originalModelColors = new int[] { -29403, -28266, 7845 };
	itemDef.modifiedModelColors = new int[] { 61, 41, 57 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2582;
	itemDef.anInt165 = 268;
	itemDef.anInt200 = 432;
	break;

case 12484:
	itemDef.name = "Bandos plateskirt";
	itemDef.modelZoom = 1100;
	itemDef.modelRotationY = 620;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = 5;
	itemDef.modelOffset2 = 5;
	itemDef.originalModelColors = new int[] { -29403, -28266, 7845, -30316 };
	itemDef.modifiedModelColors = new int[] { 61, 41, 57, 25238 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 4208;
	itemDef.anInt165 = 4206;
	itemDef.anInt200 = 4207;
	break;

case 12486:
	itemDef.name = "Bandos full helm";
	itemDef.modelZoom = 800;
	itemDef.modelRotationY = 160;
	itemDef.modelRotationX = 152;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = 6;
	itemDef.originalModelColors = new int[] { -29403, 7845 };
	itemDef.modifiedModelColors = new int[] { 61, 926 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2813;
	itemDef.anInt165 = 218;
	itemDef.anInt200 = 394;
	break;

case 12488:
	itemDef.name = "Bandos kiteshield";
	itemDef.modelZoom = 1560;
	itemDef.modelRotationY = 344;
	itemDef.modelRotationX = 1104;
	itemDef.modelOffset1 = -6;
	itemDef.modelOffset2 = -14;
	itemDef.originalModelColors = new int[] { -29403, 7845, 7845 };
	itemDef.modifiedModelColors = new int[] { 61, 7054, 57 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2339;
	itemDef.anInt165 = 486;
	itemDef.anInt200 = 486;
	break;

case 12490:
	itemDef.name = "Ancient bracers";
	itemDef.modelZoom = 740;
	itemDef.modelRotationY = 196;
	itemDef.modelRotationX = 1784;
	itemDef.modelOffset1 = 7;
	itemDef.modelOffset2 = -33;
	itemDef.originalModelColors = new int[] { -10854, -10329, -10329 };
	itemDef.modifiedModelColors = new int[] { 22156, 912, 22408 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 20264;
	itemDef.anInt165 = 20129;
	itemDef.anInt200 = 20180;
	break;
	


case 12492:
	itemDef.name = "Ancient d'hide";
	itemDef.modelZoom = 1180;
	itemDef.modelRotationY = 452;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = -1;
	itemDef.originalModelColors = new int[] { -12900, -11101, -12900, -10854, -10329, -10329 };
	itemDef.modifiedModelColors = new int[] { -27417, 24082, 22168, 22156, 920, 912 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28670;
	itemDef.anInt165 = 28543;
	itemDef.anInt188 = 20121;
	itemDef.anInt200 = 28601;
	itemDef.anInt164 = 20177;
	break;

case 12494:
	itemDef.name = "Ancient chaps";
	itemDef.modelZoom = 1827;
	itemDef.modelRotationY = 444;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -1;
	itemDef.originalModelColors = new int[] { -12900, -10329, -11101, -10854, -10329, -10329 };
	itemDef.modifiedModelColors = new int[] { 22168, 8070, 24082, 22156, 920, 912 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 20230;
	itemDef.anInt165 = 20139;
	itemDef.anInt200 = 20194;
	break;

case 12496:
	itemDef.name = "Ancient coif";
	itemDef.modelZoom = 789;
	itemDef.modelRotationY = 194;
	itemDef.modelRotationX = 1784;
	itemDef.modelOffset2 = -35;
	itemDef.originalModelColors = new int[] { -12900, -10329, -11101, -10854, -10329, -10329 };
	itemDef.modifiedModelColors = new int[] { 22168, 8070, 24082, 22156, 920, 912 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 20231;
	itemDef.anInt165 = 20131;
	itemDef.anInt188 = 230;
	itemDef.anInt200 = 20184;
	itemDef.anInt164 = 403;
	break;

case 12498:
	itemDef.name = "Bandos bracers";
	itemDef.modelZoom = 740;
	itemDef.modelRotationY = 196;
	itemDef.modelRotationX = 1784;
	itemDef.modelOffset1 = 7;
	itemDef.modelOffset2 = -33;
	itemDef.originalModelColors = new int[] { 6323, 6352, 6352 };
	itemDef.modifiedModelColors = new int[] { 22156, 912, 22408 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 20264;
	itemDef.anInt165 = 20129;
	itemDef.anInt200 = 20180;
	break;

case 12500:
	itemDef.name = "Bandos d'hide";
	itemDef.modelZoom = 1180;
	itemDef.modelRotationY = 452;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = -1;
	itemDef.originalModelColors = new int[] { 8377, 3127, 8377, 6323, 6352, 6352 };
	itemDef.modifiedModelColors = new int[] { -27417, 24082, 22168, 22156, 920, 912 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28748;
	itemDef.anInt165 = 28539;
	itemDef.anInt188 = 20121;
	itemDef.anInt200 = 28615;
	itemDef.anInt164 = 20177;
	break;

case 12502:
	itemDef.name = "Bandos chaps";
	itemDef.modelZoom = 1827;
	itemDef.modelRotationY = 444;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -1;
	itemDef.originalModelColors = new int[] { 8377, 6352, 3127, 6323, 6352, 6352 };
	itemDef.modifiedModelColors = new int[] { 22168, 8070, 24082, 22156, 920, 912 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 20230;
	itemDef.anInt165 = 20139;
	itemDef.anInt200 = 20194;
	break;

case 12504:
	itemDef.name = "Bandos coif";
	itemDef.modelZoom = 789;
	itemDef.modelRotationY = 194;
	itemDef.modelRotationX = 1784;
	itemDef.modelOffset2 = -35;
	itemDef.originalModelColors = new int[] { 8377, 6352, 3127, 6323, 6352, 6352 };
	itemDef.modifiedModelColors = new int[] { 22168, 8070, 24082, 22156, 920, 912 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 20231;
	itemDef.anInt165 = 20131;
	itemDef.anInt188 = 230;
	itemDef.anInt200 = 20184;
	itemDef.anInt164 = 403;
	break;

case 12506:
	itemDef.name = "Armadyl bracers";
	itemDef.modelZoom = 740;
	itemDef.modelRotationY = 196;
	itemDef.modelRotationX = 1784;
	itemDef.modelOffset1 = 7;
	itemDef.modelOffset2 = -33;
	itemDef.originalModelColors = new int[] { 107, 119, 119 };
	itemDef.modifiedModelColors = new int[] { 22156, 912, 22408 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 20264;
	itemDef.anInt165 = 20129;
	itemDef.anInt200 = 20180;
	break;

case 12508:
	itemDef.name = "Armadyl d'hide";
	itemDef.modelZoom = 1180;
	itemDef.modelRotationY = 452;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = -1;
	itemDef.originalModelColors = new int[] { 119, 94, -27417, 107, 119 };
	itemDef.modifiedModelColors = new int[] { 912, 24082, 22168, 22156, 920 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28668;
	itemDef.anInt165 = 28530;
	itemDef.anInt188 = 20121;
	itemDef.anInt200 = 28610;
	itemDef.anInt164 = 20177;
	break;
	
	

case 12510:
	itemDef.name = "Armadyl chaps";
	itemDef.modelZoom = 1827;
	itemDef.modelRotationY = 444;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -1;
	itemDef.originalModelColors = new int[] { -27417, 119, 94, 107, 119, 119 };
	itemDef.modifiedModelColors = new int[] { 22168, 8070, 24082, 22156, 920, 912 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 20230;
	itemDef.anInt165 = 20139;
	itemDef.anInt200 = 20194;
	break;

case 12512:
	itemDef.name = "Armadyl coif";
	itemDef.modelZoom = 789;
	itemDef.modelRotationY = 194;
	itemDef.modelRotationX = 1784;
	itemDef.modelOffset2 = -35;
	itemDef.originalModelColors = new int[] { -27417, 119, 94, 107, 119, 119 };
	itemDef.modifiedModelColors = new int[] { 22168, 8070, 24082, 22156, 920, 912 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 20231;
	itemDef.anInt165 = 20131;
	itemDef.anInt188 = 230;
	itemDef.anInt200 = 20184;
	itemDef.anInt164 = 403;
	break;


case 12518:
	itemDef.name = "Green dragon mask";
	itemDef.modelZoom = 905;
	itemDef.modelRotationY = 202;
	itemDef.modelRotationX = 121;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = 22;
	itemDef.originalModelColors = new int[] { 22049, 21910, 25484 };
	itemDef.modifiedModelColors = new int[] { 127, -27417, -27221 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28739;
	itemDef.anInt165 = 28508;
	itemDef.anInt200 = 28552;
	break;

case 12520:
	itemDef.name = "Blue dragon mask";
	itemDef.modelZoom = 905;
	itemDef.modelRotationY = 202;
	itemDef.modelRotationX = 121;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = 22;
	itemDef.originalModelColors = new int[] { -27099, -26841, -26845 };
	itemDef.modifiedModelColors = new int[] { 127, -27417, -27221 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28739;
	itemDef.anInt165 = 28508;
	itemDef.anInt200 = 28552;
	break;

case 12522:
	itemDef.name = "Red dragon mask";
	itemDef.modelZoom = 905;
	itemDef.modelRotationY = 202;
	itemDef.modelRotationX = 121;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = 22;
	itemDef.originalModelColors = new int[] { 935, 941, 716 };
	itemDef.modifiedModelColors = new int[] { 127, -27417, -27221 };
	itemDef.itemActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28739;
	itemDef.anInt165 = 28508;
	itemDef.anInt200 = 28552;
	break;

case 12524:
	itemDef.name = "White dragon mask";
	itemDef.modelZoom = 905;
	itemDef.modelRotationY = 202;
	itemDef.modelRotationX = 121;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = 22;
	itemDef.modifiedModelColors = new int[] { 0, 30, 26 };
	itemDef.originalModelColors = new int[] { 127, -27417, -27221 };
	itemDef.itemActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28739;
	itemDef.anInt165 = 28508;
	itemDef.anInt200 = 28552;
	break;

case 12526:
	itemDef.name = "Fury ornament kit";
	itemDef.modelZoom = 1616;
	itemDef.modelRotationY = 564;
	itemDef.modelRotationX = 1943;
	itemDef.modelOffset1 = -10;
	itemDef.modelOffset2 = 20;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
	itemDef.modelID = 28636;
	break;

case 12528:
	itemDef.name = "Dark infinity colour kit";
	itemDef.modelZoom = 1616;
	itemDef.modelRotationY = 564;
	itemDef.modelRotationX = 1943;
	itemDef.modelOffset1 = -10;
	itemDef.modelOffset2 = 20;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
	itemDef.modelID = 28661;
	break;

case 12530:
	itemDef.name = "Light infinity colour kit";
	itemDef.modelZoom = 1616;
	itemDef.modelRotationY = 564;
	itemDef.modelRotationX = 1943;
	itemDef.modelOffset1 = -10;
	itemDef.modelOffset2 = 20;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
	itemDef.modelID = 28692;
	break;

case 12532:
	itemDef.name = "Dragon sq shield ornament kit";
	itemDef.modelZoom = 1616;
	itemDef.modelRotationY = 564;
	itemDef.modelRotationX = 1943;
	itemDef.modelOffset1 = -10;
	itemDef.modelOffset2 = 20;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
	itemDef.modelID = 28634;
	break;

case 12534:
	itemDef.name = "Dragon chainbody ornament kit";
	itemDef.modelZoom = 1616;
	itemDef.modelRotationY = 564;
	itemDef.modelRotationX = 1943;
	itemDef.modelOffset1 = -10;
	itemDef.modelOffset2 = 20;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
	itemDef.modelID = 28645;
	break;

case 12536:
	itemDef.name = "Dragon plate/skirt ornament kit";
	itemDef.modelZoom = 1616;
	itemDef.modelRotationY = 564;
	itemDef.modelRotationX = 1943;
	itemDef.modelOffset1 = -10;
	itemDef.modelOffset2 = 20;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
	itemDef.modelID = 28691;
	break;

case 12538:
	itemDef.name = "Dragon full helm ornament kit";
	itemDef.modelZoom = 1616;
	itemDef.modelRotationY = 564;
	itemDef.modelRotationX = 1943;
	itemDef.modelOffset1 = -10;
	itemDef.modelOffset2 = 20;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
	itemDef.modelID = 28638;
	break;

case 12293:
	itemDef.name = "Mithril full helm (t)";
	itemDef.modelZoom = 800;
	itemDef.modelRotationY = 160;
	itemDef.modelRotationX = 152;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = 6;
	itemDef.originalModelColors = new int[] { -22239, -27310 };
	itemDef.modifiedModelColors = new int[] { 61, 926 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2813;
	itemDef.anInt165 = 218;
	itemDef.anInt200 = 394;
	break;

case 12295:
	itemDef.name = "Mithril plateskirt (t)";
	itemDef.modelZoom = 1100;
	itemDef.modelRotationY = 620;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = 5;
	itemDef.modelOffset2 = 5;
	itemDef.originalModelColors = new int[] { -22239, -22254, -27310 };
	itemDef.modifiedModelColors = new int[] { 61, 25238, 57 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 4208;
	itemDef.anInt165 = 4206;
	itemDef.anInt200 = 4207;
	break;

case 12297:
	itemDef.name = "Black pickaxe";
	itemDef.modelZoom = 1070;
	itemDef.modelRotationY = 224;
	itemDef.modelRotationX = 1056;
	itemDef.modelOffset1 = -2;
	itemDef.modelOffset2 = -19;
	itemDef.originalModelColors = new int[] { 8 };
	itemDef.modifiedModelColors = new int[] { 61 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wield", null, null, "Drop" };
	itemDef.modelID = 2529;
	itemDef.anInt165 = 509;
	itemDef.anInt200 = 509;
	break;

case 12299:
	itemDef.name = "White headband";
	itemDef.modelZoom = 380;
	itemDef.modelRotationY = 108;
	itemDef.modelRotationX = 56;
	itemDef.modelOffset1 = -1;
	itemDef.originalModelColors = new int[] { 119, 119 };
	itemDef.modifiedModelColors = new int[] { 61, 41 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 3377;
	itemDef.anInt165 = 201;
	itemDef.anInt200 = 376;
	break;

case 12301:
	itemDef.name = "Blue headband";
	itemDef.modelZoom = 380;
	itemDef.modelRotationY = 108;
	itemDef.modelRotationX = 56;
	itemDef.modelOffset1 = -1;
	itemDef.originalModelColors = new int[] { -24665, -24665 };
	itemDef.modifiedModelColors = new int[] { 61, 41 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 3377;
	itemDef.anInt165 = 201;
	itemDef.anInt200 = 376;
	break;

case 12303:
	itemDef.name = "Gold headband";
	itemDef.modelZoom = 380;
	itemDef.modelRotationY = 108;
	itemDef.modelRotationX = 56;
	itemDef.modelOffset1 = -1;
	itemDef.originalModelColors = new int[] { 10805, 10805 };
	itemDef.modifiedModelColors = new int[] { 61, 41 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 3377;
	itemDef.anInt165 = 201;
	itemDef.anInt200 = 376;
	break;

case 12305:
	itemDef.name = "Pink headband";
	itemDef.modelZoom = 380;
	itemDef.modelRotationY = 108;
	itemDef.modelRotationX = 56;
	itemDef.modelOffset1 = -1;
	itemDef.originalModelColors = new int[] { -7220, -7220 };
	itemDef.modifiedModelColors = new int[] { 61, 41 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 3377;
	itemDef.anInt165 = 201;
	itemDef.anInt200 = 376;
	break;

case 12307:
	itemDef.name = "Green headband";
	itemDef.modelZoom = 380;
	itemDef.modelRotationY = 108;
	itemDef.modelRotationX = 56;
	itemDef.modelOffset1 = -1;
	itemDef.originalModelColors = new int[] { 22451, 22451 };
	itemDef.modifiedModelColors = new int[] { 61, 41 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 3377;
	itemDef.anInt165 = 201;
	itemDef.anInt200 = 376;
	break;

case 12309:
	itemDef.name = "Pink boater";
	itemDef.modelZoom = 724;
	itemDef.modelRotationY = 166;
	itemDef.modelRotationX = 1784;
	itemDef.modelOffset2 = -11;
	itemDef.originalModelColors = new int[] { -7220 };
	itemDef.modifiedModelColors = new int[] { 926 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 11399;
	itemDef.anInt165 = 11330;
	itemDef.anInt200 = 11353;
	break;

case 12311:
	itemDef.name = "Purple boater";
	itemDef.modelZoom = 724;
	itemDef.modelRotationY = 166;
	itemDef.modelRotationX = 1784;
	itemDef.modelOffset2 = -11;
	itemDef.originalModelColors = new int[] { -13389 };
	itemDef.modifiedModelColors = new int[] { 926 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 11399;
	itemDef.anInt165 = 11330;
	itemDef.anInt200 = 11353;
	break;

case 12313:
	itemDef.name = "White boater";
	itemDef.modelZoom = 724;
	itemDef.modelRotationY = 166;
	itemDef.modelRotationX = 1784;
	itemDef.modelOffset2 = -11;
	itemDef.originalModelColors = new int[] { 119 };
	itemDef.modifiedModelColors = new int[] { 926 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 11399;
	itemDef.anInt165 = 11330;
	itemDef.anInt200 = 11353;
	break;

case 12315:
	itemDef.name = "Pink ele' shirt";
	itemDef.modelZoom = 1373;
	itemDef.modelRotationY = 452;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = 7;
	itemDef.originalModelColors = new int[] { 109, -8987, -7716, -8762, -8775, -10914 };
	itemDef.modifiedModelColors = new int[] { 105, 64, 47, 35, 26, -10364 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 20235;
	itemDef.anInt165 = 20158;
	itemDef.anInt165 = 20122;
	itemDef.anInt200 = 20214;
	itemDef.anInt200 = 20178;
	break;

case 12317:
	itemDef.name = "Pink ele' legs";
	itemDef.modelZoom = 1827;
	itemDef.modelRotationY = 444;
	itemDef.modelOffset2 = -1;
	itemDef.originalModelColors = new int[] { 109, -1700, 293, -8775, -10914, -8775 };
	itemDef.modifiedModelColors = new int[] { 105, 64, 47, 35, 26, -10364 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 20234;
	itemDef.anInt165 = 20140;
	itemDef.anInt200 = 20195;
	break;

case 12321:
	itemDef.name = "White cavalier";
	itemDef.modelZoom = 690;
	itemDef.modelRotationY = 160;
	itemDef.modelRotationX = 1856;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = -8;
	itemDef.originalModelColors = new int[] { 5231, 24 };
	itemDef.modifiedModelColors = new int[] { 7073, 127 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2451;
	itemDef.anInt165 = 186;
	itemDef.anInt200 = 362;
	break;

case 12323:
	itemDef.name = "Red cavalier";
	itemDef.modelZoom = 690;
	itemDef.modelRotationY = 160;
	itemDef.modelRotationX = 1856;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = -8;
	itemDef.originalModelColors = new int[] { 662 };
	itemDef.modifiedModelColors = new int[] { 7073 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2451;
	itemDef.anInt165 = 186;
	itemDef.anInt200 = 362;
	break;

case 12325:
	itemDef.name = "Navy cavalier";
	itemDef.modelZoom = 690;
	itemDef.modelRotationY = 160;
	itemDef.modelRotationX = 1856;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = -8;
	itemDef.originalModelColors = new int[] { -23903 };
	itemDef.modifiedModelColors = new int[] { 7073 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 2451;
	itemDef.anInt165 = 186;
	itemDef.anInt200 = 362;
	break;

case 12327:
	itemDef.name = "Red d'hide body (g)";
	itemDef.modelZoom = 1030;
	itemDef.modelRotationY = 548;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -4;
	itemDef.originalModelColors = new int[] { 912, 540, 7114 };
	itemDef.modifiedModelColors = new int[] { 22416, 22424, 24 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 11390;
	itemDef.anInt165 = 11345;
	itemDef.anInt200 = 11361;
	break;

case 12329:
	itemDef.name = "Red d'hide chaps (g)";
	itemDef.modelZoom = 1720;
	itemDef.modelRotationY = 488;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = 7;
	itemDef.modelOffset2 = 5;
	itemDef.originalModelColors = new int[] { 912, 540, 7114, 7114, 7114 };
	itemDef.modifiedModelColors = new int[] { 22416, 22424, 22408, 24, 7566 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 11371;
	itemDef.anInt165 = 11411;
	itemDef.anInt200 = 11355;
	break;

case 12331:
	itemDef.name = "Red d'hide body (t)";
	itemDef.modelZoom = 1030;
	itemDef.modelRotationY = 548;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -4;
	itemDef.originalModelColors = new int[] { 912, 540, 460 };
	itemDef.modifiedModelColors = new int[] { 22416, 22424, 24 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 11390;
	itemDef.anInt165 = 11345;
	itemDef.anInt200 = 11361;
	break;

case 12333:
	itemDef.name = "Red d'hide chaps (t)";
	itemDef.modelZoom = 1720;
	itemDef.modelRotationY = 488;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = 7;
	itemDef.modelOffset2 = 5;
	itemDef.originalModelColors = new int[] { 912, 540, 460, 460 };
	itemDef.modifiedModelColors = new int[] { 22416, 22424, 24, 7566 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 11371;
	itemDef.anInt165 = 11411;
	itemDef.anInt200 = 11355;
	break;



case 12339:
	itemDef.name = "Pink ele' blouse";
	itemDef.modelZoom = 1180;
	itemDef.modelRotationY = 452;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = 5;
	itemDef.originalModelColors = new int[] { -10914, -8775, -8775 };
	itemDef.modifiedModelColors = new int[] { 105, 64, -10364 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 20237;
	itemDef.anInt165 = 20159;
	itemDef.anInt165 = 20123;
	itemDef.anInt200 = 20215;
	itemDef.anInt200 = 20179;
	break;

case 12341:
	itemDef.name = "Pink ele' skirt";
	itemDef.modelZoom = 1187;
	itemDef.modelRotationY = 444;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -1;
	itemDef.originalModelColors = new int[] { -10914, -10914, -8775, -9687, -10914 };
	itemDef.modifiedModelColors = new int[] { 105, 64, 47, 26, -10364 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 20236;
	itemDef.anInt165 = 20141;
	itemDef.anInt200 = 20196;
	break;

case 12343:
	itemDef.name = "Gold ele' blouse";
	itemDef.modelZoom = 1180;
	itemDef.modelRotationY = 452;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = 5;
	itemDef.originalModelColors = new int[] { 11179, 10793, 10793 };
	itemDef.modifiedModelColors = new int[] { 105, 64, -10364 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 20237;
	itemDef.anInt165 = 20159;
	itemDef.anInt165 = 20123;
	itemDef.anInt200 = 20215;
	itemDef.anInt200 = 20179;
	break;

case 12345:
	itemDef.name = "Gold ele' skirt";
	itemDef.modelZoom = 1187;
	itemDef.modelRotationY = 444;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -1;
	itemDef.originalModelColors = new int[] { 11179, 11179, 10021, 8867, 11179 };
	itemDef.modifiedModelColors = new int[] { 105, 64, 47, 26, -10364 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 20236;
	itemDef.anInt165 = 20141;
	itemDef.anInt200 = 20196;
	break;

case 12347:
	itemDef.name = "Gold ele' shirt";
	itemDef.modelZoom = 1373;
	itemDef.modelRotationY = 452;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = 7;
	itemDef.originalModelColors = new int[] { 109, 11179, 9917, 9771, 8867, 10910 };
	itemDef.modifiedModelColors = new int[] { 105, -10364, 64, 47, 35, 26 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 20235;
	itemDef.anInt165 = 20158;
	itemDef.anInt165 = 20122;
	itemDef.anInt200 = 20214;
	itemDef.anInt200 = 20178;
	break;

case 12349:
	itemDef.name = "Gold ele' legs";
	itemDef.modelZoom = 1827;
	itemDef.modelRotationY = 444;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -1;
	itemDef.originalModelColors = new int[] { 11179, 11059, 11179, 9771, 10913 };
	itemDef.modifiedModelColors = new int[] { 105, 64, 35, 26, -10364 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 20234;
	itemDef.anInt165 = 20140;
	itemDef.anInt200 = 20195;
	break;

case 12351:
	itemDef.name = "Musketeer hat";
	itemDef.modelZoom = 1221;
	itemDef.modelRotationY = 162;
	itemDef.modelRotationX = 1333;
	itemDef.modelOffset1 = -11;
	itemDef.modelOffset2 = -18;
	itemDef.originalModelColors = new int[] { 920 };
	itemDef.modifiedModelColors = new int[] { 29456 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28706;
	itemDef.anInt165 = 28516;
	itemDef.anInt200 = 28584;
	break;

case 12357:
	itemDef.name = "Katana";
	itemDef.modelZoom = 2105;
	itemDef.modelRotationY = 431;
	itemDef.modelRotationX = 768;
	itemDef.modelOffset1 = 9;
	itemDef.modelOffset2 = 1;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wield", null, null, "Drop" };
	itemDef.modelID = 28647;
	itemDef.anInt165 = 5233;
	itemDef.anInt200 = 5233;
	break;

case 12363:
	itemDef.name = "Bronze dragon mask";
	itemDef.modelZoom = 905;
	itemDef.modelRotationY = 202;
	itemDef.modelRotationX = 121;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = 22;
	itemDef.originalModelColors = new int[] { 5904, 5652, 4395 };
	itemDef.modifiedModelColors = new int[] { 127, -27417, -27221 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28739;
	itemDef.anInt165 = 28508;
	itemDef.anInt200 = 28552;
	break;

case 12365:
	itemDef.name = "Iron dragon mask";
	itemDef.modelZoom = 905;
	itemDef.modelRotationY = 202;
	itemDef.modelRotationX = 121;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = 22;
	itemDef.originalModelColors = new int[] { 20, 24, 33 };
	itemDef.modifiedModelColors = new int[] { 127, -27417, -27221 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28739;
	itemDef.anInt165 = 28508;
	itemDef.anInt200 = 28552;
	break;

case 12367:
	itemDef.name = "Steel dragon mask";
	itemDef.modelZoom = 905;
	itemDef.modelRotationY = 202;
	itemDef.modelRotationX = 121;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = 22;
	itemDef.originalModelColors = new int[] { 5161, 3123, 3148 };
	itemDef.modifiedModelColors = new int[] { 127, -27417, -27221 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28739;
	itemDef.anInt165 = 28508;
	itemDef.anInt200 = 28552;
	break;

case 12369:
	itemDef.name = "Mithril dragon mask";
	itemDef.modelZoom = 905;
	itemDef.modelRotationY = 202;
	itemDef.modelRotationX = 121;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = 22;
	itemDef.originalModelColors = new int[] { -27364, -27359, -27479 };
	itemDef.modifiedModelColors = new int[] { 127, -27417, -27221 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28739;
	itemDef.anInt165 = 28508;
	itemDef.anInt200 = 28552;
	break;


case 12381:
	itemDef.name = "Black d'hide body (g)";
	itemDef.modelZoom = 1030;
	itemDef.modelRotationY = 548;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -4;
	itemDef.originalModelColors = new int[] { 4, 16, 7114 };
	itemDef.modifiedModelColors = new int[] { 22416, 22424, 24 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 11390;
	itemDef.anInt165 = 11345;
	itemDef.anInt200 = 11361;
	break;

case 12383:
	itemDef.name = "Black d'hide chaps (g)";
	itemDef.modelZoom = 1720;
	itemDef.modelRotationY = 488;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = 7;
	itemDef.modelOffset2 = 5;
	itemDef.originalModelColors = new int[] { 4, 16, 7114, 7114 };
	itemDef.modifiedModelColors = new int[] { 22416, 22424, 24, 7566 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 11371;
	itemDef.anInt165 = 11411;
	itemDef.anInt200 = 11355;
	break;

case 12385:
	itemDef.name = "Black d'hide body (t)";
	itemDef.modelZoom = 1030;
	itemDef.modelRotationY = 548;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset2 = -4;
	itemDef.originalModelColors = new int[] { 4, 16, 47 };
	itemDef.modifiedModelColors = new int[] { 22416, 22424, 24 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 11390;
	itemDef.anInt165 = 11345;
	itemDef.anInt200 = 11361;
	break;

case 12387:
	itemDef.name = "Black d'hide chaps (t)";
	itemDef.modelZoom = 1720;
	itemDef.modelRotationY = 488;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = 7;
	itemDef.modelOffset2 = 5;
	itemDef.originalModelColors = new int[] { 4, 16, 47, 47 };
	itemDef.modifiedModelColors = new int[] { 22416, 22424, 24, 7566 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 11371;
	itemDef.anInt165 = 11411;
	itemDef.anInt200 = 11355;
	break;

case 12389:
	itemDef.name = "Gilded scimitar";
	itemDef.modelZoom = 1180;
	itemDef.modelRotationY = 300;
	itemDef.modelRotationX = 1120;
	itemDef.modelOffset1 = -6;
	itemDef.modelOffset2 = 4;
	itemDef.originalModelColors = new int[] { 7114 };
	itemDef.modifiedModelColors = new int[] { 61 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wield", null, null, "Drop" };
	itemDef.modelID = 2373;
	itemDef.anInt165 = 490;
	itemDef.anInt200 = 490;
	break;

case 12391:
	itemDef.name = "Gilded boots";
	itemDef.modelZoom = 770;
	itemDef.modelRotationY = 164;
	itemDef.modelRotationX = 156;
	itemDef.modelOffset1 = 3;
	itemDef.modelOffset2 = -3;
	itemDef.originalModelColors = new int[] { 7114, 7104 };
	itemDef.modifiedModelColors = new int[] { 61, 5400 };
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 5037;
	itemDef.anInt165 = 4954;
	itemDef.anInt200 = 5031;
	break;

case 12399:
	itemDef.name = "Partyhat & specs";
	itemDef.modelZoom = 653;
	itemDef.modelRotationY = 242;
	itemDef.modelRotationX = 0;
	itemDef.modelOffset1 = -1;
	itemDef.modelOffset2 = -59;
	itemDef.groundActions = new String[] { null, null, "Take", null, null };
	itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
	itemDef.modelID = 28693;
	itemDef.anInt165 = 28505;
	itemDef.anInt200 = 28576;
	break;
		case 12603:
			itemDef.name = "Tyrannical ring";
			itemDef.modelZoom = 592;
			itemDef.modelRotationY = 285;
			itemDef.modelRotationX = 1163;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 28823;
			break;

		case 12605:
			itemDef.name = "Treasonous ring";
			itemDef.modelZoom = 750;
			itemDef.modelRotationY = 342;
			itemDef.modelRotationX = 252;
			itemDef.modelOffset1 = -3;
			itemDef.modelOffset2 = -12;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.modelID = 28825;
			break;

		case 12607:
			itemDef.name = "Damaged book";
			itemDef.modelZoom = 830;
			itemDef.modelRotationY = 244;
			itemDef.modelRotationX = 116;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = -21;
			itemDef.originalModelColors = new int[] { 5425, 11177, 61 };
			itemDef.modifiedModelColors = new int[] { 5018, 61, 10351 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wield", "Check", null, "Drop" };
			itemDef.modelID = 2543;
			itemDef.anInt165 = 556;
			itemDef.anInt200 = 556;
			break;

		case 12608:
			itemDef.name = "Book of war";
			itemDef.modelZoom = 830;
			itemDef.modelRotationY = 244;
			itemDef.modelRotationX = 116;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = -21;
			itemDef.originalModelColors = new int[] { 5425, 11177, 61 };
			itemDef.modifiedModelColors = new int[] { 5018, 61, 10351 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wield", "Preach", null, "Drop" };
			itemDef.modelID = 2543;
			itemDef.anInt165 = 556;
			itemDef.anInt200 = 556;
			break;

		case 12609:
			itemDef.name = "Damaged book";
			itemDef.modelZoom = 830;
			itemDef.modelRotationY = 244;
			itemDef.modelRotationX = 116;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = -21;
			itemDef.originalModelColors = new int[] { -22440, 11177, 61 };
			itemDef.modifiedModelColors = new int[] { 5018, 61, 10351 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wield", "Check", null, "Drop" };
			itemDef.modelID = 2543;
			itemDef.anInt165 = 556;
			itemDef.anInt200 = 556;
			break;

		case 12610:
			itemDef.name = "Book of law";
			itemDef.modelZoom = 830;
			itemDef.modelRotationY = 244;
			itemDef.modelRotationX = 116;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = -21;
			itemDef.originalModelColors = new int[] { -22440, 11177, 61 };
			itemDef.modifiedModelColors = new int[] { 5018, 61, 10351 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wield", "Preach", null, "Drop" };
			itemDef.modelID = 2543;
			itemDef.anInt165 = 556;
			itemDef.anInt200 = 556;
			break;

		case 12611:
			itemDef.name = "Damaged book";
			itemDef.modelZoom = 830;
			itemDef.modelRotationY = 244;
			itemDef.modelRotationX = 116;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = -21;
			itemDef.originalModelColors = new int[] { -16870, 11177, 61 };
			itemDef.modifiedModelColors = new int[] { 5018, 61, 10351 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wield", "Check", null, "Drop" };
			itemDef.modelID = 2543;
			itemDef.anInt165 = 556;
			itemDef.anInt200 = 556;
			break;

		case 12612:
			itemDef.name = "Book of darkness";
			itemDef.modelZoom = 830;
			itemDef.modelRotationY = 244;
			itemDef.modelRotationX = 116;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = -21;
			itemDef.originalModelColors = new int[] { -16870, 11177, 61 };
			itemDef.modifiedModelColors = new int[] { 5018, 61, 10351 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, "Wield", "Preach", null, "Drop" };
			itemDef.modelID = 2543;
			itemDef.anInt165 = 556;
			itemDef.anInt200 = 556;
			break;

		case 12613:
			itemDef.name = "Bandos page 1";
			itemDef.modelZoom = 680;
			itemDef.modelRotationY = 400;
			itemDef.modelRotationX = 80;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = 5;
			itemDef.originalModelColors = new int[] { 6336, 6331, 5305, 5301, 5425 };
			itemDef.modifiedModelColors = new int[] { 90, 86, 82, 78, 74 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 4508;
			break;

		case 12614:
			itemDef.name = "Bandos page 2";
			itemDef.modelZoom = 680;
			itemDef.modelRotationY = 400;
			itemDef.modelRotationX = 80;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = 5;
			itemDef.originalModelColors = new int[] { 6336, 6331, 5305, 5301, 5425 };
			itemDef.modifiedModelColors = new int[] { 90, 86, 82, 78, 74 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 4508;
			break;

		case 12615:
			itemDef.name = "Bandos page 3";
			itemDef.modelZoom = 680;
			itemDef.modelRotationY = 400;
			itemDef.modelRotationX = 80;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = 5;
			itemDef.originalModelColors = new int[] { 6336, 6331, 5305, 5301, 5425 };
			itemDef.modifiedModelColors = new int[] { 90, 86, 82, 78, 74 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 4508;
			break;

		case 12616:
			itemDef.name = "Bandos page 4";
			itemDef.modelZoom = 680;
			itemDef.modelRotationY = 400;
			itemDef.modelRotationX = 80;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = 5;
			itemDef.originalModelColors = new int[] { 6336, 6331, 5305, 5301, 5425 };
			itemDef.modifiedModelColors = new int[] { 90, 86, 82, 78, 74 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 4508;
			break;

		case 12617:
			itemDef.name = "Armadyl page 1";
			itemDef.modelZoom = 680;
			itemDef.modelRotationY = 400;
			itemDef.modelRotationX = 80;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = 5;
			itemDef.originalModelColors = new int[] { -22423, -22427, -22431, -22436, -22440 };
			itemDef.modifiedModelColors = new int[] { 90, 86, 82, 78, 74 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 4508;
			break;

		case 12618:
			itemDef.name = "Armadyl page 2";
			itemDef.modelZoom = 680;
			itemDef.modelRotationY = 400;
			itemDef.modelRotationX = 80;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = 5;
			itemDef.originalModelColors = new int[] { -22423, -22427, -22431, -22436, -22440 };
			itemDef.modifiedModelColors = new int[] { 90, 86, 82, 78, 74 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 4508;
			break;

		case 12619:
			itemDef.name = "Armadyl page 3";
			itemDef.modelZoom = 680;
			itemDef.modelRotationY = 400;
			itemDef.modelRotationX = 80;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = 5;
			itemDef.originalModelColors = new int[] { -22423, -22427, -22431, -22436, -22440 };
			itemDef.modifiedModelColors = new int[] { 90, 86, 82, 78, 74 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 4508;
			break;

		case 12620:
			itemDef.name = "Armadyl page 4";
			itemDef.modelZoom = 680;
			itemDef.modelRotationY = 400;
			itemDef.modelRotationX = 80;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = 5;
			itemDef.originalModelColors = new int[] { -22423, -22427, -22431, -22436, -22440 };
			itemDef.modifiedModelColors = new int[] { 90, 86, 82, 78, 74 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 4508;
			break;

		case 12621:
			itemDef.name = "Ancient page 1";
			itemDef.modelZoom = 680;
			itemDef.modelRotationY = 400;
			itemDef.modelRotationX = 80;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = 5;
			itemDef.originalModelColors = new int[] { -22194, -22324, -20278, -20152, -17212 };
			itemDef.modifiedModelColors = new int[] { 90, 86, 82, 78, 74 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 4508;
			break;

		case 12622:
			itemDef.name = "Ancient page 2";
			itemDef.modelZoom = 680;
			itemDef.modelRotationY = 400;
			itemDef.modelRotationX = 80;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = 5;
			itemDef.originalModelColors = new int[] { -22194, -22324, -20278, -20152, -17212 };
			itemDef.modifiedModelColors = new int[] { 90, 86, 82, 78, 74 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 4508;
			break;

		case 12623:
			itemDef.name = "Ancient page 3";
			itemDef.modelZoom = 680;
			itemDef.modelRotationY = 400;
			itemDef.modelRotationX = 80;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = 5;
			itemDef.originalModelColors = new int[] { -22194, -22324, -20278, -20152, -17212 };
			itemDef.modifiedModelColors = new int[] { 90, 86, 82, 78, 74 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 4508;
			break;

		case 12624:
			itemDef.name = "Ancient page 4";
			itemDef.modelZoom = 680;
			itemDef.modelRotationY = 400;
			itemDef.modelRotationX = 80;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = 5;
			itemDef.originalModelColors = new int[] { -22194, -22324, -20278, -20152, -17212 };
			itemDef.modifiedModelColors = new int[] { 90, 86, 82, 78, 74 };
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[] { null, null, null, null, "Drop" };
			itemDef.modelID = 4508;
			break;

		case 15051:
			itemDef.itemActions = new String[5];
			itemDef.itemActions[1] = "Wield";
			itemDef.modelZoom = 789;
			itemDef.modelRotationY = 69;
			itemDef.modelRotationX = 1743;
			itemDef.modelOffset1 = -4;
			itemDef.modelOffset2 = -3;
			itemDef.modelID = 34411;
			itemDef.anInt165 = 6775; // male wield model
			itemDef.anInt200 = 14112; // femArmModel
			itemDef.name = "Slayer helmet";
			itemDef.description = "You don't want to wear it inside-out.".getBytes();// examine.
			break;
			
		case 405:
			itemDef.name = "2.5m Cash";
			itemDef.description = "Opening this casket will give you 2,500,000 coins.".getBytes();
			break;
			
		case 761:
			itemDef.name = "2x Global";
			itemDef.description = "Reading this will reward you will 2x experience for all skills. (30 Minutes)".getBytes();
			break;
			
		case 607:
			itemDef.name = "2x Combat";
			itemDef.description = "Reading this will reward you will 2x experience for combat skills only. (30 Minutes)".getBytes();
			break;
			
		case 608:
			itemDef.name = "2x Skilling";
			itemDef.description = "Reading this will reward you will 2x experience for non-combat skills only. (30 Minutes)".getBytes();
			break;

		case 15330:
			itemDef.name = "Halloween ring";
			itemDef.modelID = 2677;
			itemDef.modelZoom = 830;
			itemDef.modelRotationY = 322;
			itemDef.modelRotationX = 135;
			itemDef.itemActions[1] = "Wear";
			break;
			
		case 15332:
			itemDef.name = "Ring of slaying";
			itemDef.modelID = 2677;
			itemDef.modelZoom = 830;
			itemDef.modelRotationY = 322;
			itemDef.modelRotationX = 135;
			itemDef.modelOffset1 = -1;
			itemDef.modelOffset1 = 1;
			itemDef.itemActions[1] = "Wear";
			itemDef.originalModelColors = new int[1];
			itemDef.modifiedModelColors = new int[1];
			itemDef.originalModelColors[0] = 51111;
			itemDef.modifiedModelColors[0] = 127;
			break;
			
		case 15103:
			itemDef.itemActions = new String[5];
			itemDef.itemActions[1] = "Wield";
			itemDef.name = "Hammer"; // Name
			itemDef.description = "A wieldable hammer.".getBytes();
			itemDef.modelRotationY = 356;
			itemDef.modelRotationX = 2012;
			itemDef.modelOffset1 = -3;
			itemDef.modelOffset2 = -1;
			itemDef.modelID = 2376;
			itemDef.anInt165 = 491;
			itemDef.anInt200 = 491;//21886,253,167,491
			itemDef.modelZoom = 900;
			break;

		}
	}

	public static void dumpInfo(int item) {
		try {
			ItemDef itemDef = ItemDef.forID(item);
			System.out.println();
			System.out.println("Name : "+itemDef.name);
			System.out.println("Model : " + itemDef.modelID);
			System.out.println("Zoom : " + itemDef.modelZoom);
			System.out.println("RotY : " + itemDef.modelRotationY);
			System.out.println("RotX : " + itemDef.modelRotationX);
			System.out.println("Offset1 : "+itemDef.modelOffset1);
			System.out.println("Offset2 : "+itemDef.modelOffset2);
			System.out.println("anInt165(MALE WIELD) : "+itemDef.anInt165);
			System.out.println("anInt200(FEMALE WIELD) : "+itemDef.anInt200);
			System.out.println();
			System.out.println("Original Color[0] : "
					+ itemDef.originalModelColors[0]);
			System.out.println("Modified Color[0] : "
					+ itemDef.modifiedModelColors[0]);
			System.out.println("Original Color[1] : "
					+ itemDef.originalModelColors[1]);
			System.out.println("Modified Color[1] : "
					+ itemDef.modifiedModelColors[1]);
		} catch (Exception e) {

		}
	}

	private static String arrayToString(String[] arr) {
		String toReturn = "";
		for (String s : arr) {
			if (s != null) {
				toReturn += s + "\n";
			}
		}
		return toReturn;
	}

	private static String arrayToString(int[] arr) {
		String toReturn = "";
		for (int s : arr) {
			toReturn += s + "\t";
		}
		return toReturn;
	}

	public static void dumpItem(int item) {
		ItemDef itemDef = ItemDef.forID(item);
		String userHomeFolder = System.getProperty("user.home");
		File textFile = new File(userHomeFolder, +item + ".txt");
		String[] data = new String[10];
		data[0] = "itemDef.modelID = " + itemDef.modelID + ";";
		data[1] = "itemDef.modelZoom = " + itemDef.modelZoom + ";";
		data[2] = "itemDef.modelRotationX = " + itemDef.modelRotationX + ";";
		data[3] = "itemDef.modelRotationY = " + itemDef.modelRotationY + ";";
		data[4] = "itemDef.anInt165 = " + itemDef.anInt165 + ";";
		data[5] = "itemDef.anInt200 = " + itemDef.anInt200 + ";";
		data[6] = "itemDef.modelOffset1 = " + itemDef.modelOffset1 + ";";
		data[7] = "itemDef.modelOffset2 = " + itemDef.modelOffset2 + ";";
		data[8] = "Item actions : " + arrayToString(itemDef.itemActions);
		data[9] = "Original colors : "+ arrayToString(itemDef.originalModelColors);
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(textFile));
			for (String s : data) {
				out.write(s);
				out.newLine();
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}