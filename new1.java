import java.util.Scanner;
public class new1 {
  //  Take values of length and breadth of a rectangle from user and check if it is square or not.

    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER THE LENGTH OF RECTANGLE=");
    double length=sc.nextDouble();
    System.out.println("ENTER THE BREADTH OF RECTANGLE=");
    double breadth=sc.nextDouble();
    if(length==breadth)
    {
        System.out.println("RECTANGLE is SQUARE");
    }
    else
    {
        System.out.println("RECTANGLE is not SQUARE");
    }

    

    }
}
