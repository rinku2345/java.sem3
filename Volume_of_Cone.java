import java.util.Scanner;
public class Volume_of_Cone{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("radius of cone = ");
        int r=sc.nextInt();
        System.out.println("height of cone =");
        int h=sc.nextInt();
        System.out.println("VOLUME OF CONE ="+3.142*r*r*h/3);

    }
    
}
