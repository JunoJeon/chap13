package com.example;

import java.util.ArrayList;

public class ObjectExample2 {
	
	static class Alpha {
		
		int line;
		int column;
		
		public Alpha(int line, int column) {
			
			this.line = line;
			this.column = column;
			
		}
		
		@Override
		public String toString() {
			return String.format("[%d, %d]", line, column);
		}
		
	}
	

	public static void main(String[] args) {
		var a = new Alpha(10, 5);
		var a2 = new Alpha(20, 10);
		System.out.println(a.toString());
		System.out.println(a2.toString());
		System.out.println(a);
		System.out.println(a2);
		
		var list = new ArrayList<Integer>();
		list.add(10);
		System.out.println(list);
		
		int[] nums = {1,2,3};
		System.out.println(nums);
	}

}
