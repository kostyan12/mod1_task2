package org.example.dto;

import org.springframework.stereotype.Component;

@Component
public class Car {


    boolean partsDelivered;

    public Car() {
        this.partsDelivered = Math.random() < 0.5;
    }

    public Car(boolean partsDelivered) {

        this.partsDelivered = partsDelivered;
    }

    public boolean isPartsDelivered() {
        return partsDelivered;
    }

    public void setPartsDelivered(boolean partsDelivered) {
        this.partsDelivered = partsDelivered;
    }
}
