// This program checks whether a given number is prime or not using a for loop and Math.sqrt().

import java.util.*;
public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number:");
        int n=sc.nextInt();
        if(n==2){
            System.out.println("number is prime");
        }else{
            boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(n);i++){
              if(n%i==0){
            isPrime=false;
              }
        }
        if(isPrime==true){
            System.out.println(""+n+" is prime number");
        }else{
            System.out.println(""+n+" is not a prime number");
        }
    }
        
        sc.close();
    }
}
