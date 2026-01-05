public class QuestionPractice {
    public static int Search(int arr[],int tar,int si,int ei){
        //base case
        if(si > ei){
            return -1;
        }
        //kaam
       int mid = si + (ei-si)/2;

       //case Found
       if(arr[mid] == tar){
        return mid;
       }

       // mid on L1

       if(arr[si] <= arr[mid]){
        // case a: left

        if(arr[si] <= tar && tar <= arr[mid]){
          return Search(arr,tar,si,mid-1);  
        }else{
            //case b: right
            return Search(arr, tar, mid+1, ei);
        }

    }
       // mid on L2
       else{
        //case C: right
        if(arr[mid] <= tar && tar <= arr[ei]){
            return Search(arr, tar, mid+1, ei);
        }else{
            //case d: left
            return Search(arr, tar, si, mid-1);
        }

       }
    }
    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        int target = 2; //output index-> 4
        int tarIdx = Search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}
