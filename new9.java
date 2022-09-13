import java.util.Scanner;
public class new9
{
public static void main(String[] args){
      //Modify the above question to allow student to sit if he/she 
      //has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly. 
   
Scanner sc=new Scanner(System.in);

System.out.println("ENTER THE MEDICAL CAUSE OR NOT=");
        char s=sc.next().charAt(0);
        if(s == 95)
        {
             System.out.println("HE HAS MEDICAL CAUSE");
        }
         else if(s == 78)
         {
                System.out.println("HE HAS NOT MEDICAL CAUSE");
         }
         
}
}



