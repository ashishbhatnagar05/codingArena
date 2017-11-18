package com.codechef.practise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringPractise {

	public Map<String, Integer> GOOGOL05(List<String> args) {
		Map<String, Integer> element = new HashMap<String, Integer>();
		for (String arg : args) {
			if (element.containsKey(arg)) {
				element.put(arg, element.get(arg) + 1);
			} else {
				element.put(arg, 1);
			}
		}
		System.out.println(element.toString());
		return element;
	}
}
