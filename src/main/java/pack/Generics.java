package pack;

public class Generics<T> {
    private T a;

    public Generics(T a) {
        this.a = a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public static void main(String[] args) {

        Generics<Tiger> cat = new Generics<>(new Tiger("Tiger"));
        Animal a = cat.getA();
        cat.setA(new Tiger());
    }
}
