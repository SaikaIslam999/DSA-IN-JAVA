import java.util.*;
public class Strings{
    // CHARAT() USING
    public static void printLetter(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        String str1 = new String("xyz");
        String str2 = "abcd";
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        System.out.println(name1.length());
        
        // CONCATNATION PRINT
        
        String name = "Saika";
        String sername = "Islam";
        String fullname = name + " " + sername;
        printLetter(fullname);
        System.out.println(fullname);   

        // SUBSTRING PRINT
       System.out.println(fullname.substring(0,5)); 
    } 
}