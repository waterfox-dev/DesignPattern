package com.waterfox.designpattern.proxy;

public class LaboratoryProxy  implements LaboratoryAccess
{

    private Laboratory realLaboratory;

    public LaboratoryProxy()
    {
        this.realLaboratory = new Laboratory();
    }

    @Override
    public void enterLaboratory(Passenger p)
    {
        if (p.engineer)
        {
            realLaboratory.enterLaboratory(p);
        }
        else
        {
            System.out.println("Access denied to laboratory");
        }
    }
}