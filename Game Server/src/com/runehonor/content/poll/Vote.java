package com.runehonor.content.poll;

public class Vote {
	
	private String name;
	private int option;
	
	public Vote(String name, int option) {
		this.setName(name);
		this.setOption(option);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOption() {
		return option;
	}

	public void setOption(int option) {
		this.option = option;
	}
}
