import java.util.Scanner;
public class Multiplication{
    public void multiple(int n){
        for(int i=1;i<=10;i++){
            System.out.print(n+"*"+i+"=" +n*i+"\n");
        }
    
    }


public static void main(String[] a){
    Scanner sc=new Scanner(System.in);
    Multiplication mp=new Multiplication();
    System.out.print("Enter the number:");
    int n=sc.nextInt();
    mp.multiple(n);
    sc.close();
}
}

// Output
// Enter the number:3
// 3*1=3
// 3*2=6
// 3*3=9
// 3*4=12
// 3*5=15
// 3*6=18
// 3*7=21
// 3*8=24
// 3*9=27
// 3*10=30