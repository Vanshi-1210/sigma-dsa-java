// Program to calculate the area of a square using user input

import java.util.*;
public class AreaOfSquareWithUserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of side:");
        float side=sc.nextFloat();
        float areaOfSquare=side*side;
        System.out.println("Area Of Square is:"+areaOfSquare);
        sc.close();
    }
}
