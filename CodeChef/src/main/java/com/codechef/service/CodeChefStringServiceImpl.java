package com.codechef.service;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.codechef.practise.StringPractise;

@Service(CodeChefStringServiceImpl.OpCode)
@Scope("singleton")
public class CodeChefStringServiceImpl implements CodeChefStringService {
	public static final String OpCode = "CodeChefStringService";
	private StringPractise stringPractise;

	public Map<String, Integer> GOOGOL05(List<String> args) {
		stringPractise = new StringPractise();
		return stringPractise.GOOGOL05(args);
	}
}
