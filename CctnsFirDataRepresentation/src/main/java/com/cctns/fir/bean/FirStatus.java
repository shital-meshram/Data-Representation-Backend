package com.cctns.fir.bean;

public class FirStatus {
	
	private Integer firStatusCd;
	private String firStatus;
	
	public FirStatus() {
		super();
	}

	public FirStatus(Integer firStatusCd, String firStatus) {
		super();
		this.firStatusCd = firStatusCd;
		this.firStatus = firStatus;
	}
	
	public Integer getFirStatusCd() {
		return firStatusCd;
	}
	public void setFirStatusCd(Integer firStatusCd) {
		this.firStatusCd = firStatusCd;
	}
	public String getFirStatus() {
		return firStatus;
	}
	public void setFirStatus(String firStatus) {
		this.firStatus = firStatus;
	}
	
	

}
