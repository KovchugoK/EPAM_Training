package by.epam.preTraining.KovchugoK.tasks.task07.model;


import java.util.Arrays;

public class Taxi {
    private int cost;
    private int numberofcars;
    private Car car[];

    public Taxi() {
        this.cost = 0;
        this.numberofcars = 0;
        this.car = null;
    }

    public Taxi(Taxi taxi) {
        this.cost = taxi.cost;
        this.numberofcars = taxi.numberofcars;
        this.car = taxi.car;
    }

    public Taxi(int cost, int numberofcars) {
        this.cost = cost;
        this.numberofcars = numberofcars;
        this.car = new Car[numberofcars];
    }

    public Taxi(int cost, int numberofcars, Car[] car) {
        this.cost = cost;
        this.numberofcars = numberofcars;
        this.car = car;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getNumberofcars() {
        return numberofcars;
    }

    public void setNumberofcars(int numberofcars) {
        this.numberofcars = numberofcars;
    }

    public Car[] getCars() {
        return car;
    }

    public void setCars(Car[] car) {
        this.car = car;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Taxi taxi = (Taxi) o;

        if (cost != taxi.cost) return false;
        if (numberofcars != taxi.numberofcars) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(car, taxi.car);
    }

    @Override
    public int hashCode() {
        int result = cost;
        result = 31 * result + numberofcars;
        result = 31 * result + Arrays.hashCode(car);
        return result;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "cost=" + cost +
                ", numberofcars=" + numberofcars +
                ", car=" + Arrays.toString(car) +
                '}';
    }
}

