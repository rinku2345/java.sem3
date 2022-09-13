import java.util.Scanner;
public class new12 {
    public static void main(String[] args) {
        //Write a program to check if a year is leap year or not.
//If a year is divisible by 4 then it is leap year but if the year is century year like 2000, 1900, 2100 
//then it must be divisible by 400.
             
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER THE LEAP YEAR =");

    int year=sc.nextInt();

    if(year%400==0){
        System.out.println(year+" leap year");

    }else if(year%100==0){
System.out.println(year+" not a leap year");
    }else if(year%4==0){
        System.out.println(year+" leap year");
    }else{
        System.out.println(year+" not a leap year");
    }
         }





    }    







    

