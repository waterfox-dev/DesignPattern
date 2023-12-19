package com.waterfox.designpattern.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class ImageEditor
{
    public static CompoundGraphic drawing;

    public static void  createGroup(ArrayList<Graphic> components )
    {
        CompoundGraphic group = new CompoundGraphic();
        for(Graphic c : components)
        {
            group.addChild(c);
            ImageEditor.drawing.removeChild(c);
        }
        ImageEditor.drawing.addChild(group);
        ImageEditor.drawing.draw();
    }

    public static void main(String[] args)
    {
        drawing = new CompoundGraphic();
        //J'ajoute des éléments de manière basique à mon image
        drawing.addChild(new Dot(2,4));
        drawing.addChild(new Circle(6, 8, 20));

        //Je crée un sous-groupe d'éléments tout en l'intégrant à mon image
        Dot dot = new Dot(1,4);
        Circle circle = new Circle(3, 3, 5);
        ArrayList<Graphic> shapes = new ArrayList<>();
        shapes.add(dot);
        shapes.add(circle);

        createGroup(shapes);
    }

}
