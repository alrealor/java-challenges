package com.arao.topics.designPatterns.structural.decorator;

import com.arao.topics.designPatterns.structural.decorator.shape.Shape;

public class RedColorDecorator extends ShapeDecorator {

    public RedColorDecorator(Shape shapeDecorated) {
        super(shapeDecorated);
    }

    @Override
    public void draw() {
        shapeDecorated.draw();
        this.setRedBorder(shapeDecorated);
    }

    private void setRedBorder(Shape shapeDecorated) {
        System.out.println("Red color border added");
    }
}
