package de.neuefische;

import de.neuefische.model.Contact;
import de.neuefische.model.Friend;
import de.neuefische.model.Smartphone;

public class Main {
    public static void main(String[] args) {

        Contact c0 = new Friend("Max Muster", 123456);
        Contact c1 = new Friend("Maxi Münster", 34578636);
        Contact c2 = new Friend("Friedbert Hausen", 5476342);

        Contact[] allContacts = {c0, c1, c2};

        Smartphone s0 = new Smartphone("iPhone", "Apple", allContacts);
        System.out.println(s0.toString());
    }
}