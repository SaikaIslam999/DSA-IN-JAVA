public class UpdateIthBit {
    public static int clearIthBit(int n , int i){
        int bitMark = ~(i<<1);
        return n & bitMark;
    }
    public static int updateIthBit(int n, int i, int newBit){
        n = clearIthBit(n, i);
        int Bitmark = newBit<<i;
        return n | Bitmark;
    }
    public static int clearIBits(int n, int i){
        int bitMark = ~(0)<<i;
        return n & bitMark;
    }
    public static int clearBitsInRange(int n , int i , int j){
       int a = ((~0)<<(j+1));
       int b = (1<<i)-1;
       int bitMark = a | b;
       return n & bitMark;
    }
    public static boolean powerOfTwo(int n){
        return (n & (n-1)) == 0;
    }
    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){
                count++;
            }
                n = n>>1;
        }
        return count;
    }
    public static int fastExpo(int a , int n){
        int ans = 1;
        while(n > 0){
            if((n & 1) != 0){
                ans = ans * a;
            }
              a = a * a;
              n = n>>1;
        }
        return ans;
    }
    public static void main(String args[]){
            System.out.println(fastExpo(3, 5));
        }
}
