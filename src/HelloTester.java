import java.util.Scanner;

class HelloObject
{
	
	private String HelloObject;
  // method definition
  void speak()
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your greeting?");
	String greeting = sc.nextLine();
	for (int i = 0; i < greeting.length(); i++) {
    	System.out.println(greeting + ", good morning!" + greeting + ", good evening!");
	}
	HelloObject = greeting + ", good morning!" + greeting + ", good evening!";
  }
}

class HelloTester
{
  public static void main ( String[] args )
  {
    HelloObject anObject = new HelloObject();
    
    anObject.speak();
  }
}
