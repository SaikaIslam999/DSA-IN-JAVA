import java.util.*;
public class Calculator
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a :");
    int a = sc.nextInt();
    System.out.print("enter b : ");
    int b = sc.nextInt();
    System.out.print("enter operator : ");
    char operator = sc.next().charAt(0);
    switch(operator){
     case '+' : System.out.println(a+b);
                break;
     case '-' : System.out.println(a-b);
                break;
     case '*' : System.out.println(a*b);
                break;
     case '/' : System.out.println(a/b);
                break;
     case '%' : System.out.println(a%b);
                break;
     default : System.out.println("Wrong operator");
    }
  }
}
