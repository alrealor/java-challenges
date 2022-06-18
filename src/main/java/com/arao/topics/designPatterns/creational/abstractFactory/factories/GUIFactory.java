package com.arao.topics.designPatterns.creational.abstractFactory.factories;

import com.arao.topics.designPatterns.creational.abstractFactory.buttons.Button;
import com.arao.topics.designPatterns.creational.abstractFactory.checkboxes.Checkbox;

public interface GUIFactory {
    public Button createButton();
    public Checkbox createCheckbox();
}
