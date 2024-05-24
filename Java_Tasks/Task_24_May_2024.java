public class Task_24_May_2024 {
    public static void main(String[] args) {
        Swap_2_Numbers();
    }

    // Task -1 ------> Swap 2 Numbers In Java
    public static void Swap_2_Numbers(){
        int First_Number = 10, Second_Number = 20;
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
}
