package at.alperen.oo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class car {
    public Engine engine;
    private List<RearMirror> mirrors;
    private List<Tires> Tires;
    private int fuelConsumption;
    private int fuelAmount;
    private String brand;
    private String serialNumber;
    private String color;


   public car(Engine engine, String brand, String color, String Type){
        this.engine = engine;
        this.brand = brand;
        this.color = color;
       // this.honkCounter = 0;
       this.mirrors = new ArrayList<>();
       this.Tires = new ArrayList<>();
    }

    public car(Engine engine, String brand, String color) {

    }

    public void addMirror(RearMirror rearMirror){
       this.mirrors.add(rearMirror);
    }
    public void addTires(Tires tires) {this.Tires.add(tires);}

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public List<Tires> getTires(){
       return Tires;
    }

    // Methode
    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");
    }

    public void brake(){
        System.out.println("Ich bremse");
    }

    public void turboBoost(){
        if(getFuelAmount()>(getFuelAmount()/100*10)) {
            System.out.println("SuperBoostMode");
        }
        else{
            System.out.println("Not enough fuel to go to SuperBoost");
        }
    }

    /*public void honk(){
        System.out.println("Tuuut");
    }*/


    public void honk(){
        System.out.println("Ich bin ein " + this.brand + " und habe die Farbe " + this.color + " und hab " + this.getEngine().getHorsePower() + " PS. Ich habe" + this.Tires + ".");
    //    this.honkCounter++;
     }




    public int getFuelConsumption() {
        return fuelConsumption;
    }
    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }
    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }


    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
