// Program to calculate the area of a circle using user input

import java.util.*;
public class AreaOfCircleWithUserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of radius:");
        float radius=sc.nextFloat();
        float areaOfCircle= 3.14f*radius*radius;
        System.out.println(areaOfCircle);
        sc.close();

    }
}
