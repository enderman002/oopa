package chap3;
public class Employee {
    static int id = 1001;
    String name = "Nalinee";
    int age = 35;
    
    static void work(){
        System.out.println("work()");
    }
    
    void gatSalary(){
        System.out.println("getSalary()");
    }
    
    public static void main(String[] args) {
        System.out.println("id : "+id);
        work();
        
         Employee a = new Employee();
         System.out.println("Age : "+a.age);
         a.gatSalary();
    }
}