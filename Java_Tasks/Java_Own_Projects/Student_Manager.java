public class Student_Manager {
    public static void main(String[] args) {
        Test1();
        Test3();
    }

    public static void  Test1(){
        System.out.println("Hello 1");
    }
    public static void Test2(){
        System.out.println("Hello 2 But From Test3");
        
    }
    public static void Test3(){
        Test2();
    }
    
}
