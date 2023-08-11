package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Vector;

public class ListRandomExample {
	
	public static void main(String[] args) {
		
//		var list = new ArrayList<Integer>();
//		var list = new Vector<Integer>();
		var list = new LinkedList<Integer>();
		Random r = new Random();
		int forCount = 0;
		
		for(;;) {
			forCount++;
			int number = r.nextInt(1, 101);
			if (!list.contains(number))
				list.add(0, number);
			
			if (list.size()==100)
				break;
		}
		
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println("forCount = " + forCount);
		
	}

	public static void main2(String[] args) {
		
		var list = new ArrayList<Integer>();
		
		
		Random r = new Random();
		
		for (int i=0; i<100; i++) {
			list.add(r.nextInt(1, 100+1));
		}
		
		System.out.println(list);
		System.out.println(list.size());
		
		
		boolean isFull = true;
		for (int n=1; n<=100; n++) {
			if (!list.contains(n)) {
				isFull = false;
			}
		}
		
		if (isFull) {
//			break;
			
		}
		
	}

}
