package pro.sky.java.src.set.multiply;

import java.util.Objects;

public class Example {

    private final int number1;

    private final int number2;

    public Example(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example example = (Example) o;
        return (number1 == example.number1 && number2 == example.number2) ||
                (number2 == example.number1 && number1 == example.number2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number1 * number2);
    }

    @Override
    public String toString() {
        return String.format("%s * %s = __", this.number1, this.number2);
    }
}
