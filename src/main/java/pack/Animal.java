package pack;

public class Animal {
    public String name;
    private static int counter = 0;

    public Animal() {
        counter++;
        name = "Animal " + counter;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println("Я ЖИВОТНОЕ, я иду!");
    }

    public void makingNoise() {
        System.out.println("Я издаю звуки.");
    }

    @Override
    public String toString() {
        return String.valueOf(name);
    }
}
