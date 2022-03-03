package abc;
public class Constructors { 
	int id;
String name;
 void Bikes()     //creating default constructor.
{
  System.out.println(id +""+name);
}

public static void main(String[] args) {
 Constructors s1 =new  Constructors(); 
 Constructors s2=new  Constructors();
	s1.Bikes();          //calling default constructor.
	s2.Bikes();
}
}
