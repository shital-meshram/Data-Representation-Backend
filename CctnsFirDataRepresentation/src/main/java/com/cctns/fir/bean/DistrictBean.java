package com.cctns.fir.bean;

public class DistrictBean {
	
	private String districtName;
	private Integer districtCd;
	
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public Integer getDistrictCd() {
		return districtCd;
	}
	public void setDistrictCd(Integer districtCd) {
		this.districtCd = districtCd;
	}
	public DistrictBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DistrictBean(String districtName, Integer districtCd) {
		super();
		this.districtName = districtName;
		this.districtCd = districtCd;
	}

	
}
