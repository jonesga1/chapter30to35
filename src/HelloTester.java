class HelloObject
{
  // method definition
  void speak(String greeting)
  {
	for (int i = 0; i < greeting.length(); i++) {
    	System.out.println(greeting + ", good morning!");
    	System.out.println(greeting + ", good evening!");
	}
  }
}

class HelloTester
{
  public static void main ( String[] args )
  {
    HelloObject anObject = new HelloObject();
    
    anObject.speak("Hello");
  }
}
