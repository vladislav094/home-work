package pack;

public class Tiger extends Cat {
    String name;

    public Tiger(){}

    public Tiger(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("Я бегу!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
