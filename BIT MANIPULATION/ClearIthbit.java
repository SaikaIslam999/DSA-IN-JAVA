public class ClearIthbit {
    public static int clearIthBit(int n , int i){
        int bitMark = ~(i<<1);
        return n & bitMark;
    }
    public static void main(String args[]){
          System.out.println(clearIthBit(10 , 1));
    }
}
