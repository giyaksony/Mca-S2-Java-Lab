import java.util.*;
interface Printable{
    public void display();
    public void show();
}

interface Computable{
    public double area();
    public double perimeter();
    public double volume();
}

interface Drawable{
    public void draw();
}

class Rectangle implements Printable,Computable,Drawable{
    double length,width;
    public Rectangle(double l,double w){
        length=l;
        width=w;
    }
    @Override
    public void display(){
        System.out.println("Rectangle("+length+","+width+")");
    }
    public void show(){}
    public double area(){
        return length*width;
    }
    public double perimeter(){
        return 2*(length+width);
    }
    public double volume(){
        return -1;
    }
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}

class Sphere implements Printable,Computable,Drawable{
    double radius;
    public Sphere(double ra){
        radius=ra;
    }
    @Override
    public void display(){
        System.out.println("Sphere("+radius+")");
    }
    public void show(){}
    public double area(){
        return 4*Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double volume(){
        return (4.0/3.0) * Math.PI * radius * radius * radius;

    }
    public void draw(){
        System.out.println("Drawing Sphere");
    }
}

class rectspDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Menu:");
            System.out.println("1.Rectangle");
            System.out.println("2.Sphere");
            System.out.println("3.Exit");
            System.out.println("enter your choice:");
            int ch=sc.nextInt();
            switch(ch){
                case 1: System.out.println("Enter the length:");
                        double l= sc.nextDouble();
                        System.out.println("Enter the width:");
                        double w= sc.nextDouble();
                        Rectangle r=new Rectangle(l,w);
                        r.display();
                        r.show();
                        System.out.println("Area of Rectangle("+l+" "+w+") is: "+r.area());
                        System.out.println("Perimeter of Rectangle("+l+" "+w+") is: "+r.perimeter());
                        System.out.println("Volume of Rectangle("+l+" "+w+") is: "+r.volume());
                        r.draw();
                        break;
                case 2: System.out.println("Enter the radius:");
                        double ra= sc.nextDouble();
                        Sphere s=new Sphere(ra);
                        s.display();
                        s.show();
                        System.out.println("Area of Sphere("+ra+") is: "+s.area());
                        System.out.println("Perimeter of Sphere("+ra+") is: "+s.perimeter());
                        System.out.println("Volume of Sphere("+ra+") is: "+s.volume());
                        s.draw();
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
// 2.Sphere
// 3.Exit
// enter your choice:
// 1
// Enter the length:
// 2
// Enter the width:
// 4
// Rectangle(2.0,4.0)
// Area of Rectangle(2.0 4.0) is: 8.0
// Perimeter of Rectangle(2.0 4.0) is: 12.0
// Volume of Rectangle(2.0 4.0) is: -1.0
// Drawing Rectangle
// Menu:
// 1.Rectangle
// 2.Sphere
// 3.Exit
// enter your choice:
// 2
// Enter the radius:
// 3
// Sphere(3.0)
// Area of Sphere(3.0) is: 113.09733552923255
// Perimeter of Sphere(3.0) is: 18.84955592153876
// Volume of Sphere(3.0) is: 113.09733552923255
// Drawing Sphere
// Menu:
// 1.Rectangle
// 2.Sphere
// 3.Exit
// enter your choice:
// 3
// Exiting...