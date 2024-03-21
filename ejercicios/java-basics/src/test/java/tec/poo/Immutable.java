package tec.poo;

public class Immutable {
    private int someNumber;
    public Immutable(int initialNumber) {
        this.someNumber = initialNumber;
    }
    public Immutable increase() {
        return new Immutable(this.someNumber + 1);
    }

    public int getSomeNumber() {
        return this.someNumber;
    }
}
