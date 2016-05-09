package com.shq.dao.usercenter;

import org.springframework.stereotype.Repository;

import com.shq.common.dao.MyBatisDao;

/**
 * 系统管理dao
 * @author zhutianwei
 *
 */
@Repository
public class SystemDao extends MyBatisDao<com.shq.model.usercenter.System>{

	public boolean isExistsCode(String code){
		long count = count("isExistsCode", code);
		return count > 0 ? true : false;
	}
	
	public void deleteRolePermBySystemId(String systemId){
		delete("deleteRolePermBySystemId", systemId);
	}
	
	public void deletePermBySystemId(String systemId){
		delete("deletePermBySystemId", systemId);
	}
}
