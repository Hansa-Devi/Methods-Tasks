public class Method_7_PentagonalNumbers {
    public static int pentagonalNos(int n){
        return (n-1)*n + n*(n+1)/2;
    }

    public static void main(String[] args) {
        System.out.println("First 50 pentagonal Numbers:");
        int i;
        int count = 1;
        for (i = 1; i <=50 ; i++) {
            System.out.print(pentagonalNos(i) + " ");
            if (count%10 == 0) System.out.println();
            count++;
        }
    }
}
