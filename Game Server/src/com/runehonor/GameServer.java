package com.runehonor;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.text.DecimalFormat;

import org.Vote.MainLoader;
import org.apache.mina.common.IoAcceptor;
import org.apache.mina.transport.socket.nio.SocketAcceptor;
import org.apache.mina.transport.socket.nio.SocketAcceptorConfig;

import com.runehonor.clip.region.ObjectDef;
import com.runehonor.clip.region.Region;
import com.runehonor.content.poll.PollAssistant;
import com.runehonor.content.skills.Implings;
import com.runehonor.event.CycleEventHandler;
import com.runehonor.game.minigames.castlewars.CastleWars;
import com.runehonor.game.minigames.pestcontrol.PestControl;
import com.runehonor.game.minigames.trawler.Trawler;
import com.runehonor.game.minigames.tzhaar.FightCaves;
import com.runehonor.game.minigames.tzhaar.FightPits;
import com.runehonor.game.npcs.NPCHandler;
import com.runehonor.game.objects.doors.Doors;
import com.runehonor.game.objects.doors.DoubleDoors;
import com.runehonor.game.players.Client;
import com.runehonor.game.players.Player;
import com.runehonor.game.players.PlayerHandler;
import com.runehonor.game.players.PlayerSave;
import com.runehonor.world.ClanManager;
import com.runehonor.world.ItemHandler;
import com.runehonor.world.ObjectHandler;
import com.runehonor.world.ObjectManager;
import com.runehonor.world.PlayerManager;
import com.runehonor.world.ShopHandler;
import com.runehonor.world.StillGraphicsManager;
import com.runehonor.world.definitions.EntityDef;


//import org.runetoplist.VoteChecker;
import core.net.ConnectionHandler;
import core.net.ConnectionThrottleFilter;
import core.util.SimpleTimer;
import core.util.log.Logger;

/**
 * Server.java
 *
 * @author Sanity
 * @author Graham
 * @author Blake
 * @author Ryan Lmctruck30
 * @author Acquittal
 * @author Chris
 *
 */

public class GameServer {
	
	public static PlayerManager playerManager = null;
	private static StillGraphicsManager stillGraphicsManager = null;
	
	public static boolean sleeping;
	public static final int cycleRate;
	public static boolean UpdateServer = false;
	public static long lastMassSave = System.currentTimeMillis();
	private static IoAcceptor acceptor;
	private static ConnectionHandler connectionHandler;
	private static ConnectionThrottleFilter throttleFilter;
	private static SimpleTimer engineTimer, debugTimer;
	private static long cycleTime, cycles, totalCycleTime, sleepTime;
	private static DecimalFormat debugPercentFormat;
	public static boolean shutdownServer = false;		
	public static boolean shutdownClientHandler;			
	public static int serverlistenerPort;
	public static ItemHandler itemHandler = new ItemHandler();
	public static PlayerHandler playerHandler = new PlayerHandler();
    public static NPCHandler npcHandler = new NPCHandler();
	public static ShopHandler shopHandler = new ShopHandler();
	public static ObjectHandler objectHandler = new ObjectHandler();
	public static ObjectManager objectManager = new ObjectManager();
	public static ClanManager clanManager = new ClanManager();
	public static CastleWars castleWars = new CastleWars();
	public static FightPits fightPits = new FightPits();
	public static PestControl pestControl = new PestControl();
	public static Trawler trawler = new Trawler();
	//public static ClanChatHandler clanChat = new ClanChatHandler();
	public static FightCaves fightCaves = new FightCaves();
	
	static {
		if(!Constants.SERVER_DEBUG) {
			serverlistenerPort = 43594;
		} else {
			serverlistenerPort = 43594;
		}
		cycleRate = 600;
		shutdownServer = false;
		engineTimer = new SimpleTimer();
		debugTimer = new SimpleTimer();
		sleepTime = 0;
		debugPercentFormat = new DecimalFormat("0.0#%");
	}
	
