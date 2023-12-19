package com.waterfox.designpattern.factory;

public class RocketFactory
{
    public static void main(String[] args)
    {
        //Commande de Saturn
        Rocket s = new Saturn().build();
        s.launch();

        //Commande de Soyouz
        Rocket r = new Soyouz().build();
        r.launch();

        //Avantage : si Soyouz décide maintenant de faire construire de Soyouz3, Pas besoin de toucher à ce code, pas besoin de changer l'usine !

    }
}
