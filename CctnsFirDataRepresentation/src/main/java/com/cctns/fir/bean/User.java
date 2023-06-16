package com.cctns.fir.bean;

public class User {
	
	private String username;
	private Integer officeCd;
	private String state;
	private Integer stateCd;
	private String district;
	private Integer districtCd;
	private String ps;
	private Integer psCd;
	private Integer langCd;
	
	
	
	public User() {
		super();
	}
	
	
	public User(String username, Integer officeCd, String state, Integer stateCd, String district, Integer districtCd,
			String ps, Integer psCd, Integer langCd) {
		super();
		this.username = username;
		this.officeCd = officeCd;
		this.state = state;
		this.stateCd = stateCd;
		this.district = district;
		this.districtCd = districtCd;
		this.ps = ps;
		this.psCd = psCd;
		this.langCd = langCd;
	}


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getOfficeCd() {
		return officeCd;
	}
	public void setOfficeCd(Integer officeCd) {
		this.officeCd = officeCd;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getStateCd() {
		return stateCd;
	}
	public void setStateCd(Integer stateCd) {
		this.stateCd = stateCd;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public Integer getDistrictCd() {
		return districtCd;
	}
	public void setDistrictCd(Integer districtCd) {
		this.districtCd = districtCd;
	}
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}
	public Integer getPsCd() {
		return psCd;
	}
	public void setPsCd(Integer psCd) {
		this.psCd = psCd;
	}
	public Integer getLangCd() {
		return langCd;
	}
	public void setLangCd(Integer langCd) {
		this.langCd = langCd;
	}
	
	
}
