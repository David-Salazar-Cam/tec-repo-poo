package tec.poo;

public class Mutable {
    private int someNumber;
    public Mutable(int initialNumber) {
        this.someNumber = initialNumber;
    }
    public void increase() {
        this.someNumber = this.someNumber++;
    }
}
