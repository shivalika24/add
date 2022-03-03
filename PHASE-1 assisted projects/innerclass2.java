package com;
public class innerclass2 {

	 private String msg="Welcome to Java"; 
		 
		 class Inner{  
		  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
		 }  


		public static void main(String[] args) {

			innerclass2 obj=new innerclass2();
			innerclass2.Inner in=obj.new Inner();  
			in.hello();  
		}
	}

