package tec.poo;

public class Bar {

    private String someName;

    // Esto rompe el principio de Encapsulamiento
    public String anotherInstanceVariable;

    public Bar() {
        
    }

    public String getSomeName() {
        return someName;
    }

    public void setSomeName(String someName) {
        this.someName = someName;
    }

    public void doSomething() {
        System.out.println("do something.");
    }
}
