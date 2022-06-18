package com.arao.topics.designPatterns.creational.abstractFactory;

import com.arao.topics.designPatterns.creational.abstractFactory.buttons.Button;
import com.arao.topics.designPatterns.creational.abstractFactory.checkboxes.Checkbox;
import com.arao.topics.designPatterns.creational.abstractFactory.factories.GUIFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
