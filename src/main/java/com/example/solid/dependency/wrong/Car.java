package com.example.solid.dependency.wrong;

import com.example.solid.dependency.Engine;
import com.example.solid.dependency.GasolineEngine;

// Violación del principio
public class Car {
    private Engine engine;
    public Car() {
        engine = new GasolineEngine();
    }
}
