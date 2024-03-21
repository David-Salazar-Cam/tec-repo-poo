package tec.poo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertThat(true).isTrue();
    }

    @Test
    public void basicMethodInvocation() {
        Foo foo = new Foo();
        //Foo foo = new Foo(7);
        foo.someMethod();

        System.out.println(foo.getMyNumber());

        Foo.myStaticMethod();

        Foo.MY_NUMBER = 80;

        // Esto no se puede modificar porque es una constante en Java. Por usa final
        // Foo.MY_CONSTANT = 40;

        Bar bar = new Bar();
        System.out.println(bar.getSomeName());
        bar.anotherInstanceVariable = "Algo malo";

        foo.setNumber(10);
        foo.multiply(6);
        foo.someOtherMethod(bar);

        foo.someOtherMethod(null);

    }

    @Test
    public void mutableVsImmutable() {
        var object1 = new Mutable(10);
        object1.increase(); // object1.getSomeNumber() ? 11

        var object2 = new Immutable(10);
        object2 = object2.increase();

    }

    @Test
    public void printStrategies() {

        Printable printable = new TerminalPrinter();
        printable.print();

        printable = new PaperPrinter();
        printable.print();
    }
}
