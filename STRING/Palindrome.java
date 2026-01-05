public class Palindrome {
    public static boolean palindromePrint(String str){
       for(int i=0; i<str.length()/2; i++){
         int n = str.length();
         if(str.charAt(i) != str.charAt(n-1-i)){
            return false;
         }
       }
       return true;
    }

    public static void main(String arg[]){
        String str = "saika";
        System.out.println(palindromePrint(str));
    }
}
