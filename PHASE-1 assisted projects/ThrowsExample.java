package com;

public class ThrowsExample {
	static void dis1() throws Exception {
		//try {
		int a=10/0;
		//}catch(Exception e){}
		System.out.println("this is dis1 method");
	}
	static void dis2() throws Exception {
		//try {
		dis1();
		//}catch(Exception e){}
		System.out.println("this is dis2 method");
	}
	public static void main(String[] args) {
		try {
			dis2();
		}catch(Exception e) {}
		System.out.println("this is main method");
		}
	}


