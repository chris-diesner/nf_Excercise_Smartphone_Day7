package de.neuefische.model;

/*Erstelle eine Klasse Friend die von der Klasse Contact erbt.

        Zusätzlich soll die Klasse das Attribut:

        Telefonnummer
        und die Methoden:

        einen leeren/default Konstruktor und einen Konstruktor mit dem Namen und der Telefonnummer haben.
        die toString() Methode soll den Namen und die Telefonnummer zurückgeben.*/

public class Friend extends Contact {
    private int iTelNumber;

    public Friend() {
    }

    public Friend(String sName, int iTelNumber) {
        super(sName);
        this.iTelNumber = iTelNumber;
    }


    public Friend(String sName) {
        super(sName);
    }

    public int getiTelNumber() {
        return iTelNumber;
    }

    public void setiTelNumber(int iTelNumber) {
        this.iTelNumber = iTelNumber;
    }

    @Override
    public String toString() {
        return "Name: " +
                super.toString() +
                "Phone: " + iTelNumber +
                " ";
    }
}
