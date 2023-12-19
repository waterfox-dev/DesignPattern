package com.waterfox.designpattern.factory;

public class Soyouz extends RocketBrand
{
    @Override
    public Rocket build() {
        return new Soyouz2();
    }
}
