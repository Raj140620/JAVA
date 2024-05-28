public class Java_Inputs {
    public static void main(String[]arg ){

        // java.util.Scanner Numb = new java.util.Scanner(System.in);
        // System.out.println("Please Enter Your Age : ");
        // int Number = Numb.nextInt();
        
        // if(Number >= 18){
        //     System.out.println("You Are " + Number + " Years Old. And You Can Eligible To Vote.");
        // }
        // else{
        //     System.out.println("You Are Below 18 Years. That's Why You Can't Vote.");
        // }
    
    
    // Basic Login Logic
    
    java.util.Scanner Auth = new java.util.Scanner(System.in);
    System.out.println("Please Enter Your Name : ");
    
    String User = Auth.nextLine();
    System.out.println("Please Enter Your Password : ");
    String Password = Auth.nextLine();
     
    
    if(User.equals("admin") && Password.equals("Admin")){
        System.out.println("Welcome Back " + User);
    }
    else{
        System.out.println("Sorry, " + User + " I Can't Recognize You , Please Check Your User Name And Password.");
    }
     }
    }
