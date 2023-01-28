package pro.sky.java.src.oop.src.transport;

import pro.sky.java.src.oop.src.driver.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final float volumeEngine;
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();


    public Transport(String brand,
                     String model,
                     float volumeEngine) {

        this.brand = brand;
        this.model = model;
        this.volumeEngine = volumeEngine;
    }


    public abstract void startMovement();

    public abstract void stopMovement();

    public abstract void printInformation();

    public abstract boolean service();

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public float getVolumeEngine() {
        return volumeEngine;

    }

    public void addDriver(Driver<?>... drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public abstract void repair();

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }
}
//    private int year;
//    private String country;
//    private String colorBody;
//    private int maxSpeed;
//    public Transport(String brand, String model, String colorBody, int year, String country) {
//        this.year = Math.max(year, 2000);
//        this.brand = Objects.requireNonNullElse(brand, "default");
//        this.model = Objects.requireNonNullElse(model, "default");
//        this.country = Objects.requireNonNullElse(country, "default");
//        setColorBody(colorBody);
//        setMaxSpeed(maxSpeed);
//    }
//
//    public abstract void refill();
//
//    public void options() {
//        System.out.println("Марка " + brand + " модель " + model +
//                " год выпуска " + year + " цвет " + colorBody +
//                " страна производитель " + country + ".");
//    }
//
//    public void getBrand() {
//        this.brand = Objects.requireNonNullElse(brand, "default");
//    }
//    public void getModel() {
//        this.model = Objects.requireNonNullElse(model, "default");
//    }
//    public void getYear() {
//        this.year = Math.max(year, 2000);
//    }
//    public void getCountry() {
//        this.country = Objects.requireNonNullElse(country, "default");
//    }
//    public void getColorBody() {
//        this.colorBody = Objects.requireNonNullElse(colorBody, "белый");
//    }
//    public void setColorBody(String colorBody) {
//        this.colorBody = Objects.requireNonNullElse(colorBody, "Белый");
//    }
//    public int maxSpeed() {
//        return maxSpeed;
//    }
//    public void setMaxSpeed(int maxSpeed) {
//        this.maxSpeed = Math.max(maxSpeed, 1);
//    }
