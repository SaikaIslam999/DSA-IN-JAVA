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
// // HERBIVORE
// interface Herbivore{
//     void eatgrass();
// }
// interface Carnivore{
//     void eatmeat();
// }
//  class Bear implements Herbivore, Carnivore{
//     public void eatboth(){
//         System.out.println("Bear eat both grass and meat");
//     }
// }
