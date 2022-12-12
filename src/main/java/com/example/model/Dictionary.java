package com.example.model;

public class Dictionary {
    private String vn;
    private String en;

    public Dictionary(String en, String vn) {
        this.en = en;
        this.vn = vn;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }
}
