package com.esenkubanychbekov.continents;

public class Region {
    private String name;
    private String capital;
    private int flag;

    public Region(String name, String capital, int flag) {
        this.name = name;
        this.capital = capital;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
