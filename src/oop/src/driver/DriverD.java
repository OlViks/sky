package pro.sky.java.src.oop.src.driver;

import pro.sky.java.src.oop.src.transport.Bus;

public class DriverD extends Driver<Bus> {


    public DriverD(String fullName, String driverLicence, Bus car) {
        super(fullName, driverLicence, "D", car);
    }
}
