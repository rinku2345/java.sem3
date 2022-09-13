import java.util.Scanner;
public class new5 {
    public static void main(String[] args) 
{
// A school has following rules for grading system:
//a. Below 25 - F
//b. 25 to 45 - E
//c. 45 to 50 - D
//d. 50 to 60 - C
//e. 60 to 80 - B
//f. Above 80 - A
//Ask user to enter marks and print the corresponding grade.

Scanner sc=new Scanner(System.in);
System.out.println("enter the marks=");
int marks=sc.nextInt();
if(marks<25){
    System.out.println("GRADE F");
}
else if(marks<45)
{
    System.out.println("GRADE E");
}
else if(marks<50){
    System.out.println("GRADE D");
}
else if(marks<60){
    System.out.println("GRADE C");
}
else if(marks<80){
    System.out.println("GRADE B");
}
else if(marks<100){
    System.out.println("GRADE A");
}
}
    }
    
