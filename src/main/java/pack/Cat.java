package pack;

public class Cat extends Animal {
    public String tail;

    public void moveTail() {
        System.out.println("Я веляю хвостом!");
    }

    public Cat() {
        this.tail = "New Cat!";
    }

    @Override
    public void move() {
        System.out.println("Я прыгаю!");
        super.move();
    }

    @Override
    public String toString() {
        return tail;
    }
}