package com.sresta.techspecs.component;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sresta.techspecs.entity.MobileImage;
import com.sresta.techspecs.entity.MobileInfo;
import com.sresta.techspecs.entity.MobileSpecs;

@Component
public class Mobile {

	private MobileInfo info;
	private List<MobileImage> images;
	private MobileSpecs specs;

	public MobileInfo getInfo() {
		return info;
	}

	public void setInfo(MobileInfo info) {
		this.info = info;
	}

	public List<MobileImage> getImages() {
		return images;
	}

	public void setImages(List<MobileImage> images) {
		this.images = images;
	}

	public MobileSpecs getSpecs() {
		return specs;
	}

	public void setSpecs(MobileSpecs specs) {
		this.specs = specs;
	}

	@Override
	public String toString() {
		return "Mobile [info=" + info + ", images=" + images + ", specs=" + specs + "]";
	}

}
