public class RecursionBasics {
    public static void printDnc(int n){
     if(n==10){
        System.out.print(10 +" ");
        return;
     }
     printDnc(n+1);
     System.out.print(n +" ");
    }
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;

    }
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        int sn1 = sum(n-1);
        int sn2 = n + sn1;
        return sn2;
    }
    public static int fib(int n){
        if(n==0 || n == 1){
            return n;
        }
    int fnm1 = fib(n-1);
    int fnm2 = fib(n-2);
    int fn = fnm1 + fnm2;
    return fn;
    }
    public static boolean isSorted(int arr[],int i){
        if (i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1); 
    }
    public static int firstOccurence(int arr[] , int key ,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr,key,i+1);
    }
    public static int lastOccurence(int arr[] , int key ,int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        // int xnm1 = power(x,n-1);
        // int xn = x * xnm1;
        // return xn;
        return x * power(x,n-1);
    }
    public static int optimisedPower(int a , int n){
        if(n == 0){
            return 1;
        }
        int halfpower = optimisedPower(a, n/2);
        int halfpowersq = halfpower * halfpower;
        // n is odd
        if(n % 2 != 0){
            halfpowersq = a * halfpowersq;
        }
        return halfpowersq;
    }
    public static int tilingProblem(int n){
        // base case
        if(n==0 || n==1){
            return 1;
        }
        //kaam
        // vertical choice
        int fnm1 = tilingProblem(n - 1);

        // Horizontal choice
        int fnm2 = tilingProblem(n - 2);

        int totWays = fnm1 + fnm2;
        return totWays;
    }
    public static void removeDuplicates(String str, int idx, StringBuilder newStr , boolean map[]){
        if(idx == str.length()){
         System.out.println(newStr);
         return ;
        }
         char currChar = str.charAt(idx);
         if(map[currChar-'a'] == true){
             removeDuplicates(str, idx+1, newStr, map);
         }else{
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar),map);
         } 
    }
    public static int friendsPairing(int n){
        // Base case
        if(n==1||n==2){
            return n;
        }
       // kaam
       // single
        int fnm1 = friendsPairing(n-1);
        // pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;
        // total ways
        int totWays = fnm1 + pairWays;
        return totWays;
    //    return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }
    public static void printBinStr(int n,int lastplace,String str){
     // base case
     if(n==0){
        System.out.println(str);
        return;
     }
     printBinStr(n-1 , 0,str+"0");
     if(lastplace == 0){
        printBinStr(n-1,1,str+"1");
     }
    }
public static void main(String[] args) {
printBinStr(3,0,"");
   }
}