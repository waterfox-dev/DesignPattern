package com.waterfox.designpattern.composite;

import java.util.ArrayList;

public class CompoundGraphic implements Graphic
{
    private final ArrayList<Graphic> children;

    public CompoundGraphic()
    {
        this.children = new ArrayList<>();
    }

    public void addChild(Graphic child)
    {
        children.add(child);
    }

    public void removeChild(Graphic child)
    {
        children.remove(child);
    }

    @Override
    public void move(int x, int y)
    {
        for(Graphic c : children)
        {
            c.move(x, y);
        }
    }

    @Override
    public void draw()
    {
        System.out.println("== My grouped components ==");
        for(Graphic c : children)
        {
            System.out.printf("Drawing a %s \n", c.getClass().getName());
        }
    }
}
