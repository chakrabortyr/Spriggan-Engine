/* SpriteHandle.java
 * Pizzapuncher Productions, 2015.
 * This code is written under what we call the CSL ( Common Sense License ). 
 * We believe that code can be learned from, whether brilliantly or poorly written, and thus we are willing to share.
 * You may use this code for whatever purpose you will, but you should do so in good judgement, at your own risk,
 * and with the understanding that we assume no responsibility and offer no warranty on this code. 
 * We do not even guarantee that it works exactly as advertised.
 */

package com.spriggan.sprite;

import java.io.Serializable;

/**
 * SpriteHandle
 * Defines all parameters for this Sprite
 * @author chakrabortyr
 */
public class SpriteHandle implements Serializable {
    public String id; //The unique ID of this Sprite
    public boolean dynamic; //False if this is a static sprite (Placeable), true otherwise
    public boolean loop; //True if looping animation, false otherwise
    public float timePerFrame; //Time per frame of sprite in seconds
    public String action; //Only relevant on dynamic sprites, designates walking, standing, taunt, cast, etc
    public String filePath; //Path to this sprite
    public int width; //X dimension of this sprite
    public int height; //Y dimension of this sprite
    public int rows; // Number of rows
    public int columns; //Number of columns
}
