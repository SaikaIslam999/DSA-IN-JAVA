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

// Hybrid Inheritence

public class Inheritence {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.breath();
        d.talk();
        Shark s = new Shark();
        s.swim();
        s.fins = 2;
        System.out.println(s.fins);
        Sparrow spa = new Sparrow();
        spa.fly();
        spa.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eats...");
    }
    void breath(){
        System.out.println("breath...");
    }
}
class Mammal extends Animal{
    int legs;
}
class Cat extends Mammal{
    void talk(){
        System.out.println("meow..");
    }
}
class Dog extends Mammal{
    void talk(){
        System.out.println("bark..");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}
class Shark extends Fish{
    int fins;
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly...");
    }
}
class Sparrow extends Bird{
    int legs;
}



