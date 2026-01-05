import java.util.Arrays;
public class Anagram{
    public static void main(String[]args) {
        String str1="earth";
        String str2="heart";
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        // First check - if the lengths are the same
        if(str1.length() ==str2.length())  {
            // convert strings into 
            char[]str1charArray=str1.toCharArray();
            char[]str2charArray=str2.toCharArray();
            // sort the char array
           Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);// if the sorted char arrays are sameor identical then the strings areanagram
            boolean result=Arrays.equals(str1charArray,str2charArray);
            if(result) {System.out.println(str1+" and "+str2+" are anagrams of eachother.");
        }else
        {System.out.println(str1+" and "+str2+" are not anagrams ofeach other.");
    }
}else{// case when lengths are not equal
    System.out.println(str1+" and "+str2+" are not anagrams of eachother.");
           }
      }
}