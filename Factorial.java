import java.util.Scanner;
public class Factorial{
    public static int factor(int n){
        if(n==1){
        return 1;
        }
        else{
        return n*factor(n-1);
        }
    }


public static void main(String[] a){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number:");
    int n=sc.nextInt();
    System.out.println("The factorial of" +n+"is:"+factor(n));
    sc.close();
}
}


// Output
// Enter the number:5
// The factorial of5is:120