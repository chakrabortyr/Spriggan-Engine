/* FileHandler.java
 * Pizzapuncher Productions, 2015.
 * This code is written under what we call the CSL ( Common Sense License ). 
 * We believe that code can be learned from, whether brilliantly or poorly written, and thus we are willing to share.
 * You may use this code for whatever purpose you will, but you should do so in good judgement, at your own risk,
 * and with the understanding that we assume no responsibility and offer no warranty on this code. 
 * We do not even guarantee that it works exactly as advertised.
 */

package com.spriggan.util.io;

import java.io.Serializable;

/**
 *  Takes in Configuration params from JSON file, used by the Client when specifying resolution, game data paths, etc.
 *  NOTE: Treat spritePath/gamePath/gameName as final, they should never be modified post creation of the game window!
 */
public class Configuration implements Serializable {
    private String spritePath;
    private String gamePath;
    private String gameName;
    private int windowXRes;
    private int windowYRes;

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
        return this.windowYRes;
    }
}
