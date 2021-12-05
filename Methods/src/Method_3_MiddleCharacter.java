public class Method_3_MiddleCharacter {
    public  static String  middleCharacter(String str) {
        int len = str.length();
        int mid;
        int end;

        if (len % 2 == 0) {
            mid = (len / 2) -1;
            end = 2;
        }
        else {
            mid = len/2;
            end=1;
        }
        return str.substring(mid,end+mid);
    }

    public static void main(String[] args) {
        System.out.println(middleCharacter("789"));


    }
}
