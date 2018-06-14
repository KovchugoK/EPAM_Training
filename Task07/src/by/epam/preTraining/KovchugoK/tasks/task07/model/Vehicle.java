package by.epam.preTraining.KovchugoK.tasks.task07.model;


public class Vehicle {
    private int dateofprodaction;
    private double price;

    public Vehicle() {
        this.dateofprodaction = 0;
        this.price = 0;
    }

    public Vehicle(Vehicle vehicle) {
        this.dateofprodaction = vehicle.dateofprodaction;
        this.price = vehicle.price;
    }

    public Vehicle(int dateofprodaction, double price) {
        this.dateofprodaction = dateofprodaction;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (dateofprodaction != vehicle.dateofprodaction) return false;
        return Double.compare(vehicle.price, price) == 0;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "dateofprodaction=" + dateofprodaction +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = dateofprodaction;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public int getDateofprodaction() {
        return dateofprodaction;
    }

    public void setDateofprodaction(int dateofprodaction) {
        this.dateofprodaction = dateofprodaction;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

