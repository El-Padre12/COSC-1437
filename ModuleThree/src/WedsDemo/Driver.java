package WedsDemo;

public class Driver {
    public static void main(String[] args) {
        Projector myProj = new Projector("Sony", 5000);
        Computer myComputer = new Computer("Dell", 16, 256);
        Classroom myClassroom = new Classroom("MLH", "219", 26, myComputer, myProj );

        System.out.println(myClassroom.printClassroomInfo());
    }
}
