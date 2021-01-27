package com.dhdydtkd.server.controller;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dhdydtkd.server.service.DataBaseService;

public class DataBaseControllerTest {

	Logger log = LoggerFactory.getLogger("for-developer");
	
	@InjectMocks
	private SqlSessionFactory sqlFactory;
	
	@Test
	public void baseGetData() {
		DataBaseService c = new DataBaseService();
		
		List<Map<String, Object>> result = c.getData("TDDID", "TDDPASS");

		log.trace("Trace Level 테스트", result);
		log.debug("DEBUG Level 테스트", result);
		log.info("baseGetData : {}", result);
		log.error("ERROR Level 테스트", result);

	}

}
