package Training_HitbullsEye;

class Animals{
    void sound(){
        System.out.println("Animal Makes a sound");
    }
}
class Dogs extends Animals{
    void sound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animals {
    void sound(){
        System.out.println("Cat Meaws");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        Animals a;
        a=new Dogs();
        a.sound();

        a=new Cat();
        a.sound();
    }
}
