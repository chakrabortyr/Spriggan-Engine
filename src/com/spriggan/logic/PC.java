/* PC.java
* Pizzapuncher Productions, 2015.
* This code is written under what we call the CSL ( Common Sense License ). 
* We believe that code can be learned from, whether brilliantly or poorly written, and thus we are willing to share.
* You may use this code for whatever purpose you will, but you should do so in good judgement, at your own risk,
* and with the understanding that we assume no responsibility and offer no warranty on this code. 
* We do not even guarantee that it works exactly as advertised.
*/

package com.spriggan.logic;

import com.spriggan.util.sprite.SpriteSheetLoader;

/**
 * Derived class of player character and party members. 
 * @author chakrabortyr
 */
public class PC extends Entity{
   protected int pcRole;  // What archetype the character fulfills. 0 - 
   protected int pcLevel; // level of experience
   protected int pcHealthCurrent; 
   protected int pcFatigueCurrent;
   protected int pcManaCurrent;
   protected int pcHealthMax;
   protected int pcFatigueMax;
   protected int pcManaMax;
   
   private int pcXPCurrent; // Current experience points
   private int pcXPNext; // Experience needed for next level
    
   @Override
   public void createEntity(long id, String name, long sID) {
       this.entityID = id;
       this.name = name;
       this.sprite = SpriteSheetLoader.spriteSheetLoader.getSprite(sID);
   }
}
