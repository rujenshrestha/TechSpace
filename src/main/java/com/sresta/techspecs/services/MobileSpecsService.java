package com.sresta.techspecs.services;

import com.sresta.techspecs.entity.MobileSpecs;

public interface MobileSpecsService {

	MobileSpecs getSpecsByMobileId(String mobileId);
	
	MobileSpecs saveMobileSpecs(MobileSpecs specs);
	
	void deleteSpecs(String specsId);
}
