// This program demonstrates the use of a boolean function to check whether a given number is prime or not.

public class CheckPrimeNumberUsingFunction {

    public static boolean isPrime(int n){

        if(n==2){
            return true;
        }
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
             isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(20));
    }
}
