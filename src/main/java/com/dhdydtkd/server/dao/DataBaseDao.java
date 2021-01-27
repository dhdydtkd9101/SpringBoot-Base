package com.dhdydtkd.server.dao;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("DataBaseDao")
public class DataBaseDao extends BaseDao {
	
	Logger log = LoggerFactory.getLogger("for-developer");	
	
	public List<Map<String, Object>> getData(Map<String, Object> param) throws Exception {
		return (List<Map<String, Object>>) queryForList("DataBaseMapper.getData", param);
	}
}
