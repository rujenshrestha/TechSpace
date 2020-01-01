package com.sresta.techspecs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mobile_images")
public class MobileImage {

	@Id
	private String imgId;

	@Column(name = "mobile_id")
	private String mobileId;

	@Column(name = "img_url")
	private String imgUrl;

	public String getImgId() {
		return imgId;
	}

	public void setImgId(String imgId) {
		this.imgId = imgId;
	}

	public String getMobileId() {
		return mobileId;
	}

	public void setMobileId(String mobileId) {
		this.mobileId = mobileId;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Override
	public String toString() {
		return "MobileImage [imgId=" + imgId + ", mobileId=" + mobileId + ", imgUrl=" + imgUrl + "]";
	}

}
