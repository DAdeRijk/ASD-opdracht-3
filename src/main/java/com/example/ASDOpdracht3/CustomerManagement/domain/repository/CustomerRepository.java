package com.example.ASDOpdracht3.CustomerManagement.domain.repository;
import com.example.ASDOpdracht3.CustomerManagement.domain.Customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,String> {
    int nextIdentity();
}