package com.waterfox.designpattern.proxy;

public class Laboratory implements LaboratoryAccess
{
    @Override
    public void enterLaboratory(Passenger p) {
        System.out.println("Access allowed to laboratory");
    }
}
