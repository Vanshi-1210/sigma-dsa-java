// Program to print a butterfly star pattern using nested for loops.

public class ButterflyPattern {
    public static void main(String[] args) {
        int n=4;
        // outer loop for printing upper stars
        for(int i=1;i<=n;i++){
            // loop for printing left stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // loop for printing spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // loop for printing right stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // outer loop for printing down stars
        for(int i=n;i>=1;i--){
             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
