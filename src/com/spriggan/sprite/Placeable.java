/* SpriteSheet.java
 * Pizzapuncher Productions, 2015.
 * This code is written under what we call the CSL ( Common Sense License ). 
 * We believe that code can be learned from, whether brilliantly or poorly written, and thus we are willing to share.
 * You may use this code for whatever purpose you will, but you should do so in good judgement, at your own risk,
 * and with the understanding that we assume no responsibility and offer no warranty on this code. 
 * We do not even guarantee that it works exactly as advertised.
 */

package com.spriggan.sprite;

import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Placeable
 * The Placeable class implements a transformable static sprite
 * @author chakrabortyr
 */
public class Placeable extends Group{   
    
    /**
     * Helper class for Placeable
     */
    private class PlaceableActor extends Actor {
        private TextureRegion texture;
        
        public PlaceableActor(TextureRegion tex) {
            this.texture = tex;
            
            this.setWidth(this.texture.getRegionWidth());
            this.setHeight(this.texture.getRegionHeight());
        }
        
        @Override
        public void draw(Batch batch, float alpha) {
            batch.draw(texture, this.getX(), this.getY());
        }

        @Override
        public Actor hit(float x, float y, boolean touch) {
            return x > 0 && x < getWidth() && y > 0 && y < getHeight() ? this : null;
        }
    }
    
    private final PlaceableActor actor;
    private final String id;
    
    public Placeable(String id, TextureRegion texture) {
        this.actor = new PlaceableActor(texture);
        this.id = id;
        
        this.setWidth(this.actor.getWidth());
        this.setHeight(this.actor.getHeight());
        this.addActor(actor);
    }
}
