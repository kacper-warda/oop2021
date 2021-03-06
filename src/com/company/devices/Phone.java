package com.company.devices;

import java.util.List;

public class Phone extends Device implements Refillable {
    private static final String DEFAULT_VERSION = "latest";
    public final Double screenSize;
    public String os;

    public static String greetings = "HELLO";

    public Phone(String producer, String model, Double screenSize, String os) {
        super(producer, model);
        this.screenSize = screenSize;
        this.os = os;
    }

    public String toString() {
        return "producer: " + this.producer
                + " model: " + this.model;
    }

    public void turnOn() {
        System.out.println("push the button");
        System.out.println("software is loading");
        System.out.println("now you can call");
    }

    @Override
    public void refill() {
        System.out.println("wire it into the recharger");
        System.out.println("wait");
        System.out.println("wait some more time");
    }

    @Override
    public void refillToFull() {
        System.out.println("wire it into the recharger");
        System.out.println("wait");
        System.out.println("wait as long as it is needed");
    }

    // difrent sockets:
    // HDMI/VGA/SOMEOTHER
    // that all do the same think
    // transfer data from laptop to the monitor

    public void installAnApp(String appName) {
        this.installAnApp(appName, DEFAULT_VERSION);
    }

    public void installAnApp(String appName, String version) {
        //check if have a space in mem
        //check if it's paid
        //check if I have money
        //pay
        //download
        //unzip
        //install
    }

    public void installAnApp(List<String> appNames) {
        for (String appName : appNames) {
            this.installAnApp(appName);
        }
    }

}
