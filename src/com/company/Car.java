package com.company;

public class Car extends MotorVehicle{
    private Object String;

    public Car(){
        super("Mercedes",54000,5,30);
    }

    @Override
    public String toString() {
        return "Car{" +
                "String=" + String +
                '}';
    }

    @Override
    public void driveForward(int distance) {
        System.out.println("Car distance is: " + distance);
    }

    @Override
    public void stop() {
        System.out.println("Car stop");
    }

    @Override
    public void turnLeft() {
        System.out.println("Car in left");
    }

    @Override
    public void turnRight() {
        System.out.println("Car to right");

    }
    public void printCar(){
        System.out.println("Brand: "+ brand  + "\n price :" +price);
    }
}
