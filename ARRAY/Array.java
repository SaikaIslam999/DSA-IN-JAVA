import java.util.*;

public class Array
{
	public static void main(String[] args) {
	    int marks[] = new int[100];
     Scanner scn = new Scanner(System.in);
        System.out.print("marks of phys : ");
	    marks[0] = scn.nextInt();
	     System.out.print("marks of chem : ");
	    marks[1] = scn.nextInt();
	    System.out.print("marks of maths : ");
	    marks[2] = scn.nextInt();
		System.out.println("phy: " + marks[0]);
		System.out.println("chem: " + marks[1]);
	    System.out.println("math: " + marks[2]);
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage: " + percentage + "%");
	}
}
