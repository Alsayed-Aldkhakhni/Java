/*
 * File name: Date.java
 *  
 * Subject: A class that presents date.
 *
 * Date: March 13, 2024
 *
 * Author: Alsayed Aldkhakhni
 *
 * Last modification: August 6, 2024 --> [12:15 PM]
 *
 * */


public class Date // class declaration.
{
    // instance variables.
    private int year;
    private int month;
    private int day;
    
    // 3-arguments constructor.
    public Date(int year, int month, int day)
    {
	    this.year = year;
	    this.month = month;
	    this.day = day;
    }
    
    // setters, mutators.
    public void setYear(int year)   { this.year = year; }
    public void setMonth(int month) { this.month = month; }
    public void setDay(int day)     { this.day = day; }

    // accessors, getters to return the values of the instance variables.
    public int getYear()  { return year; }
    public int getMonth() { return month; }
    public int getDay()   { return day; }

    // display the date.
    public void displayDate()
    {
        System.out.printf("You entered: %d/%d/%d%n", month, day, year);
    }
}
