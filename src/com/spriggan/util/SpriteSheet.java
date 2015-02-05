/* SpriteSheet.java
 *  To change this license header, choose License Headers in Project Properties.
 *  To change this template file, choose Tools | Templates
 *  and open the template in the editor.
 */

package com.spriggan.util;

import java.awt.image.BufferedImage;

/**
 * Type definition for Sprite Sheet
 * @author Rudra
 */
public class SpriteSheet {
    private long id;
    private int width;
    private int height;
    private int rows;
    private int columns;
    private BufferedImage sprites[];

    /*
     * Creates a new instance of SpriteSheet, all params MUST be initialized properly.
     * 
     * Assumption: All params have qualified values;
     * @param id unique identifier for sprite sheet
     * @param w The width of each sprite in the sheet
     * @param h The height of each sprite in the sheet
     * @param r The number of rows in the sheet
     * @param c The number of columns in the sheet
     * 
     */
    public SpriteSheet(BufferedImage img, long id, int w, int h, int r, int c) {
        this.id = ids;
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
