package com.hq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SecurityLoginController {

	@RequestMapping(method=RequestMethod.GET,value="loginPage.do")
	public String userLogin() {
		return "login";
	}
}
