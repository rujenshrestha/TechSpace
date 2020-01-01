package com.sresta.techspecs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sresta.techspecs.entity.MobileSpecs;
import com.sresta.techspecs.repository.MobileSpecsRepository;

@Service
public class MobileSpecsServiceImpl implements MobileSpecsService{
	
	@Autowired
	MobileSpecsRepository repo;

	@Override
	public MobileSpecs getSpecsByMobileId(String mobileId) {
		List<MobileSpecs> mobileSpecs = repo.findByMobileId(mobileId);
		if(!mobileSpecs.isEmpty()) {
			return repo.findByMobileId(mobileId).get(0);
		}else {
			return null;
		}
	}

	@Override
	public MobileSpecs saveMobileSpecs(MobileSpecs specs) {
		return repo.save(specs);
	}

	@Override
	public void deleteSpecs(String specsId) {
		repo.deleteById(specsId);;
	}

}
