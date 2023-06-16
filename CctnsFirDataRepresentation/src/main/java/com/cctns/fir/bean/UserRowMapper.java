package com.cctns.fir.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User userDetails = new User();
		
		userDetails.setUsername(rs.getString("username"));
		userDetails.setOfficeCd(Integer.parseInt( rs.getString("officeCd")));
		userDetails.setStateCd(Integer.parseInt( rs.getString("stateCd")));
		userDetails.setDistrictCd(Integer.parseInt( rs.getString("districtCd")));
		userDetails.setPsCd(Integer.parseInt( rs.getString("psCd")));
		userDetails.setLangCd(Integer.parseInt( rs.getString("langCd")));
		return userDetails;
	}

	

}
