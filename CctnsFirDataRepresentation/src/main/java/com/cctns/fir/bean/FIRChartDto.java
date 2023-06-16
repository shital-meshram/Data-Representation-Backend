package com.cctns.fir.bean;

public class FIRChartDto {
	private String districtName;
	private Integer firCount;
	
	
	
	
	public FIRChartDto() {
		super();
	}

	public FIRChartDto(String districtName, Integer firCount) {
		super();
		this.districtName = districtName;
		this.firCount = firCount;
	}
	
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public Integer getFirCount() {
		return firCount;
	}
	public void setFirCount(Integer firCount) {
		this.firCount = firCount;
	}
	
	
	

}
