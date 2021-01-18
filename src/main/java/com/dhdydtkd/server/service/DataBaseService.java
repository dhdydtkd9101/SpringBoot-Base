package com.dhdydtkd.server.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhdydtkd.server.dao.DataBaseDao;
import com.google.common.collect.Maps;

@Service("DataBaseService")
public class DataBaseService {

	@Autowired
	private DataBaseDao dataBaseDao;
	
	public List<Map<String, Object>> getData(String id, String pass) {
		Map<String,Object> param = Maps.newHashMap();
		param.put("id", id);
		param.put("pass", pass);
		return dataBaseDao.getData(param);
	}
	
}
