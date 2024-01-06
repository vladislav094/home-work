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

    static GenericsThreeTuple<Dog, String, Integer> g() {
        return new GenericsThreeTuple<>(new Dog(), "Hello", 17);
    }

    public static void showExtendsWildcard(List<? extends Animal> animals) {
        for (Animal animal: animals) {
            animal.move();
        }
    }

    public static void showSuperWildcard(List<? super Cat> animals) {
        for (int i = 0; i < animals.size(); i++) {
            Object animal = animals.get(i);
            System.out.println(animal.toString());
        }
    }

    public static void main(String[] args) {
        GenericsTwoTuple<String, Integer> test1 = f();
        GenericsThreeTuple<Dog, String, Integer> test2 = g();
        System.out.println(test1);
        System.out.println(test2);
        System.out.println();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal());
        animalList.add(new Animal());

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        catList.add(new Cat());

        List<Tiger> tigerList = new ArrayList<>();
        tigerList.add(new Tiger());
        tigerList.add(new Tiger());

        showExtendsWildcard(tigerList);
        showExtendsWildcard(catList);
        showExtendsWildcard(animalList);

        showSuperWildcard(animalList);
        showSuperWildcard(catList);

//        Нельзя передать коллекцию из элементов типа Tiger, т.к класс Tiger ниже в иерархии, чем класс Cat.
//        showSuperWildcard(tigerList);

    }
}
