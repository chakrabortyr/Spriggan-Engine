/* NPC.java
 * Pizzapuncher Productions, 2015.
 * This code is written under what we call the CSL ( Common Sense License ). We believe that code can be learned from, whether brilliantly or poorly written, and thus we are willing to share. You may use this code for whatever purpose you will, but you should do so in good judgement, at your own risk, and with the understanding that we assume no responsibility and offer no warranty on this code. We do not even guarantee that it works exactly as advertised.
 */


package com.spriggan.logic;

import java.io.Serializable;

/**
 * Derived class for NPCs. 
 * @author chakrabortyr
 */
public class NPC extends Entity implements Serializable {
   //Entity stats
   private int npcDamage; // Indicates damage this NPC can inflict.
   private int nResolve; // Indicates likelihood of NPC to flee combat. 0 - Wimpy, 1 - Standard, 2 - Tough, 3 - Ruthless (will not flee)

   //Dynamic stats
   private int npcCurrentHealth; // The NPCs current Health.
   private int npcStatus; // Indicates disposition to player. 1 - Friendly, 2 - Suspicious, 3 - Angry, 4 - Hostile.

   @Override
   public void createEntity(String name) {
      this.name = name;
   }

   //NPC specific methods

   public int npcGetCurrentMood() {
      return this.npcStatus;
   }
}
