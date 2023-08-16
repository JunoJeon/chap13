package com.example;

import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import util.Alpha;
import util.VT100;

public class MapExample4 {

	public static void main(String[] args) {
		var map = new HashMap<Alpha, List<Alpha>>();
		
		
		
		for(;;) {
			
			var alpha =  new Alpha();
			if(map.containsKey(alpha)) {
				var list = map.get(alpha);
				list.add(alpha);
				map.put(alpha, list);
			} else
				map.put(alpha, new ArrayList<Alpha>());
			
			
			if (map.size()==800)
				break;
		}
		
//		VT100.clearScreen();
		
		for (var e : map.entrySet()) {
			System.out.println(e.getKey() + "=" + e.getValue());
//			e.getKey().show();
		}
		
//		VT100.reset();
//		VT100.cursorMove(21, 1);
		System.out.println("End");
	}

}
