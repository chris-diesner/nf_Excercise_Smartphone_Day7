package de.neuefische;

import de.neuefische.model.BusinessContact;
import de.neuefische.model.Contact;
import de.neuefische.model.Friend;
import de.neuefische.model.Smartphone;

public class Main {
    public static void main(String[] args) {

        Contact c0 = new Friend("Max Muster", 123456);
        Contact c1 = new Friend("Maxi Münster", 34578636);
        Contact c2 = new Friend("Friedbert Hausen", 5476342);
        Contact b0 = new BusinessContact("Mr. Wichtig","Sunshine Inc.");
        Contact b1 = new BusinessContact("Ms. Wichtiger","Mad TV");
        Contact b2 = new BusinessContact("Am Wichtigsten","Der Planer");

        Contact[] allContacts = {c0, c1, c2, b0, b1, b2};

        Smartphone s0 = new Smartphone("iPhone", "Apple", allContacts);
        System.out.println(s0.toString());
    }
}