	public static void main(java.lang.String args[]) throws NullPointerException, IOException {
		final String enginePrefix = "[" + Constants.SERVER_NAME + "] ";
		/**
		 * Starting Up Server
		 */
		ObjectDef.loadConfig();
		Region.load();
		//ShutdownHook.getSingleton().run();
		//WalkingCheck.load();
		//Highscores.process();
		/*if (Highscores.connected) {
			System.out.println("Connected to MySQL Database 'highscores'!");
		} else {
			System.out.println("Failed to connect to MySQL Database 'highscores'!");
		}*/
		System.setOut(new Logger(System.out));
		System.setErr(new Logger(System.err));
		Implings.spawnImplings();
		EntityDef.unpackConfig();
		System.out.println(enginePrefix + "Loaded NPC drops...");
		System.out.println(enginePrefix + "Loaded NPC spawns...");
		System.out.println(enginePrefix + "Loaded shops...");
		System.out.println(enginePrefix + "Loaded object spawns...");
		System.out.println(enginePrefix + "Connections are now being accepted...");
		
		/**
		 * Accepting Connections
		 */
		acceptor = new SocketAcceptor();
		connectionHandler = new ConnectionHandler();
		
		playerManager = PlayerManager.getSingleton();
		playerManager.setupRegionPlayers();
		stillGraphicsManager = new StillGraphicsManager();
		SocketAcceptorConfig sac = new SocketAcceptorConfig();
		sac.getSessionConfig().setTcpNoDelay(false);
		sac.setReuseAddress(true);
		sac.setBacklog(100);
		
		throttleFilter = new ConnectionThrottleFilter(Constants.CONNECTION_DELAY);
		sac.getFilterChain().addFirst("throttleFilter", throttleFilter);
		acceptor.bind(new InetSocketAddress(serverlistenerPort), connectionHandler, sac);

		/**
		 * Initialise Handlers
		 */
		Doors.getSingleton().load();
		DoubleDoors.getSingleton().load();
		Connection.initialize();
		PollAssistant.initialize();
		
		/**
		 * Server Successfully Loaded 
		 */
		System.out.println(enginePrefix + "Game server initialized on port " + serverlistenerPort + "...");
		/**
		 * Main Server Tick
		 */
		try {
			while (!GameServer.shutdownServer) {
				if (sleepTime >= 0)
					Thread.sleep(sleepTime);
				else
					Thread.sleep(600);
				engineTimer.reset();
				itemHandler.process();
				playerHandler.process();	
	            npcHandler.process();
				shopHandler.process();
				CycleEventHandler.process();
				objectManager.process();
				//castlewars
				CastleWars.process();
				fightPits.process();
				pestControl.process();
				cycleTime = engineTimer.elapsed();
				sleepTime = cycleRate - cycleTime;
				totalCycleTime += cycleTime;
				cycles++;
				debug();
				/*if (System.currentTimeMillis() - lastMassSave > 3) {
					for(Player p : PlayerHandler.players) {
						if(p == null)
							continue;						
						PlayerSave.saveGame((Client)p);
						lastMassSave = System.currentTimeMillis();
					}
				
				}*/
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("A fatal exception has been thrown!");
			for(Player p : PlayerHandler.players) {
				if(p == null)
					continue;						
				PlayerSave.saveGame((Client)p);
			}
		}
		acceptor = null;
		connectionHandler = null;
		sac = null;
		System.exit(0);
	}
	
	public static void processAllPackets() {
		for (int j = 0; j < PlayerHandler.players.length; j++) {
			if (PlayerHandler.players[j] != null) {
				while(PlayerHandler.players[j].processQueuedPackets());			
			}	
		}
	}
	
	public static boolean playerExecuted = false;
	private static void debug() {
		if (debugTimer.elapsed() > 360*1000 || playerExecuted) {
			long averageCycleTime = totalCycleTime / cycles;
			double engineLoad = ((double) averageCycleTime / (double) cycleRate);
			System.out.println("[GameEngine] Online: " + PlayerHandler.playerCount+ ", engine load: "+ debugPercentFormat.format(engineLoad));
			totalCycleTime = 0;
			cycles = 0;
			System.gc();
			System.runFinalization();
			debugTimer.reset();
			playerExecuted = false;
		}
	}
	
	public static long getSleepTimer() {
		return sleepTime;
	}
	
	public static StillGraphicsManager getStillGraphicsManager() {
		return stillGraphicsManager;
	}
	
	public static PlayerManager getPlayerManager() {
		return playerManager;
	}
	
	public static ObjectManager getObjectManager() {
		return objectManager;
	}
	
}
