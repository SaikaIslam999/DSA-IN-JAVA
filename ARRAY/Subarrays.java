public class Subarrays {
    public static void printSubarray(int numbers[]){
        int totSum = 0;
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(numbers[k]+ " ");
                }
                totSum++;
                System.out.println();
            }
            
            System.out.println();
        }
        System.out.println("total sum : " + totSum);
    }
    public static void main(String args[]){
      int numbers[] = {2 , 4 , 6 , 8 , 10};
      printSubarray(numbers);
    }
}
