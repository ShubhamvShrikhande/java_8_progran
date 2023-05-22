package com.forEcachMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("10", "ram");
		map.put("20", "shyam");
		map.put("30", "ganesh");

		/*
		 * old approch
		 */
		
		/*
		 * Set<String> s = map.keySet(); for (String str : s) {
		 * System.out.println("kay:" + str + "value:" + map.get(str));
		 */
		
		/*
		 * forEachMethod
		 */
		map.forEach((k, v) -> System.out.println("Key=" + k + ",Value=" + v));
	}
}
