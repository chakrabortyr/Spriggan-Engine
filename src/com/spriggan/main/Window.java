/* Window.java
 * Pizzapuncher Productions, 2015.
 * This code is written under what we call the CSL ( Common Sense License ). 
 * We believe that code can be learned from, whether brilliantly or poorly written, and thus we are willing to share.
 * You may use this code for whatever purpose you will, but you should do so in good judgement, at your own risk,
 * and with the understanding that we assume no responsibility and offer no warranty on this code. 
 * We do not even guarantee that it works exactly as advertised.
 */

package com.spriggan.main;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.spriggan.util.log.Logger;

public class Window {
    public static void main(String[] args) {
        if (args[0] == null || args[0].isEmpty()) {
            Logger.logger.Write("No configuration file specified!");
            
            System.exit(666);
        }
        
        Client client = new Client();
        client.Go(args[0]);
        
        LwjglApplication app;
        
        try {
            app = new LwjglApplication(new Game(), client.getConfig().getGameName(), client.getConfig().getXRes(), client.getConfig().getYRes());
        } catch (Exception e) {
            Logger.logger.Write(e.getMessage());
            client.Stop();
            System.exit(666);
        }
    }
}