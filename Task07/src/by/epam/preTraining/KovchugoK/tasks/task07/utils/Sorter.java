package by.epam.preTraining.KovchugoK.tasks.task07.utils;

import by.epam.preTraining.KovchugoK.tasks.task07.model.Car;
import by.epam.preTraining.KovchugoK.tasks.task07.model.Taxi;
import by.epam.preTraining.KovchugoK.tasks.task07.model.Vehicle;

public class Sorter {
    public static void sortByPrice(Car[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - 1 ; j++) {
                if(cars[j].getPrice() > cars[j+1].getPrice()){
                    Car temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
    }
}
