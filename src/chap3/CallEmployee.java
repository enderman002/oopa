package chap3;
public class CallEmployee {
    public static void main(String[] args) {
        System.out.println("Id : "+Employee.id);
        Employee.work();
        
        Employee a = new Employee();
        System.out.println("Age : "+a.age);
        a.gatSalary();
        
    }
    
}
