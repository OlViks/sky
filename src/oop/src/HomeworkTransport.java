package pro.sky.java.src.oop.src;

import pro.sky.java.src.oop.src.driver.Driver;
import pro.sky.java.src.oop.src.driver.DriverB;
import pro.sky.java.src.oop.src.driver.DriverC;
import pro.sky.java.src.oop.src.driver.DriverD;
import pro.sky.java.src.oop.src.transport.*;

import java.util.List;

public class HomeworkTransport {

    public static class Main {

        public static void main(String[] args) {

            Sponsor nokian = new Sponsor("Nokian", 10_000_000);
            Sponsor continental = new Sponsor("Continental", 5_000_000);
            Sponsor duragon = new Sponsor("Duragon", 2_000_000);
            Sponsor wolf = new Sponsor("Wolf", 10_000_000);

            Car a5 = new Car("audi", "A5", 3.5f, null);
            a5.addDriver(new DriverB("Иванов", "есть", a5));
            a5.addMechanic(new Mechanic<Car>("Иван", "Иванов", "Nokian"));
            a5.addSponsor(nokian, wolf);

            Car a7 = new Car("audi", "A7", 6.2f, BodyType.COUPE);
            a7.addDriver(new DriverB("Типанов", "есть", a7));
            a7.addMechanic(new Mechanic<Car>("Кирилл", "Кириллович", "Wolf"));
            a7.addSponsor(duragon, wolf);

            Truck hw1 = new Truck("volvo", "hw1", 12f, LoadCapacity.N1);
            hw1.addDriver(new DriverC("Типанов", "есть", hw1));
            hw1.addMechanic(new Mechanic<Car>("Денис", "Денисов", "continental"));
            hw1.addSponsor(continental, wolf);

            Bus dq124 = new Bus("liaz", "dq124", 3.7f, PassengerCapacity.BIG);
            dq124.addDriver(new DriverD("Расулов", "есть", dq124));
            dq124.addMechanic(new Mechanic<Car>("Альберт", "Альберотович", "continental"));
            dq124.addSponsor(continental, nokian);

            DriverC driverC = new DriverC("Имбицилов", "есть", hw1);
            System.out.println(driverC);
            DriverD driverD = new DriverD("Кирилов", "есть", dq124);
            System.out.println(driverD);
            a5.printInformation();
            a7.pitStop();

            service(a5, a7, hw1, dq124);
            a7.printInformation();
            hw1.printInformation();
            dq124.printInformation();

            List<Transport> transports = List.of(a5, a7, hw1, dq124);

            ServiceStation serviceStation = new ServiceStation();
            serviceStation.addCar(a5);
            serviceStation.addTruck(hw1);
            serviceStation.service();
            serviceStation.service();

            for (Transport transport : transports) {
                printInfo(transport);
            }


        }

        private static void printInfo(Transport transport) {
            System.out.println("Информация по автомобилю " + transport.getBrand() + " " + transport.getModel());
            System.out.println("Водители: ");
            for (Driver<?> driver : transport.getDrivers()) {
                System.out.println(driver.getFullName());
            }
            System.out.println("Cпонсоры: ");
            for (Sponsor sponsor : transport.getSponsors()) {
                System.out.println(sponsor.getName() + " сумма поддержки " + sponsor.getAmount());
            }
            System.out.println("Механики: ");
            for (Mechanic<?> mechanic : transport.getMechanics()) {
                System.out.println(mechanic.getName() + " из " + mechanic.getCompany());
            }
        }

        private static void service(Transport... transports) {
            for (Transport transport : transports) {
                if (!transport.service()) {
                    try {
                        throw new RuntimeException("Автомобиль " + transport.getBrand() + " "
                                + transport.getModel() + " не прошел диагностику");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                }

            }
        }
    }
}