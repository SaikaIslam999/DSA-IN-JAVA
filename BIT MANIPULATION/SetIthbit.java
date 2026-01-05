public class SetIthbit {
    public static int SetIthBit(int n , int i){
        int bitMark = 1<<i;
        return n|bitMark;
    }
  public static void main(String args[]){
      System.out.println(SetIthBit(20, 2));
  }
}
