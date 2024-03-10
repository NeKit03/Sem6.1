package org.example.SRP;

public class CalculateSalary {
    private int baseSalary;

    public CalculateSalary(int baseSalary) {

        this.baseSalary = baseSalary;
    }
    public double calculateSalary(){
        return baseSalary*0.5;
    }
}
