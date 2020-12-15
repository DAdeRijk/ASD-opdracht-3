package com.example.ASDOpdracht3.CustomerManagement.controller.Customer;

import com.example.ASDOpdracht3.CustomerManagement.application.Customer.CustomerImpl;
import com.example.ASDOpdracht3.CustomerManagement.application.Customer.CustomerInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @PostMapping("/create-customer")
    public ResponseEntity<String> createCustomer(String iban,String firstName,String lastName,String email,int companyCode ) {
        CustomerInterface customerImpl= new CustomerImpl();
        return new ResponseEntity<>(customerImpl.registerCustomer(iban,firstName,lastName,email,companyCode), HttpStatus.OK);
    }
}
