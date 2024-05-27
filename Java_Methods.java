public class Java_Methods{

    static String hello(){
        //return(14);           // ------> I Have To Specify The Int Data Type Of Method TO store My Integers .
        return("Hello World"); // ------> I Have To Specify The String Data Type Of Method TO store My Strings .    
     }

     static void Raj(){      //  -------> We Use Void To Store Multiple Data Types
        int Number = 23;
        String Word = "Raj Kumar";
        System.out.println(Number);
        System.out.println(Word);
    }
    public static void main(String arg[]){
         // Learning Basics Of Java Methods (Also Known As Functions)
          String a = hello();
          System.out.println(a);
          Raj();
         
    }
}