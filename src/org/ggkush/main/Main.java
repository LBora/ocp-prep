package org.ggkush.main;

public class Main {

	public static void main(String[] args) {
		Main deneme = new Main();
		deneme.setBearName("yogi");
		System.out.println(args[1]);
		//setBearName("yogi"); if we use static after public on methods
	}

	/*
	 * ______________________________________________________________
		|           │ Class │ Package │ Subclass │ Subclass │ World  |
		|           │       │         │(same pkg)│(diff pkg)│        |
		|───────────┼───────┼─────────┼──────────┼──────────┼────────|
		|public     │   +   │    +    │    +     │     +    │   +    | 
		|───────────┼───────┼─────────┼──────────┼──────────┼────────|
		|protected  │   +   │    +    │    +     │     +    │        | 
		|───────────┼───────┼─────────┼──────────┼──────────┼────────|
		|no modifier│   +   │    +    │    +     │          │        | 
		|───────────┼───────┼─────────┼──────────┼──────────┼────────|
		|private    │   +   │         │          │          │        |
		|___________|_______|_________|__________|__________|________|
		 + : accessible         blank : not accessible
	 */
	public String setBearName(String name) {
		Animal bear = new Animal();	
		bear.setName(name);
		bear.setName(name, "deneme");
		System.out.println(bear.name);
		System.out.println(bear.getName());
		return "";
	}
}

class Animal1 {
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
