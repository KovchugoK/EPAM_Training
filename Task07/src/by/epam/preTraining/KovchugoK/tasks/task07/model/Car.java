package by.epam.preTraining.KovchugoK.tasks.task07.model;

public class Car extends Vehicle {
    private String model;
    private String carModelType;

    public Car() {
        this.model = "";
        this.carModelType = "";
    }

    public Car(Car car) {
        this.model = car.model;
        this.carModelType = car.carModelType;
    }

    public Car(String model, String carModelType) {
        this.model = model;
        this.carModelType = carModelType;
    }

    public Car(Vehicle vehicle, String model, String carModelType) {
        super(vehicle);
        this.model = model;
        this.carModelType = carModelType;
    }

    public Car(int dateofprodaction, double price, String model, String carModelType) {
        super(dateofprodaction, price);
        this.model = model;
        this.carModelType = carModelType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice(){
        return super.getPrice();
    }

    public String getCarModelType() {
        return carModelType;
    }

    public void setCarModelType(String carModelType) {
        this.carModelType = carModelType;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Car car = (Car) o;

        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        return carModelType != null ? carModelType.equals(car.carModelType) : car.carModelType == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (carModelType != null ? carModelType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", carModelType='" + carModelType + '\'' +
                ", price='" + super.getPrice() + '\'' +
                '}' + '\n';
    }
}

