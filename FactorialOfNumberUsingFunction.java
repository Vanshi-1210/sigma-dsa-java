// This program calculates the factorial of a given number using a user-defined function and a for loop.

import java.util.*;
public class FactorialOfNumberUsingFunction {
    
    public static int printFactorial(int n){
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        return  factorial;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter value of n:");
        int n=sc.nextInt();
        int factorial=printFactorial(n);
        System.out.print("Factorial of n is:"+factorial);
        sc.close();
    }
}
