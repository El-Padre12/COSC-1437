package MidTerm;
/**
 * Person Class
 * 	Class contains: First name, Last name, and age
 */
//Modified by: Angel Chavez 3/18/2024. added GPA and Phone number variables, data points to file writer, as well as
//modified the PrintData method to include hyphens in the phone number.
//Resources used: https://howtodoinjava.com/java/string/format-phone-number/
public class Person {
    //Attributes/fields
    private String firstName;
    private String lastName;
    private String phoneNum;
    private int personAge;
    private double GPA;

    /**************************************
     * Constructors
     **************************************/
    //Constructors (Default)
    public Person()
    {
        firstName = "None";
        lastName = "None";
        personAge = 0;
        phoneNum = "None";
        GPA = 0.0;
    }

    //Constructors (Populates data with arguments, but sets phoneNum and GPA to "none" and "0")
    public Person(String pFirst, String pLast, int pAge)
    {
        setFirstName(pFirst);
        setLastName(pLast);
        setPersonAge(pAge);
        setPhoneNum("None");
        setGPA(0.0);
    }

    //Constructors (Populates data with arguments)
    public Person(String firstName, String lastName, int personAge, String phoneNum, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personAge = personAge;
        this.phoneNum = phoneNum;
        this.GPA = GPA;
    }

    /**************************************
     * Getters/Setters
     **************************************/

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPersonAge() {
        return personAge;
    }
    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String  getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    /**************************************
     * Methods
     **************************************/
    public String PrintData()
    {
        String myReturn = "";
        myReturn += "Name: " + getFirstName() + " " + getLastName();
        myReturn += ", Age: " + getPersonAge();
        myReturn += ", GPA: " + getGPA();
        myReturn += ", Phone: " + getPhoneNum().replaceFirst("(\\d{3})(\\d{3})(\\d+)", "$1-$2-$3");
        return myReturn;
    }

} // END Person Class