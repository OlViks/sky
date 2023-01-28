package pro.sky.java.src.set.multiply;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MultiplicationTable {
    private final Set<Example> examples = new HashSet<>();


    public MultiplicationTable() {
        Random random = new Random();
        while (examples.size() < 15) {
            examples.add(new Example(random.nextInt(2, 10), random.nextInt(2, 10)));
        }
    }


    @Override
    public String toString() {
        return "Таблица умножения\n" +
                "Задание:\n" + examples +
                '\n';
    }
}
