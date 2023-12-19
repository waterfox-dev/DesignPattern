package com.waterfox.designpattern.proxy;

public class CommunOS
{
    public static void main(String[] args) {
        LaboratoryAccess laboratoryAccess = new LaboratoryProxy(); // L'ingénieure a accès au laboratoire

        Passenger engineerPassenger = new Passenger(true);
        Passenger pilotPassenger = new Passenger(false);

        engineerPassenger.enterLaboratory(laboratoryAccess); // L'ingénieure entre dans le laboratoire
        pilotPassenger.enterLaboratory(laboratoryAccess); // Le pilote tente d'entrer dans le laboratoire, mais l'accès est refusé
    }
}
