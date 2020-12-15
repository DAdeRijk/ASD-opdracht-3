package com.example.ASDOpdracht3.CustomerManagement.application.Customer;

import com.example.ASDOpdracht3.CustomerManagement.application.Company.CompanyImpl;
import com.example.ASDOpdracht3.CustomerManagement.application.Company.CompanyInterface;
import com.example.ASDOpdracht3.CustomerManagement.application.User.UserImpl;
import com.example.ASDOpdracht3.CustomerManagement.domain.Company.Company;
import com.example.ASDOpdracht3.CustomerManagement.domain.Customer.Customer;
import com.example.ASDOpdracht3.CustomerManagement.domain.User.User;

public class CustomerImpl implements CustomerInterface {
    @Override
    public String registerCustomer(String iban,String firstName,String lastName,String email,String companyCode) throws Exception {
        CompanyImpl companyImpl = new CompanyImpl();
        Company c = companyImpl.createCompany(companyCode);
        if(c==null){
            return "COMPANY_NOT_LISTED";
        }

        UserImpl userImpl = new UserImpl();
        User user = userImpl.createUser(firstName,lastName,email,"ADMIN");
        if(user==null){
            return "INVALID_EMAIL";
        }
        userImpl.sendWelcomeMail(email,firstName);

        Customer customer = new Customer(firstName,iban,c);
        if(!customer.validateIban()){
            return "INVALID_IBAN";
        }
        customer.addUser(user);
        return "SUCCESS";

    };
}
