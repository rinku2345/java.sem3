import java.util.Scanner;
public class  Total_surface_area_of_rectangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("length of rectangle  = ");
        int l=sc.nextInt();
        System.out.println("height of rectangle  = ");
        int h=sc.nextInt();
   System.out.println("breadth of rectangle  = ");
        int b=sc.nextInt();
        System.out.println(" Total surface area of  RECTANGLE ="+2*(l*b+b*h+l*h) );

    }
    
}
