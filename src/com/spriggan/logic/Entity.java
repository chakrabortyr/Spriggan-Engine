/* Entity.java
 * Pizzapuncher Productions, 2015.
 * This code is written under what we call the CSL ( Common Sense License ). We believe that code can be learned from, whether brilliantly or poorly written, and thus we are willing to share. You may use this code for whatever purpose you will, but you should do so in good judgement, at your own risk, and with the understanding that we assume no responsibility and offer no warranty on this code. We do not even guarantee that it works exactly as advertised.
 */

package com.spriggan.logic;

import java.lang.Character.Subset;

import com.spriggan.sprite.SpriteSheet;

/**
 * The generic class for any being in the game, it has three derived classes, PC, NPC,
 * and Monster. This class contains basic identification info for any being, with the assumption
 * that the rest is detailed in the derived classes.
 * 
 * @author chakrabortyr
 */
abstract class Entity {

    /**
     * Implementation of Trait mechanic
     *
     * @author chakrabortyr
     */
    private class Trait implements Serializable {
        private int category; // 0 - Strength, 1 - Weakness, 2 - Immunity
        private int type; // 0 - Healing/Damage, 1 - Status Ailment, 2 - Critical Chance       
        private String subType; // FIRE, ICE, MAGIC, WEAPON, FEAR, STUN, SLOW, POISON, FREEZE, IMMOLATE
        private float amount; // Amount to tack on of subtype, if applicable
        private boolean percentage; // Whether to read amounts as flat or as a percentage 

        public Trait (int cat, int type, String sub, float amt, boolean flat) {
            this.category = cat;
            this.type = type;
            this.subType = sub;
            this.amount = amt;
            this.percentage = flat;
        }
    }

   //Core External Attributes
   protected String name; // The name of the Entity, usually unique but we don't assume so.
   protected SpriteSheet spriteBase; // Sprite sheet of entity, some will be copies of others, not always unique

   //Animations (Core)
   protected Map<String, SpriteSheet> animations;

   //Gameplay Statistics
   protected int eHealth; // The entity's maximum health
   protected int eMana; // The entity's maximum mana
   protected List<Trait> traits; // A series of 3 letter keywords, assist in determining derived stats

   abstract void createEntity(String name);
}
