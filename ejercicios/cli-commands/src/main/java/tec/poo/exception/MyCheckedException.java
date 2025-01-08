package tec.poo.exception;

public class MyCheckedException extends Exception {

    private int code;

    public MyCheckedException(String message, int code) {
        super(message);
        this.code = code;
    }

}
