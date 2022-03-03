package com;

public class FinallyBlock {

	public static void main(String[] args) {
		try {
			int a=10/0;
			System.out.println("no exception");
		}catch(Exception e) {
			System.out.println("catch block");
		}finally {
			System.out.println("finally block");
		}
		System.out.println("normal satatement");
	}
}
    