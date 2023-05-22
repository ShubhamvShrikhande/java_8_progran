package com.FunctionalInterface;

public class Demo implements Test {

	public void gestStudentName(String name) {
		System.out.println(name);
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.gestStudentName("shubham");
	}

}
