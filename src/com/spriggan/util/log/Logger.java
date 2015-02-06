/* Logger.java
 * Pizzapuncher Productions, 2015.
 * This code is written under what we call the CSL ( Common Sense License ). We believe that code can be learned from,
 * poorly written or otherwise, and thus we are willing to share. You may use this code for whatever purpose you will, 
 * but you should do so in good judgement and at your own risk, and with the understanding that we assume no responsibility 
 * and offer no warranty on this code; we do not even guarantee that it works exactly as advertised.
 */

package com.spriggan.util.log;

import java.io.IOException;
import java.io.FileWriter;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author chakrabortyr
 */
public class Logger {
    private static FileWriter log = null;
    private static int messageID = 0;
    private static final Date date = new Date();
    
    private Logger() {}
    
    public void Init() {
        try {
            Timestamp timestamp = new Timestamp(date.getTime());
            String stamp = timestamp.toString().replaceAll(" ", "_");
            log = new FileWriter("log_" + stamp + ".log");
        } catch (IOException e) {
            System.err.println("Error initializing logger!");
        }
    }
    
    public void Write(String message) {
        try {
            System.err.println(messageID + ": " + message);
            log.write(messageID + ": " + message);
            messageID++;
        } catch (IOException writeException) {
            System.err.println("Error writing message ID " + (messageID++) + " to logger!");
        }
    }
        
    public void Close() {
        try {
            log.flush();
            log.close();
        } catch (IOException e) {
            System.err.println("Error shutting down logger!");
        }
    }
    
    public static final Logger logger = new Logger();
}
