// Program to print the digits of a number in reverse order using a while loop.

public class ReverseDigits {
    public static void main(String[] args) {
        int n=23456;
        while(n>0){
            int lastDigit=n%10;
            System.out.print(lastDigit);
            n=n/10;
        }
    }
}
