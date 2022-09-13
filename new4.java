import java.util.Scanner;
public class new4 {
    public static void main(String[] args) {
    //A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
//Ask user for their salary and year of service and print the net bonus amount.
      Scanner sc=new Scanner(System.in);
                            System.out.println("enter the salary");

                       double salary=sc.nextDouble();
                       
                                 System.out.println("enter the year of sevice");

                        double year_of_sevice=sc.nextDouble();

      if(year_of_sevice>5){
        System.out.println("net bonus amount="+(salary*5/100));
      }
      else{
        System.out.println("not allow for bonus");
      }

}
}