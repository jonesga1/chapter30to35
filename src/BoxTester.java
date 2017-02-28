class Box {
	double length;
	double width;
	double height;
	
	Box(double l, double w, double h) {
		length = l;
		width = w;
		height = h;
	}
	
	public double volume() {
		return (length * width * height);
	}
	
	public double area() {
		return (length * width * 2) + (width * height * 2) + (height * length * 2);
	}
}

class BoxTester
{

  public static void main ( String[] args )
  {
     Box box = new  Box( 2.5, 5.0, 6.0 ) ;

     System.out.println( "Area: "  + box.area() + " volume: " + box. volume() );

     System.out.println( "length: " + box.length + " height: " + box. height +
                         "width:  " + box.width )  ;

  }
}