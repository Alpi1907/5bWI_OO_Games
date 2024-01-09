package at.alperen.oo.Fernbedienung;

import at.alperen.oo.Engine;

public class Battery {

    private int chargingStatus = 100;

    public Battery(int chargingStatus) {
        this.chargingStatus = chargingStatus;
    }

    public void chargingStatus(){

    }

    public int getChargingStatus() {
        return chargingStatus;
    }
    public void setChargingStatus(int chargingStatus) {
        this.chargingStatus = chargingStatus;
    }
}
