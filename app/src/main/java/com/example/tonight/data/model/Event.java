package com.example.tonight.data.model;

import android.location.Location;
import java.text.DateFormat;
import java.util.Date;
import java.util.TimeZone;


public class Event {

    private String name;
    private TimeZone timeZone;
    private Date date;
    private DateFormat dateFormat;
    private Location location;

    public Event(){
    }

    public Event(String name){
        this.name = name;
    }

    public Event(String name, TimeZone timeZone, Date date,
                 DateFormat dateFormat, Location location){
        this.name = name;
        this.timeZone = timeZone;
        this.date = date;
        this.dateFormat = dateFormat;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TimeZone getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public DateFormat getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

}
