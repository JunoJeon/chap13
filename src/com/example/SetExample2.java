package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Random;

public class SetExample2 {
	
	static Random r = new Random();
	
	static class A /*extends Object*/{
		
		void xxx() {
			this.hashCode();
			this.getClass();
			this.notify();
		}
	}
	
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
	}
	
	public static void main(String[] args) {
		
		var a = new A();
		
		var a1 = new Alpha(10, 5);
		var a2 = new Alpha(10, 5);
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
	}
	
	public static void main3(String[] args) {
		Integer n1 = 100;
		Integer n2 = 100;
		
		System.out.println(n1.hashCode());
		System.out.println(n2.hashCode());
		
		int h1 = Objects.hash(10, "Hello", 10.5);
		int h2 = Objects.hash(10, "Hello", 10.5);
		
		System.out.println(h1);
		System.out.println(h2);
	}

	public static void main2(String[] args) {
		
		var s = new HashSet<Alpha>();
		
		var a1 = new Alpha(10, 5);
		var a2 = new Alpha(10, 5);
		
		s.add(a1);
		s.add(a2);
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(new String("Hello").hashCode());
		System.out.println(new String("Hello").hashCode());
		
		System.out.println(s.size());
	}

}
