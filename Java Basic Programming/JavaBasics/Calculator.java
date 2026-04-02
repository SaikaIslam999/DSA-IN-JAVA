import java.util.*;
class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter A = ");
        int A = sc.nextInt();
        System.out.print("enter B = ");
        int B = sc.nextInt();
        System.out.print("enter Operator = ");
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+': System.out.println("sum = "+ (A+B));
                      break;
            case '-': System.out.println("sub = "+ (A-B));
                      break;
            case '*': System.out.println("mul = "+ (A*B));
                      break;
            case '/': System.out.println("div = "+ (A/B));
                      break;
            case '%': System.out.println("modulo = "+ (A%B));
                      break;
            default: System.out.println("Sumthing went wrong");
        }
        
    }
}