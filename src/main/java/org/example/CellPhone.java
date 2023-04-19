package org.example;

public class CellPhone {
    int serialNumber;

    String model;

    String carrier;

    String phoneNumber;

    String owner;

    CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner){
        this.model = model;
        this.serialNumber = serialNumber;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }
}