package com.sresta.techspecs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sresta.techspecs.component.Mobile;
import com.sresta.techspecs.entity.Brand;
import com.sresta.techspecs.entity.Company;
import com.sresta.techspecs.entity.MobileImage;
import com.sresta.techspecs.entity.MobileInfo;
import com.sresta.techspecs.entity.MobileSpecs;
import com.sresta.techspecs.services.MobileService;
import com.sresta.techspecs.services.MobileSpecsService;

@Controller
@RequestMapping("/mobiles")
public class MobileController {
	
	@Autowired
	MobileService service;
	
	@Autowired
	MobileSpecsService specsService;
	
	@RequestMapping(method = RequestMethod.GET )
	public String displayAllMobiles(Model model) {
		List<Mobile> mobiles = service.getAllMobile();
		List<Brand> brands = service.getAllBrands();
		model.addAttribute("mobiles", mobiles);
		model.addAttribute("brands",brands);
		return "mobileDashboard";
	}
	
	@RequestMapping(value="/mobile", method = RequestMethod.GET)
	//@ResponseBody
	public String displayOneMobile(@RequestParam("mobileId") String mobileId, Model model) {
		Mobile mobile = null;
		MobileInfo info = (MobileInfo) service.getMobileById(mobileId);
		if(info!=null) {
			MobileSpecs specs = specsService.getSpecsByMobileId(mobileId);
			List<MobileImage> images = service.getMobileImages(mobileId);
			
			mobile = new Mobile();
			mobile.setInfo(info);
			mobile.setImages(images);
			mobile.setSpecs(specs);
		}
		model.addAttribute("mobile",mobile);
		return "mobile";
	}
	
	@RequestMapping(value="/mobile/add", method = RequestMethod.GET)
	public String addMobileForm(Model model) {
		List<Company> companies = service.getCompanies();
		model.addAttribute("companies", companies);
		return "addMobile";
	}

	@RequestMapping(value="/mobile", method = RequestMethod.POST)
	public String addMobile(@ModelAttribute MobileInfo mobile, Model model) {
		System.out.println("addMobileController");
		MobileInfo mob = service.saveMobileInfo(mobile);
		
		if(mob!=null) {
			model.addAttribute("msg","Mobile Information Added Succesfully");
		}else {
			model.addAttribute("msg","Mobile Information Could Not Be Added");
		}
		List<Company> companies = service.getCompanies();
		model.addAttribute("companies", companies);
		return "addMobile";
	}
	
	@RequestMapping("/mobile/brandsByCompany")  
	@ResponseBody
	public List<Brand> getBrandsByCompanyId(@RequestParam("companyId") String companyId){
		System.out.println("getBrandsByCompanyId CompanyId:"+companyId);
		List<Brand> brandsByCompanies = service.getBrandsByCompany(companyId);
		brandsByCompanies.forEach(brand ->{
			brand.toString();
		});
		return brandsByCompanies;
	}
	
}
