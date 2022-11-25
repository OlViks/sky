package pro.sky.java.src.oop.src.transport;

public class Bus extends Transport implements Competing {
    private final PassengerCapacity passengerCapacity;
    public Bus(String brand, String model, float volumeEngine, PassengerCapacity passengerCapacity) {
        super(brand, model, volumeEngine);
        this.passengerCapacity = passengerCapacity;
    }


    @Override
    public void startMovement() {
        System.out.printf("Автобус %s %s начать движение", this.getBrand(), this.getModel());
    }
    @Override
    public void stopMovement() {
        System.out.printf("Автобус %s %s начать движение", this.getBrand(), this.getModel());
    }

    @Override
    public void printInformation() {
        if (this.passengerCapacity != null) {
            System.out.println(this.passengerCapacity);
        } else {
            System.out.println("Укажите вместимость.");
        }
    }

    @Override
    public boolean service() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не требуется.");
        return true;
    }

    @Override
    public void repair() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " отремонтирован!");
    }

    @Override
    public void pitStop() {
        System.out.printf("Автобус %s %s выполняет пит-стоп", this.getBrand(), this.getModel());
    }


    @Override
    public int getBestLapTime() {
        return 0;
    }
    @Override
    public int getMaxSpeed() {
        return 0;
    }
}