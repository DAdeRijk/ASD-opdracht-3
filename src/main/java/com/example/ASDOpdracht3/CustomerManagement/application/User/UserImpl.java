package com.example.ASDOpdracht3.CustomerManagement.application.User;

import com.example.ASDOpdracht3.CustomerManagement.domain.User.User;
import org.apache.commons.validator.routines.EmailValidator;
public class UserImpl implements UserInterface {
    @Override
    public User createUser(String firstName, String lastName, String email, String role) {

        if(validateEmail(email)){
            return new User(1,firstName,lastName,email,role);
        }
        else{
            return null;
        }
    }

    @Override
    public void sendWelcomeMail(String email, String firstname) {

    }

    public Boolean validateEmail(String email){
        return EmailValidator.getInstance().isValid(email);
    }
}
