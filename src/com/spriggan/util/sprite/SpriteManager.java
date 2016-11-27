/* SpriteManager.java
 * Pizzapuncher Productions, 2015.
 * This code is written under what we call the CSL ( Common Sense License ). 
 * We believe that code can be learned from, whether brilliantly or poorly written, and thus we are willing to share.
 * You may use this code for whatever purpose you will, but you should do so in good judgement, at your own risk,
 * and with the understanding that we assume no responsibility and offer no warranty on this code. 
 * We do not even guarantee that it works exactly as advertised.
 */

package com.spriggan.util.sprite;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Map;
import java.util.HashMap;

import com.spriggan.util.log.Logger;


/**
 * Singleton, loads SpriteSheet instances into memory.
 * @author chakrabortyr
 */
public class SpriteManager {
    private static final Map<Long, SpriteSheet> spriteSheets = new HashMap<>();
    
    private SpriteManager() {       
    }
    
    /*
     * Loads sprite sheets from sprites.cfg
     * 
     * Assumption: SPRITE_PATH variable in spriggan.cfg is properly set, SPRITE_PATH folder
     * has master.dat properly set
    */
    public void loadSprites(String spritePath) throws FileNotFoundException, IOException {
    
        if (spritePath == null || spritePath.isEmpty()) {
            Logger.logger.Write("Retrieving sprites from: " + spritePath);
        } else {
            Logger.logger.Write("Could not retrieve Sprite Path from Configuration! "
                    + "Please ensure this value is properly set.");
        }
        
        //TODO: Implement TextureAtlases
    }
    
    public SpriteSheet getSprite(long id) {
        return spriteSheets.get(id);
    }
    
    /**
     * Static instance of SpriteManager
     */
    public static final SpriteManager spriteManager = new SpriteManager();
}
