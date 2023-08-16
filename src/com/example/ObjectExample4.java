package com.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class ObjectExample4 {
	
	static class Alpha {
		
		int line;
		int column;
		
		public Alpha(int line, int column) {
			
			this.line = line;
			this.column = column;
			
		}
		
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Alpha) {
				Alpha target =  (Alpha)obj;
				return line == target.line && column==target.column;
			}
			return false;
		}
		
		public int hashCode() {
			return Objects.hash(line, column);
		}
		
		@Override
		public String toString() {
			return String.format("[%d, %d]", line, column);
		}
		
	}
	
	public static void main(String[] args) {
		var set = new HashSet<Alpha>();
		
		set.add(new Alpha(10, 5));
		set.add(new Alpha(10, 5));
		set.add(new Alpha(10, 5));
		set.add(new Alpha(10, 5));
		set.add(new Alpha(10, 5));
		
		System.out.println(set);
	}

	public static void main2(String[] args) {
		var a1 = new Alpha(10, 5);
		var a2 = new Alpha(10, 5);
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		
		var now1 = LocalDate.of(2023, 8, 16);
		var now2 = LocalDate.of(2023, 8, 16);
		System.out.println(now1 == now2);		// false
		
		
		System.out.println(a1);
		System.out.println(a2);
		
		var list = new ArrayList<Integer>();
		list.add(10);
		System.out.println(list);
		
		int[] nums = {1,2,3};
		System.out.println(nums);
	}

}
