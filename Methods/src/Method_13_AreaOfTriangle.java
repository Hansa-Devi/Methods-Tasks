import java.util.Scanner;

public class Method_13_AreaOfTriangle {
    public static void areaOfTriangle(double x, double y ){
        double area = (x*y)/2;
        System.out.println("area of triangle: "+area);
        }



    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter base of triangle:");
        double side1=ip.nextDouble();
        System.out.println("Enter height of triangle:");
        double side2=ip.nextDouble();

        areaOfTriangle(side2,side1);
    }
}
