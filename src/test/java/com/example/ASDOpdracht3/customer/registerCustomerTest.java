package com.example.ASDOpdracht3.customer;

import com.example.ASDOpdracht3.CustomerManagement.application.Customer.CustomerImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class registerCustomerTest {
    @MockBean
    private CustomerImpl customerImpl;

    @Test
    public void invalidCompanyShouldReturnInvalid() {
        assertThat(customerImpl.registerCustomer("NL45RABO0118343319", "Henk", "Petersen", "goodemail@mymail.com", 12).equals("COMPANY_NOT_LISTED"));
    }
    @Test
    public void validCompanyShouldNotReturnInvalid() {
        assertThat(!customerImpl.registerCustomer("NL45RABO0118343319","Henk","Petersen","goodemail@mymail.com",4875).equals("COMPANY_NOT_LISTED"));
    }
    @Test
    public void invalidEmailShouldReturnInvalid() {
        assertThat(customerImpl.registerCustomer("NL45RABO0118343319","Henk","Petersen","bademail",4875).equals("INVALID_EMAIL"));
    }
    @Test
    public void validEmailShouldNotReturnInvalid() {
        assertThat(!customerImpl.registerCustomer("NL45RABO0118343319","Henk","Petersen","goodemail@mymail.com",4875).equals("INVALID_EMAIL"));
    }
    @Test
    public void invalidIbanShouldReturnInvalid() {
        assertThat(customerImpl.registerCustomer("NL45RABORABO01183433","Henk","Petersen","goodemail@mymail.com",4875).equals("INVALID_IBAN"));
    }
    @Test
    public void validIbanShouldNotReturnInvalid() {
        assertThat(!customerImpl.registerCustomer("NL45RABO0118343319","Henk","Petersen","goodemail@mymail.com",4875).equals("INVALID_IBAN"));
    }
    @Test
    public void validInfoShouldReturnSuccess() {
        assertThat(customerImpl.registerCustomer("NL45RABO0118343319","Henk","Petersen","goodemail@mymail.com",4875).equals("SUCCESS"));
    }

}