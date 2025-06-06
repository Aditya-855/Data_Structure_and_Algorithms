package Training_HitbullsEye;
interface Print{
    void print();
}
interface Show{
    void show();
}
class  Document implements Print,Show{
    public void print(){
        System.out.println("Printing Document");
    }
    public void show(){
        System.out.println("Showing the Document");
    }
}
public class Interface_class {
    public static void main(String[] args) {
        Document doc=new Document();
        doc.print();
        doc.show();

    }
}
