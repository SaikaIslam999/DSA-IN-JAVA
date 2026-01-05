public class GetIthbit {

    public static int getIthbit(int n , int i){
        int bitMark = 1<<i;
        if((n & bitMark) == 0){
          return 0;
        }else{
            return 1;
        }
    }
    public static void main(String args[]){
     System.out.print(getIthbit(9 , 3));
    }
}