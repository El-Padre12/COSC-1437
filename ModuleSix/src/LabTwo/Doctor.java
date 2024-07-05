/*
Author: Angel Chavez
Assignment: Module Six Lab Two
Date: 4/8/2024
Language: Java
Description: sub class of MedicalProvider for Doctor objects, has salary, specialty, and license number attributes.
*/
package LabTwo;

import java.text.NumberFormat;
import java.util.Objects;

public class Doctor extends MedicalProvider {
    //instance variables
    private double yearlySalary;
    private String specialty, licenseNumber;

    //constructors
    public Doctor(String firstName, String lastName, String employeeID, OfficeLocation employeeOffice,
                  double yearlySalary, String specialty, String licenseNumber) {
        super(firstName, lastName, employeeID, employeeOffice);
        this.yearlySalary = yearlySalary;
        this.specialty = specialty;
        this.licenseNumber = licenseNumber;
    }

    public Doctor() {
        super();
        this.yearlySalary = 0.0;
        this.specialty = "none";
        this.licenseNumber = "none";
    }

    public Doctor(Doctor pDoctor) {
        super(pDoctor);
        this.yearlySalary = pDoctor.yearlySalary;
        this.specialty = pDoctor.specialty;
        this.licenseNumber = pDoctor.licenseNumber;
    }

    //getters and setters
    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    //functions
    public double payEmployee() {
        return yearlySalary / 52;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctor doctor)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(getYearlySalary(), doctor.getYearlySalary()) == 0 && Objects.equals(getSpecialty(),
                doctor.getSpecialty()) && Objects.equals(getLicenseNumber(), doctor.getLicenseNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getYearlySalary(), getSpecialty(), getLicenseNumber());
    }

    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        return "\t*** Doctor ***\n" + super.toString() + "\n" +
                "Yearly Salary: " + formatter.format(yearlySalary) + "\n" +
                "Specialty: " + specialty + "\n" +
                "License Number: " + licenseNumber + "\n" +
                "Weeks Pay: " + formatter.format(payEmployee());
    }
}
