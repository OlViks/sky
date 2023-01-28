package pro.sky.java.src.oop.src.driver;

import pro.sky.java.src.oop.src.transport.Car;

public class DriverB extends Driver<Car> {

    public DriverB(String fullName, String driverLicence , Car car) {
        super(fullName, driverLicence, "B", car);
    }
}
