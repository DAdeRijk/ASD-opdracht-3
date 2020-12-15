package com.example.ASDOpdracht3.CustomerManagement.domain.repository;
import com.example.ASDOpdracht3.CustomerManagement.domain.Company.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CompanyRespository extends JpaRepository<Company,String> {
    int nextIdentity();

}