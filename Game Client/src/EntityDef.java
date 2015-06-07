public final class EntityDef {

	public static EntityDef forID(int i) {
		for (int j = 0; j < 20; j++)
			if (cache[j].interfaceType == (long) i)
				return cache[j];

		anInt56 = (anInt56 + 1) % 20;
		EntityDef entityDef = cache[anInt56] = new EntityDef();
		stream.currentOffset = streamIndices[i];
		entityDef.interfaceType = i;
		entityDef.readValues(stream);
		switch (i) {
		
		case 2005: 
			entityDef.name = "Draconic visage";
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Take";
			entityDef.anIntArray94 = new int[] {26456};
			entityDef.description = "It's a Draconic visage.".getBytes();
		break;
		
		case 4000:
			entityDef.name = "Prince Black Dragon";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.actions[1] = "Talk-to";
			entityDef.anIntArray94 = new int[] {17414, 17415, 17429, 17422};
			entityDef.description = "Not quite the full royalty yet.".getBytes();
			entityDef.standAnim = 90;
			entityDef.walkAnim = 4635;
			entityDef.anInt86 = 40;
			entityDef.anInt91 = 40;
		break;
		
		case 4001:
			entityDef.name = "General Graardor Jr.";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.actions[1] = "Talk-to";
			entityDef.anIntArray94 = new int[] {27785, 27789};
			entityDef.description = "Totally unintelligible.".getBytes();
			entityDef.standAnim = 7059;
			entityDef.walkAnim = 7058;
			entityDef.anInt86 = 30;
			entityDef.anInt91 = 30;
		break;	
		

		
		case 4003:
			entityDef.name = "Chaos Elemental Jr.";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.actions[1] = "Talk-to";
			entityDef.anIntArray94 = new int[] {11216};
			entityDef.description = "D'aw look at the liddle...".getBytes();
			entityDef.standAnim = 3144;
			entityDef.walkAnim = 3145;
			entityDef.anInt86 = 30;
			entityDef.anInt91 = 30;
		break;
		
		
		
		case 4005:
			entityDef.name = "Kree'Arra Jr.";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.actions[1] = "Talk-to";
			entityDef.anIntArray94 = new int[] {28003, 28004};
			entityDef.standAnim = 6972;
			entityDef.walkAnim = 6973;
			entityDef.anInt86 = 30;
			entityDef.anInt91 = 30;
		break;
		
		case 4006:
			entityDef.name = "K'ril Tsutsaroth Jr.";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.actions[1] = "Talk-to";
			entityDef.anIntArray94 = new int[] {27768, 27773, 27764, 27765, 27770};
			entityDef.standAnim = 6943;
			entityDef.walkAnim = 6942;
			entityDef.anInt86 = 30;
			entityDef.anInt91 = 30;
		break;
		
		case 4007:
			entityDef.name = "Commander Zilyana Jr.";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.actions[1] = "Talk-to";
			entityDef.anIntArray94 = new int[] {28057, 28071, 28078, 28056};
			entityDef.combatLevel = 596;
			entityDef.standAnim = 6963;
			entityDef.walkAnim = 6962;
			entityDef.anInt86 = 70;
			entityDef.anInt91 = 70;
		break;

		
		case 4011:
			entityDef.name = "Ahrim the Blighted";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.actions[1] = "Talk-to";
			entityDef.anIntArray94 = new int[] {6668};
			entityDef.combatLevel = 98;
			entityDef.standAnim = 813;
			entityDef.walkAnim = 1205;
			entityDef.anInt86 = 100;
			entityDef.anInt91 = 100;
		break;
		
		case 4012:
			entityDef.name = "Dharok the Wretched";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.actions[1] = "Talk-to";
			entityDef.anIntArray94 = new int[] {6652, 6671, 6640, 6661, 6703, 6679};
			entityDef.combatLevel = 115;
			entityDef.standAnim = 2065;
			entityDef.walkAnim = 2064;
			entityDef.anInt86 = 100;
			entityDef.anInt91 = 100;
		break;
		
		case 4013:
			entityDef.name = "Guthan the Infested";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.actions[1] = "Talk-to";
			entityDef.anIntArray94 = new int[] {6654, 6673, 6642, 6666, 6679, 6710};
			entityDef.standAnim = 813;
			entityDef.walkAnim = 1205;
			entityDef.combatLevel = 115;
			entityDef.anInt86 = 100;
			entityDef.anInt91 = 100;
		break;
		
		case 4014:
			entityDef.name = "Karil the Tainted";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.actions[1] = "Talk-to";
			entityDef.anIntArray94 = new int[] {6675};
			entityDef.standAnim = 2074;
			entityDef.walkAnim = 2076;
			entityDef.combatLevel = 98;
			entityDef.anInt86 = 100;
			entityDef.anInt91 = 100;
		break;
		
		case 4015:
			entityDef.name = "Torag the Corrupted";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.actions[1] = "Talk-to";
			entityDef.anIntArray94 = new int[] {6657, 6677, 6645, 6663, 6708, 6679};
			entityDef.standAnim = 808;
			entityDef.walkAnim = 819;
			entityDef.combatLevel = 115;
			entityDef.anInt86 = 100;
			entityDef.anInt91 = 100;
		break;
		
		case 4016:
			entityDef.name = "Verac the Defiled";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.actions[1] = "Talk-to";
			entityDef.anIntArray94 = new int[] {6678, 6705};
			entityDef.standAnim = 2061;
			entityDef.walkAnim = 2060;
			entityDef.combatLevel = 115;
			entityDef.anInt86 = 100;
			entityDef.anInt91 = 100;
		break;
		
		case 4017:
			entityDef.name = "Kraken Jr.";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.actions[1] = "Talk-to";
			entityDef.anIntArray94 = new int[] {28233};
			entityDef.description = "How....is it walking?".getBytes();
			entityDef.standAnim = 3989;
		    entityDef.walkAnim = 3989;
			entityDef.anInt86 = 20;
			entityDef.anInt91 = 20;
			break;
		
		case 608:
			entityDef.name = "Sir Amik Varze";
			entityDef.actions[2] = "Exchange Scrolls";
			break;
	       case 4174:
	           entityDef.name = "Callisto";
	           entityDef.combatLevel = 470;
	           entityDef.anIntArray94[0] = 28298;
	           EntityDef callisto = forID(105);
	           entityDef.standAnim = callisto.standAnim;
	           entityDef.walkAnim = callisto.walkAnim;
	           entityDef.actions = callisto.actions;
	           entityDef.anInt86 = 70;
	           entityDef.anInt91 = 60;
	    	  break;
	       case 3580:
	    	   entityDef.actions = new String[] {null, "Attack", null, null, null};
	    	   break;

	    case 4173: 
	    	entityDef.anIntArray94 = new int[2];
	        entityDef.anIntArray94[0] = 28294;
	        entityDef.anIntArray94[1] = 28295;
	        entityDef.name = "Venenatis";
	        entityDef.actions = new String[] {null, "Attack", null, null, null};
	        entityDef.anInt86 = 200;
	        entityDef.anInt91 = 200;
	        EntityDef ven = forID(60);
	        entityDef.standAnim = ven.standAnim;
	        entityDef.walkAnim = ven.walkAnim;
	        entityDef.combatLevel = 464;
	        break;
	    case 4172: 
	    	entityDef.anIntArray94 = new int[1];
	    	entityDef.anIntArray94[0] = 28293;
	    	entityDef.name = "Scorpia";
	    	entityDef.actions = new String[] {null, "Attack", null, null, null};
	    	EntityDef scor = forID(107);
	        entityDef.standAnim = scor.standAnim;
	        entityDef.walkAnim = scor.walkAnim;
	        entityDef.combatLevel = 464;
	        break;
	    case 4175: 
	    	entityDef.anIntArray94 = new int[1];
	    	entityDef.anIntArray94[0] = 28299;
	    	entityDef.name = "Vet'ion";
	    	entityDef.actions = new String[] {null, "Attack", null, null, null};
	    	EntityDef vet = forID(90);
	        entityDef.standAnim = vet.standAnim;
	        entityDef.walkAnim = vet.walkAnim;
	        entityDef.combatLevel = 464;
	        break;
	    case 4176: 
	    	entityDef.anIntArray94 = new int[3];
	    	entityDef.anIntArray94[0] = 28400;
	    	entityDef.anIntArray94[1] = 28301;
	    	entityDef.anIntArray94[2] = 28302;
	    	entityDef.name = "Lava dragon";
	    	entityDef.anInt86 = 90;
	        entityDef.anInt91 = 79;
	        entityDef.combatLevel = 252;
	        entityDef.anIntArray94 = new int[] { 28400, 28301, 28302, 16540 };
	        EntityDef lava = forID(54);
	        entityDef.standAnim = lava.standAnim;
	        entityDef.walkAnim = lava.walkAnim;
	        entityDef.actions = new String[] {null, "Attack", null, null, null};
	        //localZI1.A = localZI4.A;
	        break;//
	    case 4158: 
	    	entityDef.anIntArray94 = new int[1];
	    	entityDef.anIntArray94[0] = 28233;
	    	entityDef.name = "Cave kraken";
	    	entityDef.actions = new String[] {null, "Attack", null, null, null};
	    	EntityDef cave = forID(3847);
	    	entityDef.anIntArray94 = new int[1];
	        entityDef.anIntArray94[0] = 28233;
	        entityDef.combatLevel = 127;
	        entityDef.standAnim = 3989;
	        entityDef.walkAnim = cave.walkAnim;
	        entityDef.anInt86 = 42;
	        entityDef.anInt91 = 42;
	        break;
	    case 4154: 
	    	entityDef.anIntArray94 = new int[1];
	    	entityDef.anIntArray94[0] = 28233;
	    	entityDef.name = "Kraken";
	    	entityDef.actions = new String[] {null, "Attack", null, null, null};
	    	EntityDef eld = forID(3847);
	        entityDef.anIntArray94 = new int[1];
	        entityDef.anIntArray94[0] = 28233;
	        entityDef.combatLevel = 291;
	        entityDef.standAnim = 3989;
	        entityDef.walkAnim = eld.walkAnim;
	        entityDef.anInt86 = 84;
	        entityDef.anInt91 = 84;
	        break;
		case 273: 
			entityDef.name = "Emblem Trader";
			entityDef.actions = new String[] {"Talk-to", null, "Trade", "Skull", null};
			break;
		case 945: 
			entityDef.name = "Zerix Guide";
			break;
	    case 1625:
	           entityDef.name = "Smoke devil";
	           entityDef.combatLevel = 160;
	           entityDef.anIntArray94[0] = 28302;
	           EntityDef smoke = forID(1624);
	           entityDef.standAnim = smoke.standAnim;
	           entityDef.walkAnim = smoke.walkAnim;
	           entityDef.actions = smoke.actions;
	           entityDef.anInt86 = smoke.anInt86;
	           entityDef.anInt91 = smoke.anInt91;
	    	   break;
		}
		return entityDef;
	}

	public Model method160() {
		if (childrenIDs != null) {
			EntityDef entityDef = method161();
			if (entityDef == null)
				return null;
			else
				return entityDef.method160();
		}
		if (anIntArray73 == null)
			return null;
		boolean flag1 = false;
		for (int i = 0; i < anIntArray73.length; i++)
			if (!Model.method463(anIntArray73[i]))
				flag1 = true;

		if (flag1)
			return null;
		Model aclass30_sub2_sub4_sub6s[] = new Model[anIntArray73.length];
		for (int j = 0; j < anIntArray73.length; j++)
			aclass30_sub2_sub4_sub6s[j] = Model.method462(anIntArray73[j]);

		Model model;
		if (aclass30_sub2_sub4_sub6s.length == 1)
			model = aclass30_sub2_sub4_sub6s[0];
		else
			model = new Model(aclass30_sub2_sub4_sub6s.length,
					aclass30_sub2_sub4_sub6s);
		if (anIntArray76 != null) {
			for (int k = 0; k < anIntArray76.length; k++)
				model.method476(anIntArray76[k], anIntArray70[k]);

		}
		return model;
	}

	public EntityDef method161() {
		int j = -1;
		if (anInt57 != -1 && anInt57 <= 2113) {
			VarBit varBit = VarBit.cache[anInt57];
			int k = varBit.anInt648;
			int l = varBit.anInt649;
			int i1 = varBit.anInt650;
			int j1 = AJ.anIntArray1232[i1 - l];
			j = clientInstance.variousSettings[k] >> l & j1;
		} else if (anInt59 != -1)
			j = clientInstance.variousSettings[anInt59];
		if (j < 0 || j >= childrenIDs.length || childrenIDs[j] == -1)
			return null;
		else
			return forID(childrenIDs[j]);
	}

	public static void unpackConfig(StreamLoader streamLoader) {
		stream = new Stream(streamLoader.getDataForName("npc.dat"));
		Stream stream2 = new Stream(streamLoader.getDataForName("npc.idx"));
		int totalNPCs = stream2.readUnsignedWord();
		streamIndices = new int[totalNPCs];
		int i = 2;
		for (int j = 0; j < totalNPCs; j++) {
			streamIndices[j] = i;
			i += stream2.readUnsignedWord();
		}

		cache = new EntityDef[20];
		for (int k = 0; k < 20; k++)
			cache[k] = new EntityDef();
		for (int index = 0; index < totalNPCs; index++) {
			EntityDef ed = forID(index);
			if (ed == null)
				continue;
			if (ed.name == null)
				continue;
		}
	}

	public static void nullLoader() {
		mruNodes = null;
		streamIndices = null;
		cache = null;
		stream = null;
	}

	public Model method164(int j, int k, int ai[]) {
		if (childrenIDs != null) {
			EntityDef entityDef = method161();
			if (entityDef == null)
				return null;
			else
				return entityDef.method164(j, k, ai);
		}
		Model model = (Model) mruNodes.insertFromCache(interfaceType);
		if (model == null) {
			boolean flag = false;
			for (int i1 = 0; i1 < anIntArray94.length; i1++)
				if (!Model.method463(anIntArray94[i1]))
					flag = true;

			if (flag)
				return null;
			Model aclass30_sub2_sub4_sub6s[] = new Model[anIntArray94.length];
			for (int j1 = 0; j1 < anIntArray94.length; j1++)
				aclass30_sub2_sub4_sub6s[j1] = Model
				.method462(anIntArray94[j1]);

			if (aclass30_sub2_sub4_sub6s.length == 1)
				model = aclass30_sub2_sub4_sub6s[0];
			else
				model = new Model(aclass30_sub2_sub4_sub6s.length,
						aclass30_sub2_sub4_sub6s);
			if (anIntArray76 != null) {
				for (int k1 = 0; k1 < anIntArray76.length; k1++)
					model.method476(anIntArray76[k1], anIntArray70[k1]);

			}
			model.method469();
			//model.method479(64 + anInt85, 850 + anInt92, -30, -50, -30, true);
			model.method479(84 + anInt85, 1000 + anInt92, -90, -580, -90, true);
			mruNodes.removeFromCache(model, interfaceType);
		}
		Model model_1 = Model.aModel_1621;
		model_1.method464(model, Class36.method532(k) & Class36.method532(j));
		if (k != -1 && j != -1)
			model_1.method471(ai, j, k);
		else if (k != -1)
			model_1.method470(k);
		if (anInt91 != 128 || anInt86 != 128)
			model_1.method478(anInt91, anInt91, anInt86);
		model_1.method466();
		model_1.anIntArrayArray1658 = null;
		model_1.anIntArrayArray1657 = null;
		if (aByte68 == 1)
			model_1.aBoolean1659 = true;
		return model_1;
	}

	public void readValues(Stream stream) {
		do {
			int i = stream.readUnsignedByte();
			if (i == 0)
				return;
			if (i == 1) {
				int j = stream.readUnsignedByte();
				anIntArray94 = new int[j];
				for (int j1 = 0; j1 < j; j1++)
					anIntArray94[j1] = stream.readUnsignedWord();

			} else if (i == 2)
				name = stream.readNewString();
			else if (i == 3)
				description = stream.readBytes();
			else if (i == 12)
				aByte68 = stream.readSignedByte();
			else if (i == 13)
				standAnim = stream.readUnsignedWord();
			else if (i == 14)
				walkAnim = stream.readUnsignedWord();
			else if (i == 17) {
				walkAnim = stream.readUnsignedWord();
				anInt58 = stream.readUnsignedWord();
				anInt83 = stream.readUnsignedWord();
				anInt55 = stream.readUnsignedWord();
			} else if (i >= 30 && i < 40) {
				if (actions == null)
					actions = new String[5];
				actions[i - 30] = stream.readNewString();
				if (actions[i - 30].equalsIgnoreCase("hidden"))
					actions[i - 30] = null;
			} else if (i == 40) {
				int k = stream.readUnsignedByte();
				anIntArray76 = new int[k];
				anIntArray70 = new int[k];
				for (int k1 = 0; k1 < k; k1++) {
					anIntArray76[k1] = stream.readUnsignedWord();
					anIntArray70[k1] = stream.readUnsignedWord();
				}

			} else if (i == 60) {
				int l = stream.readUnsignedByte();
				anIntArray73 = new int[l];
				for (int l1 = 0; l1 < l; l1++)
					anIntArray73[l1] = stream.readUnsignedWord();

			} else if (i == 90)
				stream.readUnsignedWord();
			else if (i == 91)
				stream.readUnsignedWord();
			else if (i == 92)
				stream.readUnsignedWord();
			else if (i == 93)
				aBoolean87 = false;
			else if (i == 95)
				combatLevel = stream.readUnsignedWord();
			else if (i == 97)
				anInt91 = stream.readUnsignedWord();
			else if (i == 98)
				anInt86 = stream.readUnsignedWord();
			else if (i == 99)
				aBoolean93 = true;
			else if (i == 100)
				anInt85 = stream.readSignedByte();
			else if (i == 101)
				anInt92 = stream.readSignedByte() * 5;
			else if (i == 102)
				anInt75 = stream.readUnsignedWord();
			else if (i == 103)
				anInt79 = stream.readUnsignedWord();
			else if (i == 106) {
				anInt57 = stream.readUnsignedWord();
				if (anInt57 == 65535)
					anInt57 = -1;
				anInt59 = stream.readUnsignedWord();
				if (anInt59 == 65535)
					anInt59 = -1;
				int i1 = stream.readUnsignedByte();
				childrenIDs = new int[i1 + 1];
				for (int i2 = 0; i2 <= i1; i2++) {
					childrenIDs[i2] = stream.readUnsignedWord();
					if (childrenIDs[i2] == 65535)
						childrenIDs[i2] = -1;
				}

			} else if (i == 107)
				aBoolean84 = false;
		} while (true);
	}

	public EntityDef() {
		anInt55 = -1;
		anInt57 = -1;
		anInt58 = -1;
		anInt59 = -1;
		combatLevel = -1;
		anInt64 = 1834;
		walkAnim = -1;
		aByte68 = 1;
		anInt75 = -1;
		standAnim = -1;
		interfaceType = -1L;
		anInt79 = 32;
		anInt83 = -1;
		aBoolean84 = true;
		anInt86 = 128;
		aBoolean87 = true;
		anInt91 = 128;
		aBoolean93 = false;
	}

	public int anInt55;
	public static int anInt56;
	public int anInt57;
	public int anInt58;
	public int anInt59;
	public static Stream stream;
	public int combatLevel;
	public final int anInt64;
	public String name;
	public String actions[];
	public int walkAnim;
	public byte aByte68;
	public int[] anIntArray70;
	public static int[] streamIndices;
	public int[] anIntArray73;
	public int anInt75;
	public int[] anIntArray76;
	public int standAnim;
	public long interfaceType;
	public int anInt79;
	public static EntityDef[] cache;
	public static AJ clientInstance;
	public int anInt83;
	public boolean aBoolean84;
	public int anInt85;
	public int anInt86;
	public boolean aBoolean87;
	public int childrenIDs[];
	public byte description[];
	public int anInt91;
	public int anInt92;
	public boolean aBoolean93;
	public int[] anIntArray94;
	public static MRUNodes mruNodes = new MRUNodes(30);

}
