package com.example.solid.dependency.wrong;

// Violación del principio
public class Car {
    private Engine engine;
    public Car() {
        engine = new GasolineEngine();
    }
}
