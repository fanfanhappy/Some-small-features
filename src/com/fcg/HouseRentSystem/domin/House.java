package com.fcg.HouseRentSystem.domin;

public class House {
    private int id;
    private String name;
    private String iphonenum;
    private String address;
    private double mouthRent;
    private String state;

    public House(int id, String name, String iphonenum, String address, double mouthRent, String state) {
        this.id = id;
        this.name = name;
        this.iphonenum = iphonenum;
        this.address = address;
        this.mouthRent = mouthRent;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIphonenum() {
        return iphonenum;
    }

    public void setIphonenum(String iphonenum) {
        this.iphonenum = iphonenum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMouthRent() {
        return mouthRent;
    }

    public void setMouthRent(double mouthRent) {
        this.mouthRent = mouthRent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return id +
                "\t\t" + name + "\t" + iphonenum +
                "\t" + address +
                "\t\t" + mouthRent +
                "\t\t" + state;
    }
}
