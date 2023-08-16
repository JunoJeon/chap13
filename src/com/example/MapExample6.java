package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import util.Alpha;
import util.VT100;

public class MapExample6 {
	
	static class AlphaStat extends Alpha {
		
		void printPosition() {
			VT100.reset();
			System.out.printf("[%02d, %02d]", line, column);
		}
		
		void printChar() {
			VT100.setForeground(fg);
			VT100.setBackground(bg);
			VT100.print(ch);
			VT100.reset();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		var map = new HashMap<AlphaStat, List<AlphaStat>>();
		
		
		
		for(;;) {
			
			var alpha =  new AlphaStat();
			if(map.containsKey(alpha)) {
				var list = map.get(alpha);
				list.add(alpha);
				map.put(alpha, list);
			} else
				map.put(alpha, new ArrayList<AlphaStat>());
			
			
			if (map.size()==800)
				break;
		}
		
		VT100.clearScreen();
		
		map.forEach((k, v) -> {
			
			k.printPosition();
			v.forEach(alpha -> {
				alpha.printChar();
			});
			
			System.out.println();
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		VT100.reset();
		System.out.println("End");
	}

}
