import java.util.*;
public class Ifelse {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int age = sc.nextInt();
    //IF-ELSE STATEMENT
    if(number%2 == 0){
        System.out.println("EVEN");
    }else{
        System.out.println("ODD");
    }
    //ELSE-IF STATEMENT
    if(age>=18){
        System.out.println("is Adult : vote,drive,college");
    }
    else if(age >= 13 && age < 18){
        System.out.println("teenager");
    }
    else{
        System.out.println("Child");
    }
    // TERNARY OPERATOR
    int number2 = 4;
    String type = ((number2%2) == 0)?"EVEN":"ODD";
    System.out.println(type);
   // SWITCH STATEMENT
   
   } 
} 