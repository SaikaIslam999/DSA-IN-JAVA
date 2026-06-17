import java.util.LinkedList;
class Main {
    public static void main(String[] args) {
       LinkedList<Integer> ll = new LinkedList<>();
       ll.addLast(1);
       ll.addLast(2);
       ll.addFirst(0);
       System.out.println(ll);
       ll.removeFirst();
       ll.removeLast();
       System.out.println(ll);
    }
}
