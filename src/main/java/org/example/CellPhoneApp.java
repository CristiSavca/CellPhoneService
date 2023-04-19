package org.example;

public class CellPhoneApp {
    public static void main(String[] args) {
        CellPhone[] myPhones = new CellPhone[3];

        myPhones[0] = new CellPhone(1000001,
                "iPhone",
                "Verizon",
                "3475308454",
                "Cristi Savca");
        myPhones[1] = new CellPhone(1000002,
                "Samsung",
                "T-Mobile",
                "3475304650",
                "Mr. Beast");

        System.out.printf("%s belongs to %s", myPhones[1].phoneNumber, myPhones[1].owner);
    }
}
