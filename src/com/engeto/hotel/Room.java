package com.engeto.hotel;

import java.math.BigDecimal;

public class Room {

    ///region Atributy

    private int roomNumber;

    private int bedsCount;

    private boolean hasBalcony;

    private boolean hasSeaView;

    private BigDecimal pricePerNight;

    ///endregion

    ///region Konstruktory

    public Room(int roomNumber, int bedsCount, boolean hasBalcony, boolean hasSeaView, BigDecimal pricePerNight) {
        this.roomNumber = roomNumber;
        this.bedsCount = bedsCount;
        this.hasBalcony = hasBalcony;
        this.hasSeaView = hasSeaView;
        this.pricePerNight = pricePerNight;
    }

    ///endregion

    ///region Přístupové metody

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBedsCount() {
        return bedsCount;
    }

    public void setBedsCount(int bedsCount) {
        this.bedsCount = bedsCount;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean isHasSeaView() {
        return hasSeaView;
    }

    public void setHasSeaView(boolean hasSeaView) {
        this.hasSeaView = hasSeaView;
    }

    public BigDecimal getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(BigDecimal pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    ///endregion

}
