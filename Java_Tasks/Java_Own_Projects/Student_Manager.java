public class Student_Manager {
    static int Physics,Chemistry,Mathematics,It ,Operation_Value;
    public void Main_Two(){
        java.util.Scanner Operation_Data = new java.util.Scanner(System.in);
        System.out.println("Please Choose Your Number According To The Operation :");
        System.out.println(" 1. Add Student");
        System.out.println(" 2. Add Subject Numbers");
        System.out.println(" 3. Calculate GPA");
        System.out.println(" 4. Update Grades");
        System.out.println(" 5. Generate Report");
        int Operation = Operation_Data.nextInt();
        this.Operation_Value = Operation;

        
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
        System.out.println("Please Enter Your E-mail :");
        String Student_Email = Student_Data.nextLine();
        System.out.println("Please Verify Your Details And Press Enter. Name = " + Student_Name + " , And Email = " + Student_Email);
        Add_Subject_Marks();

        
    }
    // The Add Student Subject Marks Method ( Where We Can Add Students Subject Marks)
    public void Add_Subject_Marks(){
        if ( Operation_Value == 2 || Operation_Value ==3 || Operation_Value ==3 || Operation_Value == 4 ||Operation_Value ==5){
            System.out.println("Error :} Hey You Missed The 1st Step , Please Complete 1st Step First :" );
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
        System.err.println("-----------------  Calculate GPA Section    -----------------");
        if(this.Physics > 0){
            int Total_Marks =(Physics + Chemistry + Mathematics + It);
            int Percentage = ((Total_Marks)/4);
            int Average = ((Total_Marks)/4);
            System.out.println(" -----  Hey, You Have Secured Total " + (Total_Marks) +" Marks .  -----");
            System.out.println(" -----  Hey, You Have Secured Percentage Of " + (Percentage) +"% .  -----");
            System.out.println(" -----  Hey, Your Average Mark Is " + (Average) +"  ----- ");

            if (Percentage >= 90){
                System.out.println(" -----  Hey Congratulations You Have Passed The Exam :) , And You Got  ' A ' Grade With " +(Total_Marks)/4 +"% .  ----- ");
            }
            else if(Percentage >= 70){
                System.out.println(" -----  Hey Congratulations You Have Passed The Exam :) , And You Got  ' B ' Grade With " +(Total_Marks)/4 +"% .  -----");

            }
            else if(Percentage >= 50){
                System.out.println(" -----  Hey Congratulations You Have Passed The Exam :) , And You Got  ' C ' Grade With " +(Total_Marks)/4 +"% .  -----");

            }
            else if(Percentage >= 30){
                System.out.println(" -----  Hey Congratulations You Have Passed The Exam :) , And You Got  ' D ' Grade With " +(Total_Marks)/4 +"% .  ----- ");

            }
            else if(Percentage < 30){
                System.out.println(" -----  Hey You Failed In Your Exam  :} , And You Only Get " +(Total_Marks)/4 +"% .  -----");

            }
           

        }

        else{
            System.out.println("Hey Please Enter Your Marks And Details First :) ");
        }
    }

    public  void Update_Grades(){
        
        System.err.println("-----------------  Update Grade Section    -----------------");

        if (Physics < 0){
            System.out.println("Hey Please Enter Your Marks And Details First :) ");
        }
        else{
            java.util.Scanner Update_Subject = new java.util.Scanner(System.in);
            System.out.println("Hey Please The Number That You Want To Update The Subject Marks ");
            System.out.println(" 1. Update Physics Marks :");
            System.out.println(" 2. Update Chemistry Marks :");
            System.out.println(" 3. Update Mathematics Marks :");
            System.out.println(" 4. Update It Marks :");
            System.out.println(" 5. Update All Subject Marks :");


            int Update_Subject_Value = Update_Subject.nextInt();

            if (Update_Subject_Value == 1){
                
                System.out.println(" So You Want To Update Physics Marks Which Is " + Physics + " Right Now .");
                System.out.println("Please Enter Your New  Marks For Physics : ");
                int New_Physics_Marks = Update_Subject.nextInt();
                if (New_Physics_Marks <= 100){
                System.out.println("Hey We Updated Your Marks Of Physics From  " +Physics + " To " + New_Physics_Marks + " :)");
                }
                else {
                    System.out.println("Error, Hey Please Enter Number Below Or Equal to 100 :} ");
                }

                
            }
            else if (Update_Subject_Value == 2){
                System.out.println(" So You Want To Update Chemistry Marks Which Is " + Chemistry + " Right Now .");
                System.out.println("Please Enter Your New  Marks For Chemistry : ");
                int New_Chemistry_Marks = Update_Subject.nextInt();
                if(New_Chemistry_Marks <= 100){
                System.out.println("Hey We Updated Your Marks Of Chemistry From  " +Chemistry + " To " + New_Chemistry_Marks + " :)");
                }
                else{
                    System.out.println("Error, Hey Please Enter Number Below Or Equal to 100 :} ");
                    

                }
                
            }
            else if (Update_Subject_Value == 3){
                System.out.println(" So You Want To Update Mathematics Marks Which Is " + Mathematics + " Right Now .");
                System.out.println("Please Enter Your New  Marks For Mathematics :) ");
                int New_Mathematics_Marks = Update_Subject.nextInt();
                if(New_Mathematics_Marks <= 100){
                System.out.println("Hey We Updated Your Marks Of Mathematics From  " +Mathematics + " To " + New_Mathematics_Marks + " :)");
                }
                else{
                    System.out.println("Error, Hey Please Enter Number Below Or Equal to 100 :} ");
                }
                
            }
            else if (Update_Subject_Value == 1){
                System.out.println(" So You Want To Update It Marks Which Is " + It + " Right Now .");
                System.out.println("Please Enter Your New  Marks For It : ");
                int New_It_Marks = Update_Subject.nextInt();
                if(New_It_Marks <= 100){
                System.out.println("Hey We Updated Your Marks Of It From  " +Physics + " To " + New_It_Marks + " :)");
                }


                else{
                    System.out.println("Error, Hey Please Enter Number Below Or Equal to 100 :} ");
                }

                
            }
            else if (Update_Subject_Value == 5){
                System.out.println(" So You Want To Update Your All The Marks :) ");
                System.out.println("Please Enter Your New  Marks For Physics : ");
                int All_New_Physics_Marks = Update_Subject.nextInt();
                if (All_New_Physics_Marks <= 100){
                System.out.println("Please Enter Your New  Marks For Chemistry : ");
                }
                else{
                    System.out.println("Error, Hey Please Enter Number Below Or Equal to 100 :} ");
                }
                int All_New_Chemistry_Marks = Update_Subject.nextInt();
                if(All_New_Chemistry_Marks <= 100){
                System.out.println("Please Enter Your New  Marks For Mathematics : ");
                }
                else{
                    System.out.println("Error, Hey Please Enter Number Below Or Equal to 100 :} ");
                }
                int All_New_Mathematics_Marks = Update_Subject.nextInt();
                if(All_New_Mathematics_Marks <= 100){
                System.out.println("Please Enter Your New  Marks For It : ");
                }
                else{
                    System.out.println("Error, Hey Please Enter Number Below Or Equal to 100 :} ");
                }
                int All_New_It_Marks = Update_Subject.nextInt();
                if(All_New_It_Marks <= 100){
                System.out.println("Hey We Updated Your Marks Successfully :)" );
                }
                else{
                    System.out.println("Error, Hey Please Enter Number Below Or Equal to 100 :} ");
                }

                System.err.println("-----------------  Your Updated Grades Are    -----------------");

                System.out.println(" -----  Hey, Your Updated Total Mark Is " + (All_New_Physics_Marks+All_New_Chemistry_Marks+All_New_Mathematics_Marks+All_New_It_Marks) +" Marks .  -----");
                System.out.println(" -----  Hey, Your Updated Percentage Is " + (All_New_Physics_Marks+All_New_Chemistry_Marks+All_New_Mathematics_Marks+All_New_It_Marks)/4 +"% .  -----");
                System.out.println(" -----  Hey, Your Updated Average Mark Is " + (All_New_Physics_Marks+All_New_Chemistry_Marks+All_New_Mathematics_Marks+All_New_It_Marks)/4 +" Marks .  -----");


                


            }

            
        }

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
