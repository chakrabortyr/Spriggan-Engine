/* PC.java
* Pizzapuncher Productions, 2015.
* This code is written under what we call the CSL ( Common Sense License ). 
* We believe that code can be learned from, whether brilliantly or poorly written, and thus we are willing to share.
* You may use this code for whatever purpose you will, but you should do so in good judgement, at your own risk,
* and with the understanding that we assume no responsibility and offer no warranty on this code. 
* We do not even guarantee that it works exactly as advertised.
*/

package com.spriggan.logic;

import java.io.Serializable;

import com.spriggan.util.sprite.SpriteSheetLoader;

/**
 * Derived class of player character and party members. 
 * @author chakrabortyr
 */
public class PC extends Entity implements Serializable{
   //PC Specific Stats
   protected int pcRole;  // What archetype the character fulfills. 0 - 
   protected int pcLevel; // level of experience
   private int pcXPNext; // Experience needed for next level
   private int pcSanity; // Maximum fear threshold, hereafter the PC is insane
   private int pcFatigue; // Maximum stamina threshold, a
   
   //Dynamic Stats
   private int pcCurrentHealth;
   private int pcCurrentMana;
   private int pcCurrentSanity;
   
   @Override
   public void createEntity(long id, String name, long sID, int hp, int mp, String [] traits) {
       
   }
}
