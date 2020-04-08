package com.example.demoproject.model;

public class Viruses {
    private String name;
    private String originCountry;
    private Integer mortalityRate;

    public Viruses() {
    }

    public Viruses(String name, String originCountry, Integer mortalityRate) {
        this.name = name;
        this.originCountry = originCountry;
        this.mortalityRate = mortalityRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public Integer getMortalityRate() {
        return mortalityRate;
    }

    public void setMortalityRate(Integer mortalityRate) {
        this.mortalityRate = mortalityRate;
    }

    @Override
    public String toString() {
        return "Viruses{" +
                "name='" + name + '\'' +
                ", originCountry='" + originCountry + '\'' +
                ", mortalityRate=" + mortalityRate +
                '}';
    }
}
