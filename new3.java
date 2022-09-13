import java.util.Scanner;
public class new3 {
    //A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//Ask user for quantity
//Suppose, one unit will cost 100.
//Judge and print total cost for user.
   public static void main(String[] args) {
    
   

    Scanner sc=new Scanner(System.in);

System.out.println("enter the QTY=");

    int qty=sc.nextInt();
 int price=qty*100;
    if(price>1000){
        System.out.println("effected price "+(price-(price/10)));
    }
    else{
        System.out.println("price is "+price);
    }
}

    
}
