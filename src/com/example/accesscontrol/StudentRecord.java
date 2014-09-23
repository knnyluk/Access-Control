package com.example.accesscontrol;

public class StudentRecord {
    private String idNumber;
    private String name;

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        try {
            if (idNumber.substring(0, 1).equals("9")) {
                this.idNumber = idNumber;
            } else {
                throw new InvalidIDNumberException();
            }

        }
        catch (InvalidIDNumberException e) {
            System.out.println(e);
        }


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            if (name.length() > 4) {
                this.name = name;
            } else {
                throw new NameTooShortException();
            }
        }
        catch (NameTooShortException e) {
            System.out.println(e);
        }
    }
}
