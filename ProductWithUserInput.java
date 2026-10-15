// Program to calculate the product of two numbers using user input
import java.util.*;
public class ProductWithUserInput{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a=sc.nextInt();
        System.out.print("Enter value of b:");
        int b=sc.nextInt();
        int product=a*b;
        System.out.println("Product of a & b:"+product);
        sc.close();
    }
}
