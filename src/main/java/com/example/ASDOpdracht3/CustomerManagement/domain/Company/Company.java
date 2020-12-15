package com.example.ASDOpdracht3.CustomerManagement.domain.Company;

import org.json.JSONArray;
import org.json.JSONObject;


import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Company {
    private final int id;
    private int companyId;
    private final String companyCode;
    private String name;
    private String shortName;
    private String url;
    private String countryIso;

    public Company(int id,String companyCode) {
        setCompanyInformation(companyCode);
        this.companyCode = companyCode;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setCompanyInformation(String cc){
        try{
            String text = new String(Files.readAllBytes(Paths.get("~/resources/RegisteredCompanies.json")), StandardCharsets.UTF_8);

            JSONObject obj = new JSONObject(text);
            JSONObject companies = obj.getJSONObject("companies");

            for(int i = 0; i < companies.length(); i++){
                if(companies.get("companyCode").toString().toLowerCase().equals(cc.toLowerCase())){
                    this.countryIso=companies.get("countryIso").toString();
                    this.name=companies.get("Name").toString();
                    this.url=companies.get("Url").toString();
                    this.shortName=companies.get("shortName").toString();
                    break;
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyCode() {
        return companyCode;
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
