import java.util.Scanner;

public class Method_10_LeapYear {
    public static boolean leapYear(int year){
        if (year < 0)
            return false;

        if (year % 4 == 0) {
            System.out.println("Given year is Leap Year");
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter year: ");
        int y = ip.nextInt();
        System.out.println(leapYear(y));
    }
}
