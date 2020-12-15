package com.example.ASDOpdracht3.CustomerManagement.domain.repository;

import com.example.ASDOpdracht3.CustomerManagement.domain.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    int nextIdentity();
}
