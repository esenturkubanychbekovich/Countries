package com.esenkubanychbekov.continents.model;

public class Region {
    private int id;
    private String name;
    private String capital;
    private int flag;

    public Region(String name, String capital, int flag) {
        this.name = name;
        this.capital = capital;
        this.flag = flag;
    }

    public Region(int id, String name, String capital, int flag) {
        this.id = id;
        this.name = name;
        this.capital = capital;
        this.flag = flag;
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
