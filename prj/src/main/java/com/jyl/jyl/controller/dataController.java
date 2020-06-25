package com.jyl.jyl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jyl.jyl.domain.User;
import com.jyl.jyl.service.MyService;

//引入日志类
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class dataController {
	private static final Logger LOGGER = LoggerFactory.getLogger(dataController.class);

	@Autowired
	private MyService ser;

	@RequestMapping(value = "/fun", method = RequestMethod.GET)
	User fun() {
		LOGGER.info("get user....");
		return ser.fun(0);
	}
}
