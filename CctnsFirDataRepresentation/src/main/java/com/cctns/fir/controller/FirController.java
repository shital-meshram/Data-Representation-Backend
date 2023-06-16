package com.cctns.fir.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.naming.spi.ObjectFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.cctns.fir.bean.DistrictBean;
import com.cctns.fir.bean.FIRChartDto;
import com.cctns.fir.bean.FirDetailsDto;
import com.cctns.fir.bean.FirDetailsResponse;
import com.cctns.fir.bean.FirRegistration;
import com.cctns.fir.bean.FirStatus;
import com.cctns.fir.bean.MajorHeadBean;
import com.cctns.fir.bean.PsBean;
import com.cctns.fir.bean.StateBean;
import com.cctns.fir.bean.User;
import com.cctns.fir.service.IFirDetailService;



@RestController
@RequestMapping("/fir")
@CrossOrigin(origins = "http://localhost:4200")
public class FirController {
	
	
	
	@Autowired
	IFirDetailService firDetailsService;
	
	
	
	
	
	
	@GetMapping({"/firfetch"})
	public @ResponseBody List<FirDetailsResponse> getFirDetails(){
	   return firDetailsService.getFirDetails();
	}
	
	@GetMapping({"/getfirbydate"})
	public @ResponseBody List<FirDetailsResponse> getFirByDate(@RequestParam (name="stateCd") Integer stateCd,
			@RequestParam (name="districtCd") Integer districtCd,
			@RequestParam (name="psCd") Integer psCd,
			@RequestParam(name = "startDate") String startDate, 
			
			@RequestParam(name = "endDate") String endDate){
		return firDetailsService.getFirDetailsByDate(stateCd,districtCd,psCd, startDate, endDate);
	}
	
	@GetMapping({"/getfircountbydate"})
	public @ResponseBody Integer getFirCountByDate(@RequestParam (name="stateCd") Integer stateCd,
			@RequestParam (name="districtCd") Integer districtCd,
			@RequestParam (name="psCd") Integer psCd,
			@RequestParam(name = "startDate") String startDate, 
			
			@RequestParam(name = "endDate") String endDate){
		return firDetailsService.getFirCountByDate(stateCd,districtCd,psCd, startDate, endDate);
	}
	
	@GetMapping({"/gettotalfircount"})
	public @ResponseBody Integer getFirTotalCount(){
		return firDetailsService.getFirTotalCount();
	}
	
	@GetMapping({"/getfirchartbydate"})
	public @ResponseBody  List<FIRChartDto> getFirChartByDate(@RequestParam (name="stateCd") Integer stateCd,
			@RequestParam (name="districtCd") Integer districtCd,
			@RequestParam (name="psCd") Integer psCd,
			@RequestParam(name = "startDate") String startDate, 
			
			@RequestParam(name = "endDate") String endDate){
		return firDetailsService.getFirChartByDate(stateCd,districtCd,psCd, startDate, endDate);
	}
	
	@GetMapping({"/getDistrict"})
	public @ResponseBody List<DistrictBean> getDistrict(@RequestParam (name="stateCd") Integer stateCd, @RequestParam (name="langCd") Integer langCd){
		return firDetailsService.getDistrict(stateCd, langCd);
	}
	
	@GetMapping({"/getfircountbydistrict"})
	public @ResponseBody Integer  getFirCountByDistrict(@RequestParam (name="districtCd") Integer districtCd, @RequestParam (name="langCd") Integer langCd){
		return firDetailsService.getFirCountByDistrict(districtCd, langCd);
	}
	
	@GetMapping({"/getfirstatus"})
	public @ResponseBody List<FirStatus> getFirStatus(@RequestParam (name="langCd") Integer langCd){
		return firDetailsService.getFirStatus(langCd);
	}
	
	@GetMapping({"/getfircountbystatus"})
	public @ResponseBody Integer  getFirCountByStatus(@RequestParam (name="districtCd") Integer districtCd, @RequestParam (name="langCd") Integer langCd,
			@RequestParam (name="firStatusCd") Integer firStatusCd){
		return firDetailsService.getFirCountByStatus(districtCd, langCd, firStatusCd);
	}
	
