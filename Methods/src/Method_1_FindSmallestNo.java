import java.util.Scanner;

public class Method_1_FindSmallestNo {

    public static int smallestNumber(int i, int j ,int k){
        return Math.min(Math.min(i,j),k);

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
        System.out.println(smallestNumber(firstNo,secondNo,thirdNo));

    }
}
