package org.example.OCP;

public class mainOCP {
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle(100,"ship");
        printMaxSpeed(vehicle);
        vehicle=new Car(100);
        printMaxSpeed(vehicle);
        vehicle=new Bus(100);
        printMaxSpeed(vehicle);
    }

    static void printMaxSpeed(Vehicle vehicle){
        System.out.println(vehicle.calculateMaxSpeed());
    }
}
