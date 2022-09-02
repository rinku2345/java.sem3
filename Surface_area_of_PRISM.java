import java.util.Scanner;
public class Surface_area_of_prism{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("area of base of prism = ");
        int b=sc.nextInt();
        System.out.println("perimeter of base of prism =");
        int p=sc.nextInt();
       System.out.println("height of prism =");
        int h=sc.nextInt();
        System.out.println("SURFACE AREA OF PRISM IS ="+2*b*p*h);

    }
    
}
