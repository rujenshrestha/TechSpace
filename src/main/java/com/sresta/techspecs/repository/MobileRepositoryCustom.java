package com.sresta.techspecs.repository;

import java.util.List;

import com.sresta.techspecs.entity.MobileInfo;

public interface MobileRepositoryCustom {
	
	List<MobileInfo> findMobileBetweenPrice(double min, double max);

}
