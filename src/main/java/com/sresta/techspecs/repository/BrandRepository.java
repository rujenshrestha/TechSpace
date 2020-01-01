package com.sresta.techspecs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sresta.techspecs.entity.Brand;
import java.lang.String;
import java.util.List;

public interface BrandRepository extends JpaRepository<Brand, String>{

	List<Brand> findByCompanyId(String companyId);
}
