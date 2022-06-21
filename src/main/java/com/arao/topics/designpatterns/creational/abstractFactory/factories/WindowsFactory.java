package com.arao.topics.designpatterns.creational.abstractFactory.factories;

import com.arao.topics.designpatterns.creational.abstractFactory.buttons.Button;
import com.arao.topics.designpatterns.creational.abstractFactory.checkboxes.Checkbox;
import com.arao.topics.designpatterns.creational.abstractFactory.buttons.WindowsButton;
import com.arao.topics.designpatterns.creational.abstractFactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
