package com.cctns.fir.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class FIRDetailsMapper implements RowMapper<FirDetailsResponse> {

	@Override
	public FirDetailsResponse mapRow(ResultSet rs, int rowNum) throws SQLException {

		FirDetailsResponse firDetails = new FirDetailsResponse();
		
		firDetails.setFirDescription(rs.getString("firDescription"));
		firDetails.setOfficerInchargeFullName(rs.getString("officerInchargeFullName"));
		firDetails.setRegDate(rs.getString("regDate"));
		firDetails.setMajorHead(rs.getString("majorHead"));
		firDetails.setMinorHead(rs.getString("minorHead"));
		firDetails.setFirStatus(rs.getString("firStatus"));
		firDetails.setFirType(rs.getString("firType"));
		firDetails.setActionTaken(rs.getString("actionTaken"));
		firDetails.setAct(rs.getString("act"));
		firDetails.setState(rs.getString("state"));
		firDetails.setDistrict(rs.getString("district"));
		firDetails.setPoliceStation(rs.getString("policeStation"));
		return firDetails;
	}

}
