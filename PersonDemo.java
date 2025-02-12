import java.util.*;
class Person{
    String name;
    String gender;
    String addr;
    int age;
    public Person(String name,String gender,String addr,int age){
        this.name=name;
        this.gender=gender;
        this.addr=addr;
        this.age=age;
    }
    public void displayPerson(){
        System.out.println("Name:"+name+"Gender:"+gender+"Address:"+addr+"Age:"+age);

    }
    }
class Employee extends Person{
    int empid;
    String emp_name;
    String quali;
    int salary;
    public Employee(String name,String gender,String addr,int age,int empid,String emp_name,String quali,int salary){
        super(name,gender,addr,age);
        this.empid=empid;
        this.emp_name=emp_name;
        this.quali=quali;
        this.salary=salary;
    }
     public void displayEmployee(){
        super.displayPerson();
        System.out.println("Employee id:"+empid+" Employee Name:"+emp_name+" Qualification:"+quali+ " Salary:"+salary);
     }  
    }
class Teacher extends Employee{
    int teacherid;
    String sub;
    String dept;
    public Teacher(String name,String gender,String addr,int age,int empid,String emp_name,String quali,int salary,int teacherid,String sub,String dept){
        super(name,gender,addr,age,empid,emp_name,quali,salary);
        this.teacherid=teacherid;
        this.sub=sub;
        this.dept=dept;
    }
    public void displayteacher(){
        super.displayEmployee();
        System.out.println("Teacher id:"+teacherid+" Subject:"+sub+" Department:"+dept);
        }
    }
public class PersonDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of teachers:");
        int n=sc.nextInt();
        sc.nextLine();

        Teacher[] teachers=new Teacher[n];

        for(int i=0;i<=n;i++){
        System.out.println("\nEnter details for Teacher " + (i + 1) + ":");
        System.out.println("Enter the empname");
        String name=sc.nextLine();

        System.out.println("Enter the Gender");
        String gender=sc.nextLine();

        System.out.println("Enter the Address");
        String addr=sc.nextLine();

        System.out.println("Enter the age");
        int age=sc.nextInt();
        sc.nextLine();

        
    }
}
}