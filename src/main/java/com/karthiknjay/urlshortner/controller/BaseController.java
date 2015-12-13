package com.karthiknjay.urlshortner.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BaseController {
	
	private static Logger logger = LoggerFactory.getLogger(BaseController.class);

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(ModelMap model) {
		logger.debug("in base controller");
		return "home";
	}
	
}
