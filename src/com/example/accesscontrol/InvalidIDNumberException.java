package com.example.accesscontrol;

public class InvalidIDNumberException extends Exception {

    InvalidIDNumberException() {

    }

    public String toString() {
        return "Student ID numbers must start with \"9\"";
    }

}
