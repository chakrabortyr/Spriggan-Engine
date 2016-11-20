/* OSUtils.java
 * Pizzapuncher Productions, 2015.
 * This code is written under what we call the CSL ( Common Sense License ). 
 * We believe that code can be learned from, whether brilliantly or poorly written, and thus we are willing to share.
 * You may use this code for whatever purpose you will, but you should do so in good judgement, at your own risk,
 * and with the understanding that we assume no responsibility and offer no warranty on this code. 
 * We do not even guarantee that it works exactly as advertised.
 */

package com.spriggan.util.io;

/**
 * Detects current Operating System, behaves accordingly.
 * @author chakrabortyr
 */
public class OSUtils {
    private static String operatingSystem; // whatever OS we're running.
    
    public OSUtils() {
        
    }
    
    public void getOS() {
        operatingSystem = System.getProperty("os.name").toLowerCase();
    }
    
    public static boolean isWindows() {
        return operatingSystem.contains("win");
    }
    
    public static boolean isOSX() {
        return operatingSystem.contains("mac");
    }
    
    /*
     * Tells us if the system we are running is a Linux or Unix Derivative.
    */
    public static boolean isUnix() {
        return operatingSystem.contains("nux") || operatingSystem.contains("nix");
    }
}
