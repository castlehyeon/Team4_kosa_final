package com.douzone.comet.service.hr.cdmjim00100.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.douzone.comet.jdbc.mybatis.DzMybatisSupport;
import com.douzone.comet.service.hr.cdmjim00100.models.cdmjim00100_left_grid;
import com.douzone.comet.service.hr.cdmjim00100.models.cdmjim00100_right_grid1;
import com.douzone.comet.service.hr.cdmjim00100.models.cdmjim00100_right_grid2;
/** 
  * @description :
  * @Since   : 
  * @Author  :
  * @History :
  */
@Repository
public class cdmjim00100_SubGrid_Dao  {

	private DzMybatisSupport mybatisSupport;

	@Autowired
	public cdmjim00100_SubGrid_Dao(DzMybatisSupport mybatisSupport) {
		this.mybatisSupport = mybatisSupport;
	}

	/**
	 * 세부분류(좌) 목록 조회
	 * @param cdmjim00100_left_grid
	 * @return List<cdmjim00100_left_grid>
	 */
	public List<cdmjim00100_left_grid> selectcdmjim00100_left_gridList(Map<String, Object> cdmjim00100_left_grid) throws Exception {
		return this.mybatisSupport.selectList(this.getClass().getName() + ".selectcdmjim00100_left_gridList", cdmjim00100_left_grid);
	}
	
	/**
	 * 수행준거(상) 목록 조회
	 * @param cdmjim00100_left_grid
	 * @return List<cdmjim00100_left_grid>
	 */
	public List<cdmjim00100_right_grid1> selectcdmjim00100_right_grid1List(Map<String, Object> cdmjim00100_right_grid1) throws Exception {
		return this.mybatisSupport.selectList(this.getClass().getName() + ".selectcdmjim00100_right_grid1List", cdmjim00100_right_grid1);
	}
	
	/**
	 * 수행준거(하) 목록 조회
	 * @param cdmjim00100_left_grid
	 * @return List<cdmjim00100_left_grid>
	 */
	public List<cdmjim00100_right_grid2> selectcdmjim00100_right_grid2List(Map<String, Object> cdmjim00100_right_grid2) throws Exception {
		return this.mybatisSupport.selectList(this.getClass().getName() + ".selectcdmjim00100_right_grid2List", cdmjim00100_right_grid2);
	}


	//입력
	/**
	 * 단일 데이터 입력 처리
	 * @param cdmjim00100_left_grid
	 */
	public void insertcdmjim00100_leftgrid(cdmjim00100_left_grid cdmjim00100_left_grid) throws Exception {
		this.mybatisSupport.insert(this.getClass().getName() + ".insertcdmjim00100_leftgrid", cdmjim00100_left_grid);
	}
	/**
	 * 단일 데이터 입력 처리
	 * @param cdmjim00100_right1_grid
	 */
	public void insertcdmjim00100_right1_grid(cdmjim00100_right_grid1 cdmjim00100_right_grid1) throws Exception {
		this.mybatisSupport.insert(this.getClass().getName() + ".insertcdmjim00100_right1_grid", cdmjim00100_right_grid1);
	}
	/**
	 * 단일 데이터 입력 처리
	 * @param cdmjim00100_right2_grid
	 */
	public void insertcdmjim00100_right2_grid(cdmjim00100_right_grid2 cdmjim00100_right_grid2) throws Exception {
		this.mybatisSupport.insert(this.getClass().getName() + ".insertcdmjim00100_right2_grid", cdmjim00100_right_grid2);
	}
	
	//수정 
	/**
	 * 단일 데이터 수정 처리
	 * @param cdmjim00100_left_grid
	 */
	public void updatecdmjim00100_left_grid(cdmjim00100_left_grid cdmjim00100_left_grid) throws Exception {
		this.mybatisSupport.update(this.getClass().getName() + ".updatecdmjim00100_left_grid", cdmjim00100_left_grid);
	}
	/**
	 * 단일 데이터 수정 처리
	 * @param cdmjim00100_right1_grid
	 */
	public void updatecdmjim00100_right1_grid(cdmjim00100_right_grid1 cdmjim00100_right_grid1) throws Exception {
		this.mybatisSupport.insert(this.getClass().getName() + ".updatecdmjim00100_right1_grid", cdmjim00100_right_grid1);
	}
	/**
	 * 단일 데이터 수정 처리
	 * @param cdmjim00100_right2_grid
	 */
	public void updatecdmjim00100_right2_grid1(cdmjim00100_right_grid2 cdmjim00100_right_grid2) throws Exception {
		this.mybatisSupport.insert(this.getClass().getName() + ".updatecdmjim00100_right2_grid1", cdmjim00100_right_grid2);
	}
	public void updatecdmjim00100_right2_grid2(cdmjim00100_right_grid2 cdmjim00100_right_grid2) throws Exception {
		this.mybatisSupport.insert(this.getClass().getName() + ".updatecdmjim00100_right2_grid2", cdmjim00100_right_grid2);
	}
	public void updatecdmjim00100_right2_grid3(cdmjim00100_right_grid2 cdmjim00100_right_grid2) throws Exception {
		this.mybatisSupport.insert(this.getClass().getName() + ".updatecdmjim00100_right2_grid3", cdmjim00100_right_grid2);
	}
	
	
	//삭제
	/**
	 * 단일 데이터 삭제 처리
	 * @param cdmjim00100_left_grid
	 */
	public void deletecdmjim00100_left_grid(cdmjim00100_left_grid cdmjim00100_left_grid) throws Exception {
		this.mybatisSupport.delete(this.getClass().getName() + ".deletecdmjim00100_left_grid", cdmjim00100_left_grid);
	}
	
	
	/**
	 * 단일 데이터 삭제 처리
	 * @param cdmjim00100_right_grid1
	 */
	public void deletecdmjim00100_right1_grid(cdmjim00100_right_grid1 cdmjim00100_right_grid1) throws Exception {
		this.mybatisSupport.delete(this.getClass().getName() + ".deletecdmjim00100_right1_grid", cdmjim00100_right_grid1);
	}
	/**
	 * 전체 데이터 삭제 처리
	 * @param cdmjim00100_right_grid1
	 */
	public void deletecdmjim00100_right1_grid_all(Map<String, Object> parameters) throws Exception {
		this.mybatisSupport.delete(this.getClass().getName() + ".deletecdmjim00100_right1_grid_all", parameters);
	}
	
	
	/**
	 * 단일 데이터 삭제 처리
	 * @param cdmjim00100_right_grid2
	 */
	public void deletecdmjim00100_right2_grid(cdmjim00100_right_grid2 cdmjim00100_right_grid2) throws Exception {
		this.mybatisSupport.delete(this.getClass().getName() + ".deletecdmjim00100_right2_grid", cdmjim00100_right_grid2);
	}
	/**
	 * 전체 데이터 삭제 처리(cdmjim00100_right_grid1 삭제가 일어날 때)
	 * @param cdmjim00100_right_grid2
	 */
	public void deletecdmjim00100_right2_grid_all(Map<String, Object> parameters) throws Exception {
		this.mybatisSupport.delete(this.getClass().getName() + ".deletecdmjim00100_right2_grid_all", parameters);
	}

}
