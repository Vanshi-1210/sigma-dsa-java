// This program demonstrates the use of a user-defined function with parameters and a return value to calculate the product of two numbers.

import java.util.*;
public class ProductOfTwoNumbersUsingFunction {

    public static int calculateProduct(int a,int b){
        int product=a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a=sc.nextInt();
        System.out.print("Enter value of b:");
        int b=sc.nextInt();
        int product=calculateProduct(a, b);
        System.out.println("Product of a and b is:"+product);
        sc.close();

    }
}
