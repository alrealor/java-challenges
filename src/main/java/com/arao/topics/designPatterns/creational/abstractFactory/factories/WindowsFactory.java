package com.arao.topics.designPatterns.creational.abstractFactory.factories;

import com.arao.topics.designPatterns.creational.abstractFactory.buttons.Button;
import com.arao.topics.designPatterns.creational.abstractFactory.checkboxes.Checkbox;
import com.arao.topics.designPatterns.creational.abstractFactory.buttons.WindowsButton;
import com.arao.topics.designPatterns.creational.abstractFactory.checkboxes.WindowsCheckbox;

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
