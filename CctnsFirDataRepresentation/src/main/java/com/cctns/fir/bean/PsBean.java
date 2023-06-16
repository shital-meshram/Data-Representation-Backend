package com.cctns.fir.bean;

public class PsBean {
	
	private Integer psCode;
	private String psName;
	
	
	
	public PsBean() {
		super();
	}
	public PsBean(Integer psCode, String psName) {
		super();
		this.psCode = psCode;
		this.psName = psName;
	}
	public Integer getPsCode() {
		return psCode;
	}
	public void setPsCode(Integer psCode) {
		this.psCode = psCode;
	}
	public String getPsName() {
		return psName;
	}
	public void setPsName(String psName) {
		this.psName = psName;
	}
	
	

}
