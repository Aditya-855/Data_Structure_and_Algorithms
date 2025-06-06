package Training_HitbullsEye;
class Aditya{
    public void adi(int a,int b){
        System.out.println(a+b);
    }
}
class Panwar extends Aditya{
    public void display(){
        System.out.println("Aditya Panwar");
    }
}
public class Inhertance {
    public static void main(String[] args) {
        Panwar p1=new Panwar();
        p1.adi(8,6);
        p1.display();
    }
}
