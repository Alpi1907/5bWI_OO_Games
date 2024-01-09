package at.alperen.oo.Test;

import java.util.ArrayList;
import java.util.List;

public class Cynapp {

    private List<interfaceDevice> devices;

    public Cynapp(String name){
        this.devices = new ArrayList<>();
    }

    public List<interfaceDevice> getDevices() {
        return devices;
    }

    public void addDevice(interfaceDevice interfacedevice) {this.devices.add(interfacedevice);}

    public void showDevice(){
        System.out.println("This is Device " + devices);
    }
}
