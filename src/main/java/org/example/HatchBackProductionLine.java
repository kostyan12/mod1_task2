package org.example;

import org.example.dto.Car;
import org.springframework.stereotype.Component;

@Component
public class HatchBackProductionLine implements ProductionLine{
    @Override
    public Car work() {
//        Car car = new Car(true);
        Car car = new Car();
        return car;
      //  System.out.println("HATCHBACK built");
    }
}
