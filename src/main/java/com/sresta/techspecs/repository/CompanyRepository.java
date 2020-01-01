package com.sresta.techspecs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sresta.techspecs.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, String>{

}
