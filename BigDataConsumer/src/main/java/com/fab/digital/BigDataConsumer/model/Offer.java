package com.fab.digital.BigDataConsumer.model;

public class Offer {
	
	private String customerId;
	private String offername;
	private String offerDescription;	
	private String mcc_code;
	private String merchant;
	private byte[] image;
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public String getMcc_code() {
		return mcc_code;
	}
	public void setMcc_code(String mcc_code) {
		this.mcc_code = mcc_code;
	}
	public String getMerchant() {
		return merchant;
	}
	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}
	public String getOffername() {
		return offername;
	}
	public void setOffername(String offername) {
		this.offername = offername;
	}
	public String getOfferDescription() {
		return offerDescription;
	}
	public void setOfferDescription(String offerDescription) {
		this.offerDescription = offerDescription;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = offerDescription;
	}
	
	public String getMCCcode() {
		return offerDescription;
	}
	public void setMCCcode(String mcc_code) {
		this.mcc_code = mcc_code;
	}

}
