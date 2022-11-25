package pro.sky.java.src.oop.src.transport;

public enum PassengerCapacity {
    TINY(0,10),
    SMALL(0,25),
    MEDIUM(40,50),
    LARGE(60,80),
    BIG(100,120);

    private final int CapacityFrom;
    private final int CapacityTo;

    PassengerCapacity(int capacityFrom, int capacityTo) {
        CapacityFrom = capacityFrom;
        CapacityTo = capacityTo;
    }


    @Override
    public String toString() {
        return "Вместимость : " +
                "от " + CapacityFrom +
                " до " + CapacityTo + " пассажиров." ;
    }
}