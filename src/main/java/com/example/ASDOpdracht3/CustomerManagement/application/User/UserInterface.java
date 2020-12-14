package com.example.ASDOpdracht3.CustomerManagement.application.User;

import com.example.ASDOpdracht3.CustomerManagement.domain.User.User;

public interface UserInterface {
    public User createUser(String firstName, String lastName,String email,String Role);

    public void sendWelcomeMail(String email,String firstname);
}
