package com.arao.topics.solidprinciples.liskovsubstitution;

import com.arao.topics.solidprinciples.liskovsubstitution.cars.Car;
import com.arao.topics.solidprinciples.liskovsubstitution.cars.ElectricCar;
import com.arao.topics.solidprinciples.liskovsubstitution.cars.MotorCar;

/**
 * 3. Liskov substitution principle
 *
 * The Liskov Substitution Principle (LSP) applies to inheritance hierarchies such that derived classes must be completely
 * substitutable for their base classes.
 *
 * Next on our list is Liskov substitution, which is arguably the most complex of the five principles.
 * Simply put, if class A is a subtype of class B, we should be able to replace B with A without disrupting the behavior
 * of our program.
 *
 */
public class LiskovSubstitutionTester {

    public static void main(String[] args) {
        // any subtype of a Car can do basic functionality of a Car
        Car electric = new ElectricCar("Electric");
        Car motor = new MotorCar("Motor");

        electric.accelerate(120);
        motor.accelerate(1200);
    }

}
