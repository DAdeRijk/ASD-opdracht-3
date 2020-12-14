package com.example.ASDOpdracht3.CustomerManagement.domain;

public class Company {
    private int id;
    private int companyId;
    private int companyCode;
    private String name;
    private String shortName;
    private String url;
    private String countryIso;

    public Company(int id, int companyId, int companyCode, String name, String shortName, String url, String countryIso) {
        this.id = id;
        this.companyId = companyId;
        this.companyCode = companyCode;
        this.name = name;
        this.shortName = shortName;
        this.url = url;
        this.countryIso = countryIso;
    }

    public int getId() {
        return id;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(int companyCode) {
        this.companyCode = companyCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCountryIso() {
        return countryIso;
    }

    public void setCountryIso(String countryIso) {
        this.countryIso = countryIso;
    }
}
