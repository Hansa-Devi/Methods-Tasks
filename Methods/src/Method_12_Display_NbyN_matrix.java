import java.util.Scanner;

public class Method_12_Display_NbyN_matrix {
    public static void matrix(int num) {

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print((int)( Math.random() *2)+ " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = ip.nextInt();
        matrix(n);
    }
}
