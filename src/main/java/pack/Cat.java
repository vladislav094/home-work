package pack;

public class Cat extends Animal {
    public String name;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public void moveTail() {
        System.out.println("Я веляю хвостом!");
    }

    @Override
    public void move() {
        System.out.println("Я прыгаю!");
        super.move();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
