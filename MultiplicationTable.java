// Program to print the multiplication table of a number using a for loop

import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
        sc.close();
    }
}
