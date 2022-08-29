package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.example.dto.Car;

@Component
//@Profile("test")
@Scope("prototype")
public class AutoFactory {
    private int prodSize;
    //@Autowired
    //@Qualifier("sedanPL")
    private ProductionLine productionLine;
    private int carsBuilt;

    @Autowired
    public AutoFactory(@Qualifier("sedanPL") ProductionLine productionLine) {
        this.productionLine = productionLine;
    }

    public AutoFactory(int prodSize, ProductionLine productionLine) {
        this.prodSize = prodSize;
        this.productionLine = productionLine;
    }

    public int getProdSize() {
        return prodSize;
    }

    public void setProdSize(int prodSize) {
        this.prodSize = prodSize;
    }

    public void runProduction() {
        //productionLine.work();
        while (carsBuilt < prodSize) {
            Car car = productionLine.work();
            if (car.isPartsDelivered()){
                carsBuilt++;
                System.out.println("car is built");
            }
            else {
                System.out.println("car is not built");
            }
        }
    }

    public AutoFactory() {
    }

    private static AutoFactory factory() {
        return new AutoFactory();
    }

    @PostConstruct
    public void init() {
        System.out.println("bean initialized");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("bean destroyed");
    }
}
