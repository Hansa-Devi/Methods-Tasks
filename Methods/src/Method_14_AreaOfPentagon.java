import java.util.Scanner;

public class Method_14_AreaOfPentagon {
    public static void areaOfPentagon(int s , int a){
        int area = (5 * s * a)/2;
        System.out.println("Area of Pentagon: "+area);
    }


    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter side length:");
        int side =ip.nextInt();
        System.out.println("Enter apothem length:");
        int apothem = ip.nextInt();
        areaOfPentagon(side,apothem);

    }
}
