package br.com.rafael.interfaces.ex08;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class SimpleTimeClient implements TimeSetter {
    private LocalDateTime localDateTime;

    {
        localDateTime = LocalDateTime.now();
    }

    @Override
    public void setTime(int hour, int minute, int second) {
        localDateTime = LocalDateTime.of(localDateTime.toLocalDate(), LocalTime.of(hour, minute, second));
    }

    @Override
    public void setDate(int day, int month, int year) {
        localDateTime = LocalDateTime.of(LocalDate.of(year, month, day), localDateTime.toLocalTime());
    }

    @Override
    public void setDateAndTime(int day, int month, int year, int hour, int minute, int second) {
        localDateTime = LocalDateTime.of(LocalDate.of(year, month, day), LocalTime.of(hour, minute, second));
    }

    @Override
    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    @Override
    public String toString() {
        return localDateTime.toString();
    }
}
