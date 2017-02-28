import java.util.Scanner;

class Jam
{
  // Instance Variables
  String contents ;   // type of fruit in the jar
  String date  ;      // date of canning
  int capacity ;      // amount of jam in the jar


  // Constructors
  Jam( String contents, String date, int size )
  {
    this . contents = contents  ;
    this . date = date ;
    capacity = size;
  }

  // Methods
  public boolean empty ()
  {
    return ( capacity== 0 ) ;
  }

  public void print ()
  {
    System.out.println ( contents + "   " +  date + "   " +  capacity + " fl. oz." ) ;
  }

  public void spread ( int fluidOz)
  {
    if ( !empty() )
    {
      if ( fluidOz <= capacity )
      {
        System.out.println("Spreading " + fluidOz + " fluid ounces of "
            + contents );
        capacity = capacity - fluidOz ;
      }
      else
      {
        System.out.println("Spreading " + capacity + " fluid ounces of "
            + contents );
        capacity =  0 ;
      }
     }
     else
       System.out.println("No jam in the Jar!");
  }

}

class Pantry
{
  // Instance Variables
  private Jam  jar1 ;
  private Jam  jar2 ;
  private Jam  jar3 ;
  private Jam  selected ;

  // Constructors
  Pantry( Jam jar1, Jam jar2, Jam jar3 )
  {
    this . jar1 = jar1 ;
    this . jar2 = jar2 ;
    this . jar3 = jar3 ;
    selected = null ;
  }

  // Methods
  public void print()
  {
    System.out.print("1: "); jar1 . print() ;
    System.out.print("2: "); jar2 . print() ;
    System.out.print("3: "); jar3 . print() ;
  }

  // assume that the user entered a correct selection, 1, 2, or 3
  public void select( int jarNumber )
  {
    if ( jarNumber == 1 )
      selected =  jar1 ;

    else if ( jarNumber == 2 )
      selected = jar2 ;

    else 
      selected = jar3 ;
  }

  // spread the selected jam
  public void spread( int oz )
  {
    selected . spread( oz ) ;
  }
}

class PantryTester
{
  public static void main ( String[] args )
  {
    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 3 );

    Pantry hubbard = new Pantry( goose, apple, rhub );
    int selection = 0;
    while (selection != -1) {
    	askSelection(hubbard);
    	System.out.println("Are you finished?");
    	Scanner sc = new Scanner(System.in);
    	selection = sc.nextInt();
    }
  }
  
  public static void askSelection(Pantry pantry) {
	  pantry.print();
	  System.out.println("Which jam would you like to spread? (1, 2, 3)");
	  Scanner sc = new Scanner(System.in);
	  int input = sc.nextInt();
	  if (input > 3) {
		  System.out.println("Selection not available.");
	  } else {
		  pantry.select(input);
		  System.out.println("How much would you like to spread?");
		  int input2 = sc.nextInt();
		  pantry.spread(input2);
	  }
  }
}