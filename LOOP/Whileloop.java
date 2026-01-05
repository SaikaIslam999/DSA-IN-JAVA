import java.util.*;
public class Whileloop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = sc.nextInt();
        int number = 1;
        int sum = 0;
        while(number<=n){
           sum = sum + number;
           number++;
        }
        System.out.println(sum);
    }
}