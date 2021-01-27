package com.dhdydtkd.server;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.dhdydtkd.server.controller.DataBaseControllerTest;

@SpringBootTest
class LocalServerApplicationTests {

	@Test
	void contextLoads() {
		DataBaseControllerTest c = new DataBaseControllerTest();
		c.baseGetData();
	}

}
