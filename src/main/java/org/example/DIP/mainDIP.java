package org.example.DIP;

public class mainDIP
{
    public static void main(String[] args){
        Car car=new Car(new DiselEngine());
        car.start();
        car=new Car(new PetrolEngine());
        car.start();
    }
}
