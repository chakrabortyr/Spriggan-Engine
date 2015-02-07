/* FileHandler.java
 * Pizzapuncher Productions, 2015.
 * This code is written under what we call the CSL ( Common Sense License ). 
 * We believe that code can be learned from, whether brilliantly or poorly written, and thus we are willing to share.
 * You may use this code for whatever purpose you will, but you should do so in good judgement, at your own risk,
 * and with the understanding that we assume no responsibility and offer no warranty on this code. 
 * We do not even guarantee that it works exactly as advertised.
 */

package com.spriggan.util.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import com.spriggan.util.log.Logger;

/**
 * FileHandler, takes care of most File I/O, retrieves information from configuration files.
 * @author chakrabortyr
 */
public class FileHandler {
    private static File sprigganCfg;
    
    private FileHandler() { 
        sprigganCfg = new File(getAbsolutePath() + "/cfg/spriggan.cfg");
        
        if(!sprigganCfg.exists()) {
            Logger.logger.Write("Could not locate spriggan.cfg!");
            System.exit(666);
        }
    }
    
    public String getPathFromSpriggan(String pathName) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(sprigganCfg);
        } catch (FileNotFoundException ex) { } //we should realistically never reach this
                                               //not finding it already triggers an error      
        
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            
            if (line.toLowerCase().contains(pathName.toLowerCase())) {
                String path = line.replaceAll(pathName + "=", "").trim();
                return path;
            }
        }
        
        return "undef";
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
    
    public static FileHandler fileHandler = new FileHandler();
}
