package com.example;

import java.util.HashSet;

import util.Alpha;
import util.VT100;

public class AlphaRectExample {

	public static void main(String[] args) {
		
		var set = new HashSet<Alpha>();
		
		int forCount = 0;
		for(;;) {
			forCount++;
			var alpha = new Alpha();
			set.add(alpha);
			
			if (set.size()==800)
				break;
			
		}
		
		VT100.clearScreen();
		
		var iter = set.iterator();
		while(iter.hasNext()) {
			var alpha = iter.next();
			alpha.show();
		}
		
		VT100.cursorMove(21, 1);
		VT100.reset();
		System.out.println("End		forCount = " + forCount );

	}

}
