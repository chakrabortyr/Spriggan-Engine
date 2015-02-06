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
import java.io.FileReader;
import java.io.FileWriter;

import javax.imageio.ImageIO;

/**
 *
 * @author chakrabortyr
 */
public class FileHandler {
    public String getAbsolutePath() {
        return new File("").getAbsolutePath();
    }
    
    public String getCanonicalPath() throws Exception {
        return new File("").getCanonicalPath();
    }
    
    public static FileHandler fileHandler = new FileHandler();
}
