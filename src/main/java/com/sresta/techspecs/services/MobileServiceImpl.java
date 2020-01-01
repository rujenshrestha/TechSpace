package com.sresta.techspecs.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sresta.techspecs.entity.MobileInfo;
import com.sresta.techspecs.component.Mobile;
import com.sresta.techspecs.entity.Brand;
import com.sresta.techspecs.entity.Company;
import com.sresta.techspecs.entity.MobileImage;
import com.sresta.techspecs.repository.BrandRepository;
import com.sresta.techspecs.repository.CompanyRepository;
import com.sresta.techspecs.repository.MobileImageRepository;
import com.sresta.techspecs.repository.MobileRepository;

@Service
public class MobileServiceImpl implements MobileService {

	@Autowired
	MobileRepository repo;

	@Autowired
	MobileImageRepository imgRepo;
	
	@Autowired
	CompanyRepository companyRepo;
	
	@Autowired
	BrandRepository brandRepo;

	@Override
	public MobileInfo getMobileById(String id) {
		MobileInfo info = null;
		Optional<MobileInfo> mobileInfoOptional = repo.findById(id);
		if(mobileInfoOptional.isPresent()) {
			info = mobileInfoOptional.get();
		}
		return info;
	}

	@Override
	public List<MobileInfo> getMobileByBrandId(String brandId) {
		return repo.findByBrandId(brandId);
	}

	@Override
	public List<MobileInfo> getMobileByName(String name) {
		return repo.findByName(name);
	}

	@Override
	public List<MobileInfo> getMobileByCompanyId(String companyId) {
		return repo.findByCompanyId(companyId);
	}

	@Override
	public List<MobileInfo> getMobileBetweenPrice(double min, double max) {
		return repo.findMobileBetweenPrice(min, max);
	}

	@Override
	public List<MobileInfo> getMobileByMultipleBrands(String[] brandIds) {
		List<MobileInfo> mobiles = new ArrayList<MobileInfo>();

		Arrays.stream(brandIds).forEach(brandId -> {
			mobiles.addAll(repo.findByBrandId(brandId));
		});

		if (mobiles.size() < 1) {
			return null;
		}
		return mobiles;
	}

	@Override
	public List<MobileInfo> getMobileByMultipleCompanies(String[] companyIds) {
		List<MobileInfo> mobiles = new ArrayList<MobileInfo>();

		Arrays.stream(companyIds).forEach(companyId -> {
			mobiles.addAll(repo.findByCompanyId(companyId));
		});

		if (mobiles.size() < 1) {
			return null;
		}
		return mobiles;
	}

	@Override
	public MobileInfo saveMobileInfo(MobileInfo mobileInfo) {
		return repo.save(mobileInfo);
	}

	@Override
	public List<Mobile> getAllMobile() {
		List<Mobile> mobiles = new ArrayList<Mobile>();
		List<MobileInfo> allMobile = repo.findAll();
		
		allMobile.forEach(mobileInfo -> {
			Mobile mobile = new Mobile();
			mobile.setInfo(mobileInfo);
			mobile.setImages(imgRepo.findByMobileId(mobileInfo.getId()));
			mobiles.add(mobile);
		});
		return mobiles;
	}

	@Override
	public void deleteMobile(MobileInfo mobile) {
		repo.delete(mobile);

	}

	@Override
	public void deleteMobileById(String id) {
		repo.deleteById(id);
	}

	@Override
	public long countMobiles() {
		return repo.count();
	}

	@Override
	public List<MobileInfo> getMobileByBrandAndCompany(String brandId, String companyId) {
		return repo.findByBrandIdAndCompanyId(brandId, companyId);
	}

	@Override
	public List<MobileImage> getMobileImages(String id) {
		return imgRepo.findByMobileId(id);
	}

	@Override
	public List<Company> getCompanies() {
		return companyRepo.findAll();
	}

	@Override
	public List<Brand> getBrandsByCompany(String companyId) {
		return brandRepo.findByCompanyId(companyId);
	}

	@Override
	public List<Brand> getAllBrands() {
		return brandRepo.findAll();
	}

}
