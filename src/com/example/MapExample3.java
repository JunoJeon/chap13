package com.example;

import java.nio.MappedByteBuffer;
import java.util.HashMap;

import util.Alpha;
import util.VT100;

public class MapExample3 {

	public static void main(String[] args) {
		var map = new HashMap<Alpha, Integer>();
		
		
		
		for(;;) {
			
			var alpha =  new Alpha();
			if(map.containsKey(alpha)) {
				int count = map.get(alpha);
				count++;
				map.put(alpha, count);
			} else
				map.put(alpha, 1);
			
			
			if (map.size()==800)
				break;
		}
		
//		System.out.println(map);
		VT100.clearScreen();
		
		for (var e : map.entrySet()) {
//			System.out.println(e.getKey() + "=" + e.getValue());
			e.getKey().show();
		}
		
		VT100.reset();
		VT100.cursorMove(21, 1);
		System.out.println("End");
	}

}
