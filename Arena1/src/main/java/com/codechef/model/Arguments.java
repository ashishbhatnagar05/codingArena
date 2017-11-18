package com.codechef.model;

import java.util.List;

public class Arguments {

	private List<String> args;

	public List<String> getArgs() {
		return args;
	}

	public void setArgs(List<String> args) {
		this.args = args;
	}

	@Override
	public String toString() {
		return "Arguments [args=" + args + "]";
	}

}
