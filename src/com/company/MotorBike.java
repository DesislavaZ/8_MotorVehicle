package com.company;

public class MotorBike extends MotorVehicle{
    public MotorBike(){
        super("Yamaha",22000,5,10);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void driveForward(int distance) {
        System.out.println("Motor distance is: " + distance);
    }

    @Override
    public void stop() {
        System.out.println("Motor stop");
    }

    @Override
    public void turnLeft() {
        System.out.println("Motor turn Left");
    }

    @Override
    public void turnRight() {
        System.out.println("Motor turn right");
    }

    public void printCar() {
        System.out.println("Brand: "+ brand  + "\n price : " +price);
    }
}


