import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        
        int arrayMax = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > arrayMax){
                arrayMax = list.get(i);
            }
        }
        System.out.println("max element "+ arrayMax);
    }
}
