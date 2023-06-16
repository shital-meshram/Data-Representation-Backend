package com.cctns.fir.bean;

public class StateBean {

	private Integer stateCode;
	private String stateName;
	
	
	public StateBean() {
		super();
	}
	public StateBean(Integer stateCode, String stateName) {
		super();
		this.stateCode = stateCode;
		this.stateName = stateName;
	}
	public Integer getStateCode() {
		return stateCode;
	}
	public void setStateCode(Integer stateCode) {
		this.stateCode = stateCode;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	
}
