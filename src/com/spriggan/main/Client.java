/* Client.java
 * Pizzapuncher Productions, 2015.
 * This code is written under what we call the CSL ( Common Sense License ). 
 * We believe that code can be learned from, whether brilliantly or poorly written, and thus we are willing to share.
 * You may use this code for whatever purpose you will, but you should do so in good judgement, at your own risk,
 * and with the understanding that we assume no responsibility and offer no warranty on this code. 
 * We do not even guarantee that it works exactly as advertised.
 */

package com.spriggan.main;

import java.io.File;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import com.spriggan.util.io.Configuration;
import com.spriggan.util.log.Logger;
import com.spriggan.util.misc.OSUtils;
import com.spriggan.util.sprite.SpriteSheetLoader;

/**
 * Client Instances control the entire Application.
 * @author chakrabortyr
 */
public class Client {
    private Configuration sprigganCfg;
    private static final Gson gson = new Gson();
    
    public Client() {
        
    }
    
    public Client getInstance() {
        return this;
    }

    /**
     * Launches Logger, OSUtils, and loads up our files.
     * @author chakrabortyr
     * @param cfgPath Path to Json configuration file provided by command line
     */
    public void Go(String cfgPath) {
        Logger.logger.Init();
        OSUtils.getOS();
        
        try {
            FileReader cfgFile = new FileReader(new File(getAbsolutePath() + cfgPath));
            JsonReader reader = new JsonReader(cfgFile);
            
            sprigganCfg = gson.fromJson(reader, Configuration.class);

            //SpriteSheetLoader.spriteSheetLoader.loadSprites(sprigganCfg.getSpritePath());       
        } catch (Exception e) {
            Logger.logger.Write(e.toString());
        }
    }

    public void Stop() {
        Logger.logger.Close();
    }
    
    public Configuration getConfig() {
        return this.sprigganCfg;
    }
    
    public static String getAbsolutePath() {
        return new File("").getAbsolutePath();
    }
    
    public static String getCanonicalPath() throws Exception {
        return new File("").getCanonicalPath();
    }
    
    public static String normalizeWindowsPath(String path) {
        return path.replaceAll("\\/", "\\\\");
    }
}
