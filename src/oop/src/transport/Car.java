package pro.sky.java.src.oop.src.transport;

public class Car extends Transport implements Competing {

    private final BodyType bodyType;
    public Car(String brand, String model, float volumeEngine,BodyType bodyType) {
        super(brand, model, volumeEngine);
        this.bodyType = bodyType;
    }

    @Override
    public void startMovement() {
        System.out.printf("Машина %s %s начать движение", this.getBrand(), this.getModel());
    }
    @Override
    public void stopMovement() {
        System.out.printf("Машина %s %s закончить движение", this.getBrand(), this.getModel());

    }

    @Override
    public void printInformation() {
        if (this.bodyType != null) {
            System.out.println(this.bodyType);
        } else {
            System.out.println("Укажите тип кузова.");
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.5;
    }

    @Override
    public void repair() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " отремонтирован!");
    }


    @Override
    public void pitStop() {
        System.out.printf("Машина %s %s выполняет пит-стоп", this.getBrand(), this.getModel());
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