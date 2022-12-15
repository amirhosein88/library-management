package com.company.Model;

public class Address {
    private String provinceName;
    private String townName;
    private String streetName;

    private int plaque;

    public Address(String provinceName, String townName, String streetName, int plaque) {
        this.provinceName = provinceName;
        this.townName = townName;
        this.streetName = streetName;
        this.plaque = plaque;
    }

    public int getPlaque() {
        return plaque;
    }

    public void setPlaque(int plaque) {
        this.plaque = plaque;
    }

    public Address(String name) {
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
