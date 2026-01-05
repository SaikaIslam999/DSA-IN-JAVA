public class MaxSubbarraySum {
    public static void maxSubarraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        // using prefix sum for finding max numbers
        int prefix[] = new int[numbers.length];
         prefix[0] = numbers[0];
         for(int i = 1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
         }
        for(int i=0; i<numbers.length; i++){
           int start = i;
           for(int j=i; j<numbers.length; j++){
            int end = j;
            currSum = start == 0?prefix[end]: prefix[end] - prefix[start-1];
            // using brute forcess for finding max numbers
            // for(int k=start; k<=end; k++){
            //     currSum += numbers[k];
            // }
            // System.out.println(currSum);
            if (maxSum < currSum) {
                maxSum = currSum;
              }
            }
        }
        System.out.println("max sum : " + maxSum);
    }
    // using kadane's algorithm 
    public static void kadane(int numbers[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("our max subarray is : " + ms);
    }

    public static void main(String args[]){
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadane(numbers);
    }
}
