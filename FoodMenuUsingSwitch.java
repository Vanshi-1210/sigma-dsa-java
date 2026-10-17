// Display the selected food item using a switch statement

import java.util.*;
public class FoodMenuUsingSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number button you want to press:");
        int button=sc.nextInt();
        switch (button) {
            case 1:System.out.println("Samosa");
                break;
            case 2:System.out.println("Burger");
                break;
            case 3:System.out.println("MilkShake");
                break;
            default:System.out.println("Invalid button");
                break;
        }
        sc.close();
    }
}
