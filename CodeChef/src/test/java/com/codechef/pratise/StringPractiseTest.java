package com.codechef.pratise;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.codechef.practise.StringPractise;

public class StringPractiseTest {

	private StringPractise sut;

	@Before
	public void setup() {
		sut = new StringPractise();
	}

	@Test
	public void testGOOGOL05() {
		String[] args = { "cse", "mnc", "cse", "ele", "cse", "zzza", "physics", "mnc" };
		sut.GOOGOL05(Arrays.asList(args));
	}

}
