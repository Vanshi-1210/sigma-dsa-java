// Program to check whether a number is positive, negative, or zero

import java.util.*;
public class PositiveNegativeOrZero{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number:");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("Number is positive");
        }else if(num==0){
            System.out.println("Number is zero");
        }else{
            System.out.println("Number is negative");
        }
        sc.close();
    }
}