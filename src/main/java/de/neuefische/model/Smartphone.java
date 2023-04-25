package de.neuefische.model;

/*
Erstelle eine Klasse Smartphone, die beide Interfaces implementiert und folgende Attributen hat:

        Name des Modells
        Name des Herstellers
        eine Liste mit allen Kontakten
        implementiere die Methoden:

        startRadio gibt den String "Radio started" aus und gibt true zurück
        stopRadio gibt den String "Radio stopped" aus und false zurück
        getPosition() gibt den Standort "Köln" zurück.
        default Konstruktor und einen Konstruktor mit allen Werten.
        Getter/Setter für alle Attribute.
        toString die den Namen des Modells und Herstellers und eine Liste mit allen Kontakten zurückgibt.
*/

import java.util.Arrays;

public class Smartphone extends Contact implements Radio, GPS{
    private String sModell;
    private String sProducer;

    private Contact[] allContacts;

    public Smartphone(Contact allContact) {
    }

    public Smartphone(String iPhone, String apple, Contact allContact) {
    }

    public String getsModell() {
        return sModell;
    }

    public void setsModell(String sModell) {
        this.sModell = sModell;
    }

    public String getsProducer() {
        return sProducer;
    }

    public void setsProducer(String sProducer) {
        this.sProducer = sProducer;
    }

    public Contact[] getAllContacts() {
        return allContacts;
    }

    public void setAllContacts(Contact[] allContacts) {
        this.allContacts = allContacts;
    }

    public Smartphone(String sModell, String sProducer, Contact[] contacts) {
        this.sModell = sModell;
        this.sProducer = sProducer;
        this.allContacts = contacts;
    }

    public Smartphone() {
    }



    @Override
    public String toString() {
        return "Smartphone{" +
                "sModell='" + sModell + '\'' +
                ", sProducer='" + sProducer + '\'' +
                ", contacts=" + Arrays.toString(allContacts) +
                "} " ;
    }

    @Override
    public String getPosition() {
        return "Berlin";
    }

    @Override
    public boolean startRadio() {
        return true;
    }

    @Override
    public boolean stopRadio() {
        return false;
    }
}
