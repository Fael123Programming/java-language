package br.com.rafael.interfaces.ex08;

import java.time.DateTimeException;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public interface HandleInvalidTimeZoneSetter extends TimeSetter {

    @Override  //Redefining the default method found in TimeSetter.
    public default ZonedDateTime getZonedDateTime(String zoneStr) {
        try {
            return ZonedDateTime.of(getLocalDateTime(), ZoneId.of(zoneStr));
        } catch (DateTimeException exception) {
            System.err.println("Invalid zone string: " + zoneStr + "; using the default time zone instead");
            return ZonedDateTime.of(getLocalDateTime(), ZoneId.systemDefault());
        }
    }
}
