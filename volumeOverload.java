class Volume
{

public double vol(double r)

{
return r*r*r;
}

public double vol(double l, double b,double h){
return l*b*h;
}

public double vol(double r,String color)
{
return (4.0/3.0) * Math.PI * r * r * r;

}
public double vol (double r,double h)
{
return Math.PI*r*r*h;
} 
public double vol(double r, double h,String color)
{
return (1.0/3.0) * Math.PI * r * r * h;

}

}
public class volumeOverload{
public static void main(String[] args)
{
Volume v =new Volume();
double vol1=v.vol(4.6);
System.out.println("Volume of Cube:" +vol1);
double vol2=v.vol (5.0,6.5,3.6);
System.out.println("Volume of Cuboid:" +vol2);
double vol3=v.vol(3.5,"sphere");
System.out.println("Volume of Sphere:" +vol3);
double vol4=v.vol(3.0,4.1);
System.out.println("Volume of Cylinder:" +vol4);
double vol5=v.vol (4.0,4.1,"cone");
System.out.println("Volume of Cone:" +vol5);


}

}

// Output
// Volume of Cube:97.33599999999997
// Volume of Cuboid:117.0
// Volume of Sphere:179.5943800302165
// Volume of Cylinder:115.92476891746335
// Volume of Cone:68.6961593584968