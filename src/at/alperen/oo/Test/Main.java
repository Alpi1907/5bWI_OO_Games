package at.alperen.oo.Test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        interfaceDevice d1 = new interfaceDevice("Miracast1");
        interfaceDevice d2 = new interfaceDevice("Miracast2");
        interfaceDevice d3 = new interfaceDevice("AirPlay1");
        interfaceDevice d4 = new interfaceDevice("AirPlay2");

        Beamer b1 = new Beamer();

        System.out.println(d1.getContent());

    }

}
