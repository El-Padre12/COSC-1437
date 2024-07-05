package WedsDemo;

public class Classroom {
    private String building;
    private String classNumber;
    private int occupancy;
    private Computer computer;
    private Projector projector;

    //constructors
    public Classroom(String building, String classNumber, int occupancy, Computer computer, Projector projector) {
        this.building = building;
        this.classNumber = classNumber;
        this.occupancy = occupancy;
        this.computer = new Computer(computer);
        this.projector = new Projector(projector);
    }

    public Classroom() {
        this.building = "None";
        this.classNumber = "None";
        this.occupancy = -1;
        this.computer = new Computer();
        this.projector = new Projector();
    }

    //getter and setters
    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public int getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(int occupancy) {
        this.occupancy = occupancy;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = new Computer(computer);
    }

    public Projector getProjector() {
        return projector;
    }

    public void setProjector(Projector projector) {
        this.projector = new Projector(projector);
    }

    //functions
    public String printClassroomInfo() {
        String myReturn = "";
        myReturn += "Building: " + this.building + "\n";
        myReturn += "Classroom: " + this.classNumber + "\n";
        myReturn += "Occupancy: " + this.occupancy + "\n";
        myReturn += this.projector + "\n";
        myReturn += this.computer + "\n";
        return myReturn;
    }
}
