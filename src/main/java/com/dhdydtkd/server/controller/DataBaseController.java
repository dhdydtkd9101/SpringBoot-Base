package com.dhdydtkd.server.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dhdydtkd.server.model.BaseModel;
import com.dhdydtkd.server.model.BodyModel;
import com.dhdydtkd.server.service.DataBaseService;

@CrossOrigin("*")
@RestController
public class DataBaseController extends BaseController {

	@Autowired
	private DataBaseService dataBaseService;

//	private static final Logger logger = (Logger) LoggerFactory.getLogger(DataBaseController.class);
	Logger log = LoggerFactory.getLogger("for-developer");

	@RequestMapping(value = "/GetData", method = RequestMethod.GET)
	public BaseModel baseGetData(@RequestParam(value = "id", required = true) String id,
			@RequestParam("pass") String pass) throws Exception {
		BodyModel body = new BodyModel();

		
		Map<String, Object> requestMap = new HashMap<>();
		requestMap.put("id", id);
		requestMap.put("pass", pass);

		// 받아온 데이터 체크 하려면, 객체, Map 오버로딩해야함

		// 객체는 Map으로 변경해서 사용해야함.
		// Map<String, Object> result = new ObjectMapper().convertValue(class,
		// Map.class);

		log.trace("Trace Level 테스트", requestMap);
		log.debug("DEBUG Level 테스트", requestMap);
		log.info("baseGetData : {}", requestMap);
		log.error("ERROR Level 테스트", requestMap);

		body.setBody(dataBaseService.getData(id, pass));
		return ok(body);
	}

	public double sum(double a, double b) {
		return a + b;
	}

}
