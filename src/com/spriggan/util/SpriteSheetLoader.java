package com.spriggan.util;

import java.awt.image.BufferedImage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import javax.imageio.ImageIO;

/**
 * Singleton, loads SpriteSheet instances into memory. 
 * @author Rudra Chakraborty
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
        String filePath = "/cfg/spriggan.cfg";
        BufferedReader reader = new BufferedReader(new FileReader(absolutePath + filePath));
        
        String spritePath = reader.readLine();
        String spritePathReal = spritePath.substring(11, spritePath.length());
        
        System.err.println("Loading sprites from SPRITE_PATH " + spritePathReal);
    }
    
    public static final SpriteSheetLoader spriteSheetLoader = new SpriteSheetLoader();
}
