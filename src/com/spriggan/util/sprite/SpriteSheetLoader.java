/* SpriteSheetLoader.java
 * Pizzapuncher Productions, 2015.
 * This code is written under what we call the CSL ( Common Sense License ). 
 * We believe that code can be learned from, whether brilliantly or poorly written, and thus we are willing to share.
 * You may use this code for whatever purpose you will, but you should do so in good judgement, at your own risk,
 * and with the understanding that we assume no responsibility and offer no warranty on this code. 
 * We do not even guarantee that it works exactly as advertised.
 */

package com.spriggan.util.sprite;
import java.awt.image.BufferedImage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import com.spriggan.util.io.FileHandler;
import com.spriggan.util.io.ImageHandler;
import com.spriggan.util.io.OSUtils;
import com.spriggan.util.log.Logger;


/**
 * Singleton, loads SpriteSheet instances into memory.
 * @author chakrabortyr
 */
public class SpriteSheetLoader {
    private static final Map<Long, SpriteSheet> spriteSheets = new HashMap<>();
    
    private SpriteSheetLoader() {       
    }
    
    /*
     * Loads sprite sheets from sprites.cfg
     * 
     * Assumption: SPRITE_PATH variable in spriggan.cfg is properly set, SPRITE_PATH folder
     * has master.dat properly set
    */
    public void loadSprites() throws FileNotFoundException, IOException {
        String spriteInfo = FileHandler.fileHandler.getPathFromSpriggan("SPRITE_PATH");
        if (!spriteInfo.equals("undef")) {
            Logger.logger.Write("Retrieving sprites from: " + spriteInfo);
        } else {
            Logger.logger.Write("Could not retrieve SPRITE_PATH variable from spriggan.cfg! "
                    + "Please ensure this value is properly set.");
        }
        
        BufferedReader reader = new BufferedReader(new FileReader(FileHandler.getAbsolutePath() + spriteInfo + "sprites.txt"));
        String read;
        
        while((read = reader.readLine()) != null) {
            String params [] = read.split("\\,+");
            long id = Integer.parseInt(params[0]);
            BufferedImage img = ImageHandler.imageHandler.getImage(FileHandler.getAbsolutePath() + spriteInfo + params[1]);
            
            SpriteSheet sheet = new SpriteSheet(img, id, img.getWidth(), img.getHeight(), img.getWidth() / 64, img.getHeight() / 64);          
            spriteSheets.put(id, sheet);
        }
    }
    
    public SpriteSheet getSprite(long id) {
        return spriteSheets.get(id);
    }
    
    public static final SpriteSheetLoader spriteSheetLoader = new SpriteSheetLoader();
}
