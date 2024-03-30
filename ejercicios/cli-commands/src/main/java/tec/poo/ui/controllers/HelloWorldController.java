package tec.poo.ui.controllers;

import tec.poo.ui.models.HelloWorldModel;

public class HelloWorldController {

    private HelloWorldModel helloWorldModel;
    private HelloWorldView helloWorldView;

    public HelloWorldController(HelloWorldModel helloWorldModel, HelloWorldView helloWorldView) {
        this.helloWorldModel = helloWorldModel;
        this.helloWorldView = helloWorldView;
    }

    public HelloWorldModel getHelloWorldModel() {
        return helloWorldModel;
    }

    public void updateHelloWorld(String helloWorldText) {
        this.helloWorldModel.setHelloWorld(helloWorldText);
    }

    public String getHelloWorld() {
        return this.helloWorldModel.getHelloWorld();
    }
}