	@GetMapping({"/getPsList"})
	public @ResponseBody List<PsBean> getPsList(@RequestParam (name="stateCd") Integer stateCd, @RequestParam (name="districtCd") Integer districtCd, @RequestParam (name="langCd") Integer langCd){
		return firDetailsService.getPsList(stateCd,districtCd, langCd);
	}
	
	@GetMapping({"/getStateList"})
	public @ResponseBody List<StateBean> getStateList(@RequestParam (name="langCd") Integer langCd){
		return firDetailsService.getStateList(langCd);
	}
	
	
	@GetMapping({"/getChartByMajorHead"})
	public @ResponseBody List<MajorHeadBean> getMajorHeadCode(@RequestParam (name="langCd") Integer langCd){
		return firDetailsService.getMajorHeadCode(langCd);
	}
	
	@GetMapping({"/getfirbymajorhead"})
	public @ResponseBody List<FirDetailsResponse> getFirByMajorHead(@RequestParam (name="stateCd") Integer stateCd,
			@RequestParam (name="districtCd") Integer districtCd,
			@RequestParam (name="psCd") Integer psCd, @RequestParam (name="majorHeadCd") Integer majorHeadCd){
		return firDetailsService.getFirByMajorHead(stateCd,districtCd,psCd, majorHeadCd);
	}
	
	@GetMapping({"/getfirdetaileddesc"})
	public @ResponseBody FirDetailsResponse getFirDetailedDescription(@RequestParam (name="firRegNum") String firRegNum){
		return firDetailsService.getFirDetailedDescription(firRegNum);
	}
	
	@GetMapping({"/isIIF2Filled"})
	public @ResponseBody Integer getIsIIF2Filled(@RequestParam (name="firRegNum") String firRegNum){
		return firDetailsService.getIsIIF2Filled(firRegNum);
	}
	
	@GetMapping({"/isIIF3Filled"})
	public @ResponseBody Integer getIsIIF3Filled(@RequestParam (name="firRegNum") String firRegNum){
		return firDetailsService.getIsIIF3Filled(firRegNum);
	}
	
	@GetMapping({"/isIIF4Filled"})
	public @ResponseBody Integer getIsIIF4Filled(@RequestParam (name="firRegNum") String firRegNum){
		return firDetailsService.getIsIIF4Filled(firRegNum);
	}
	
	@PostMapping({"/saveLoggedInUserDetails"})
	public @ResponseBody String saveCasLoggedInUserDetails(@RequestParam Map<String, String> body ) {
		System.out.println(body.get("username"));
		System.out.println(body.get("officeCd"));
		System.out.println(body.get("stateCd"));
		System.out.println(body.get("districtCd"));
		System.out.println(body.get("psCd"));
		System.out.println(body);
		User loggedInUser = new User();
		
		
		loggedInUser.setUsername(body.get("username"));
		loggedInUser.setOfficeCd(Integer.parseInt(body.get("officeCd")) );
		loggedInUser.setStateCd(Integer.parseInt(body.get("stateCd")) );
		loggedInUser.setDistrictCd(Integer.parseInt(body.get("districtCd")));
		loggedInUser.setPsCd(Integer.parseInt(body.get("psCd")));
		loggedInUser.setLangCd(Integer.parseInt(body.get("langCd")));
		System.out.println("username : "+loggedInUser.getUsername()+", office code :: "+loggedInUser.getOfficeCd()+", State cd :: "+loggedInUser.getStateCd()+
				", district cd :: "+loggedInUser.getDistrictCd()+", police station cd :: "+ loggedInUser.getPsCd());
		 
		String isDataSaved = firDetailsService.saveCasLoggedInUserDetails(loggedInUser);
		System.out.println(isDataSaved);
		return isDataSaved;
	 }
	
	@GetMapping({"/getLoggedInUserDetails"})
	public @ResponseBody User getLoggedInUserDetails(){
		return firDetailsService.getLoggedInUserDetails();
	}
	

	
	
		
	
	
	
	
}


