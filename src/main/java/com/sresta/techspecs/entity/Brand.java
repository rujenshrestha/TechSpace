package com.sresta.techspecs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Brand {

	@Id
	private String id;
	private String name;
	@Column(name = "brand_logo")
	private String brandLogo;
	@Column(name = "company_id")
	private String companyId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrandLogo() {
		return brandLogo;
	}

	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	@Override
	public String toString() {
		return "Brand [id=" + id + ", name=" + name + ", brandLogo=" + brandLogo + ", companyId=" + companyId + "]";
	}

}
