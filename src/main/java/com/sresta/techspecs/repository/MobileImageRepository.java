package com.sresta.techspecs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sresta.techspecs.entity.MobileImage;
import java.lang.String;
import java.util.List;

public interface MobileImageRepository extends JpaRepository<MobileImage, String>{

	List<MobileImage> findByMobileId(String mobileid);
}
