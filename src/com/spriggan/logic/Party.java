/* Party.java
 * Pizzapuncher Productions, 2015.
 * This code is written under what we call the CSL ( Common Sense License ). 
 * We believe that code can be learned from, whether brilliantly or poorly written, and thus we are willing to share.
 * You may use this code for whatever purpose you will, but you should do so in good judgement, at your own risk,
 * and with the understanding that we assume no responsibility and offer no warranty on this code. 
 * We do not even guarantee that it works exactly as advertised.
 */

package com.spriggan.logic;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/**
 * Static Singleton class keeping track of the Party
 *
 * @author chakrabortyr
 */
public class Party {
    //Party value
    private static int currentPartyCount = 0;

    private static final Map<Long, PC> party = new HashMap<>();
    
    //Pun only slightly intended.
    private Party() {
        
    }
    
    //Party-specific static methods
    public static int getPartyCount() {
        return currentPartyCount;
    }

    public static void addPartyMember(long id, PC pc) {
        party.put(id, pc);
        currentPartyCount++;
    }

    public static void removePartyMember(long id) {
        party.remove(id);
        currentPartyCount--;
    }
    
    public int getPartySanity() {
        int sanity = 0;
        
        Collection<PC> members = new ArrayList<>(party.values());
        
        for (PC member: members) {
            sanity += member.pcGetSanity();
        }
        
        return sanity;
    }
    
    public static final Party theParty = new Party();
}
