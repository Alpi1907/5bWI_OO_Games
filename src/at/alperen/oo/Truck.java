package at.alperen.oo;

public class Truck extends car{
    private String trailer;

    public Truck(Engine engine, String brand, String color, String trailer) {
        super(engine, brand, color);
        this.trailer = trailer;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    @Override
    public void drive() {
        System.out.println("I am driving the truck - consuption is high");
    }
}
