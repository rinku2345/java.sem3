import java.util.Scanner;
public class new13 {
    public static void main(String[] args) {
       // .Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using 
       //following rules print their place of service.
//if employee is female, then she will work only in urban areas.

//if employee is a male and age is in between 20 to 40 then he may work in anywhere

//if employee is male and age is in between 40 t0 60 then he will work in urban areas only.

//and any other input of age should print "ERROR".
Scanner sc=new Scanner(System.in);
System.out.println("enter the age");
int age=sc.nextInt();
System.out.println("enter the sex");
char sex=sc.next().charAt(0);
System.out.println("enter the maritus status");
String maritus_status=sc.next();
if(sex==70){//65to96  uppercase//97 to 123 lowercase
    System.out.println("she will work in urbain areas");
    
}
else if(sex==77)
{
       if(age>=20  &&    age<=40){
              System.out.println("he may work in anywhere");}
                 else if (age>=40   &&   age<=60){
                       System.out.println("he will work in urban areas ");
        }
else{
    System.out.println("ERROR");
 }
}

    }
}
