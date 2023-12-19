package com.waterfox.designpattern.decorator;

public class RocketFactory
{
    public static void main(String[] args)
    {
        Rocket saturn6 = new Astronaut(new Saturn6());
        saturn6.launch();

        Rocket soyouz3 = new Satellite(new Soyouz3());
        soyouz3.launch();

        //Mais si un jour les programmes spaciaux change :
        //On pourra lancer avec soyouz une cosmonaute
        Rocket n_soyouz3 = new Astronaut(new Soyouz3());
        n_soyouz3.launch();

        //Et même lancer une simple fusée
        Rocket n_saturn6 = new Saturn6();
        n_saturn6.launch();
    }
}
