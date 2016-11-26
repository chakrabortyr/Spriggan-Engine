/* ImageHandler.java
 * Pizzapuncher Productions, 2015.
 * This code is written under what we call the CSL ( Common Sense License ). 
 * We believe that code can be learned from, whether brilliantly or poorly written, and thus we are willing to share.
 * You may use this code for whatever purpose you will, but you should do so in good judgement, at your own risk,
 * and with the understanding that we assume no responsibility and offer no warranty on this code. 
 * We do not even guarantee that it works exactly as advertised.
 */

package com.spriggan.util.io;

import com.spriggan.util.log.Logger;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * ImageHandler Singleton, parses images for SpriteSheets, maps, etc.
 * This class is deprecated.
 * @author chakrabortyr
 */
public class ImageHandler {
    private ImageHandler() { }
    
    public class ImgFile {
        BufferedImage img;
        int width; // Must be a multiple of 4
        int height; // Must be a multiple of 4
        
        public ImgFile(BufferedImage img, int width, int height) {
            this.img = img;
            this.width = width;
            this.height = height;
        }
    }
    
    public BufferedImage getImage(String fileName) throws IOException {       
        return ImageIO.read(new File(fileName));
    }
    
    public static final ImageHandler imageHandler = new ImageHandler();
}
