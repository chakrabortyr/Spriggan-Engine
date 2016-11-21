/* Window.java
 * Pizzapuncher Productions, 2015.
 * This code is written under what we call the CSL ( Common Sense License ). 
 * We believe that code can be learned from, whether brilliantly or poorly written, and thus we are willing to share.
 * You may use this code for whatever purpose you will, but you should do so in good judgement, at your own risk,
 * and with the understanding that we assume no responsibility and offer no warranty on this code. 
 * We do not even guarantee that it works exactly as advertised.
 */

package com.spriggan.main;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class Window {
    public static void main(String[] args) {
        //TODO: Add Client + Replace with JSON params
        new LwjglApplication(new Game(), "Placeholder", 800, 640);
    }
}