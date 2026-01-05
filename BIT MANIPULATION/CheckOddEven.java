public class CheckOddEven {
    public static void oddOrEven(int n){
        int bitMark = 1;
        if((n & bitMark) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
    public static void main(String args[]){
        oddOrEven(3);
        oddOrEven(13);
        oddOrEven(14);
        oddOrEven(22);
    }
}
