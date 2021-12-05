import java.util.Locale;
import java.util.Scanner;

public class Method_4_CountVowels {

    public static int countVowels(String str){

        if (str.length()<1)
            return 0;

        int count =0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.print("Number of vowels in given string: ");
        return count;

    }


    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = ip.nextLine().toLowerCase(Locale.ROOT);
        System.out.println(countVowels(s));

    }

}
