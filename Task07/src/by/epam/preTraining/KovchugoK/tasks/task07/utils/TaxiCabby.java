package by.epam.preTraining.KovchugoK.tasks.task07.utils;

import by.epam.preTraining.KovchugoK.tasks.task07.model.Car;
import by.epam.preTraining.KovchugoK.tasks.task07.model.Taxi;
import by.epam.preTraining.KovchugoK.tasks.task07.model.Vehicle;

import java.util.Arrays;

public class TaxiCabby {
    Taxi taxi;

    public TaxiCabby(Taxi taxi) {
        this.taxi = taxi;
    }

    public boolean isEmpty() {
        Car[] cars = taxi.getCars();
        if (cars == null) {
            return true;
        }
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                return false;
            }
        }
        return true;
    }

    public boolean isFull() {
        Car[] cars = taxi.getCars();
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void addCar(Car car) {
        if (isEmpty()) {
            Car[] cars = new Car[1];
            cars[0] = car;
            taxi.setCars(cars);
        } else {
            int count = taxi.getCars().length;
            if (isFull()) {
                Car[] cars = Arrays.copyOf(taxi.getCars(), (int) (count * 1.5 + 1));
                cars[count] = car;
                taxi.setCars(cars);
            } else {
                Car[] cars = taxi.getCars();
                for (int i = 0; i < count; i++) {
                    if (cars[i] == null) {
                        cars[i] = car;
                        taxi.setCars(cars);
                        break;
                    }
                }
            }
        }
    }

    public Car[] findByCarModelType(String carModelType) {
        Car[] searchedCars = null;
        if (!isEmpty()) {
            int count = 0;
            Car[] cars = taxi.getCars();
            for (int i = 0; i < cars.length - 1; i++) {
                if (cars[i].getCarModelType().equals(carModelType)) {
                    count++;
                }
            }
            searchedCars = new Car[count];
            for (int i = 0, j = 0; i < cars.length - 1; i++) {
                if (cars[i].getCarModelType().equals(carModelType)) {
                    searchedCars[j] = cars[i];
                    j++;
                }
            }
        }
        return searchedCars;
    }

    public void deleteAllCars() {
        taxi.setCars(null);
    }

    public void deleteCarByIndex(int index) {
        if (isEmpty()) {
        } else {
            Car[] cars = taxi.getCars();
            Car[] newCars = new Car[cars.length - 1];
            if (cars.length > index) {
                for (int i = 0, j = 0; i < cars.length; i++) {
                    if (i != index) {
                        newCars[j] = cars[i];
                        j++;
                    }
                }
                taxi.setCars(newCars);
            }
        }
    }

    public Car getByIndex(int index) {
        if (isEmpty()) {
            return null;
        } else {
            Car[] cars = taxi.getCars();
            if (cars.length >= index)
                return cars[index];
            else
                return null;
        }
    }

    @Override
    public String toString() {
        return "TaxiCabby{" +
                "taxi=" + taxi +
                '}';
    }
}
