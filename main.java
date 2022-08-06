import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circle c1 = new circle();
        System.out.println("Enter the radius of circle : ");
        double radius = sc.nextDouble();

        circle c = new circle(radius);
        System.out.println("The Area of Circle is :  " + c.getarea());
        System.out.println("The Perimeter of Circle is :  " + c.getperimeter());
    }
}
