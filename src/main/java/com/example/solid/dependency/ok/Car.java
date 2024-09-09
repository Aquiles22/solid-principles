package com.example.solid.dependency.ok;

import com.example.solid.dependency.Engine;

// Aplicación del principio
public class Car {
    private Engine engine;
    public Car(Engine engine) {
        this.engine = engine;
    }
}