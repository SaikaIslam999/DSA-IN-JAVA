public class Constructors {
   public static void main(String args[]){
     Student s1 = new Student();
     s1.name = "Saika";
     s1.roll = 12;
     s1.password = "abcdefgh";
     s1.marks[0] = 99 ;
     s1.marks[1] = 90 ;
     s1.marks[2] = 98 ;
     Student s2 = new Student(s1);
     s2.password = "123456";
     s1.marks[2] = 80;
     for(int i=0; i<3; i++){
        System.out.println(s2.marks[i]);
     }
     Student s3 = new Student("Saika");
     System.out.println(s3.name);
     Student s4 = new Student(12);
     System.out.println(s4.roll);
   } 
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];
    //  Shallow copy constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll =s1.roll;
    //     this.marks = s1.marks;
    
    // }

    // Deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll =s1.roll;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
    // Nonparameterized
    Student(){
        System.out.println("Constructors are called.....");  
        marks = new int[3]; 
    }
    // Parameterrized
    Student(String name){
        this.name = name;
        marks = new int[3];
    }
    Student(int roll){
        this.roll = roll;
        marks = new int[3];
    }
}
