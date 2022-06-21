package com.arao.topics.solidprinciples.liskovsubstitution.cars;

import com.arao.topics.solidprinciples.liskovsubstitution.engines.CombustionEngine;
import com.arao.topics.solidprinciples.liskovsubstitution.engines.Engine;

public class MotorCar extends Car implements CombustionEngine {

    public Engine engine = new Engine();

    public MotorCar(String type) {
        super(type);
    }

    @Override
    public void turnOnCombustionEngine() {
        engine.engineOn();
    }
}
