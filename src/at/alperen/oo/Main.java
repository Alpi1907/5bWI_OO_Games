package at.alperen.oo;

public class Main {
    public static void main(String[] args) {
        //int a = 7;

        Engine e1 = new Engine (140, Engine.TYPE.DIESEL);
        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(90, -40);
        Tires T1 = new Tires("Sommerreifen", 10);
        Tires T2 = new Tires("Sommerreifen", 10);
        Tires T3 = new Tires("Sommerreifen", 10);
        Tires T4 = new Tires("Sommerreifen", 10);

        car c1 = new car(e1, "Mercedes", "schwarz", "Sommerreifen");
        c1.addMirror(r1);
        c1.addMirror(r2);
        c1.addTires(T1);
        c1.addTires(T2);
        c1.addTires(T3);
        c1.addTires(T4);

        //System.out.println(c1.getMirrors().get(0).getPosition());

        /*car c1 = new car();
        c1.setBrand("Audi");
        c1.setFuelConsumption(7);
        c1.setSerialNumber("A1234");
        c1.setFuelAmount(70);*/

        /*car c2 = new car();
        c2.setBrand("Mercedes");
        c2.setFuelConsumption(6);
        c2.setSerialNumber("M1234");
        c2.setFuelAmount(20);
        c2.setColor("schwarz");*/


        //car c3 = new car(17,"Opel","1234O");

        //System.out.println(c3.serialNumber);

        /*System.out.println(c1.getFuelAmount());
        c1.drive();
        System.out.println(c1.getFuelAmount());
        c1.brake();
        c1.turboBoost();*/
        //System.out.println(c1.getEngine().getHorsePower());
        //c1.honk();


        Truck t1 = new Truck(e1, "Mercedes", "green", "trailer1");

        /*System.out.println(t1.getColor() + t1.getTrailer());
        t1.drive();
        t1.brake();*/

        System.out.println(c1.getFuelAmount());
        c1.turboBoost();
        c1.drive();
        t1.drive();



    }
}
