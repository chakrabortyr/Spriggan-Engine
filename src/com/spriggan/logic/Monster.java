/* Monster.java
 * Pizzapuncher Productions, 2015.
 * This code is written under what we call the CSL ( Common Sense License ). 
 * We believe that code can be learned from, whether brilliantly or poorly written, and thus we are willing to share.
 * You may use this code for whatever purpose you will, but you should do so in good judgement, at your own risk,
 * and with the understanding that we assume no responsibility and offer no warranty on this code. 
 * We do not even guarantee that it works exactly as advertised.
 */
package com.spriggan.logic;

import java.io.Serializable;


/**
 * Derived class for Monsters.
 *
 * @author chakrabortyr
 */
public class Monster extends Entity implements Serializable {
    //Monster specific gameplay stats
    protected int mFear; // How fearful this monster is, impacts PC sanity.  
    protected int mResolve; // How likely the monster is to flee. 0 - Wimpy, 1 - Standard, 2 - Tough, 3 - Ruthless (will not flee)
    protected int mXPValue; // Amount of XP this monster yields on kill
    protected int mDamage; // Amount of damage this monster deals
    protected int mAPT; // Amount of attacks per turn this monster has
    
    //Dynamic Stats
    protected int mMaxHP;
    protected int mCurrentHP;

    @Override
    public void createEntity(long id, String name, long sID, int hp, int mp, String[] traits) {
       this.entityID = id;
       this.name = name;
       this.sprite = null; //TODO: Replace
    }
    
    @Override
    public void writeToJson() { } //TODO: Implement

    public int mGiveDeathXP() {
        return this.mXPValue;
    }
}
