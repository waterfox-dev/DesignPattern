package com.waterfox.designpattern.composite;

public class Dot implements Graphic
{
    public int x;
    public int y;

    public Dot(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y)
    {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw()
    {
        System.out.printf("Drawing a dot at (%d, %d) \n", this.x, this.y);
    }
}
