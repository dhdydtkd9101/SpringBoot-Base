package com.dhdydtkd.server.controller;

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
public class DataBaseController extends BaseController{
	
	@Autowired
	private DataBaseService dataBaseService;
	
	@RequestMapping(value = "/GetData", method = RequestMethod.GET)
	public BaseModel searchChauffeurList(
			@RequestParam(value = "id", required = true) String id,
			@RequestParam("pass") String pass) throws Exception{
		BodyModel body = new BodyModel();
		body.setBody(dataBaseService.getData(id, pass));
		return ok(body);
	}
	
}
