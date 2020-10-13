package org.ggkush.main;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

import java.util.Random;
import org.ggkush.util.*;//* Character gather all contents of package.

//package-> import -> class    right syntax order. not works for other conditions

public class Main {

	public static void main(String[] args) {
		Main deneme = new Main();
		System.out.println(deneme.setBearName("yogi"));
		//System.out.println(args[2]);
		//setBearName("yogi"); if we use static after public on methods
		Random randomGenerator = new Random();
		int number1 = randomGenerator.nextInt(10);
		int number2 = randomGenerator.nextInt(10);
		//Util util = new Util(); not necessary if we defined methods as a static
		System.out.println(Util.sum(number1, number2));
		Date date2;
		java.sql.Date date;
		
	}
	public void read(Files files) {
		Paths.get("name");
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
		
		Animal1 bearInner = new Animal1();	
		bearInner.setName(name);
		bearInner.setName(name, "deneme2");
		System.out.println(bearInner.name);
		System.out.println(bearInner.getName());
		
		return bear.getName();
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
