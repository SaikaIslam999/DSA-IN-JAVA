public class Superkeyword {
    public static void main(String args[]){
    Horse h = new Horse();
    System.out.println(h.color);
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("constructor are called..");
    }
}
class Horse extends Animal{
    Horse(){
        super.color = "brown";
        System.out.println("constructor are called");
    }
}
