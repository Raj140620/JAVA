public class Task_24_May_2024 {
    public static void main(String[] args) {
        Swap_2_Numbers();
        Simple_Interest();
    }

    // Task -1 ------> Swap 2 Numbers In Java
    public static void Swap_2_Numbers(){
        int First_Number = 10, Second_Number = 20;
        System.err.println("-----------------   Question N0 - 1    -----------------");
         System.err.println(" ---------  Numbers Before Swap  ---------");
         System.err.println("The Value Of First_Number = " + First_Number);
         System.err.println("The Value Of Second_Number = " + Second_Number);


         // Storing Values In A Temperary Variable 
         int Temp_Value = First_Number;
         First_Number = Second_Number;
         Second_Number = Temp_Value;

         System.err.println(" ---------  Numbers After Swap  ---------");
         System.err.println("The Value Of First_Number = " + First_Number);
         System.err.println("The Value Of Second_Number = " + Second_Number);
         
    }

    // Task -5 ------> Calculate Simple Interest In Java
    public static void Simple_Interest(){
        float Principle_Money = 14000 , Time = 3 , Rate = 14;

        // Formula Of Simple Interest = (P x T x R)/100

        float S_I = (Principle_Money*Time*Rate)/100;
        System.err.println("-----------------   Question N0 - 5    -----------------");

        System.out.println("The Given Principal Money Is " + Principle_Money);
        System.out.println("The Given Time Period Is " + Time);
        System.out.println("The Given Rate Of Interest Is " + Rate);
        System.out.println("The Simple Interest Of The Above Given Numbers Is " + S_I);
    }
}
