package com.sresta.techspecs.services;

import java.util.List;

import com.sresta.techspecs.entity.MobileInfo;
import com.sresta.techspecs.component.Mobile;
import com.sresta.techspecs.entity.Brand;
import com.sresta.techspecs.entity.Company;
import com.sresta.techspecs.entity.MobileImage;

public interface MobileService {

	MobileInfo saveMobileInfo(MobileInfo mobile);

	List<Mobile> getAllMobile();

	MobileInfo getMobileById(String id);

	List<MobileInfo> getMobileByBrandId(String brandId);

	List<MobileInfo> getMobileByName(String name);

	List<MobileInfo> getMobileByCompanyId(String companyId);

	List<MobileInfo> getMobileBetweenPrice(double min, double max);

	List<MobileInfo> getMobileByMultipleBrands(String[] brandIds);

	List<MobileInfo> getMobileByMultipleCompanies(String[] companies);

	List<MobileInfo> getMobileByBrandAndCompany(String brand, String company);

	void deleteMobile(MobileInfo mobile);

	void deleteMobileById(String id);

	long countMobiles();

	List<MobileImage> getMobileImages(String id);
	
	List<Company> getCompanies();
	
	List<Brand> getBrandsByCompany(String companyId);
	
	List<Brand> getAllBrands();

}
