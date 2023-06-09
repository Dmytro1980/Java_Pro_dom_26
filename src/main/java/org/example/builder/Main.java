package org.example.builder;

import org.example.builder.*;
import org.example.builder.carComponents.Body;
import org.example.builder.carComponents.Engine;
import org.example.builder.carComponents.Transmission;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        CarBuilder builder = new CarBuilder();

        Car elCar1 = director.makeElectricCar(builder);
        System.out.println("el " + elCar1);

        Car sportCar1 = director.makeSportCar(builder);
        System.out.println("sport " + sportCar1);

        Car carForFamily = director.makeFamilyCar(builder);
        System.out.println("family " + carForFamily);


    }
}