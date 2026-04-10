//Question 1 :Write a Java method to compute the averageof three numbers.
import java.util.*;
public class PracticeQuestion5 {
    public static double calc_Sum(double a, double b, double c){
        double avg = (a + b + c) / 3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double a = sc.nextInt();
        System.out.print("Input the 2nd number: ");
        double b = sc.nextInt();
        System.out.print("Input the 3rd number: ");
        double c = sc.nextInt();
        System.out.println(calc_Sum(a, b, c));
    }
}

//Question2:Write a method named isEven that accepts an int argument.
// The method should return true if the argument iseven,or false otherwise.
// Also write a program to test your method

class Even {
    public static boolean isEven(int n){
        if(n%2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter you input num: ");
        int n = sc.nextInt();
        isEven(n);
        if(isEven(n)){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}

//Question3:Write a Java program to check if a number is a palindrome in Java?
// (121 is a palindrome, 321 is not)A number is called a palindrome if the number is equal
// to the reverse of a numbere.g.,121 is a palindrome because the reverse of 121 is 121
// itself.On the otherhand,321 is not a palindrome because the reverse of 321 is 123, 
// which is not equal to 321.
class Palindrome{
    public static boolean is_Palindrome(int number){
        int palindrome = number;
        int reverse = 0;
        while(number != 0){
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        if(reverse == palindrome){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int palindrome = sc.nextInt();
        if(is_Palindrome(palindrome)){
            System.out.println("Number : "+palindrome+" is a palindrome");
        }else{
            System.out.println("Number : "+palindrome+" is not a palindrome");
        }
    }
}
