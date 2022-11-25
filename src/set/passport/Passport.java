package pro.sky.java.src.set.passport;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {

    private final int number;
    private final String lastName;
    private final String name;
    private final String middleName;
    private final LocalDate localDate;

    public Passport(int number, String lastName, String name, String middleName, LocalDate localDate) {
        this.number = number;
        if (this.number != 0) {
        } else {
            System.out.println("Укажите номер паспорта.");
        }
        this.lastName = lastName;
        if (this.lastName != null) {
        } else {
            System.out.println("Укажите фамилию.");
        }
        this.name = name;
        if (this.name != null) {
        } else {
            System.out.println("Укажите имя.");
        }
        this.middleName = middleName;
        this.localDate = localDate;
    }

    public int getNumber() {
        return number;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return " Паспорт :" +
                " Норме : " + number +
                ", Фамилия : " + lastName + '\'' +
                ", Имя : " + name + '\'' +
                ", Отчество : " + middleName + '\'' +
                ", Дата :" + localDate +
                '\n';
    }
}
