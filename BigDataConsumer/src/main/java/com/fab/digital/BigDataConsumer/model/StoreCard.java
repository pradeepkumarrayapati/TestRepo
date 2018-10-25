package com.fab.digital.BigDataConsumer.model;

import java.util.List;

public class StoreCard {
	private List<HeaderFields> headerFields;
	private List<AuxiliaryFields> auxiliaryFields;
	private List<BackFields> backFields;

	public List<HeaderFields> getHeaderFields() {
		return headerFields;
	}
	public void setHeaderFields(List<HeaderFields> headerFields) {
		this.headerFields = headerFields;
	}
	public List<AuxiliaryFields> getAuxiliaryFields() {
		return auxiliaryFields;
	}
	public void setAuxiliaryFields(List<AuxiliaryFields> auxiliaryFields) {
		this.auxiliaryFields = auxiliaryFields;
	}
	public List<BackFields> getBackFields() {
		return backFields;
	}
	public void setBackFields(List<BackFields> backFields) {
		this.backFields = backFields;
	}
	
}
