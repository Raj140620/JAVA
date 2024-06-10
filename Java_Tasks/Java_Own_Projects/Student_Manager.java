public class Student_Manager {
    static int Physics,Chemistry,Mathematics,It;
    static String Length_Of_Name;
    public void Main_Two(){
        java.util.Scanner Operation_Data = new java.util.Scanner(System.in);
        System.out.println("Please Choose Your Number According To The Operation :");
        System.out.println(" 1. Add Student");
        System.out.println(" 2. Add Subject Numbers");
        System.out.println(" 3. Calculate GPA");
        System.out.println(" 4. Update Grades");
        System.out.println(" 5. Generate Report");
        int Operation = Operation_Data.nextInt();
        
        if(Operation == 1){
            Add_Student();
        }
        else if (Operation == 2){
            Add_Subject_Marks();
        }
        else if (Operation == 3){
            Calculate_GPA();
        }
        
        else if (Operation == 4){
            Update_Grades();
        }
        else if (Operation == 5){
            Generate_Report();
        }
        else{
            System.out.println("Error, Hey Please Choose A Valid Number :");
            Main_Two();
        }
    }

    // The Add Student Method ( Where We Can Add Students Details)
    public void Add_Student(){
        java.util.Scanner Student_Data = new java.util.Scanner(System.in);
        System.err.println("-----------------   Step - 1 Add Student Section   -----------------");
        System.out.println("Please Enter Your Name :");
        String Student_Name = Student_Data.nextLine();
        this.Length_Of_Name = Student_Name;
        System.out.println("Please Enter Your E-mail :");
        String Student_Email = Student_Data.nextLine();
        System.out.println("Please Verify Your Details And Press Enter. Name = " + Student_Name + " , And Email = " + Student_Email);
        Add_Subject_Marks();

        
    }
    // The Add Student Subject Marks Method ( Where We Can Add Students Subject Marks)
    public void Add_Subject_Marks(){

        int Length = Length_Of_Name.length();
        if (Length < 0){
            System.out.println("Error :} Hey You Missed The 1st Step , Please Complete 1st Step First :" );
            Add_Student();
        }
        else{
            java.util.Scanner Subject_Number = new java.util.Scanner(System.in);
            System.err.println("-----------------   Step - 2 Add Subject Numbers Section  -----------------");
    
            System.out.println("Please Enter Your Physics Numbers Out Of 100:");
            int Physics_Numbers = Subject_Number.nextInt();
            this.Physics = Physics_Numbers;
            System.out.println("Please Enter Your Chemistry Numbers Out Of 100 :");
            int Chemistry_Numbers = Subject_Number.nextInt();
            this.Chemistry = Chemistry_Numbers;
            System.out.println("Please Enter Your Mathematics Numbers Out Of 100 :");
            int Mathematics_Numbers = Subject_Number.nextInt();
            this.Mathematics = Mathematics_Numbers;
            System.out.println("Please Enter Your IT Numbers Out Of 100 :");
            int It_Numbers = Subject_Number.nextInt();
            this.It = It_Numbers;
    
        // Checking If The Numbers Entered Is Below 100 Or Not (If Part)
            if(Physics_Numbers <= 100 && Chemistry_Numbers <= 100 && Mathematics_Numbers <= 100 && It_Numbers <= 100 ){
                System.out.println("Please Entered Values Are. Physics = " + Physics_Numbers + ", Chemistry = " +Chemistry_Numbers + ", Mathematics = " + Mathematics_Numbers + ", IT = " +It_Numbers);
    
            System.err.println("-----------------   Registered Successfully :)  -----------------");
    
            Main_Two();
    
    
        // Checking If The Numbers Entered Is Below 100 Or Not (Else Part)
            }
            else{
                System.out.println("Error, Hey Please Enter Number Below Or Equal to 100 :");
                Add_Subject_Marks();
            }
        }
       
        
    }

    public void Calculate_GPA(){
        System.err.println("-----------------  Update Grade Section    -----------------");
        System.out.println("Your Total  Marks Is "+(this.Physics+this.Chemistry+this.Mathematics+this.It));
    }

    public  void Update_Grades(){
        
        System.err.println("-----------------  Update Grade Section    -----------------");

        System.out.println("This Is From Update Grades");
    }

    public void Generate_Report(){
        System.err.println("-----------------  Generate Report Section    -----------------");

        System.out.println("This Is From Generate Report");


        
  

    }



    public static void main(String[] args) {


        Student_Manager Start = new Student_Manager();
        Start.Main_Two();
     }
    
}
