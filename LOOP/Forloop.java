import java.util.*;

public class Forloop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //FIND PRIME NUMBERS

        System.out.print("enter n : ");
        int n = sc.nextInt();
        if(n==2){
            System.out.println("n is prime");
        }else{
            boolean isPrime = true;
            for(int i=2; i<Math.sqrt(n); i++){
                if(n%i==0){
                    isPrime = false;   // n is the multiple of i(i is not equal to 1 & n)
                }
            }
            if(isPrime == true){
                System.out.println("n is prime number");
            }else{
                System.out.println("n is not a prime number");
            }
        }
        
        //int sum = 0;
        //for(int i=0; i<=n; i++){
           // sum = sum + i;
      //  }
       // System.out.println(sum);
        // for(int i = 1; i<=10; i++){
        //     System.out.println(n*i);
        // }
    }
}
