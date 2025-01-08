package tec.poo.ui.controllers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldView {

    private HelloWorldController helloWorldController;
    private JFrame frame;
    private JLabel label;
    private JButton button;

    public HelloWorldView() {
        this.frame = new JFrame("HelloWorldSwing");
        this.frame.setSize(600, 600);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();

        this.label = new JLabel("Nothing to say!");
        this.label.setBounds(10,10,300, 50);
        this.label.setVerticalAlignment(JLabel.TOP);
        this.label.setFont(new Font("Verdana", Font.PLAIN, 20));

        this.button = new JButton("Say Hi!");
        this.button.setBounds(130,100,100, 50);
        this.button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DisplayHelloWorld();
            }
        });
        this.button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // otrp
            }
        });

        panel.add(label);
        panel.add(button);
        this.frame.add(panel);
        this.frame.setVisible(true);
    }


    public void setController(HelloWorldController helloWorldController) {
        this.helloWorldController = helloWorldController;
    }

    public void DisplayHelloWorld() {
        this.label.setText(this.helloWorldController.getHelloWorld());
    }

}
