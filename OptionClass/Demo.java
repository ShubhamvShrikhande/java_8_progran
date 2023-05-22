package com.OptionClass;

import java.util.Optional;

public class Demo {
	public static void main(String[] args) {
	String  str ="java program";
	Optional<String> optional =Optional.ofNullable(str);
	System.out.println(optional.isPresent());
	System.out.println(optional.orElse("no value"));
	}
}