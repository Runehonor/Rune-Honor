package com.runehonor;

import com.runehonor.game.players.Client;
import com.runehonor.game.players.Player;
import com.runehonor.game.players.PlayerHandler;
import com.runehonor.game.players.PlayerSave;


/**
 * Shutdown hook.
 *
 * @author Primadude
 */
public class ShutdownHook extends Thread {

    /**
     * The singleton.
     */
    private static final ShutdownHook SINGLETON = new ShutdownHook();

    /**
     * Constructs a new {@code ExorthShutdownHook} {@code Object}.
     */
    private ShutdownHook() {
        System.out.println("[Stage 6] Shutdown hook initialized!");
    }

    @Override
    public void run() {
        System.out.println("Shutting down Exorth...");
        int failCount = 0;
        System.out.println("Preparing players for shutdown...");
        for(Player p : PlayerHandler.players) {
            if (p == null)
                continue;
            PlayerSave.saveGame((Client)p);
            try {
                failCount = 0;
                
               //while (!Player p : PlayerHandler.players) {
                    if (failCount++ > 2) {
                        //Your failed saved file here.
                        break;
                    }
            } catch (Throwable t) {
                t.printStackTrace();
            }
        }
        System.out.println("Players saved.");
    }

    /**
     * @return the singleton
     */
    public static ShutdownHook getSingleton() {
        return SINGLETON;
    }
}