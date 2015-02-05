package com.spriggan.logic;

import com.spriggan.util.SpriteSheet;
import com.spriggan.util.SpriteSheetLoader;

/**
 * The generic class for any being in the game, it has three derived classes, PC, NPC,
 * and Monster. This class contains basic identification info for any being, with the assumption
 * that the rest is detailed in the derived classes.
 * 
 * @author chakrabortyr
 */
abstract class Entity {
	long entityID; // This is always a unique variable! Not to be confused with SpriteSheet ID
    String name;  // The name of the Entity, usually unique but we don't assume so.
   	SpriteSheet sprite; // Sprite sheet of entity, some will be copies of others, not always unique

    /*
     * Initializes a being into...being. This is overridden in the PC, NPC, Monster classes
     *
     * Assumption: All three parameters are properly initialized
     * @param id The entity ID
     * @param name Entity handle
     * @param sID The spriteSheet ID
     */
    abstract void createEntity(long id, String name, long sID);
}
