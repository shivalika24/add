package com;
public class TryCatch {

	public static void main(String[] args) {
		System.out.println("hi");
		int a=10;
		int b=1;
		int abc[]= {10,20,30,40};
		try {
			int res=a/b;
			System.out.println("Res"+res);
			int res1=10/abc[5];
			System.out.println("Res1"+res1);
		}catch(Exception e) {
			//System.out.println("i take care");
			System.out.println(e.toString());     //it issue to display the num of the Exception
		}
		System.out.println("bye");
		System.out.println("bye");
		}

	}



