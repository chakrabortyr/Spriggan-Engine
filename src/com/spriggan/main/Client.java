package com.spriggan.main;

import java.io.IOException;

import com.spriggan.util.SpriteSheetLoader;

/**
 *
 * @author Rudra Chakraborty
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            SpriteSheetLoader.spriteSheetLoader.loadSpriteSheetsFromCfg();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
