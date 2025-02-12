import java.util.*;

class Student{
    int rollno;
    String name;
    int mark1;
    int mark2;
    static int count=0;

public Student(Scanner sc){
   // Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Roll no:");
    rollno=sc.nextInt();
    System.out.print("Enter the Name:");
    name=sc.next();
    System.out.print("Enter the Mark1:");
    mark1=sc.nextInt();
    System.out.print("Enter the Mark2:");
    mark2=sc.nextInt();
    count++;
}

public Student(int r,String na,int m1, int m2){
    rollno=r;
    name=na;
    mark1=m1;
    mark2=m2;
    count++;
}

public Student(Student other){
    this.rollno=other.rollno;
    this.name=other.name;
    this.mark1=other.mark1;
    this.mark2=other.mark2;
    count++;
}



public int marks(){
    return mark1+mark2;
}


public void display(){
    System.out.println("Rank :(i)Roll no:"+rollno+" Name:"+name+" Mark:" +marks());
}
}

public class stuDemo{
    public static void sort(Student s[],int n){
       
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(s[i].marks()<s[j].marks()){
                    Student temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        Student s[]=new Student[n];
        
        for(int i=0;i<n;i++)
           s[i]=new Student(sc);
        sort(s,n);
        for( int i=0;i<n;i++)
          s[i].display();
       sc.close();  
    }


    }


//     Output
//     Enter the number of students: 2
// Enter the Roll no:1
// Enter the Name:giya
// Enter the Mark1:10
// Enter the Mark2:20
// Enter the Roll no:2
// Enter the Name:gayu
// Enter the Mark1:30
// Enter the Mark2:50
// Rank :(i)Roll no:2 Name:gayu Mark:80
// Rank :(i)Roll no:1 Name:giya Mark:30