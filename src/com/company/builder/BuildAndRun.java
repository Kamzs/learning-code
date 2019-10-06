package com.company.builder;

public class BuildAndRun {

    //adventages of using builder
    // 1. object variables setting order does not matter
    // 2. not all variables have to be set

    public static void main(String[] args) {
    Car car = new Car.Builder()
            .id(1)
            .model("Astra")
            .build();

        System.out.println(car.getId());
        System.out.println(car.getModel());
        System.out.println(car.getWheels());
}
}
