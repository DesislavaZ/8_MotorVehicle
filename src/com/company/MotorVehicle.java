package com.company;

public abstract class MotorVehicle implements Driveable{
    String  brand;
    double price;
    double consumption;
    double fuel;



    public MotorVehicle(String brand, int price, int consumption, int fuel) {
        this.brand = brand;
        this.price = price;
        this.consumption = consumption;
        this.fuel = fuel;

    }

    public MotorVehicle() {
        this.brand = "PORSHE";
        this.price = 20000;
        this.consumption = 4;
        this.fuel = 95;
    }
}
