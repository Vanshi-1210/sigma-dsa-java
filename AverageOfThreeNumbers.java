// Program to calculate the average of three numbers using user input


import java.util.Scanner;

public class AverageOfThreeNumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a:");
        float a=sc.nextFloat();
        System.out.print("Enter value of b:");
        float b=sc.nextFloat();
        System.out.print("Enter value of c:");
        float c=sc.nextFloat();
        float avg=(a+b+c)/3;
        System.out.println("Average of a and b is:"+avg);
        sc.close();

    }
}
