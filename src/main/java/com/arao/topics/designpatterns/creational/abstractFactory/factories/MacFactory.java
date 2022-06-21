package com.arao.topics.designpatterns.creational.abstractFactory.factories;

import com.arao.topics.designpatterns.creational.abstractFactory.buttons.Button;
import com.arao.topics.designpatterns.creational.abstractFactory.checkboxes.Checkbox;
import com.arao.topics.designpatterns.creational.abstractFactory.buttons.MacButton;
import com.arao.topics.designpatterns.creational.abstractFactory.checkboxes.MacCheckbox;

public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
