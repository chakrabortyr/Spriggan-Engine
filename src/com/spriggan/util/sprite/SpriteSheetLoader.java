/* SpriteSheetLoader.java
 * Pizzapuncher Productions, 2015.
 * This code is written under what we call the CSL ( Common Sense License ). We believe that code can be learned from,
 * poorly written or otherwise, and thus we are willing to share. You may use this code for whatever purpose you will, 
 * but you should do so in good judgement and at your own risk, and with the understanding that we assume no responsibility 
 * and offer no warranty on this code; we do not even guarantee that it works exactly as advertised.
 */

package com.spriggan.util.sprite;

import java.awt.image.BufferedImage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import javax.imageio.ImageIO;

import com.spriggan.util.log.Logger;
import com.spriggan.util.sprite.SpriteSheet;

/**
 * Singleton, loads SpriteSheet instances into memory. Refers to SPRITE_PATH of spriggan.cfg
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
    public void loadSpriteSheetsFromCfg() throws IOException {
        String absolutePath = new File("").getAbsolutePath();
        String filePath = "/cfg/spriggan.cfg"; //This can never be under any other name! As much as I dislike hardcoding filenames, it's simplest
                                               //this way. --RC
        BufferedReader reader = new BufferedReader(new FileReader(absolutePath + filePath));
        
        String spritePath = reader.readLine();
        String spritePathReal = spritePath.substring(12, spritePath.length());
        
        try {
            Logger.logger.Write("Loading sprites from SPRITE_PATH " + spritePathReal);
        } catch (NullPointerException n) {}
        
        reader.close();

        BufferedReader spriteReader = new BufferedReader(new FileReader(absolutePath + spritePathReal + "/master.dat"));

        //Adding sprite sheets to our collection
        String read;
        while ((read = spriteReader.readLine()) != null) {
            ImageIO.read(new File(read));
        }
    }
    
    public static final SpriteSheetLoader spriteSheetLoader = new SpriteSheetLoader();
}
