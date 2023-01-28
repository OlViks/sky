package pro.sky.java.src.oop.src.transport;

public class  Mechanic<T extends Transport> {


    public final String name;
    public final String surname;
    public final String company;


    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    public boolean service(T t) {
        return t.service();
    }

    public void repair(T t) {
        t.repair();
    }
}
