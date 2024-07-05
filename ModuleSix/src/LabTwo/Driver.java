/*
Author: Angel Chavez
Assignment: Module Six Lab Two
Date: 4/8/2024
Language: Java
Description: Medical providers program that demos polymorphism.
*/
package LabTwo;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {

        OfficeLocation northOffice = new OfficeLocation("Vanguard Health 1", "San Antonio", "78228",
                "123 Frio rd", "Texas");
        OfficeLocation centralOffice = new OfficeLocation("Vanguard Health 2", "San Antonio",
                "78210", "3345 Houston st", "Texas");

        MedicalProvider doc1 = new Doctor("Alex", "Marquez", "D9023", northOffice,
                875000, "Neurology", "NRO3456");
        MedicalProvider doc2 = new Doctor("Angel", "Chavez", "D8134", centralOffice,
                430000, "Orthopedic", "ORT9863");

        MedicalProvider nurse1 = new Nurse("Matthew", "Hamilton", "N8734", northOffice,
                "RN", 40, 60);
        MedicalProvider nurse2 = new Nurse("Nicole", "Martinez", "N9034", centralOffice,
                "CRNA", 60, 50);

        ArrayList<MedicalProvider> providersList = new ArrayList<>();

        providersList.add(doc1);
        providersList.add(nurse1);
        providersList.add(doc2);
        providersList.add(nurse2);

        System.out.println("********Providers List********");

        for (MedicalProvider myProvider : providersList) {
            System.out.println(myProvider + "\n");
        }

    }
}
