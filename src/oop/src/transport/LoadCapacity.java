package pro.sky.java.src.oop.src.transport;

public enum LoadCapacity { N1(0, 3.5F),
    N2(3.5F, 12),
    N3(12,20);
    private final float CapacityFrom;
    private final float CapacityTo;

    LoadCapacity(float capacityFrom, float capacityTo) {
        CapacityFrom = capacityFrom;
        CapacityTo = capacityTo;
    }

    @Override
    public String toString() {
        return "Грузоподъемность " +
                "от " + CapacityFrom +
                ", до " + CapacityTo + " тонн.";
    }
}