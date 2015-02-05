package com.spriggan.logic;

import com.spriggan.util.SpriteSheet;
import com.spriggan.util.SpriteSheetLoader;

/**
 * The generic class for any being in the game, it has three derived classes, PC, NPC,
 * and Monster. This class contains basic identification info for any being, with the assumption
 * that the rest is detailed in the derived classes.
 * 
 * @author Rudra Chakraborty
 */
public class Entity {
    private String name;  // The name of the Entity
    private long entityID; // This is always a unique variable!
    private SpriteSheet sprite;
}
