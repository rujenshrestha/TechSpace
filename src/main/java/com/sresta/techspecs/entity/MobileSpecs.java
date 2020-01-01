package com.sresta.techspecs.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "mobile_specs")
public class MobileSpecs {

	@Column(name = "mobile_id")
	private String mobileId;
	@Column(name = "network_technology")
	private String networkTechnology;
	@Column(name = "launch_date")
	private Date launchDate;
	@Column(name = "screen_resolution")
	private String screenResolution;
	private String os;
	private String battery;
	@Column(name = "front_camera")
	private String frontCamera;
	@Column(name = "rear_camera")
	private String rearCamera;
	private String RAM;
	@Column(name = "card_slot")
	private String cardSlot;
	
	@Id
	@Column(name = "specs_id")
	private String specsId;

	public String getMobileId() {
		return mobileId;
	}

	public void setMobileId(String mobileId) {
		this.mobileId = mobileId;
	}

	public String getNetworkTechnology() {
		return networkTechnology;
	}

	public void setNetworkTechnology(String networkTechnology) {
		this.networkTechnology = networkTechnology;
	}

	public Date getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(Date launchDate) {
		this.launchDate = launchDate;
	}

	public String getScreenResolution() {
		return screenResolution;
	}

	public void setScreenResolution(String screenResolution) {
		this.screenResolution = screenResolution;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public String getFrontCamera() {
		return frontCamera;
	}

	public void setFrontCamera(String frontCamera) {
		this.frontCamera = frontCamera;
	}

	public String getRearCamera() {
		return rearCamera;
	}

	public void setRearCamera(String rearCamera) {
		this.rearCamera = rearCamera;
	}

	public String getRAM() {
		return RAM;
	}

	public void setRAM(String rAM) {
		RAM = rAM;
	}

	public String getCardSlot() {
		return cardSlot;
	}

	public void setCardSlot(String cardSlot) {
		this.cardSlot = cardSlot;
	}

	public String getSpecsId() {
		return specsId;
	}

	public void setSpecsId(String specsId) {
		this.specsId = specsId;
	}

	@Override
	public String toString() {
		return "MobileSpecs [mobileId=" + mobileId + ", networkTechnology=" + networkTechnology + ", launchDate="
				+ launchDate + ", screenResolution=" + screenResolution + ", os=" + os + ", battery=" + battery
				+ ", frontCamera=" + frontCamera + ", rearCamera=" + rearCamera + ", RAM=" + RAM + ", cardSlot="
				+ cardSlot + ", specsId=" + specsId + "]";
	}

}
