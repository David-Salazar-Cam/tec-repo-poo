package tec.poo;

import tec.poo.exception.MyCheckedException;

public class Bar {

    Foo foo;

    public void action() {
        try {
            foo.execute();
        } catch (MyCheckedException e) {
            throw new RuntimeException(e);
        }
    }

    public void anotherAction() {
        foo.run();
    }
}
