package WedsDemo;

public class Projector {
    //variables
    private String make;
    private double price;

    public Projector(String make, double price) {
        this.make = make;
        this.price = price;
    }

    public Projector() {
        this.make = "No make ";
        this.price = 0.0;
    }

    public Projector (Projector pProj) {
        this.make = pProj.make;
        this.price = pProj.price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Functions

    @Override
    public String toString() {
        return "Projector " + "\n" +
                "\tmake: " + make + "\n" +
                "\tPrice: " + price + "\n";

    }
}
