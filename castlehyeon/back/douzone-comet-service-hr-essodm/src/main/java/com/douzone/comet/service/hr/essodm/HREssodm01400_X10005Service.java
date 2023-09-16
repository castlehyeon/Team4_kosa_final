package com.douzone.comet.service.hr.essodm;
 
import com.douzone.comet.components.DzCometService;
import com.douzone.gpd.restful.annotation.DzApiService;
import com.douzone.gpd.restful.enums.CometModule;
import java.util.List;
import com.douzone.gpd.restful.annotation.DzApi;
import com.douzone.gpd.restful.annotation.DzParam;
import com.douzone.gpd.restful.enums.DzParamType;
import com.douzone.gpd.restful.enums.DzRequestMethod;
import com.douzone.comet.service.hr.essodm.dao.Essodm01400_x10005Dao;
import com.douzone.comet.service.hr.essodm.models.Essodm01400_X10005Model;
import com.douzone.comet.service.hr.essodm.models.Essodm01400_X10005_UserInfoModel;
import com.douzone.gpd.restful.model.DzGridModel;
import org.springframework.beans.factory.annotation.Autowired;
import com.douzone.gpd.components.exception.DzApplicationRuntimeException;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.HashMap;

/** 
  * @description : 결근계_service
  * @Since   : 2023-09-12
  * @Author  : 김성현
  * @History : 개발환경 세팅
  */
@DzApiService(value="HREssodm01400_X10005Service", module=CometModule.HR, desc="결근계 신청")
public class HREssodm01400_X10005Service extends DzCometService {

	@Autowired
	Essodm01400_x10005Dao essodm01400_x10005DAO; 

	@DzApi(url="/list_HR_OFFAPPLY_MST_X10005MST", desc="결근계 조회", httpMethod=DzRequestMethod.GET)
	public List<Essodm01400_X10005Model> list_HR_OFFAPPLY_MST_X10005(
		@DzParam(key="start_dt", desc="시작일", paramType = DzParamType.QueryString) String start_dt,
		@DzParam(key="end_dt", desc="종료일", paramType = DzParamType.QueryString) String end_dt,
		@DzParam(key="company_cd", desc="회사코드", paramType = DzParamType.QueryString) String company_cd
	) throws Exception {
		List<Essodm01400_X10005Model> items =  new ArrayList<Essodm01400_X10005Model>();	
		try {
			HashMap<String, Object> parameters = new HashMap<>();
			parameters.put("P_COMPANY_CD", company_cd);
			parameters.put("P_START_DT", start_dt);
			parameters.put("P_END_DT", end_dt);
	 		
	 		items = essodm01400_x10005DAO.selectEssodm01400_X10005ModelList(parameters);
	 		
	 		System.out.println("MainGrid1Model==========================");
			for (Essodm01400_X10005Model item : items) {
				System.out.println(item.toString());
			}
			System.out.println("MainGrid1Model==========================");
	 	} catch(Exception e) {
	        throw new DzApplicationRuntimeException(e);
	    }
	    
	    return items;
 	}
 	
 	//이건 사용하지 않을 것 그리드에서 기본정보를 다 들고 있음.
 	@DzApi(url="/getUserInfo", desc="메인페이지 기본정보 조회", httpMethod=DzRequestMethod.GET)
	public List<Essodm01400_X10005_UserInfoModel> getUserInfo(
	@DzParam(key="company_cd", desc="회사코드", paramType = DzParamType.QueryString) String company_cd,
	@DzParam(key="emp_no", desc="사원번호", paramType = DzParamType.QueryString) String emp_no
	) throws Exception {
		Essodm01400_X10005_UserInfoModel item =  new Essodm01400_X10005_UserInfoModel();
		List<Essodm01400_X10005_UserInfoModel> items = new ArrayList<Essodm01400_X10005_UserInfoModel>();
		//현재 접속자 정보를 가져오지 않고 가장 많은 건수를 가진 사원정보를 입력
//		String company_cd = "EWP";
//		String emp_no = "20200308";
		try {
	 		HashMap<String, Object> parameters = new HashMap<>();
	 		parameters.put("P_EMP_NO", emp_no);
			parameters.put("P_COMPANY_CD", company_cd);
	 		item = essodm01400_x10005DAO.getUserInfo(parameters);
	 		items.add(item);
	 	} catch(Exception e) {
	        throw new DzApplicationRuntimeException(e);
	    }
	    
	    return items;
 	}

	@Transactional(rollbackFor = Exception.class)
	@DzApi(url="/save_HR_OFFAPPLY_MST_X10005MST", desc="결근계 신청", httpMethod=DzRequestMethod.POST)
	public void save_HR_OFFAPPLY_MST_X10005(
		@DzParam(key="main_ds", desc="모델", paramType = DzParamType.Body) DzGridModel<Essodm01400_X10005Model> main_ds
	) throws Exception {
	//전부 단건 처리	    
	    try {
	    	logger.info("전달받은 파라미터 main_ds===>" + main_ds.toString());
	        // update
//	        for(Essodm01400_X10005Model essodm01400_X10005Model : main_ds.getUpdated()) {
//	        	essodm01400_x10005DAO.updateEssodm01400_X10005Model(essodm01400_X10005Model);
//	        }
	        
	        // delete
//	        for(Essodm01400_X10005Model essodm01400_X10005Model : main_ds.getDeleted()) {
//	        	essodm01400_x10005DAO.deleteEssodm01400_X10005Model(essodm01400_X10005Model);
//	        }
	        
	        // add
//	        for(Essodm01400_X10005Model essodm01400_X10005Model : main_ds.getAdded()) {
//	        	
//	        	essodm01400_x10005DAO.insertEssodm01400_X10005Model(essodm01400_X10005Model);
//	        }
	        
	        
	        return 
	        
	        
	        
	    } catch (Exception e) {
	        throw new DzApplicationRuntimeException(e);
	    }
	}
}
