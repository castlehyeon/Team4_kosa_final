package com.douzone.comet.service.hr.pamprg.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.douzone.comet.jdbc.mybatis.DzMybatisSupport;
import com.douzone.comet.service.hr.pamprg.models.Pamprg00100_X10005Model;

/**
 * @description : 승급관리기준표_Dao
 * @Since : 23.09.12 화요일 작성
 * @Author : minaci
 * @History :
 */
@Repository
public class Pamprg00100_X10005Dao {

	private DzMybatisSupport mybatisSupport;

	@Autowired
	public Pamprg00100_X10005Dao(DzMybatisSupport mybatisSupport) {
		this.mybatisSupport = mybatisSupport;
	}
	
	public List<Pamprg00100_X10005Model> selectPamprg00100_X10005ModelList(HashMap<String, Object> parameters)
			throws Exception {
		return this.mybatisSupport.selectList(this.getClass().getName() + ".selectPamprg00100_X10005ModelList",
				parameters);
	}
 
	public int checkListExist(HashMap<String, Object> parameters) throws Exception {
		return this.mybatisSupport.selectOne(this.getClass().getName() + ".checkListExist", parameters);
	}
 
	public List<Pamprg00100_X10005Model> get_BizareaList(HashMap<String, Object> parameters) throws Exception {
		return this.mybatisSupport.selectList(this.getClass().getName() + ".get_BizareaList", parameters);
	}

	public void mergeintoPAMPRG00100_Model(List<Pamprg00100_X10005Model> Pamprg00100_X10005Model) throws Exception {
		this.mybatisSupport.insert(this.getClass().getName() + ".mergeintoPAMPRG00100_Model", Pamprg00100_X10005Model);
	}

	public void uploadPAMPRG00100_Model(Pamprg00100_X10005Model Pamprg00100_X10005Model) throws Exception {
		this.mybatisSupport.insert(this.getClass().getName() + ".uploadPAMPRG00100_Model", Pamprg00100_X10005Model);
	}

	public int checkValidate_update(Pamprg00100_X10005Model updateRow) throws Exception {
		return this.mybatisSupport.selectOne(this.getClass().getName() + ".checkValidate_update", updateRow);
	}
	
	public void updatePAMPRG00100_Model(List<Pamprg00100_X10005Model> parameters) throws Exception {
		this.mybatisSupport.updateBatch(this.getClass().getName() + ".updatePAMPRG00100_Model", parameters);
	}

	public void deletePAMPRG00100_Model(List<Pamprg00100_X10005Model> parameters) throws Exception {
		this.mybatisSupport.deleteBatch(this.getClass().getName() + ".deletePAMPRG00100_Model", parameters);
	}

	public List<Pamprg00100_X10005Model> selectModel(HashMap<String, Object> parameters) throws Exception {
		return this.mybatisSupport.selectList(this.getClass().getName() + ".selectModel", parameters);
	}

}
