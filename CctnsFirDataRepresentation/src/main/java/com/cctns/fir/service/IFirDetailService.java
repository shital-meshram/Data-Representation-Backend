package com.cctns.fir.service;

import java.util.List;
import java.util.Map;

import com.cctns.fir.bean.DistrictBean;
import com.cctns.fir.bean.FIRChartDto;
import com.cctns.fir.bean.FirDetailsResponse;
import com.cctns.fir.bean.FirStatus;
import com.cctns.fir.bean.MajorHeadBean;
import com.cctns.fir.bean.PsBean;
import com.cctns.fir.bean.StateBean;
import com.cctns.fir.bean.User;

public interface IFirDetailService {
	
	List<FirDetailsResponse> getFirDetails();

	List<FirDetailsResponse> getFirDetailsByDate(Integer stateCd, Integer districtCd, Integer psCd, String startDate, String endDate);
	
	 List<FIRChartDto> getFirChartByDate(Integer stateCd, Integer districtCd, Integer psCd, String startDate, String endDate);
	
	List<DistrictBean> getDistrict(Integer stateCd,Integer langCd);
	
	Integer getFirCountByDistrict(Integer districtCd,Integer langCd);
	
	Integer getFirTotalCount();
	
	List<FirStatus> getFirStatus(Integer langCd);
	
	Integer getFirCountByStatus(Integer districtCd, Integer langCd,Integer firStatusCd);
	
	List<PsBean> getPsList(Integer stateCd, Integer districtCd,Integer langCd);
	
	List<StateBean> getStateList(Integer langCd);
	
	
	List<MajorHeadBean> getMajorHeadCode(Integer langCd);
	Integer getFirCountByDate(Integer stateCd, Integer districtCd, Integer psCd, String startDate,
			String endDate);

	List<FirDetailsResponse> getFirByMajorHead(Integer stateCd, Integer districtCd, Integer psCd, Integer majorHeadCd);

	FirDetailsResponse getFirDetailedDescription(String firRegNum);

	Integer getIsIIF2Filled(String firRegNum);

	Integer getIsIIF3Filled(String firRegNum);

	Integer getIsIIF4Filled(String firRegNum);

	String saveCasLoggedInUserDetails(User loggedInUser);

	User getLoggedInUserDetails();
	
}
