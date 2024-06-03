class Calculator{
    public static void main(String[] args) {
        Calculator();
    }
    public static void Calculator(){
        java.util.Scanner Values = new java.util.Scanner(System.in);
        System.out.println("Please Enter Your First Number : ");
        short First_Number = Values.nextShort();
        System.out.println("Please Enter Your Second Number : ");
        short Second_Number = Values.nextShort();
        System.out.println("Please Enter Your Operator According To This Series + => 1 , - => 2 , * => 3 , / => 4 , % => 5 ");
        int Operator = Values.nextInt();
        
        if( Operator == 1){
        System.out.println("You Have Choose  + Operator So The Addition Of This Two Number Is " +(First_Number + Second_Number));
        }
         if( Operator == 2){
        System.out.println("You Have Choose  - Operator So The Subtraction Of This Two Number Is " +(First_Number - Second_Number));
        }
        if( Operator == 3){
        System.out.println("You Have Choose  * Operator So The Multiplication Of This Two Number Is " +(First_Number * Second_Number));
        }
        if( Operator == 4){
        System.out.println("You Have Choose  / Operator So The Division Of This Two Number Is " +(First_Number / Second_Number));
        }
        if( Operator == 5){
        System.out.println("You Have Choose  % Operator So The Modulo Of This Two Number Is " +(First_Number % Second_Number));
        }
        if(Operator != 1 && Operator != 2 && Operator != 3 && Operator != 4 && Operator != 5){
        System.out.println("You Have Choose The Wrong Number Please Choose Between This Numbers (1,2,3,4,5) To Select Your Operator. Thank You :) ");

        }

    }
}