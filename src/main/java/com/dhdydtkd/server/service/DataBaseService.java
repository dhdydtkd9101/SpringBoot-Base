package com.dhdydtkd.server.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhdydtkd.server.dao.DataBaseDao;
import com.google.common.collect.Maps;

@Service("DataBaseService")
public class DataBaseService {

	@Autowired
	private DataBaseDao dataBaseDao;
	
	Logger log = LoggerFactory.getLogger("for-developer");
	
	public List<Map<String, Object>> getData(String id, String pass) {
		Map<String,Object> param = Maps.newHashMap();
		param.put("id", id);
		param.put("pass", pass);
		try {
			dataBaseDao.getData(param);
			return dataBaseDao.getData(param);
			
		} catch (Exception e) {
			log.error("Exception : {}",e.getMessage());
			return null;
		}
//		try {
//			return dataBaseDao.getData(param);
//		}catch (SQLSyntaxErrorException e) {
//			log.error("SQLSyntaxErrorException : {}",e.getMessage());
//			return null;
//		}catch (SQLNonTransientException e) {
//			log.error("SQLNonTransientException : {}",e.getMessage());
//			return null;
//		}catch (SQLException e) {
//			log.error("SQLException : {}",e.getMessage());
//			return null;
//		}catch (Exception e) {
//			log.error("Exception : {}",e.getMessage());
//			return null;
//		}
		
	}
	
}
