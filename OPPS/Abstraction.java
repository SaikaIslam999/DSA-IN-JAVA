public class Abstraction {
    public static void main(String args[]){
    // Horse h = new Horse();
    // h.eat();
    // h.walk();
    // System.out.println(h.color);

    // Chicken c = new Chicken();
    // c.eat();
    // c.walk();
    Mustang myHorse = new Mustang();
    }
}
abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor are called...");
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor are called....");
    }
    void changeColor(){
        color = "black";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called..");
    }
}
class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken constructor are called...");
    }
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walk on 2 legs");
    }
}
