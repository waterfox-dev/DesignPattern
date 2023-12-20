package com.waterfox.designpattern.visitor;

import java.util.ArrayList;

public class App
{
    public static void main(String[] args)
    {
        ArrayList<Shape> shapes = new ArrayList<>();

        Dot d = new Dot();
        d.move(2, 3);
        shapes.add(d);


        Round r = new Round();
        r.move(4,5);
        shapes.add(r);

        XMLVisitor exporter = new XMLVisitor();

        for(Shape s : shapes)
        {
            s.accept(exporter);
        }
    }
}
