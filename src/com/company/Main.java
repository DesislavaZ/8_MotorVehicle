package com.company;

public class Main {

    public static void main(String[] args) {
        MotorVehicle[] moto = new MotorVehicle[5] ;

           moto[0]=new MotorBike();
           moto[1]=new Car();
        for (int i = 0; i < 2; i++) {
            moto[i].printCar();
            moto[i].turnLeft();
            moto[i].stop();
            moto[i].turnRight();
            moto[i].driveForward(120);
        }

    }
}
