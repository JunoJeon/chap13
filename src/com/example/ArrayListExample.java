package com.example;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		var list = new ArrayList<Integer>();
		
		
		// Create 
		list.add(10);
		list.add(20);
		
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(0, 30);
		System.out.println(list);
		
		// Retrieve 검색 // 없는걸 조회하면 죽어버림
		System.out.println(list.get(2));
		
		// Update
		list.add(1, 90);
		System.out.println(list);
		
		// Delete
		list.remove(1);
		System.out.println(list);
		list.remove(Integer.valueOf(20));
		System.out.println(list);
	}
	
	public static void main3(String[] args) {
		
		var list = new ArrayList<Integer>();
		
		for (int i=0; i<100; i++) {
			
			list.add((int)(Math.random()*50));
			
		}
		
		System.out.println(list);
	}

	public static void main2(String[] args) {
		
		int[] nums = {1, 2, 3, 4};
		int[] nums2 = new int[10];
		System.arraycopy(nums, 0, nums2, 0, nums.length);
		
		nums2[4] = 5;
		nums2[5] = 6;
		
		System.out.println("nums2 = " + nums2);
		System.out.println(Arrays.toString(nums2));
		
	}

}
