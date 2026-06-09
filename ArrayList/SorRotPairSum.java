import java.util.*;
class Main {
    // Brute Force Aproaach --> TC --> O(n^2)
    // public static boolean printSum(ArrayList<Integer> list, int target){
    //     for(int i=0; i<list.size(); i++){
    //         for(int j=i+1; j<list.size(); j++){
    //             if(list.get(i) + list.get(j) == target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    
    //Two Point Aproach --> TC --> O(n)
    public static boolean printSum(ArrayList<Integer> list, int target){
        int bp = -1;
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;
        int n = list.size();
        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            if(list.get(lp) + list.get(rp) < target){
                lp = (lp + 1) % n;
            }else{
                rp = (n + rp -1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(printSum(list, target));
    }
}
