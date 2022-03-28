package br.com.rafael.interfaces.ex08;

import java.time.ZonedDateTime;

public interface AbstractZoneTimeSetter extends TimeSetter {
//  Redeclaration of the default method that comes from TimeSetter as abstract.
    public abstract ZonedDateTime getZonedDateTime(String zoneStr);
}
