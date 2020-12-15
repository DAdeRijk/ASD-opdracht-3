package com.example.ASDOpdracht3.CustomerManagement.application.Company;

import com.example.ASDOpdracht3.CustomerManagement.domain.Company.Company;
import com.example.ASDOpdracht3.CustomerManagement.domain.repository.CompanyRespository;
import org.json.JSONObject;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CompanyImpl implements CompanyInterface {
    private CompanyRespository companyRespository;
    @Override
    public Company createCompany(int companyCode){
        if(checkCompanyCodeIsValid(companyCode)){

            return new Company(companyRespository.nextIdentity(),companyCode);
        }
        else{
            return null;
        }
    };
    public Boolean checkCompanyCodeIsValid(int cc){
        boolean found=false;
        try{
            String text = new String(Files.readAllBytes(Paths.get("~/resources/RegisteredCompanies.json")), StandardCharsets.UTF_8);

            JSONObject obj = new JSONObject(text);
            JSONObject companies = obj.getJSONObject("companies");

            for(int i = 0; i < companies.length(); i++){
                if(Integer.parseInt(companies.get("companyCode").toString())==cc){
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
