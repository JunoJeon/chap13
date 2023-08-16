package com.example;

import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import util.Alpha;
import util.VT100;

public class MapExample5 {

	public static void main(String[] args) throws InterruptedException {
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
		
		VT100.clearScreen();
		
		for (var e : map.entrySet()) {
			var key = e.getKey();
			key.show();
			var value = e.getValue();
			if (value.size() > 0)
				value.get(value.size()-1).show(1, 42);
			else
				key.show(1, 42);
			
			Thread.sleep(100);
		}
		
		VT100.reset();
		VT100.cursorMove(21, 1);
		System.out.println("End");
	}

}
