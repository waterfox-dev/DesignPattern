package com.waterfox.designpattern.factory;

public class Saturn extends RocketBrand
{
    @Override
    public Rocket build() {
        return new Saturn5();
    }
}
