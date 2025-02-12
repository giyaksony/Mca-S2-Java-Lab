class Animal{
    private String species;
    int age;
    float weight;
    protected String color;
    
    public Animal(String s,int a,float w,String c){
        species=s;
        age=a;
        weight=w;
        color=c;
    }

    public String getSpecies() {
        return species;
    }
    
    public void displayAnimal(){
    System.out.println(age+" years & " + weight+" kg "+getSpecies()+" in "+color+" color.");
    }

    }

class Dog extends Animal{
    private String name;
    private String owner;
    public Dog(String species,int age,float weight,String color,String name,String owner){
        super(species,age,weight,color);
        this.name=name;
        this.owner=owner;
    }
    public void displayDog(){
        super.displayAnimal();
        System.out.println(name+" owned by " + owner+".");
        }
}
public class AnimalDemo{
    public static void main(String[] args){
        Dog d=new Dog("Mammal",8,6.2f,"black","Kukku","Giya");
        d.displayDog();
    }
}

// Output
// 8 years & 6.2 kg Mammal in black color.
// Kukku owned by Giya.