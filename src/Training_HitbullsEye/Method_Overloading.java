package Training_HitbullsEye;

class MathUtils{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
}
public class Method_Overloading {
    public static void main(String[] args) {
        MathUtils a=new MathUtils();
        System.out.println(a.add(2,3));
        System.out.println(a.add(2,3,5));
        System.out.println(a.add(2.3,3.5));
    }
}
