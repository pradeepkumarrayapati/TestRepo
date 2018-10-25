package com.fab.digital.incubation.model;

import java.util.List;


public class SignPassRequest {

	private int formatVersion;
	private String  serialNumber;
	private String  passTypeIdentifier;
	private String teamIdentifier;
	
	private List<BarCodes> barcodes;
	private String organizationName;
	private String description;
	private String foregroundColor;
	private String backgroundColor;
	private String labelColor;
	private StoreCard storeCard;
	public int getFormatVersion() {
		return formatVersion;
	}
	public void setFormatVersion(int formatVersion) {
		this.formatVersion = formatVersion;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getPassTypeIdentifier() {
		return passTypeIdentifier;
	}
	public void setPassTypeIdentifier(String passTypeIdentifier) {
		this.passTypeIdentifier = passTypeIdentifier;
	}
	public String getTeamIdentifier() {
		return teamIdentifier;
	}
	public void setTeamIdentifier(String teamIdentifier) {
		this.teamIdentifier = teamIdentifier;
	}
	public List<BarCodes> getBarcodes() {
		return barcodes;
	}
	public void setBarcodes(List<BarCodes> barcodes) {
		this.barcodes = barcodes;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getForegroundColor() {
		return foregroundColor;
	}
	public void setForegroundColor(String foregroundColor) {
		this.foregroundColor = foregroundColor;
	}
	public String getBackgroundColor() {
		return backgroundColor;
	}
	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	public String getLabelColor() {
		return labelColor;
	}
	public void setLabelColor(String labelColor) {
		this.labelColor = labelColor;
	}
	public StoreCard getStoreCard() {
		return storeCard;
	}
	public void setStoreCard(StoreCard storeCard) {
		this.storeCard = storeCard;
	}
	
	

}
