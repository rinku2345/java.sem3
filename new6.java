import java.util.Scanner;
public class new6 {
    public static void main(String[] args) {
        //Take input of age of 3 people by user and determine oldest and youngest among them.
        Scanner sc=new Scanner(System.in);
        System.out.println("age of first person=");
        int a=sc.nextInt();
        System.out.println("age of second person=");
        int b=sc.nextInt();
        System.out.println("age of third person=");
        int c=sc.nextInt();
        //first logic for oldest
        if(a>b&&a>c){
            System.out.println(a+"_first is oldest ");
        }
        else if(b>a&&b>c){
            System.out.println(b+"_second is oldest ");
        }
        else if(c>a&&c>b){
            System.out.println(c+"_third is oldest ");
        }
        else{
            System.out.println("all are equal");
        }
        //second logic for yougest
        if(a<b&&a<c){
            System.out.println(a+"_first is youngest ");
        }
        else if(b<a&&b<c){
            System.out.println(b+"_second is youngest ");
        }
        else if(c<a&&c<b){
            System.out.println(c+"_third is youngest ");
        }
    }
    
}
