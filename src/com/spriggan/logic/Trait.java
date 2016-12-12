/* Trait.java
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
 * Implementation of Trait mechanic
 *
 * @author chakrabortyr
 */
public class Trait implements Serializable {
    private int category; // 0 - Strength, 1 - Weakness, 2 - Immunity
    private int type; // 0 - Healing/Damage, 1 - Status Ailment, 2 - Critical Chance       
    private String subType; // FIRE, ICE, MAGIC, WEAPON, FEAR, STUN, SLOW, POISON, FREEZE, IMMOLATE
    private float amount; // Amount to tack on of subtype, if applicable
    private boolean percentage; // Whether to read amounts as flat or as a percentage 
}