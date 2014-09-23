package com.example.accesscontrol;

public class NameTooShortException extends Exception {

    public String toString() {
        return "Names must be longer than 4 characters.";
    }
}
