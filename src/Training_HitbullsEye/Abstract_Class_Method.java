package Training_HitbullsEye;

abstract class Animal{
    abstract void makeSound();

    void eat(){
        System.out.println("This Animal eats Food");
    }
}
class Dog extends Animal{
    //implementing the abstract Method
    void makeSound(){
        System.out.println("Dog Barks");
    }
}
public class Abstract_Class_Method {
    public static void main(String[] args) {
        Animal myDog=new Dog(); //Upcasting
        myDog.makeSound(); //Dog Barks
        myDog.eat(); //This Animal Eats Food
    }
}
