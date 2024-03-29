package org.example.model;

public class City {
    private Integer id;
    private String name;
    private Country country;

    public City(Integer id, String name, Country country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public City(String name, Country country) {
        this.name = name;
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
