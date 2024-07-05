package WedsDemo;

public class Computer {
    private String manufacturer;
    private int Ram;
    private int storage;

    //constructors

    public Computer(String manufacturer, int ram, int storage) {
        this.manufacturer = manufacturer;
        Ram = ram;
        this.storage = storage;
    }

    public Computer() {
        this.manufacturer = "None";
        Ram = -1;
        this.storage = -1;
    }

    public Computer (Computer pComp) {
        this.manufacturer = pComp.manufacturer;
        this.Ram = pComp.Ram;
        this.storage = pComp.storage;
    }

    //getters and setters


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    //Functions
    @Override
    public String toString() {
        return "Computer " + "\n" +
                "\tManufacturer: " + manufacturer + "\n" +
                "\tRam: " + Ram + "\n" +
                "\tStorage: " + storage + "\n";
    }
}
