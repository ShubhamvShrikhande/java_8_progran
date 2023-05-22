package com.lambdaFunction;

public class AdditionMain {
	public static void main(String[] args) {
		Addition addition = (a, b) -> (a + b);
		System.out.println(addition.add(10, 20));
	}

}
