package com.project.studycubby.calendar;

public class Event 
{
    // private int day;
    // private int month;
    // private int year;
    // private int time;
    private String name;
    private String description;


    public Event(String name)
    {
        this.name = name;
    }

    // public event(int day, int month, int year, int time, String name, String description)
    // {
    //     this.day = day;
    //     this.month = month;
    //     this.year = year;
    //     this.time = time;
    //     this.name = name;
    //     this.description = description;
    // }

    public String getDescription()
    {
        return this.description;
    }

    public String getName()
    {
        return this.name;
    }
}