// Types Of Operators in JAVA 
public  class Operators{
    public static void main(String[]args){
        Arithmetic_Operators();
        Comparison_Operators();
        Logical_Operators();
    }
// 1. Arithmetic Operators In Java --------> (+,-,*,/,%)
public static void Arithmetic_Operators(){
    int a = 20;
    int b = 10;

    System.out.println("The Addition Of a and b is : " + (a+b));         //1. Addition
    System.out.println("The Subtraction Of a and b is : " + (a-b));     // 2. Subtraction
    System.out.println("The Multiplication Of a and b is : " + (a*b)); //  3. Multiplication
    System.out.println("The Division Of a and b is : " + (a/b));      //   4. Division
    System.out.println("The Modulo Of a and b is : " + (a%b));       //    5. Modulo
}

//  2. Assignment Operators In Java --------> (++,--,*=,/=,%=)
// public static void Assignment_Operators(){
//     int c = 30;
//     int d = 20;
//     System.out.println("The Modulo Of a and b is : " + (c));
    

// }

// 3. Comparison Operators In Java --------> (==,!=,>,<,<=,>=)
    public static void Comparison_Operators(){
        int First_Number , Second_Number;
        First_Number = 40;
        Second_Number = 50; 
        // Equal To  Equal To (==)
        if( First_Number == Second_Number){
            System.out.println("Both The Numbers Are Equal");
        }
        else{
            System.out.println("Both The Numbers Are Not Equal");
        }
    } 


// 4. Logical Operators In Java --------> (&&,||,!)
 public static void Logical_Operators(){
    int Math,Science,Biology,History,Pass_Mark,Total;
    Math = 95;
    Science = 87;
    Biology = 12;
    History = 30;
    Pass_Mark = 120;
    Total = Math+Science+Biology+History;

    if(Total>=Pass_Mark && Math>=30 && Science>=30 && Biology>=30 && History>=30){
       
        System.out.println("Your Passed Your Exam With "+ (Total) +" Marks. And You Don't Need To Give Re-Test.");
    }
    else{
        System.out.println("Your Are Failed In This Exam With "+ (Total) +" Marks. And You'r Failed In One Exam That You Have To Give The Re-Test.");

    }

    if (Math >= 30 || Science >=30 || Biology >= 30 || History >=30){
       
        System.out.println("You Are Failed In The Exam.");
    }
    else{
        System.out.println("You Are Passed In The Exam."); 
    }


 }

}