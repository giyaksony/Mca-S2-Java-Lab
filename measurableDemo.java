import java.util.*;
interface Measurable {
    public double area();
    public double perimeter();
}
class Rectangle implements Measurable{
    double length,width;
    public Rectangle(double l,double w){
        length=l;
        width=w;
    }
    public double area(){
        return length*width;
    }
    public double perimeter(){
        return 2*(length+width);
    }
}

class Circle implements Measurable{
    double radius;
    public Circle(double r){
        radius=r;
       
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}

class measurableDemo{
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         while(true){
            System.out.println("Menu:");
            System.out.println("1.Rectangle");
            System.out.println("2.Circle");
            System.out.println("3.Exit");
            System.out.println("enter your choice:");
            int ch=sc.nextInt();
            switch(ch){
                case 1: System.out.println("Enter the length:");
                        double l= sc.nextDouble();
                        System.out.println("Enter the width:");
                        double w= sc.nextDouble();
                        Rectangle r=new Rectangle(l,w);
                        System.out.println("Area of Rectangle("+l+" "+w+") is: "+r.area());
                        System.out.println("Perimeter of Rectangle("+l+" "+w+") is: "+r.perimeter());
                        break;
                case 2: System.out.println("Enter the radius:");
                        double ra= sc.nextDouble();
                        Circle c=new Circle(ra);
                        System.out.println("Area of Circle("+ra+") is: "+c.area());
                        System.out.println("Perimeter of Circle("+ra+") is: "+c.perimeter());
                        break;
                case 3:System.out.println("Exiting...");
                       sc.close();
                       System.exit(0);
                default:System.out.println("Wrong choice");
            }

         }
         
    }
}


// Output
// Menu:
// 1.Rectangle
// 2.Circle
// 3.Exit
// enter your choice:
// 1
// Enter the length:
// 2
// Enter the width:
// 4
// Area of Rectangle(2.0 4.0) is: 8.0
// Perimeter of Rectangle(2.0 4.0) is: 12.0
// Menu:
// 1.Rectangle
// 2.Circle
// 3.Exit
// enter your choice:
// 2
// Enter the radius:
// 3
// Area of Circle(3.0) is: 28.274333882308138
// Perimeter of Circle(3.0) is: 18.84955592153876
// Menu:
// 1.Rectangle
// 2.Circle
// 3.Exit
// enter your choice:
// 3
// Exiting...