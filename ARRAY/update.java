public class update
{   
    public static void update_in(int marks[]){
        for(int i=0; i < marks.length; i++){
         marks[i] = marks[i] + 1;
        }
    }
	public static void main(String[] args) {
      int marks[] = {95 , 96 , 99};
      update_in(marks);
     for(int i=0; i < marks.length; i++){
        System.out.print(marks[i] + " "); 
     }
     System.out.println();
  }
 }
