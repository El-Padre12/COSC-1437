public class Pet{

    String name, sound, type;

    //
    public Pet(String name, String sound, String type) {
        this.name = name;
        this.sound = sound;
        this.type = type;
    }

    //GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //FUNCTIONS
    public String printInfo() {
        String myReturn = "";
        myReturn += "Name: " + this.name;
        myReturn += "\nType: " + this.type;
        myReturn += "\nSound: " + this.sound;
        return  myReturn;
    }
}
