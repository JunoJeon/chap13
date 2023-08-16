package com.example;

import java.util.HashSet;
import java.util.function.Consumer;

import util.Alpha;
import util.VT100;

public class AlphaRectExample3 {

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
		
		set.forEach(new Consumer<Alpha>() {

			@Override
			public void accept(Alpha alpha) {
				alpha.show();
			}
			
		});
		
		VT100.cursorMove(21, 1);
		VT100.reset();
		System.out.println("End		forCount = " + forCount );

	}

}
