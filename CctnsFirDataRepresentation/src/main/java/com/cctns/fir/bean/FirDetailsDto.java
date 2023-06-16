package com.cctns.fir.bean;

public class FirDetailsDto {
	private long firRegNum;
	private int stateCd;
	private int districtCd;
	private int psCd;

	private int firSrno;
	private String firContents;
	
	
	
	



	public FirDetailsDto(long firRegNum, int stateCd, int districtCd, int psCd, int firSrno, String firContents) {
		super();
		this.firRegNum = firRegNum;
		this.stateCd = stateCd;
		this.districtCd = districtCd;
		this.psCd = psCd;
		this.firSrno = firSrno;
		this.firContents = firContents;
	}



	public String getFirContent() {
		return firContents;
	}



	public void setFirContent(String firContents) {
		this.firContents = firContents;
	}



	public int getFirSrNum() {
		return firSrno;
	}



	public void setFirSrNum(int firSrno) {
		this.firSrno = firSrno;
	}



	public void setFirRegNum(long firRegNum) {
		this.firRegNum = firRegNum;
	}



	public void setStateCd(int stateCd) {
		this.stateCd = stateCd;
	}



	public void setDistrictCd(int districtCd) {
		this.districtCd = districtCd;
	}



	public void setPsCd(int psCd) {
		this.psCd = psCd;
	}



	public long getFirRegNum() {
		return firRegNum;
	}



	public int getStateCd() {
		return stateCd;
	}



	public int getDistrictCd() {
		return districtCd;
	}



	public int getPsCd() {
		return psCd;
	}



	



	@Override
	public String toString() {
		return "FirDetails [firRegNum=" + firRegNum + ", stateCd=" + stateCd + ", districtCd=" + districtCd + ", psCd="
				+ psCd + "]";
	}
	
	
	
	

}
