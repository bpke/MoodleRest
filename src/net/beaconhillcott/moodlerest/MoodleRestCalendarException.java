/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.beaconhillcott.moodlerest;

import java.io.Serializable;

/**
 *
 * @author root
 */
public class MoodleRestCalendarException extends MoodleRestException implements Serializable {
  
  public static final String NO_LEGACY_CALL="No legacy call";
    
    MoodleRestCalendarException() {}

    MoodleRestCalendarException(String msg) {
        super(msg);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
