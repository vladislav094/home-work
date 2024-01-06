package pack;

import java.util.ArrayList;
import java.util.List;

public class GenericsTwoTuple<A, B> {
    public final A first;
    public final B second;

    public GenericsTwoTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

class GenericsThreeTuple<A, B, C> extends GenericsTwoTuple<A, B> {

    public final C third;

    public GenericsThreeTuple(A first, B second, C third) {
        super(first, second);
        this.third = third;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }
}

class TupleTest {

    static GenericsTwoTuple<String, Integer> f() {
        return new GenericsTwoTuple<>("hi", 47);
    }

    static GenericsThreeTuple<Cat, String, Integer> g() {
        return new GenericsThreeTuple<>(new Cat(), "Hello", 17);
    }

    public static void main(String[] args) {
        GenericsTwoTuple<String, Integer> test1 = f();
        GenericsThreeTuple<Cat, String, Integer> test2 = g();
        System.out.println(test1);
        System.out.println(test2);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("New Animal()"));
        animalList.add(new Animal());

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("New Cat()"));
        catList.add(new Cat());

        List<Tiger> tigerList = new ArrayList<>();
        tigerList.add(new Tiger("New Tiger()"));
        tigerList.add(new Tiger());

    }
}
