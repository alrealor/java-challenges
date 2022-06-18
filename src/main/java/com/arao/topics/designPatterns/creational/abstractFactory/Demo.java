package com.arao.topics.designPatterns.creational.abstractFactory;

import com.arao.topics.designPatterns.creational.abstractFactory.factories.GUIFactory;
import com.arao.topics.designPatterns.creational.abstractFactory.factories.MacFactory;
import com.arao.topics.designPatterns.creational.abstractFactory.factories.WindowsFactory;

/**
 * Abstract Factory
 *
 * This is a creational design pattern, which solves the problem of creating entire product families without specifying
 * their concrete classes.
 */
public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        GUIFactory factory;

        final String OS = System.getProperty("os.name");
        if (OS.toLowerCase().equals("windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }

        return new Application(factory);
    }


    public static void main(String... args) {
        System.setProperty("os.name", "windows");
        Application app = configureApplication();
        app.paint();
    }
}
