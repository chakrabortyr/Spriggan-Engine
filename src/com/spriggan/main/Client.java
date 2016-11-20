/* Client.java
 * Pizzapuncher Productions, 2015.
 * This code is written under what we call the CSL ( Common Sense License ). 
 * We believe that code can be learned from, whether brilliantly or poorly written, and thus we are willing to share.
 * You may use this code for whatever purpose you will, but you should do so in good judgement, at your own risk,
 * and with the understanding that we assume no responsibility and offer no warranty on this code. 
 * We do not even guarantee that it works exactly as advertised.
 */

package com.spriggan.main;

import com.spriggan.util.io.OSUtils;
import java.io.IOException;

import com.spriggan.util.log.Logger;
import com.spriggan.util.sprite.SpriteSheetLoader;

/**
 * Client Instances control the entire Application.
 * @author chakrabortyr
 */
public class Client {
    
    public Client() {
        
    }

    /**
     * Launches Logger, OSUtils, and loads up our files.
     * @author chakrabortyr
     */
    public void Go() {
        Logger.logger.Init();
        OSUtils osUtil = new OSUtils();
        osUtil.getOS();
        
        try {
            SpriteSheetLoader.spriteSheetLoader.loadSprites();       
        } catch (IOException e) {
            Logger.logger.Write(e.toString());
        }
        
        Logger.logger.Close();
    }
    
}
