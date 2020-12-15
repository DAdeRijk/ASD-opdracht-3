package com.example.ASDOpdracht3.CustomerManagement.application.User;

import com.example.ASDOpdracht3.CustomerManagement.domain.User.User;
import com.example.ASDOpdracht3.CustomerManagement.domain.repository.UserRepository;
import org.apache.commons.validator.routines.EmailValidator;


public class UserImpl implements UserInterface {
    private UserRepository userRepository;
    @Override
    public User createUser(String firstName, String lastName, String email, String role) {

        if(validateEmail(email)){
            return new User(userRepository.nextIdentity(),firstName,lastName,email,role);
        }
        else{
            return null;
        }
    }

    @Override
    public void sendWelcomeMail(String email, String firstname) {
        //NOT IMPLEMENTED
    }


    public Boolean validateEmail(String email){
        return EmailValidator.getInstance().isValid(email);
    }
}
