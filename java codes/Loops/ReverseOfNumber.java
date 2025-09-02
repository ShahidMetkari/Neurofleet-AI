package Loops;

public class ReverseOfNumber {
    public static void main(String[] args) {
        // int n = 110705;
        // int rem = 0;
        // while (n > 0) {
        // rem = n % 10;
        // n = n / 10;
        // System.out.print(rem);
        // }
        // System.out.println();

        int n=110705;
        int rev=0;
        while (n>0) {
            int lastDigit=n%10;
            rev=(rev*10)+lastDigit;
            n=n/10;
        }
        System.out.println(rev);
    }

}
