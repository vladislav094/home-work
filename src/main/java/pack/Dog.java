package pack;

public class Dog {
    String name;
    private static int counter = 0;

    public Dog() {
        counter++;
        name = "Dog " + counter;
    }

    public Dog(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println("Я СОБАКА, я бегу!");
    }

    @Override
    public String toString() {
        return String.valueOf(name);
    }
}
