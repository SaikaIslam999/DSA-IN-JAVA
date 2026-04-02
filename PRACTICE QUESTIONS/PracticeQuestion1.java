// Question1:In a program,input 3 numbers:A,B and C.You have to output the average of these 3 numbers.
// (Hint : Average of N numbers is sum of those numbers divided by N)

import java.util.*;
class PracticeQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter A = ");
        int A = sc.nextInt();
        System.out.print("enter B = ");
        int B = sc.nextInt();
        System.out.print("enter C = ");
        int C = sc.nextInt();
        int Avg = (A + B + C) / 3;
        System.out.println("Average of 3 numbers: " + Avg);
    }
}


// Question2:In a program,input the side of a square.You have to output the area of the square.
// (Hint : area of a square is (side x side))

class PracticeQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter side = ");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("area of a square is: " + area);
    }
}

// Question3:Enter cost of 3items from the user (using float data type)-a pencil,apen and an eraser.
// You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

class PracticeQuestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter pencil = ");
        int pencil = sc.nextInt();
        System.out.print("enter pen = ");
        int pen = sc.nextInt();
        System.out.print("enter eraser = ");
        int eraser = sc.nextInt();
        int total = pencil + pen + eraser;
        float newTotal = total + (0.18f * total);
        System.out.println("total cost of the items: " + newTotal);
    }
}
