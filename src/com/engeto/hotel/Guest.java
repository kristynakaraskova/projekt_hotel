package com.engeto.hotel;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Guest {

    ///region Atributy

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    ///endregion

    ///region Konstruktory

    public Guest(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    ///endregion

    ///region Přístupové metody

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    ///endregion

}
