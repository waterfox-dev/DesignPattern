package com.waterfox.designpattern.composite;

public class Circle extends Dot
{
    public int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("Draw a circle at (%d, %d) - radius : %d ", this.x, this.y, this.radius);
    }


}
