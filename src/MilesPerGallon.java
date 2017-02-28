
import java.util.Scanner ;

class MilesPerGallon
{
  public static void main( String[] args ) 
  {
    Scanner scan = new Scanner(System.in);

    double startMiles, endMiles, gallons;

    System.out.print("Enter first reading: " ); 
    startMiles = scan.nextDouble();

    System.out.print("Enter second reading: " ); 
    endMiles = scan.nextDouble();

    System.out.print("Enter gallons: " ); 
    gallons  = scan.nextDouble();

    Car car  = new Car( startMiles, endMiles, gallons );

    System.out.println( "Miles per gallon is "  + car.calculateMPG() );
    
    if (car.gasHog == true) {
    	System.out.println("This car is a gas hog!");
    } else if (car.economyCar == true) {
    	System.out.println("This car is an economy car!");
    }
    
  }
  
}

class Car
{
  // instance variables
  double startMiles;   // Stating odometer reading
  double endMiles;     // Ending odometer reading
  double gallons;      // Gallons of gas used between the readings
  boolean gasHog;
  boolean economyCar;

  // constructor
  Car(  double first, double last, double gals  )
  {
    startMiles = first ;
    endMiles   = last ;
    gallons    = gals ;
    gasHog = false; 
    economyCar = false;
    if (this.calculateMPG() > 30.0) {
    	gasHog = true;
    } else if (this.calculateMPG() < 15.0) {
    	economyCar = true;
    }
  }

  // methods
  double calculateMPG()
  {
    return  (endMiles - startMiles)/gallons;   
  }

}
