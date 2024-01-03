package pack;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Camel camel = new Camel();

        Cat cat = new Cat();

        camel.move();
        cat.move();
        cat.moveTail();

        calculate(1, 6);
        ArrayList<String> a = new ArrayList<>();
        HashSet<String> b = new HashSet<>();
        b.add("book");
        b.add("book");
    }

    public static int calculate(Object a, Object b) {
        return (int) a * (int) b;
    }

}
