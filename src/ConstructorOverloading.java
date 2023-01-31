package org.cts;

public class ConstructorOverloading {
	public ConstructorOverloading() {
		this(15);
		System.out.println("default constructor");
	}
	public ConstructorOverloading(int age) {
		System.out.println("insid single parameterised " +age);
	}

}
