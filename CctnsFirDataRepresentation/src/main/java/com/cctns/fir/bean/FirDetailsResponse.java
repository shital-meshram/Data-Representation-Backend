package com.cctns.fir.bean;

public class FirDetailsResponse { 
	
		private Long firRegNum;
		private String state;
		private String district;
		private String policeStation;
		private String ioFullName;
		private String firStatus;
		private String firDescription;
		private String majorHead;
		private String minorHead;
		private String officerInchargeFullName;
		private String firType;
		private String regDate;
		private String actionTaken;
		private String act;
		
		public FirDetailsResponse() {
			super();
		}
		public FirDetailsResponse(Long firRegNum, String state, String district, String policeStation, String ioFullName,
				String firStatus) {
			super();
			this.firRegNum = firRegNum;
			this.state = state;
			this.district = district;
			this.policeStation = policeStation;
			this.ioFullName = ioFullName;
			this.firStatus = firStatus;
		}
		
		
		
		public FirDetailsResponse(Long firRegNum, String state, String district, String policeStation,
				String ioFullName, String firStatus, String firDescription, String majorHead, String minorHead,
				String officerInchargeFullName, String firType, String regDate, String actionTaken, String act) {
			super();
			this.firRegNum = firRegNum;
			this.state = state;
			this.district = district;
			this.policeStation = policeStation;
			this.ioFullName = ioFullName;
			this.firStatus = firStatus;
			this.firDescription = firDescription;
			this.majorHead = majorHead;
			this.minorHead = minorHead;
			this.officerInchargeFullName = officerInchargeFullName;
			this.firType = firType;
			this.regDate = regDate;
			this.actionTaken = actionTaken;
			this.act = act;
		}
		
		
		
		public FirDetailsResponse(String state, String district, String policeStation, String firStatus,
				String firDescription, String majorHead, String minorHead, String officerInchargeFullName,
				String firType, String regDate, String actionTaken, String act) {
			super();
			this.state = state;
			this.district = district;
			this.policeStation = policeStation;
			this.firStatus = firStatus;
			this.firDescription = firDescription;
			this.majorHead = majorHead;
			this.minorHead = minorHead;
			this.officerInchargeFullName = officerInchargeFullName;
			this.firType = firType;
			this.regDate = regDate;
			this.actionTaken = actionTaken;
			this.act = act;
		}
		public String getFirDescription() {
			return firDescription;
		}
		public void setFirDescription(String firDescription) {
			this.firDescription = firDescription;
		}
		public String getMajorHead() {
			return majorHead;
		}
		public void setMajorHead(String majorHead) {
			this.majorHead = majorHead;
		}
		public String getMinorHead() {
			return minorHead;
		}
		public void setMinorHead(String minorHead) {
			this.minorHead = minorHead;
		}
		public String getOfficerInchargeFullName() {
			return officerInchargeFullName;
		}
		public void setOfficerInchargeFullName(String officerInchargeFullName) {
			this.officerInchargeFullName = officerInchargeFullName;
		}
		public String getFirType() {
			return firType;
		}
		public void setFirType(String firType) {
			this.firType = firType;
		}
		public String getRegDate() {
			return regDate;
		}
		public void setRegDate(String regDate) {
			this.regDate = regDate;
		}
		public String getActionTaken() {
			return actionTaken;
		}
		public void setActionTaken(String actionTaken) {
			this.actionTaken = actionTaken;
		}
		public String getAct() {
			return act;
		}
		public void setAct(String act) {
			this.act = act;
		}
		public Long getFirRegNum() {
			return firRegNum;
		}
		public void setFirRegNum(Long firRegNum) {
			this.firRegNum = firRegNum;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getDistrict() {
			return district;
		}
		public void setDistrict(String district) {
			this.district = district;
		}
		public String getPoliceStation() {
			return policeStation;
		}
		public void setPoliceStation(String policeStation) {
			this.policeStation = policeStation;
		}
		public String getIoFullName() {
			return ioFullName;
		}
		public void setIoFullName(String ioFullName) {
			this.ioFullName = ioFullName;
		}
		public String getFirStatus() {
			return firStatus;
		}
		public void setFirStatus(String firStatus) {
			this.firStatus = firStatus;
		}



}
