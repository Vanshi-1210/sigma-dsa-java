// Program to check fever based on body temperature

import java.util.*;
public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your temperature:");
        double temp=sc.nextDouble();
        if(temp>100){
            System.out.println("You have a fever");
        }else{
            System.out.println("You don't have fever");
        }
        sc.close();
    }
}
