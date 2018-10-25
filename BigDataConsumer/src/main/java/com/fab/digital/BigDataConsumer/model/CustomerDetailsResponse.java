package com.fab.digital.BigDataConsumer.model;

//import java.util.List;

import org.json.simple.JSONObject;


public class CustomerDetailsResponse {
	
	//private String customerId;
	//private List<Object> offers;
	private JSONObject offer;
	public JSONObject getOffer() {
		return offer;
	}
	public void setOffer(JSONObject offer) {
		this.offer = offer;
	}
	
//	public String getAcknowledgement() {
//		return acknowledgement;
//	}
//	public void setAcknowledgement(String acknowledgement) {
//		this.acknowledgement = acknowledgement;
//	}

	//private String acknowledgement;	
	
//	public String getCustomerId() {
//		return customerId;
//	}
//	public void setCustomerId(String customerId) {
//		this.customerId = customerId;
//	}
	
//	public List<Object> getOffers() {
//		return offers;
//	}
//	
//	public void setOffers(List<Object> offerList) {
//		this.offers = offerList;
//		
//	} 

	/*public String getAcknowledgement() {
		return acknowledgement;
	}
	public void setAcknowledgement(String acknowledgement) {
		this.acknowledgement = acknowledgement;
	}*/		
}
