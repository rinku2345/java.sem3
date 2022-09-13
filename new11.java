import java.util.Scanner;
public class new11 {
    public static void main(String[] args) {
         //Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
   char s;
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the char.....");
        s=sc.nextLine().charAt(0);
         

        
        if(s>=97 && s<=123){
            System.out.println("lowercase");
        }
        else if(s >=65 && s<=96){
            System.out.println("upercase");
        }
        else if(s>=48 && s<=57){
            System.out.println("digit");
        }
    }
    
}
