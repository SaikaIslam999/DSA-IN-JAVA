import java.util.*;
public class ProductOfTwoNum {
    public static int calProduct(int a , int b){
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = calProduct(a, b);
        System.out.println(product);
    }
}