package com.waterfox.designpattern.iterator;

public class Donor
{
    String firstname;
    String lastname;

    @Override
    public String toString()
    {
        return firstname + " " + lastname;
    }
}
