package com.FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		list.forEach((n)->System.out.println(n));
		Stream<Integer> streams =list.stream();
		//list.stream().filter(i->i<30).collect(Collectors.toList());
		System.out.println("******************************");

		/*once we  use data  second time we cant use 
		 * stream.forEach(n->System.out.println(n));
		 */
		List<Integer> al = Arrays.asList(1,3,2,5,4,6);
		Stream<Integer> stream =al.stream();
		stream.forEach(n->System.out.println(n));
		/*
		 * sorted method
		 */
		Stream<Integer> sortstream =al.stream().sorted();

		sortstream.forEach(e->System.out.println(e));
		/*
		 * min method 
		 * find min value
		 */
		Integer min =al.stream().min((x,y)->x.compareTo(y)).get();

		System.out.println(min);
		/*
		 * max methods
		 * find max number
		 */
		Integer max =al.stream().max((x,y)->x.compareTo(y)).get();

		System.out.println(max);
		
		
	}
	

}
