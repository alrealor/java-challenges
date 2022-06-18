package com.arao.topics.designPatterns.structural.decorator;

import com.arao.topics.designPatterns.structural.decorator.shape.Shape;

public abstract class ShapeDecorator implements Shape {

    protected Shape shapeDecorated;

    public ShapeDecorator(Shape shape) {
        this.shapeDecorated = shape;
    }

    @Override
    public void draw() {
        this.shapeDecorated.draw();
    }
}
