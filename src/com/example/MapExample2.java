package com.example;

import java.util.HashMap;
import java.util.Random;

public class MapExample2 {

	public static void main(String[] args) {
		var map = new HashMap<Character, Integer>();
		var r =  new Random();
		int forCount = 0;
		
		
		
		for(;;) {
			forCount++;
			char ch = (char)r.nextInt('A', 'Z'+1);
			if (map.containsKey(ch)) {
				int count = map.get(ch);
				count++;
				map.put(ch, count);
			} else
				map.put(ch, 1);
			
			if(map.size()==26)
				break;
		}
		
		System.out.println(map);
		System.out.println("forCount = " + forCount);
		
	}

}
