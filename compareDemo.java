import java.util.*;
interface Comparable{
    public double volume();
    public int compareByVolume(Comparable other);
}

class Cuboid implements Comparable{
    double length,width,height;
    public Cuboid(double l,double w,double h){
        length=l;
        width=w;
        height=h;
    }
    public double volume(){
        return length*width*height;
    }
    public int compareByVolume(Comparable other){
        if(volume()<other.volume())
        return -1;
        else if(volume()>other.volume())
        return 1;
        else
        return 0;
    }
    @Override
    public String toString(){
        return "Cuboid("+length+","+width+","+height+")";
    }
}

class Cylinder implements Comparable{
    double radius,height;
    public Cylinder(double r,double h){
        radius=r;
        height=h;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
    public int compareByVolume(Comparable other){
        if(volume()<other.volume())
        return -1;
        else if(volume()>other.volume())
        return 1;
        else
        return 0;
    }
    @Override
    public String toString(){
        return "Cylinder("+radius+","+height+")";
    }
}

public class compareDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length:");
        double l=sc.nextDouble();
        System.out.println("Enter the width:");
        double w=sc.nextDouble();
        System.out.println("Enter the height:");
        double h=sc.nextDouble();
        System.out.println("Enter the radius:");
        double r=sc.nextDouble();
        Cuboid cu=new Cuboid(l,w,h);
        Cylinder cy=new Cylinder(r,h);
        int result=cu.compareByVolume(cy);
        if(result<0)
            System.out.println("Volume of "+cu+ "is smaller than "+cy);
        else if(result>0)
            System.out.println("Volume of "+cu+ "is greater than "+cy);
        else
            System.out.println("Volume of "+cu+" and "+cy+"are same.");
        
    }
}


// Output
// Enter the length:
// 1
// Enter the width:
// 3
// Enter the height:
// 4
// Enter the radius:
// 2
// Volume of Cuboid(1.0,3.0,4.0)is smaller than Cylinder(2.0,4.0)