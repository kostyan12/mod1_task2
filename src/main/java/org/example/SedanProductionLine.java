package org.example;

import org.example.dto.Car;
import org.springframework.stereotype.Component;

@Component("sedanPL")
public class SedanProductionLine implements ProductionLine{

    @Override
    public Car work() {
        //System.out.println("SEDAN built");
        Car car = new Car();
        return car;
    }
}
