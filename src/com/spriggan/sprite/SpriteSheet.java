/* SpriteSheet.java
 * Pizzapuncher Productions, 2015.
 * This code is written under what we call the CSL ( Common Sense License ). We believe that code can be learned from, whether brilliantly or poorly written, and thus we are willing to share. You may use this code for whatever purpose you will, but you should do so in good judgement, at your own risk, and with the understanding that we assume no responsibility and offer no warranty on this code. We do not even guarantee that it works exactly as advertised.
 */

package com.spriggan.sprite;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * LibGDX SpriteSheet, for Animated Sprites. This is a wrapper for SpriteActor
 * that enables us to apply transformations to the Actor via the Group class
 * (which similarly extends Actor)
 *
 * @author chakrabortyr
 */
public class SpriteSheet extends Group {
   /**
    * SpriteActor Helper class for SpriteSheet
    *
    * @author chakrabortyr
    */
   private class SpriteActor extends Actor {

      private TextureRegion[] frames; // all frames of this sprite
      private TextureRegion activeFrame; // whatever frame we're on
      private Animation animation; // the animation that this sprite plays
      private float state; // current state (time) this sprite is on
      private boolean loop; // whether or not this animation loops. true for things like torches, false for Entity anims

      /**
       * Generate a SpriteActor from specified parameters
       *
       * @param tex The TextureRegion describing this SpriteSheet
       * @param rows # of Rows this SpriteSheet has
       * @param cols # of Columns this SpriteSheet has
       * @param timePerFrame Amount of delay per animation in frames
       * @param loop Whether or not the animation loops
       */
      public SpriteActor(TextureRegion tex, int rows, int cols, float timePerFrame, boolean loop) {
         // Generate sprite frames from Texture 
         int width = tex.getRegionWidth() / rows;
         int height = tex.getRegionHeight() / cols;
         TextureRegion[][] tmpFrames = tex.split(width, height);

         int currentFrame = 0;

         for (int i = 0; i != rows; i++) {
            for (int j = 0; j != cols; j++) {
               this.frames[currentFrame] = tmpFrames[i][j];
            }
         }

         this.setWidth(width);
         this.setHeight(height);

         this.animation = new Animation(timePerFrame, frames);
         this.loop = loop;
         this.state = 0f;
      }

      @Override
      public void draw(Batch batch, float alpha) {
         state += Gdx.graphics.getDeltaTime();
         activeFrame = animation.getKeyFrame(state, loop);
      }

      @Override
      public Actor hit(float x, float y, boolean touch) {
         return x > 0 && x < getWidth() && y > 0 && y < getHeight() ? this : null;
      }

      /**
       * Tells us whether or not an animation is finished
       *
       * @return Whether or not we're still animating.
       */
      public boolean isAnimating() {
         return animation.isAnimationFinished(state);
      }

      /**
       * Resets this Sprite back to default state.
       */
      public void Reset() {
         state = 0f;
      }
   }

   private final SpriteActor actor;
   private final String id;

   public SpriteSheet(String id, TextureRegion tex, int rows, int cols, float timePerFrame, boolean loop) {
      this.actor = new SpriteActor(tex, rows, cols, timePerFrame, loop);
      this.id = id;

      this.setWidth(this.actor.getWidth());
      this.setHeight(this.actor.getHeight());
      this.addActor(this.actor);
   }

   public boolean isAnimating() {
      return this.actor.isAnimating();
   }

   public void Reset() {
      this.actor.Reset();
   }
}
