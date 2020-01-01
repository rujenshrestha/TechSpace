package com.sresta.techspecs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mobile_info")
public class MobileInfo {

	@Id
	private String id;
	private String name;
	@Column(name="brand_id")
	private String brandId;
	private double price;
	@Column(name="company_id")
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

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", brandId=" + brandId + ", price=" + price + ", companyId=" + companyId
				+ "]";
	}

}
