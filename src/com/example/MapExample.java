package com.example;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		var map = new HashMap<String, Integer>();
		
		map.put("java", 10000);
		map.put("jsp", 5000);
		map.put("spring", 20000);
		
		map.put("java", 30000);
		
		System.out.println(map);
		System.out.println(map.size());
		
		System.out.println(map.get("java"));
		System.out.println(map.get("python"));
		System.out.println(map.containsKey("java"));	// 키존재여부 확인
		System.out.println(map.containsKey("python"));
		
		map.remove("spring");
		
		System.out.println(map);
	}

}
