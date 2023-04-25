package de.neuefische.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    Contact testC0 = new Friend("Chris", 123456789);
    Contact testC1 = new BusinessContact("Am Wichtigsten", "Chaos Inc.");

    Contact[] allContacts = {testC0, testC1};
    Smartphone smartphone = new Smartphone("iPhone x", "Apple", allContacts);


    @Test
    void getPosition_returnStringBerlin() {
        assertEquals("Berlin", smartphone.getPosition());
    }

    @Test
    void startRadio_returnTrue() {
        assertTrue(smartphone.startRadio());
    }

    @Test
    void stopRadio_returnFalse() {
        assertFalse(smartphone.stopRadio());
    }

    @Test
    void getContactByIndex_returnIndex() {
        assertEquals(testC0, smartphone.getContactByIndex(0));
    }

    @Test
    void addContact_returnNextContact() {
        Contact testC2 = new Friend("Hans", 7623547);
        smartphone.addContact(testC2);
        Contact[] allContacts = {testC0, testC1, testC2};
        assertArrayEquals(allContacts, smartphone.getAllContacts());
    }
}