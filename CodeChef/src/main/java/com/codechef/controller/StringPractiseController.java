package com.codechef.controller;

import org.springframework.web.bind.annotation.RestController;

import com.codechef.model.Arguments;
import com.codechef.service.CodeChefStringService;
import com.codechef.service.CodeChefStringServiceImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping(value = "/StringPractise")
public class StringPractiseController {

	@Qualifier(CodeChefStringServiceImpl.OpCode)
	@Autowired
	private CodeChefStringService codeChefStringService;

	public void setCodeChefStringService(CodeChefStringService codeChefStringService) {
		this.codeChefStringService = codeChefStringService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping(value = "/GOOGOL05", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, Integer> callGOOGOL05(@RequestBody Arguments arg) {
		return codeChefStringService.GOOGOL05(arg.getArgs());
	}
}
