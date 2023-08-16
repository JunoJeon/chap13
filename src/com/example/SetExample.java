package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class SetExample {

	public static void main(String[] args) {
		var r =  new Random();
		
		for (;;) {
			int num = r.nextInt(1, 11);
			System.out.println(num);
		}
	}
	
	public static void main2(String[] args) {
		
		var list = new ArrayList<Integer>();
		var set = new HashSet<Integer>();
		
		System.out.println(list.add(1));
		System.out.println(list.add(1));
		System.out.println(list.add(1));
		System.out.println(list.add(1));
		
		System.out.println(set.add(1));		
		System.out.println(set.add(1));
		System.out.println(set.add(1));
		System.out.println(set.add(1));
		
		
		System.out.println(list);
		System.out.println(set);
		
	}

}
