package de.neuefische.model;

public abstract class Contact {
    private String sName;

    public String getsName() {
        return sName;
    }

    public Contact() {

    }
    public Contact(String sName) {
        this.sName = sName;
    }

    @Override
    public String toString() {
        return "Name: "
                 + sName + '\'';
    }
}
