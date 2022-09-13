import java.util.Scanner;
public class new7 {
    public static void main(String[] args) {
        //Write a program to print absolute vlaue of a number entered by user. E.g.-
//INPUT: 1        OUTPUT: 1
//INPUT: -1        OUTPUT: 1

     Scanner sc=new Scanner(System.in);
     System.out.println("enter the absolute value ");
     System.out.println("inputs");
     double a=sc.nextDouble();
     double b=sc.nextDouble();
   if(b<0)
   {
      System.out.println("outputs");
      System.out.println(a);
      System.out.println(b*(-1));
   }
   
     
    }
    
}
