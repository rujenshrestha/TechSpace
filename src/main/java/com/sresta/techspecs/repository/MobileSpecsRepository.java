package com.sresta.techspecs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sresta.techspecs.entity.MobileSpecs;
import java.lang.String;
import java.util.List;

public interface MobileSpecsRepository extends JpaRepository<MobileSpecs, String>{

	List<MobileSpecs> findByMobileId(String mobileid);
	
}
