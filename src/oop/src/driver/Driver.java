package pro.sky.java.src.oop.src.driver;

import pro.sky.java.src.oop.src.transport.Transport;

public abstract class Driver<T extends Transport> {
    private final String fullName;
    private final String driverLicence;
    private String category;
    private final T car;

    protected Driver(String fullName, String driverLicence, String category, T car) {
        this.fullName = fullName;
        this.driverLicence = driverLicence;
        this.category = category;
        this.car = car;
    }

    public void startMovement() {
        System.out.printf("Водитель %s начинает движение", this.fullName);
        this.car.startMovement();
    }

    public void stopMovement() {
        System.out.printf("Водитель %s закончил движение", this.fullName);
        this.car.stopMovement();
    }

    public void refuelCar() {
        System.out.printf("Водитель %s заправляет %s %s", this.fullName, this.car.getBrand(), this.car.getModel());

    }

    public String getFullName() {
        return fullName;
    }

    public String getDriverLicence() {
        return driverLicence;
    }

    public void getCategory() {
        if (category == null) {
            throw new IllegalArgumentException("Нужно указать категорию прав!");
        }
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("Водитель %s управляет автомобилем %s %s и будет участвовать в заезде.",
                this.fullName, this.car.getBrand(), this.car.getModel());
    }
}

