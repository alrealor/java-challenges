package com.arao.topics.designPatterns.creational.factory.shapes;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle Draw");
    }
}