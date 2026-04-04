//Question 1 :How many times 'Hello' is printed?

// public class PracticeQuestion4{
//     public static void main(String[] args){
//         for(int i=0; i<5; i++) {
//             System.out.println("Hello");
//             i+=2;
//         }
//     }
// }

 //Question2:Write a program that reads a set of integers,and then prints the 
 // sum of the even and odd integers.

import java.util.Scanner;
class Solution{
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do{
            System.out.print("Enter the number: ");
            number = sc.nextInt();
            if(number % 2 ==0) {
                evenSum += number;
            }else{
                oddSum += number;
            }
            System.out.print("Do you want to continue? Press 1 for yes or 0 for no: ");
            choice = sc.nextInt();
        }while(choice==1);
        System.out.println("Sum of even numbers: "+evenSum);
        System.out.println("Sum of odd numbers: "+oddSum);
    }
}

 //Question 3 :Write a program to find the factorial of any number entered by the user.
 // (Hint:factorial of a numbern = n*(n-1)*(n-2)*(n-3)*......*1 and exists for positive numbers 
 // only. We write factorial as n!So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.
 // Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same)

 class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i; 
        }
        System.out.println(fact);
    } 
}

// Question4:Write a program to print the multiplication table of a number N,entered by the user.

class MultiplicationTable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n : ");
        int num = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num+"*"+i+' '+"=" +' ' + num*i);
        }
    } 
}

// Question 5 :What is wrong in the following program
 class Solve {
    public static void main(String[] args) {             
        for(int i=0; i<=5; i++ ) {
            System.out.println("i = "+i);
        }
        //System.out.println("i after the loop = "+ i );    --->  Scope of variable is referred to the part of the program where the variable can be used
    }
}



