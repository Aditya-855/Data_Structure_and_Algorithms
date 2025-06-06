package Training_HitbullsEye;

class Student{
    //Attributes
    String name;
    int marks;

    //Constructor to initialize name and marks
    public Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }

    //Method to Calculate the & return Grade
    public String getGrade(){
        if(marks>=90){
            return "A";
        } else if (marks>=75) {
            return "B";
        } else if (marks>=60) {
            return "C";
        } else if (marks>=40) {
            return "D";
        }else {
            return "F";
        }
    }
    //Method to Display Student Info
    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
        System.out.println("Grade: "+getGrade());
    }
}
public class StudentMain {
    public static void main(String[] args) {
        //creating Object of the Student
        Student s1=new Student("Aditya",97);
        //Calling method to display student info
        s1.displayInfo();
    }
}
