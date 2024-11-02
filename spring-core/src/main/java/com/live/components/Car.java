package com.live.components;

import com.live.components.Wheel;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private Wheel wheel;
    private Engine engine;

    public Car(Wheel wheel, Engine engine) {
        this.wheel = wheel;
        this.engine = engine;
    }

    public void drive() {
        System.out.println("Car is driving");
        engine.start();
        wheel.run();
    }
}
