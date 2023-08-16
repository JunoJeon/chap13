package com.example;

public class ObjectExample {
	
	static class A {
		
	}
	
	static class B extends A {
		
	}

	public static void main(String[] args) {
		Object o = new Object();
		A a = new A();		// Object 직접적으로 상속
		a.hashCode();
		System.out.println(a.toString());
		
		B b = new B();		// Object 간접적으로 상속
		b.hashCode();
		System.out.println(b.toString());
	}

}
