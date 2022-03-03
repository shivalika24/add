package abc;

	class PrivateAccesSpecifier {
		   private void display() 
		    { 
		        System.out.println("You are using private access specifier"); 
		    } 
		} 

		public class PrivateAccessSpecifiers {

			public static void main(String[] args) {
				
				System.out.println("Private Access Specifier");
				 PrivateAccesSpecifier   obj = new   PrivateAccesSpecifier  (); 
		      

			}
}
