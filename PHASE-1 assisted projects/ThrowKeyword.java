package com;
class MyException extends Exception {
	public MyException() {
}
	public MyException(String msg) {
		super(msg);  // calling super class is exception class parameterized constructor to set of the message
	}
}
public class ThrowKeyword {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		try {
			if(a>b) {
				//throw new Exception();   // pre-defined super class exception generate
				//throw new Exception("a>b"); // pre -defined super class exception with customer message
                //throw new ArithmeticException();  //pre-defined exception generated with custom condition			
                //throw new ArithmeticException("a>b");  
				//throw new MyException();  //custom exception generated with custom condition
				throw new MyException("a>b");  //custom exception with custom message
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
}

}
