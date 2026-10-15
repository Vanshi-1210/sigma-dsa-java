// Program to calculate the sum of two numbers using user input

import java.util.*;
public class SumWithUserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a=sc.nextInt();
        System.out.print("Enter value of b:");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum of a and b is:"+sum);
        sc.close();
    }
}
