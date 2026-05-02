public class Interfaces {
    public static void main(String args[]){
    Queen q = new Queen();
    q.moves();
     }
}
// CHESSPLAYER EXAMPLE

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,right,left,diagonal(in 4 directions)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,right,left");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,right,left,diagonal-(by 1 step)");
    }
}

//MULTIPLE INHERITENCE
class Main {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.grass();
        b.meat();
        Lion l = new Lion();
        l.meat();
        l.eat();
    }
}

interface Animal{
    void eat();
}

interface Hervivores extends Animal{
    void grass();
}

interface Carnivores extends Animal{
    void meat();
}

class Bear implements Hervivores, Carnivores{
    public void eat(){
        System.out.println("Bear eat plant...");
    }
    
    public void grass(){
        System.out.println("Bear eat grass...");
    }
    public void meat(){
        System.out.println("Bear eat meat...");
    }
}

class Lion implements Carnivores{
    public void meat(){
        System.out.println("Lion eat meat...");
    }
    public void eat(){
        System.out.println("Lion hunts other animal...");
    }
}
