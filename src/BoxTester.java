class Box {
	double length;
	double width;
	double height;
	
	Box(double l, double w, double h) {
		length = l;
		width = w;
		height = h;
	}
	
	public double length() {
		return length;
	}
	
	public double width() {
		return width;
	}
	
	public double height() {
		return height;
	}
	
	private double faceArea() {
		return width * height;
	}
	
	private double topArea() {
		return width * length;
	}
	
	private double sideArea() {
		return height * length;
	}
	
	public double volume() {
		return (length * width * height);
	}
	
	public double area() {
		return (faceArea() * 2) + (topArea() * 2) + (sideArea() * 2);
	}
	
	public Box biggerBox( Box oldBox )
	{

	  return new Box( 1.25*oldBox.width(), 1.25*oldBox.length(),1.25*oldBox.height());
	}
	
	public Box smallerBox( Box oldBox )
	{

	  return new Box( 0.75*oldBox.width(), 0.75*oldBox.length(), 0.75*oldBox.height());
	}
	
	public boolean nests( Box outsideBox ) {
		if (this.height() < outsideBox.height() && this.width() < outsideBox.width() && this.length() < outsideBox.length()) {
			return true;
		}
		return false;
	}
}

class BoxTester
{

  public static void main ( String[] args )
  {
     Box box = new  Box( 2.5, 5.0, 6.0) ;

     System.out.println( "Area: "  + box.area() + " volume: " + box. volume() );

     System.out.println( "length: " + box.length + " height: " + box. height +
                         "width:  " + box.width )  ;
  

  }
}