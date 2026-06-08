import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list.size());
        list.get(0);
        list.set(3, 10);
        list.remove(3);
        System.out.println(list.contains(4));
        System.out.println(list.size());
        
        // print the arraylist
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
        
        //reverse loop
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
    }
}
