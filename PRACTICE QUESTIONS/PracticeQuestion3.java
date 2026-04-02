//Question1:Write a Java program to get a number from the user and print whether it 
// ispositive or negative.

import java.util.*;
public class PracticeQuestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num = ");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("num is greater than 0");
        }else{
            System.out.println("num is less than and equal 0");
        }
    }
}

//Question2:Finish the following code so that it prints You have a fever if your 
// temperature is above 100 and otherwise prints You don't have a fever.

 class PracticeQuestion4{
    public static void main(String[] args) {
        double temp = 103.5;
        if(temp > 100){
            System.out.println("You have a fever");
        }else{
            System.out.println("You don't have a fever");
        }
    }
}

//Question3:Write a Java program to input week number (1-7) and print day of week name using 
// switch case.

class Week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Week = ");
        int week = sc.nextInt();
        System.out.print("enter  = ");
        switch(week){
            case 1: System.out.println("Sunday");
                      break;
            case 2: System.out.println("Monday");
                      break;
            case 3: System.out.println("Tuesday");
                      break;
            case 4: System.out.println("Wednesday");
                      break;
            case 5: System.out.println("Thusday");
                      break;
            case 6: System.out.println("Friday");
                      break;
            case 7: System.out.println("Saturday");
                      break;
            default: System.out.println("Invalid input! Please enter week number between 1-7");
        }
        
    }
}

// Question 4 :What will be the value of x & y in the following program:

class PracticeQuestion5{
    public static void main(String[] args) {
        int a = 63, b = 36;
        boolean x = (a < b) ? true : false;
        System.out.println(x);
        int y = (a > b) ? a : b;
        System.out.println(y);
    }
}
//Question5:Write a Java program that takes a year from the user and print whether that 
// year is a leap year or not.

class PracticeQuestion6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter year = ");
        int year = sc.nextInt();
        if(year % 4 == 0 || year % 100 == 0 || year % 400 == 0){
            System.out.println("year is a leap year");
        }else{
            System.out.println("year is not a leap year");
        }
    }
}
