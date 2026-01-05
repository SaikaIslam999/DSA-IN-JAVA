public class OPPS{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Pink");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());

        // Student s1 = new Student();
        // s1.calPercentage(98, 95, 99);
        // System.out.println(s1.percentage);
        // BankAccount myAcc = new BankAccount();
        // myAcc.username = "Saika Islam";
        // myAcc.setPassword("abcdefgh");

    }
}

// class BankAccount{
//    public String username;
//    private String password;
//    public void setPassword(String pwd) {
//     password = pwd;

//    }

// }

class Pen{
    private String color;
    private int tip;
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
       this.color = newColor;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }
}

// class Student{
//     String name;
//     int age;
//     float percentage;
//     void calPercentage(int phy,int chem,int math){
//         percentage = (phy + chem + math) / 3;
//     }
// }