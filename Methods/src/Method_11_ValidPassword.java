import java.util.Locale;
import java.util.Scanner;

public class Method_11_ValidPassword {
    //Java method to check whether a string is a valid password. Go to the editor
    //Password rules:
    //A password must have at least ten characters.
    //A password consists of only letters and digits.
    //A password must contain at least two digits.
    public static String checkPassword(String pass){

        int digits = 0;
        for (int i = 0; i <pass.length() ; i++) {
            if (pass.charAt(i) == 0 || pass.charAt(i) == 1 || pass.charAt(i) == 2 || pass.charAt(i) == 3 || pass.charAt(i) == 4
                    || pass.charAt(i) == 5 || pass.charAt(i) == 6 ||pass.charAt(i) == 7
                    ||pass.charAt(i) == 8 ||pass.charAt(i) == 9)
                digits++;
        }

        if (pass.length()< 1)
            return "not valid";

        if (pass.length()<10)
            return "Invalid Password should be atleast of 10 character";

        if (digits < 2)
            return "Invalid Password , password should consist atleast 2 digits ";

      return "false";

    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter password:");
        String password = ip.nextLine();
        System.out.println(checkPassword(password));

    }
}
