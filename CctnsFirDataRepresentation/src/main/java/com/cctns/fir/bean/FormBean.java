package com.cctns.fir.bean;

public class FormBean extends IFormBean {

	protected int langCd;
	protected String recordStatus;
	protected String recordCreatedOn;
	protected String recordCreatedBy;
	protected String recordUpStringdOn;
	protected String recordUpStringdBy;
	protected String recordUpdatedOn;
	protected String recordUpdatedby;
	protected String recordUpdatedFrom;
	protected String recordSyncFrom;
	protected String recordSyncTo;
	protected String recordSyncOn;
	private String isFirstSyncDone;
	private String psRecordSyncOn;
	private int orginalRecord;
	protected Integer userStateCd;
	protected Integer userDistrictCd;
	protected Long userPsCd;
	protected String userName;
	protected String password;
	protected String recordUpStringdFrom;
	protected int originalRecord;
	
	
	
	public FormBean() {
		super();
	}
	
	public FormBean(int langCd, String recordStatus, String recordCreatedOn, String recordCreatedBy,
			String recordUpStringdOn, String recordUpStringdBy, String recordUpdatedOn, String recordUpdatedby,
			String recordUpdatedFrom, String recordSyncFrom, String recordSyncTo, String recordSyncOn,
			String isFirstSyncDone, String psRecordSyncOn, int orginalRecord, Integer userStateCd,
			Integer userDistrictCd, Long userPsCd, String userName, String password, String recordUpStringdFrom,
			int originalRecord) {
		super();
		this.langCd = langCd;
		this.recordStatus = recordStatus;
		this.recordCreatedOn = recordCreatedOn;
		this.recordCreatedBy = recordCreatedBy;
		this.recordUpStringdOn = recordUpStringdOn;
		this.recordUpStringdBy = recordUpStringdBy;
		this.recordUpdatedOn = recordUpdatedOn;
		this.recordUpdatedby = recordUpdatedby;
		this.recordUpdatedFrom = recordUpdatedFrom;
		this.recordSyncFrom = recordSyncFrom;
		this.recordSyncTo = recordSyncTo;
		this.recordSyncOn = recordSyncOn;
		this.isFirstSyncDone = isFirstSyncDone;
		this.psRecordSyncOn = psRecordSyncOn;
		this.orginalRecord = orginalRecord;
		this.userStateCd = userStateCd;
		this.userDistrictCd = userDistrictCd;
		this.userPsCd = userPsCd;
		this.userName = userName;
		this.password = password;
		this.recordUpStringdFrom = recordUpStringdFrom;
		this.originalRecord = originalRecord;
	}
	public int getLangCd() {
		return langCd;
	}
	public void setLangCd(int langCd) {
		this.langCd = langCd;
	}
	public String getRecordStatus() {
		return recordStatus;
	}
	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}
	public String getRecordCreatedOn() {
		return recordCreatedOn;
	}
	public void setRecordCreatedOn(String recordCreatedOn) {
		this.recordCreatedOn = recordCreatedOn;
	}
	public String getRecordCreatedBy() {
		return recordCreatedBy;
	}
	public void setRecordCreatedBy(String recordCreatedBy) {
		this.recordCreatedBy = recordCreatedBy;
	}
	public String getRecordUpStringdOn() {
		return recordUpStringdOn;
	}
	public void setRecordUpStringdOn(String recordUpStringdOn) {
		this.recordUpStringdOn = recordUpStringdOn;
	}
	public String getRecordUpStringdBy() {
		return recordUpStringdBy;
	}
	public void setRecordUpStringdBy(String recordUpStringdBy) {
		this.recordUpStringdBy = recordUpStringdBy;
	}
	public String getRecordUpdatedOn() {
		return recordUpdatedOn;
	}
	public void setRecordUpdatedOn(String recordUpdatedOn) {
		this.recordUpdatedOn = recordUpdatedOn;
	}
	public String getRecordUpdatedby() {
		return recordUpdatedby;
	}
	public void setRecordUpdatedby(String recordUpdatedby) {
		this.recordUpdatedby = recordUpdatedby;
	}
	public String getRecordUpdatedFrom() {
		return recordUpdatedFrom;
	}
	public void setRecordUpdatedFrom(String recordUpdatedFrom) {
		this.recordUpdatedFrom = recordUpdatedFrom;
	}
	public String getRecordSyncFrom() {
		return recordSyncFrom;
	}
	public void setRecordSyncFrom(String recordSyncFrom) {
		this.recordSyncFrom = recordSyncFrom;
	}
	public String getRecordSyncTo() {
		return recordSyncTo;
	}
	public void setRecordSyncTo(String recordSyncTo) {
		this.recordSyncTo = recordSyncTo;
	}
	public String getRecordSyncOn() {
		return recordSyncOn;
	}
	public void setRecordSyncOn(String recordSyncOn) {
		this.recordSyncOn = recordSyncOn;
	}
	public String getIsFirstSyncDone() {
		return isFirstSyncDone;
	}
	public void setIsFirstSyncDone(String isFirstSyncDone) {
		this.isFirstSyncDone = isFirstSyncDone;
	}
	public String getPsRecordSyncOn() {
		return psRecordSyncOn;
	}
	public void setPsRecordSyncOn(String psRecordSyncOn) {
		this.psRecordSyncOn = psRecordSyncOn;
	}
	public int getOrginalRecord() {
		return orginalRecord;
	}
	public void setOrginalRecord(int orginalRecord) {
		this.orginalRecord = orginalRecord;
	}
	public Integer getUserStateCd() {
		return userStateCd;
	}
	public void setUserStateCd(Integer userStateCd) {
		this.userStateCd = userStateCd;
	}
	public Integer getUserDistrictCd() {
		return userDistrictCd;
	}
	public void setUserDistrictCd(Integer userDistrictCd) {
		this.userDistrictCd = userDistrictCd;
	}
	public Long getUserPsCd() {
		return userPsCd;
	}
	public void setUserPsCd(Long userPsCd) {
		this.userPsCd = userPsCd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRecordUpStringdFrom() {
		return recordUpStringdFrom;
	}
	public void setRecordUpStringdFrom(String recordUpStringdFrom) {
		this.recordUpStringdFrom = recordUpStringdFrom;
	}
	public int getOriginalRecord() {
		return originalRecord;
	}
	public void setOriginalRecord(int originalRecord) {
		this.originalRecord = originalRecord;
	}
	
	
}
