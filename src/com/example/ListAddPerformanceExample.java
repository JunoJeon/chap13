package com.example;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListAddPerformanceExample {

	public static void main(String[] args) {
		
		var list1 = new ArrayList<Integer>();
		var list2 = new LinkedList<Integer>();
		
		var ea = 300_000;
		
		/*
		 * ArrayList
		 */
		// 1. add
		var start = LocalTime.now();
		for (int i=0; i<ea; i++) {
			
			list1.add(0, i);
			
		} 
		var end = LocalTime.now();
		System.out.println("A add : " + Duration.between(start, end));
		
		// 2. get
		start = LocalTime.now();
		for (int i=0; i<ea; i++) {
			
			list1.get(i);
			
		} 
		end = LocalTime.now();
		System.out.println("A get : " + Duration.between(start, end));
		
		// 3. set
		start = LocalTime.now();
		for (int i=0; i<ea; i++) {
					
			list1.set(i, 0);
					
		} 
		end = LocalTime.now();
		System.out.println("A set : " + Duration.between(start, end));
		
		// 4. remove
		start = LocalTime.now();
		for (int i=0; i<ea; i++) {
			
			list1.remove(0);
					
		} 
		end = LocalTime.now();
		System.out.println("A remove : " + Duration.between(start, end));
		
		/*
		 * LinkedList
		 */
		
		// 1. add
		start = LocalTime.now();
		for (int i=0; i<ea; i++) {
			
			list2.add(0, i);
			
		}
		end = LocalTime.now();
		System.out.println("L add : " + Duration.between(start, end));
		
		// 2.get
		start = LocalTime.now();
		for (int i=0; i<ea; i++) {
			
			list2.get(i);
			
		}
		end = LocalTime.now();
		System.out.println("L get : " + Duration.between(start, end));
		
		// 3. set
		start = LocalTime.now();
		for (int i=0; i<ea; i++) {
			
			list2.set(i, 0);
			
		}
		end = LocalTime.now();
		System.out.println("L set : " + Duration.between(start, end));
		
		// 4. remove
		start = LocalTime.now();
		for (int i=0; i<ea; i++) {
					
			list2.remove(0);
					
		}
		end = LocalTime.now();
		System.out.println("L remove : " + Duration.between(start, end));

	}

}
