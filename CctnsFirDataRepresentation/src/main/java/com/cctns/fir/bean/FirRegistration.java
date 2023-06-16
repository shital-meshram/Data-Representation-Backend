package com.cctns.fir.bean;

public class FirRegistration extends FormBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firRegNum;
	private Integer stateCd;
	private Integer districtCd;
	private Integer psCd;
	private Integer regYear;
	private String officerId;
	
	
	public FirRegistration() {
		super();
	}
	public FirRegistration(String firRegNum, Integer stateCd, Integer districtCd, Integer psCd, Integer regYear,
			String officerId) {
		super();
		this.firRegNum = firRegNum;
		this.stateCd = stateCd;
		this.districtCd = districtCd;
		this.psCd = psCd;
		this.regYear = regYear;
		this.officerId = officerId;
	}
	public String getFirRegNum() {
		return firRegNum;
	}
	public void setFirRegNum(String firRegNum) {
		this.firRegNum = firRegNum;
	}
	public Integer getStateCd() {
		return stateCd;
	}
	public void setStateCd(Integer stateCd) {
		this.stateCd = stateCd;
	}
	public Integer getDistrictCd() {
		return districtCd;
	}
	public void setDistrictCd(Integer districtCd) {
		this.districtCd = districtCd;
	}
	public Integer getPsCd() {
		return psCd;
	}
	public void setPsCd(Integer psCd) {
		this.psCd = psCd;
	}
	public Integer getRegYear() {
		return regYear;
	}
	public void setRegYear(Integer regYear) {
		this.regYear = regYear;
	}
	public String getOfficerId() {
		return officerId;
	}
	public void setOfficerId(String officerId) {
		this.officerId = officerId;
	}
	
	
	
	
}
