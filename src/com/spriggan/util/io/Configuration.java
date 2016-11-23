/* FileHandler.java
 * Pizzapuncher Productions, 2015.
 * This code is written under what we call the CSL ( Common Sense License ). 
 * We believe that code can be learned from, whether brilliantly or poorly written, and thus we are willing to share.
 * You may use this code for whatever purpose you will, but you should do so in good judgement, at your own risk,
 * and with the understanding that we assume no responsibility and offer no warranty on this code. 
 * We do not even guarantee that it works exactly as advertised.
 */

package com.spriggan.util.io;

/**
 *  Takes in Configuration params from JSON file, used by 
 */
protected class Configuration {
    private static String spritePath;
    private static String gamePath;
    private static String gameName;
    private int windowXRes;
    private int windowYres;

    public Configuration() {};

    public String getSpritePath() {
        return this.spritePath;
    }

    public String getGamePath() {
        return this.gamePath;
    }

    public String getGameName() {
        return this.gameName;
    }

    public int getXRes() {
        return this.windowXRes;
    }

    public int getYRes() {
        return this.windowYres;
    }
}
