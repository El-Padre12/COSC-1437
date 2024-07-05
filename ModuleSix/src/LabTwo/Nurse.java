/*
Author: Angel Chavez
Assignment: Module Six Lab Two
Date: 4/8/2024
Language: Java
Description: sub class of MedicalProvider for Nurse objects, has type, wage, and hours worked attributes.
*/
package LabTwo;

import java.text.NumberFormat;
import java.util.Objects;

public class Nurse extends MedicalProvider{
    //private instances
    private String type;
    private double hourlyWage, hoursWorked;

    //constructors
    public Nurse(String firstName, String lastName, String employeeID, OfficeLocation employeeOffice, String type,
                 double hourlyWage, double hoursWorked) {
        super(firstName, lastName, employeeID, employeeOffice);
        this.type = type;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public Nurse() {
        super();
        this.type = "none";
        this.hourlyWage = 0.0;
        this.hoursWorked = 0.0;
    }

    public Nurse(Nurse pNurse) {
        super(pNurse);
        this.type = pNurse.type;
        this.hourlyWage = pNurse.hourlyWage;
        this.hoursWorked = pNurse.hoursWorked;
    }

    //getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //functions
    public double payEmployee() {
        double grossPay;

        if (hoursWorked <= 40) {
            grossPay = hourlyWage * hoursWorked;
        }else
            grossPay = (hoursWorked - 40) * (hourlyWage * 1.5) + (40 * hourlyWage);
        return grossPay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nurse nurse)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(getHourlyWage(), nurse.getHourlyWage()) == 0 && Double.compare(getHoursWorked(),
                nurse.getHoursWorked()) == 0 && Objects.equals(getType(), nurse.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getType(), getHourlyWage(), getHoursWorked());
    }

    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        return "\t*** Nurse ***\n" + super.toString() + "\n" +
                "Type: " + type + "\n" +
                "Hourly Wage: " + formatter.format(hourlyWage) + "\n" +
                "Hours Worked: " + hoursWorked + "\n" +
                "Weeks Pay: " + formatter.format(payEmployee());
    }
}
