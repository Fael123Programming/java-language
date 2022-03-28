package br.com.rafael.interfaces.ex08;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public interface TimeSetter {
    public abstract void setTime(int hour, int minute, int second);

    public abstract void setDate(int day, int month, int year);

    public abstract void setDateAndTime(int day, int month, int year, int hour, int minute, int second);

    public abstract LocalDateTime getLocalDateTime();

    public static ZoneId getZoneId(String zoneStr) {
        try {
            return ZoneId.of(zoneStr);
        } catch (DateTimeException e) {
            System.err.println("Invalid time zone: " + zoneStr + "; using default time zone instead");
            return ZoneId.systemDefault();
        }
    }

    public default ZonedDateTime getZonedDateTime(String zoneStr) {
        return ZonedDateTime.of(getLocalDateTime(), getZoneId(zoneStr));
    }

//    When you extend an interface that contains a default method, you can do the following:
//    -> Not mention the default method at all, which lets your extended interface inherit the default method.
//    -> Redeclare the default method, which makes it abstract.
//    -> Redefine the default method, which overrides it.

}
