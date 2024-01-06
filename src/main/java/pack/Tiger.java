package pack;

public class Tiger extends Cat {
    String name;
    private static int counter = 1;

    public Tiger() {
        name = "Tiger " + counter;
        counter++;
    }

    public Tiger(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("Я ТИГР, я бегу!");
    }

    @Override
    public String toString() {
        return String.valueOf(name);
    }
}
