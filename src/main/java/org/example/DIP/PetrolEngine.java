package org.example.DIP;

public class PetrolEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Старт бензиновый двигателя");
    }
}
