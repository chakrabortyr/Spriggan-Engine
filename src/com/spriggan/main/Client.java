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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import com.google.code.gson.Gson;

import com.spriggan.util.log.Logger;
import com.spriggan.util.sprite.SpriteSheetLoader;

/**
 * Client Instances control the entire Application.
 * @author chakrabortyr
 */
public class Client {
    private static Configuration sprigganCfg;
    
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
            File cfgFile = new File(getAbsolutePath() + cfgPath);
            FileReader reader = new FileReader(cfgFile);

            Gson gson = new Gson();
            sprigganCfg = gson.fromJson(reader, Configuration.class);

            SpriteSheetLoader.spriteSheetLoader.loadSprites();       
        } catch (IOException e) {
            Logger.logger.Write(e.toString());
        }
    }

    public void Stop() {
        Logger.logger.Close();
    }
    
    public String getAbsolutePath() {
        return new File("").getAbsolutePath();
    }
    
    public String getCanonicalPath() throws Exception {
        return new File("").getCanonicalPath();
    }
    
    public String normalizeWindowsPath(String path) {
        return path.replaceAll("\\/", "\\\\");
    }
}
