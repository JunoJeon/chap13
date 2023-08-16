package com.example;

import java.util.ArrayList;
import java.util.Objects;

public class ObjectExample3 {
	
	static class Alpha {
		
		int line;
		int column;
		
		public Alpha(int line, int column) {
			
			this.line = line;
			this.column = column;
			
		}
		
		public int hashCode() {
			return Objects.hash(line, column);
		}
		
	}
	

	public static void main(String[] args) {
		var a1 = new Alpha(10, 5);
		var a2 = new Alpha(10, 5);
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a1);
		System.out.println(a2);
		
		var list = new ArrayList<Integer>();
		list.add(10);
		System.out.println(list);
		
		int[] nums = {1,2,3};
		System.out.println(nums);
	}

}
