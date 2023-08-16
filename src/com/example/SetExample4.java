package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Random;

public class SetExample4 {
	
	static Random r = new Random();
	
	static class Alpha {
		int line;
		int column;
			
		public Alpha() {
				
			line = r.nextInt(1, 11);	// [1-10]
			column = r.nextInt(1, 11);	// [1-10]
				
		}
			
		public Alpha(int line, int column) {
				
			this.line = line;
			this.column = column;
				
		}
		
		@Override
		public int hashCode() {
			System.out.println("hashCode...." + Objects.hash(line, column));
			return Objects.hash(line, column);
		}
	}
	
	public static void main(String[] args) {
		
		var set = new HashSet<Alpha>();
		
		set.add(new Alpha(10, 5));
	}

}
