package by.epam.preTraining.KovchugoK.tasks.task07;

import by.epam.preTraining.KovchugoK.tasks.task07.model.Car;
import by.epam.preTraining.KovchugoK.tasks.task07.model.Taxi;
import by.epam.preTraining.KovchugoK.tasks.task07.utils.TaxiCabby;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[2];
        cars[0] = new Car(1994, 10000, "Honda", "Hatchback");
        cars[1] = new Car(1994, 500000, "Lexus", "Sedan");
        Taxi taxi = new Taxi(12, cars.length, cars);
        TaxiCabby taxiCabby = new TaxiCabby(taxi);
        taxiCabby.addCar(new Car(1999,2899, "Ferrary", "Sedan"));
        System.out.println(taxiCabby.toString());
        taxiCabby.deleteCarByIndex(1);
        System.out.println(taxiCabby.toString());
        System.out.println(Arrays.toString(taxiCabby.findByCarModelType("Sedan")));
        System.out.println(taxiCabby.getByIndex(0));

    }
}
