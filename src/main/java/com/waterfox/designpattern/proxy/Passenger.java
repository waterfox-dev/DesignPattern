package com.waterfox.designpattern.proxy;

class Passenger
{
    public boolean engineer;

    public Passenger(boolean engineer)
    {
        this.engineer = engineer;
    }

    public void enterLaboratory(LaboratoryAccess access)
    {
        System.out.println("Passenger try to go into laboratory");
        access.enterLaboratory(this);
    }
}