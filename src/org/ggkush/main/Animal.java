package org.ggkush.main;

public class Animal {
	String name;

	String getName() {
		return this.name;
	}

	public void setName(String name22323) {
		this.name = name22323;
	}
	
	public void setName(String name, String surname) {
		this.name = name + " " + surname;
	}
}
