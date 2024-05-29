import java.lang.Math;
class Task_28_May_2024 {
    public static void main(String[] arg) {
        // Area_Of_Circle;              // ------------->  Un-Comment This And The Below Function To Run This 
        //Greet();                     // ------------->  Un-Comment This And The Below Function To Run This 
        //Area_Of_Rectangle();        // ------------->  Un-Comment This And The Below Function To Run This 
        //Calculator();                // ------------->  Un-Comment This And The Below Function To Run This 
        Coordinates_Calculator();
    }

    // ---------------> Question -1 <-----------------


    // public static void Greet(){
    //     System.err.println("-----------------   Question N0 - 1    -----------------");
    //     System.err.println(" ---------  Greeting To The User  ---------"); 
    //     java.util.Scanner Data = new java.util.Scanner(System.in);
    //     System.out.println("Please Enter Your Name : ");
    //     String Name = Data.nextLine();
    //     System.out.println("Please Enter Your Age : ");
    //     int Age = Data.nextInt();
    //     System.out.println("Hello Mr/Mrs " + Name +", Nice To Meet You. I Can't Even Believe That You're Just " + Age + " Years Old.");
    // }


    // ---------------> Question -2 <-----------------


    // public static void Area_Of_Rectangle(){
    //     System.err.println("-----------------   Question N0 - 2    -----------------");
    //     System.err.println(" ---------  Area Of Rectangle  ---------"); 

    //     java.util.Scanner Length_Breadth = new java.util.Scanner(System.in);

    //     System.out.println("Please Enter The Length Of The Rectangle : ");

    //     int Length = Length_Breadth.nextInt();

    //     System.out.println("Please Enter The Breadth Of The Rectangle : ");
    //     int Breadth = Length_Breadth.nextInt();

    //     System.out.println("The Area Of The Rectangle Is " + (Length*Breadth));

    // }

    // ---------------> Question -3 <-----------------


    // public static void Area_Of_Circle() {
    //     System.err.println("-----------------   Question N0 - 1    -----------------");
    //     System.err.println(" ---------  Area Of Circle  ---------");
    //     Double Area;

    //     java.util.Scanner Number = new java.util.Scanner(System.in);
      
    //     System.out.println("Please Enter Any Number");
      
    //     Double Radius_Number = Number.nextDouble();
      
    //     System.out.println(Radius_Number);
        
        
      
    //     Area = ((22.0 / 7.0) * (Radius_Number * Radius_Number));
      
    //     System.out.println("You Entered  " + Radius_Number + ". So The Area Of The Circle Is  : " + Area);
    // }


    // ---------------> Question -4 <-----------------


    // public static void Calculator(){
    //     System.err.println("-----------------   Question N0 - 4    -----------------");
    //     System.err.println(" ---------  Calculator  ---------");
    //     java.util.Scanner Values = new java.util.Scanner(System.in);
    //     System.out.println("Please Enter Your First Number");
    //     int First_Number = Values.nextInt();
    //     System.out.println("Please Enter Your First Number");
    //     int Second_Number = Values.nextInt();
    //     System.out.println("Please Choose The Number According Your Operator   + => 1  , - => 2  , * => 3 ,  / => 4  ");
    //     int Operator = Values.nextInt();

    //     if( Operator == 1){
    //         System.out.println("You Have Choose Addition, So Addition Of Your 2 Numbers Is : " + (First_Number+Second_Number) );
    //     }
    //     if( Operator == 2){
    //         System.out.println("You Have Choose Subtraction, So Subtraction Of Your 2 Numbers Is : " + (First_Number-Second_Number) );
    //     }
    //     if( Operator == 3){
    //         System.out.println("You Have Choose Multiplication, So Multiplication Of Your 2 Numbers Is : " + (First_Number*Second_Number) );
    //     }
    //     if( Operator == 4){
    //         System.out.println("You Have Choose Division, So Division Of Your 2 Numbers Is : " + (First_Number/Second_Number) );
    //     }
    //     if(Operator != 1 && Operator != 2 && Operator != 3 && Operator != 4 ){
    //         System.out.println("You Have Choose The Wrong Number Please Choose Between (1 ,2 ,3 ,4) . Thank You.");
    //     }

    // }


    // ---------------> Question -5 <-----------------

    public static void Coordinates_Calculator(){
        System.err.println("-----------------   Question N0 - 5    -----------------");
        System.err.println(" ---------  Coordinates Calculator  ---------");

        java.util.Scanner Points = new java.util.Scanner(System.in);
        System.out.println("Please Enter Your First Coordinates  X1 : ");
        double Coordinate_X_One = Points.nextDouble();
        System.out.println("Please Enter Your Second Coordinates Y1 : ");
        double Coordinate_Y_One = Points.nextDouble();
        System.out.println("Please Enter Your Third Coordinates X2 : ");
        double Coordinate_X_Two = Points.nextDouble();
        System.out.println("Please Enter Your Fourth Coordinates Y2 : ");
        double Coordinate_Y_Two = Points.nextDouble();

        double Distance_Of_X_Coordinates = (Coordinate_X_Two - Coordinate_X_One) ;
        double Distance_Of_Y_Coordinates = (Coordinate_Y_Two - Coordinate_Y_One) ;
        
        double Final_Distance = (Math.sqrt(Math.pow(Distance_Of_X_Coordinates,2)+Math.pow(Distance_Of_Y_Coordinates,2)));
        System.out.println("The Distance Of Your Given Coordinates Are : " + Final_Distance);


    }
}