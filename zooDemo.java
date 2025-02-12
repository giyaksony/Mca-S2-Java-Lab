class Zoo{
    String name;
String[] enclo;
public Zoo(String name,String[] enclo){
    this.name=name;
    this.enclo=enclo;
}
public void displayZoo(){
    System.out.println(name);
    for(String x:enclo)
        System.out.println(x);
}
class Enclosure{
    String name;
    String type;
    String[] animals;
    public Enclosure(String name,String type,String[] animals){
        this.name=name;
        this.type=type;
        this.animals=animals;
    }
    public void displayEnclosure(){
        System.out.println(name+" "+type);
        for(String x:animals)
          System.out.println(x);
    }
}
static class zooInfo{
    String addr;
    String phno;
    public zooInfo(String a,String p){
        addr=a;
        phno=p;
    }
    public void displayInfo(){
        System.out.println(addr+" "+phno);
    }
}
}
public class zooDemo{
    public static void main(String[] args){
        String enco[]={"Area-1","Area-2","Area-3"};
        String an[]={"Zebra","Giraffe"};
        Zoo z=new Zoo("TVm Zoo",enco);
        Zoo.Enclosure en=z.new Enclosure("grassland","outdoor",an);
        Zoo.zooInfo info=new Zoo.zooInfo("ABC Lsnr","347573");
        

        z.displayZoo();
        en.displayEnclosure();
        info.displayInfo();
    }
}


// Output
// TVm Zoo
// Area-1
// Area-2
// Area-3
// grassland outdoor
// Zebra
// Giraffe
// ABC Lsnr 347573