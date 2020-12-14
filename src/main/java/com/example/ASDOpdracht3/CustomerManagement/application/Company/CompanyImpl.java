package com.example.ASDOpdracht3.CustomerManagement.application.Company;
import com.example.ASDOpdracht3.CustomerManagement.domain.Company.Company;
import org.json.JSONObject;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CompanyImpl implements CompanyInterface {
    @Override
    public Company createCompany(String companyCode){
        if(checkCompanyCodeIsValid(companyCode)){
            return new Company(companyCode);
        }
        else{
            return null;
        }
    };
    public Boolean checkCompanyCodeIsValid(String cc){
        boolean found=false;
        try{
            String text = new String(Files.readAllBytes(Paths.get("~/resources/RegisteredCompanies.json")), StandardCharsets.UTF_8);

            JSONObject obj = new JSONObject(text);
            JSONObject companies = obj.getJSONObject("companies");

            for(int i = 0; i < companies.length(); i++){
                if(companies.get("companyCode").toString().toLowerCase().equals(cc.toLowerCase())){
                    found=true;
                    break;
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
        return found;
    }

}
