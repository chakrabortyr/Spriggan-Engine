/* ActorManager.java
 * Pizzapuncher Productions, 2015.
 * This code is written under what we call the CSL ( Common Sense License ). We believe that code can be learned from, whether brilliantly or poorly written, and thus we are willing to share. You may use this code for whatever purpose you will, but you should do so in good judgement, at your own risk, and with the understanding that we assume no responsibility and offer no warranty on this code. We do not even guarantee that it works exactly as advertised.
 */

package com.spriggan.logic;

import java.util.Map;
import java.util.HashMap;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Group;

import com.spriggan.sprite.SpriteHandle;
import com.spriggan.sprite.SpriteSheet;
import com.spriggan.sprite.Placeable;

/**
 * ActorManager
 * Loads SpriteSheet and Placeable instances into Game. 
 * @author chakrabortyr
 */
public final class ActorManager {
   private static final Map<String, Group> actors = new HashMap();

   public void insertActor(SpriteHandle handle) {
      TextureRegion tex = new TextureRegion(new Texture(Gdx.files.internal(handle.filePath)));

      if (handle.dynamic) {
         SpriteSheet sheet = new SpriteSheet(handle.id, tex, handle.rows, handle.columns, handle.timePerFrame,
               handle.loop);
         actors.put(handle.id, sheet);
      } else {
         Placeable place = new Placeable(handle.id, tex);
         actors.put(handle.id, place); // put you in your place. heh.
      }
   }

   public Group getActor(String id) {
      return actors.get(id);
   }
}
