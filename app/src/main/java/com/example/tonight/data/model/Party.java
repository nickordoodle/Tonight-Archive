package com.example.tonight.data.model;

public class Party extends Event {

    private String address;
    private String theme;
    private String affiliationName;
    private int coverFee;

    public Party(String address){
        this.address = address;
    }

    public Party(String address, String theme,
                 String affiliationName, int coverFee){
        this.address = address;
        this.theme = theme;
        this.affiliationName = affiliationName;
        this.coverFee = coverFee;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getAffiliationName() {
        return affiliationName;
    }

    public void setAffiliationName(String affiliationName) {
        this.affiliationName = affiliationName;
    }

    public int getCoverFee() {
        return coverFee;
    }

    public void setCoverFee(int coverFee) {
        this.coverFee = coverFee;
    }
}
