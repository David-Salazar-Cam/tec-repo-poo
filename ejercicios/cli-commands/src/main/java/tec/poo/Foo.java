package tec.poo;

import tec.poo.exception.MyCheckedException;
import tec.poo.exception.MyUncheckedException;

public class Foo {

    public void execute() throws MyCheckedException {

        System.out.println("Foo execute()");
        // yo pude haber lanzado una excepcion aqui
    }

    public void run() {
        throw new MyUncheckedException("this is an unchecked exception");
    }

}
