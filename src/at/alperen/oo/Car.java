package at.alperen.oo;

import java.sql.SQLOutput;

public class Car {
    // Instanz / Gedächtnisvaribalen

    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    private String color;

    // Methode
    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");
    }
}
