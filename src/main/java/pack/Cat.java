package pack;

public class Cat extends Animal {
    public String name;
    private static int counter = 0;

    public Cat() {
        counter++;
        name = "Cat " + counter;

    }

    public Cat(String name) {
        this.name = name;
    }

    public void moveTail() {
        System.out.println("Я веляю хвостом!");
    }

    @Override
    public void move() {
        System.out.println("Я КОТ, я прыгаю!");
    }

    @Override
    public String toString() {
        return String.valueOf(name);
    }
}
