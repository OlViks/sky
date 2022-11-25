package pro.sky.java.src.oop.src.transport;

public class Sponsor {

    private final String name;

    private final int amount;

    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }


    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void sponsorRace() {
        System.out.printf("Спонсор %s проспонсировал заезд на %d\n",getName(),getAmount());
    }

}
