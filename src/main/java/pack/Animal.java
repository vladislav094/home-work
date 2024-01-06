package pack;

public class Animal {
    public String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println("Я иду!");
    }

    public void makingNoise() {
        System.out.println("Я издаю звуки.");
    }
}
