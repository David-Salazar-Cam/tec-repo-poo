package tec.poo.ui;

import tec.poo.ui.controllers.HelloWorldView;

public class App {

    public static void main(String... args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new HelloWorldView();
            }
        });
    }
}
