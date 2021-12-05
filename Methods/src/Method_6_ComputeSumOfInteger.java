import java.util.Scanner;

public class Method_6_ComputeSumOfInteger {
    public static int sumOfInteger(int integer) {
        if (integer <1)
            return 0;

        int no = integer;
        int sum = 0;
        while (no>0){
            sum += no%10;
            no/=10;
        }

        System.out.print("Sum of Integer: ");
        return sum;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Integer: ");
        int num = input.nextInt();
        System.out.println(sumOfInteger(num));

    }
}
