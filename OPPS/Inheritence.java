public class Inheritence {
    public static void main(String args[]){
    Mammal cow = new Mammal();
    cow.eat();
    Bird sparrow = new Bird();
    sparrow.color = "yellow";
    System.out.println(sparrow.color);
    Fish shark = new Fish();
    shark.breadth();
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breadth(){
        System.out.println("breathes");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("walk");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}




