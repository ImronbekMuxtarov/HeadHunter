package org.example.model;

public class City {
    private Integer id;
    private Integer countryId;
    private String name;

    public City(Integer id, Integer countryId, String name) {
        this.id = id;
        this.countryId = countryId;
        this.name = name;
    }

    public City(Integer countryId, String name) {
        this.countryId = countryId;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
