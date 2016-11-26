/* Entity.java
 * Pizzapuncher Productions, 2015.
 * This code is written under what we call the CSL ( Common Sense License ). 
 * We believe that code can be learned from, whether brilliantly or poorly written, and thus we are willing to share.
 * You may use this code for whatever purpose you will, but you should do so in good judgement, at your own risk,
 * and with the understanding that we assume no responsibility and offer no warranty on this code. 
 * We do not even guarantee that it works exactly as advertised.
 */

package com.spriggan.logic;

import com.spriggan.util.sprite.LegacySprite;

/**
 * The generic class for any being in the game, it has three derived classes, PC, NPC,
 * and Monster. This class contains basic identification info for any being, with the assumption
 * that the rest is detailed in the derived classes.
 * 
 * @author chakrabortyr
 */
abstract class Entity {
    //Core External Attributes
    protected long entityID; // This is always a unique variable! Not to be confused with LegacySprite ID
    protected String name;  // The name of the Entity, usually unique but we don't assume so.
    protected LegacySprite sprite; // Sprite sheet of entity, some will be copies of others, not always unique
    
    //Gameplay Statistics
    protected int eHealth; // The entity's maximum health
    protected int eMana; // The entity's maximum mana
    protected String [] traits; // A series of 3 letter keywords, assist in determining derived stats
    

    /*
     * Initializes a being into...being. This is overridden in the PC, NPC, Monster classes
     *
     * Assumption: All three parameters are properly initialized
     * @param id The entity ID
     * @param name Entity handle
     * @param sID The spriteSheet ID
     */
    abstract void createEntity(long id, String name, long sID, int hp, int mp, String [] traits);

    /**
    * Writes an Entity to a JSON object
    */
    abstract void writeToJson();
}
