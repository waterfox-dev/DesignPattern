package com.waterfox.designpattern.singleton;

import java.util.Random;

public class Database
{
    private static Database instance;
    private static int code;

    private Database()
    {
        Database.code = new Random().nextInt();
        System.out.println("Init database connexion\n-->Database connexion : " + code);
    }

    public static Database getInstance()
    {
        if(Database.instance == null)
        {
            Database.instance = new Database();
        }
        return Database.instance;
    }
}
