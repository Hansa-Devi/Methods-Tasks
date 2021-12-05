import java.util.Scanner;

public class Method_5_CountWords {
    public static int countWords(String str){
        if (str.length() <1)
            return 0;

        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                count++;
            }
        }
        System.out.print("Number of words in given sentence: ");
        return count;
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog.";
        System.out.println("Given String: "+sentence);
        System.out.println(countWords(sentence));
    }
}
