package com.dhdydtkd.server.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("DataBaseDao")
public class DataBaseDao extends BaseDao {
	
	public List<Map<String, Object>> getData(Map<String, Object> param) {
		return (List<Map<String, Object>>) queryForList("DataBaseMapper.getData", param);
	}
}
