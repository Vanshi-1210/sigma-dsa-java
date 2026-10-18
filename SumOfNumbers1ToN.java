// Program to calculate the sum of numbers from 1 to N using a while loop

import java.util.*;
public class SumOfNumbers1ToN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt(); 
        int i=0;
        int sum=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
        
        sc.close();

    }
}
