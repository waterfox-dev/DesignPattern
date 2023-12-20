package com.waterfox.designpattern.visitor;

public class Round implements Shape
{
    @Override
    public void move(int x, int y)
    {
        System.out.printf("Moving the round : %d - %d\n", x, y);
    }

    @Override
    public void draw()
    {
        System.out.println("Drawing the round");
    }

    @Override
    public void accept(Visitor visitor)
    {
        visitor.visitRound(this);
    }
}
