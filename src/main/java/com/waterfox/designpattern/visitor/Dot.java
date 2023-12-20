package com.waterfox.designpattern.visitor;

public class Dot implements Shape
{
    @Override
    public void move(int x, int y)
    {
        System.out.printf("Moving the dot : %d - %d\n", x, y);
    }

    @Override
    public void draw()
    {
        System.out.println("Drawing the dot");
    }

    @Override
    public void accept(Visitor visitor)
    {
        visitor.visitDot(this);
    }
}
