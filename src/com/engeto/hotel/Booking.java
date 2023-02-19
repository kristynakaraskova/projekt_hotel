package com.engeto.hotel;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {

    ///region Atributy
    private Room room;
    private Guest guest;
    private List<Guest> otherGuests;
    private LocalDate startDate;
    private LocalDate endDate;
    private String typeOfVacation;


    ///endregion

    ///region Konstruktory

    public Booking(Room room, Guest guest, List<Guest> otherGuests, LocalDate startDate, LocalDate endDate, String typeOfVacation) {
        this.room = room;
        this.guest = guest;
        this.otherGuests = otherGuests;
        this.startDate = startDate;
        this.endDate = endDate;
        this.typeOfVacation = typeOfVacation;
    }

    ///endregion

    ///region Přístupové metody

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public String getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(String typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List<Guest> otherGuests) {
        this.otherGuests = otherGuests;
    }

    ///endregion

}
