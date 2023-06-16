package com.cctns.fir.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cctns.fir.bean.DistrictBean;
import com.cctns.fir.bean.FIRChartDto;
import com.cctns.fir.bean.FirDetailsResponse;
import com.cctns.fir.bean.FirStatus;
import com.cctns.fir.bean.MajorHeadBean;
import com.cctns.fir.bean.PsBean;
import com.cctns.fir.bean.StateBean;
import com.cctns.fir.bean.User;
import com.cctns.fir.dao.IFirDao;


@Service
public class FirDetailServiceImpl implements IFirDetailService {

	@Autowired
	IFirDao firDao;
	
	@Override
	public List<FirDetailsResponse> getFirDetails() {
		return firDao.getFirDetails();
	}

	@Override
	public List<FirDetailsResponse> getFirDetailsByDate(Integer stateCd, Integer districtCd, Integer psCd, String startDate, String endDate) {
		
		return firDao.getFirDetailsByDate(stateCd,districtCd,psCd,startDate, endDate);
	}
	
	@Override
	public  List<FIRChartDto> getFirChartByDate(Integer stateCd, Integer districtCd, Integer psCd, String startDate, String endDate) {
		
		return firDao.getFirChartByDate(stateCd,districtCd,psCd,startDate, endDate);
	}

	@Override
	public List<DistrictBean> getDistrict(Integer stateCd, Integer langCd) {
		
		return firDao.getDistrict(stateCd, langCd);
	}

	@Override
	public Integer getFirCountByDistrict(Integer districtCd, Integer langCd) {
		return firDao.getFirCountByDistrict(districtCd, langCd);
	}

	@Override
	public List<FirStatus> getFirStatus(Integer langCd) {
		return firDao.getFirStatus(langCd);
	}

	@Override
	public Integer getFirCountByStatus(Integer districtCd, Integer langCd, Integer firStatusCd) {
		return firDao.getFirCountByStatus( districtCd,  langCd,  firStatusCd);
	}

	@Override
	public List<PsBean> getPsList(Integer stateCd,Integer districtCd, Integer langCd) {
		return firDao.getPsList( stateCd, districtCd,  langCd);
	}

	@Override
	public List<StateBean> getStateList(Integer langCd) {
		
		return firDao.getStateList(langCd);
	}

	@Override
	public Integer getFirCountByDate(Integer stateCd, Integer districtCd, Integer psCd,
			String startDate, String endDate) {
		
		return firDao.getFirCountByDate(stateCd,districtCd,psCd,startDate, endDate);
	}

	@Override
	public List<MajorHeadBean> getMajorHeadCode(Integer langCd) {
		return firDao.getMajorHeadCode(langCd);
	}

	@Override
	public Integer getFirTotalCount() {
		return firDao.getFirTotalCount();
	}

	@Override
	public List<FirDetailsResponse> getFirByMajorHead(Integer stateCd, Integer districtCd, Integer psCd,
			Integer majorHeadCd) {
		return firDao.getFirByMajorHead(stateCd,districtCd,psCd,majorHeadCd);
	}

	@Override
	public FirDetailsResponse getFirDetailedDescription(String firRegNum) {
		return firDao.getFirDetailedDescription(firRegNum);
	}

	@Override
	public Integer getIsIIF2Filled(String firRegNum) {
		return firDao.getIsIIF2Filled(firRegNum);
	}

	@Override
	public Integer getIsIIF3Filled(String firRegNum) {
		return firDao.getIsIIF3Filled(firRegNum);
	}

	@Override
	public Integer getIsIIF4Filled(String firRegNum) {
		return firDao.getIsIIF4Filled(firRegNum);
	}

	@Override
	public String saveCasLoggedInUserDetails(User loggedInUser) {
		return firDao.saveCasLoggedInUserDetails(loggedInUser);
	}

	@Override
	public User getLoggedInUserDetails() {
		return firDao.getLoggedInUserDetails();
	}

}
