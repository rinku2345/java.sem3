import java.util.Scanner;

public class new8 {
    public static void main(String[] args) {
  //      A student will not be allowed to sit in exam if his/her attendence is less than 75%.
//Take following input from user
//Number of classes held
//Number of classes attended.
//And print
//percentage of class attended
//Is student is allowed to sit in exam or not.

Scanner sc=new Scanner(System.in);
     System.out.println("ENTER THE CLASS HELD ");
     int class_held=sc.nextInt();
     System.out.println("ENTER THE CLASS ATTENDED ");
     int class_attended=sc.nextInt();
    
     int percentace=(class_held/100*class_attended);
     System.out.println("percentace of class attended "+percentace+"%");
     
if (percentace<75){
    System.out.println("NOT BE ALLOW TO SIT I EXAM");
}
else{
    System.out.println("ALLOW FOR SIT IN EXAM");

}

    }
}
