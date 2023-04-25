package de.neuefische.model;

public class BusinessContact extends Contact{
    private String sCompanyName;

    public BusinessContact(String sName, String sCompanyName) {
        super(sName);
        this.sCompanyName = sCompanyName;
    }
}
