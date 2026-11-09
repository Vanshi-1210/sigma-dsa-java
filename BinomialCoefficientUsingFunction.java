// This program calculates the binomial coefficient (nCr) using user-defined factorial and binomial coefficient functions.

import java.util.*;
public class BinomialCoefficientUsingFunction {


    public static int binCoeff(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);

        int binCoeff=fact_n/(fact_r*fact_nmr);
        return binCoeff;
    }
    

    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
        System.out.print("Enter value of r:");
        int r=sc.nextInt();
        int binCoeff=binCoeff(n, r);
        System.out.print("Ans is:"+binCoeff);
        sc.close();

    }  
}
