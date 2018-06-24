package by.epam.preTraining.KovchugoK.tasks.task07.utils;

import by.epam.preTraining.KovchugoK.tasks.task07.model.Car;
import by.epam.preTraining.KovchugoK.tasks.task07.model.Taxi;
import by.epam.preTraining.KovchugoK.tasks.task07.model.Vehicle;

public class Sorter {
    public static void sortByPrice1(Car[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - 1; j++) {
                if (cars[j].getPrice() > cars[j + 1].getPrice()) {
                    Car temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
    }
//selection sort
    public static void sortByPrice2(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            double min = cars[i].getPrice();
            int min_i = i;
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[j].getPrice() < min) {
                    min = cars[j].getPrice();
                    min_i = j;
                }
            }
            if (i != min_i) {
                Car temp = cars[i];
                cars[i] = cars[min_i];
                cars[min_i] = temp;
            }
        }
    }
}
