/* LegacySprite.java
 * Pizzapuncher Productions, 2015.
 * This code is written under what we call the CSL ( Common Sense License ). 
 * We believe that code can be learned from, whether brilliantly or poorly written, and thus we are willing to share.
 * You may use this code for whatever purpose you will, but you should do so in good judgement, at your own risk,
 * and with the understanding that we assume no responsibility and offer no warranty on this code. 
 * We do not even guarantee that it works exactly as advertised.
 */

package com.spriggan.sprite;

import java.awt.image.BufferedImage;

/**
 * @deprecated
 * Type definition for Sprite Sheet. Deprecated in favor of LibGDX based system.
 * @author chakrabortyr
 */
public class LegacySprite {
    private long id;
    private int width;
    private int height;
    private int rows;
    private int columns;
    private BufferedImage sprites[];

    /*
     * Creates a new instance of LegacySprite, all params MUST be initialized properly.
     * 
     * Assumption: All params have qualified values;
     * @param id unique identifier for sprite sheet
     * @param w The width of each sprite in the sheet
     * @param h The height of each sprite in the sheet
     * @param r The number of rows in the sheet
     * @param c The number of columns in the sheet
     * 
     */
    public LegacySprite(BufferedImage img, long id, int w, int h, int r, int c) {
        this.id = id;
        this.width = w;
        this.height = h;
        this.rows = r;
        this.columns = c;
        this.sprites = new BufferedImage[r * c];

        for (int i = 0; i != r;) {
            for (int j = 0; j != c;) {
                sprites[(i * c) + j] = img.getSubimage(i * w, j * h, w, h);
                j++;
            }
            i++;
        }
    }
}
