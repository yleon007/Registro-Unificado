package com.ericsson.alodiga.model;

import java.io.Serializable;

public class Pais implements Serializable {

    private static final long serialVersionUID = 1L;

    private int countryId;
    private String name;

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
