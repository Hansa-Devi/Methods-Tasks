import java.util.Scanner;

public class Method_2_AvgOfThreeNumbers {

    public static int avgThreeNumber(int i, int j ,int k) {
        return (i+j+k)/3;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int firstNo= ip.nextInt();
        System.out.println("Enter Second Number:");
        int secondNo= ip.nextInt();
        System.out.println("Enter Third Number:");
        int thirdNo= ip.nextInt();
        System.out.print("Smallest number among three number is: ");
        System.out.println(avgThreeNumber(firstNo,secondNo,thirdNo));
    }
}
