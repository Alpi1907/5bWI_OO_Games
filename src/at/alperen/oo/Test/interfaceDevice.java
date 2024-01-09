package at.alperen.oo.Test;

public class interfaceDevice {

    private String name;

    public interfaceDevice(String name){
        this.name = name;
    }

    public void isActive(){

    }

    public String getContent(){
        if (name == "Miracast1"){
            System.out.println("Hello Miracast1!");
        }
        else if (name == "Miracast2"){
            System.out.println("Hello Miracast2!");
        }
        else if (name == "AirPlay1"){
            System.out.println("Hello AirPlay1!");
        }
        else if (name == "AirPlay2"){
            System.out.println("Hello AirPlay2!");
        }
        else {
            System.out.println("Device doesn't exist");
        }
        return "done";
    }


    public String getName() {return name;}
    public void setName(String name) {this.name = name;}


}
