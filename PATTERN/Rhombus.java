public class Rhombus
{
   public static void rhombus(int n){
    //   int n = 5;
       for(int i = 1; i <= n; i++){
           for(int j = 1; j <= (n-i); j++){
               System.out.print(" ");
           }
           for(int j = 1; j <= n; j++){
               System.out.print("*");
           }
           System.out.println();
       }
   }
	public static void main(String[] args) {
		rhombus(5);
	}
}
