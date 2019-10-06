package com.company.builder;

public class Car {

    private Integer id;
    private String model;
    private Integer wheels;

    public Car (Builder builder){
        this.id = builder.id;
        this.model = builder.model;
        this.wheels = builder.wheels;
    }

    public Integer getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public Integer getWheels() {
        return wheels;
    }

    public static class Builder {

        //here is a method which returns object which is build using static class Builder
        public Car build () {
            return new Car(this);
        }

        private Integer id = null;
        private String model = null;
        private Integer wheels = null;

        public Builder id (Integer id){
            this.id = id;
            return this;
        }

        public Builder model (String model){
            this.model = model;
            return this;
        }

        public Builder wheels (Integer wheels){
            this.wheels = wheels;
            return this;
        }

    }
}
