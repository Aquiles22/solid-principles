package com.example.solid.dependency.ok;

import com.example.solid.dependency.Engine;

public class CarFactory {
    public static Car createCar(Engine engine) {
        return new Car(engine);
    }
}