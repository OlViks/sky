package pro.sky.java.src.oop.src.driver;


import pro.sky.java.src.oop.src.transport.Truck;

public class DriverC extends Driver<Truck>{

    public DriverC(String fullName, String driverLicence, Truck car) {
        super(fullName, driverLicence, "D", car);
    }
}
