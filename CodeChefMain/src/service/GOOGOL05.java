package service;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GOOGOL05 {
	public static void main(String[] args) throws Exception {
		final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine().trim());
		String[] department = new String[n];
		for (int i = 0; i < n; i++) {
			department[i] = in.readLine().trim();
		}
		GOOGOL05(Arrays.asList(department));
	}

	public static void GOOGOL05(List<String> args) {
		Map<String, Integer> element = new LinkedHashMap<String, Integer>();
		for (String arg : args) {
			if (element.containsKey(arg)) {
				element.put(arg, element.get(arg) + 1);
			} else {
				element.put(arg, 1);
			}
		}
		for (Map.Entry<String, Integer> e : element.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}
