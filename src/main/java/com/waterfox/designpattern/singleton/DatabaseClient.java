package com.waterfox.designpattern.singleton;

public class DatabaseClient
{
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();
        System.out.println(db1 == db2); //Le même objet
    }
}
