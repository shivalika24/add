package com;
import java.util.ArrayList;

public class EmailId {

	public static void main(String[] args) {
		 ArrayList<String> emailID = new ArrayList<String>();
		 emailID.add("martha@gmail.com");
		 emailID.add("anil@gmail.com");
		 emailID.add("Lavvi@gmail.com");
		 emailID.add("abhi108@gmail.com");
		 emailID.add("sunny25@gmail.com");
		// String searcElement = "anil@gmail.com";
		 String searcElement = "sunny25@gmail.com";
		  for(int i=0; i<emailID.size(); i++) {
		       System.out.println(emailID.get(i));
		       if(searcElement==emailID.get(i)) {
		    	   System.out.println("\n");
		    	   System.out.println("email Id "+ searcElement+"found");
		    	   break;
		       }
		                    
	   }
	}
}