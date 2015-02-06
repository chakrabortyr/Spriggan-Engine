/* Client.java
 * Pizzapuncher Productions, 2015.
 * This code is written under what we call the CSL ( Common Sense License ). We believe that code can be learned from,
 * poorly written or otherwise, and thus we are willing to share. You may use this code for whatever purpose you will, 
 * but you should do so in good judgement and at your own risk, and with the understanding that we assume no responsibility 
 * and offer no warranty on this code; we do not even guarantee that it works exactly as advertised.
 */

package com.spriggan.main;

import java.io.IOException;

import com.spriggan.util.log.Logger;
import com.spriggan.util.sprite.SpriteSheetLoader;

/**
 * The Client instance controls everything
 * @author chakrabortyr
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Logger.logger.Init();
        
        try {
            SpriteSheetLoader.spriteSheetLoader.loadSpriteSheetsFromCfg();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Logger.logger.Close();
    }
    
}
