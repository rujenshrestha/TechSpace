package com.sresta.techspecs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sresta.techspecs.entity.MobileInfo;
import java.lang.String;
import java.util.List;
import java.util.Optional;

@Repository
public interface MobileRepository extends JpaRepository<MobileInfo, String>, MobileRepositoryCustom {
	
	Optional<MobileInfo> findById(String id);

	List<MobileInfo> findByBrandId(String brandId);

	List<MobileInfo> findByName(String name);

	List<MobileInfo> findByCompanyId(String companyId);
	
	List<MobileInfo> findByBrandIdAndCompanyId(String brandId, String companyId);

}
