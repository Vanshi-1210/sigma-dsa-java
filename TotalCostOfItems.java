import java.util.*;
public class TotalCostOfItems{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter price of pencil:");
        float pencilPrice=sc.nextInt();
        System.out.print("Enter price of pen:");
        float penPrice=sc.nextInt();
        System.out.print("Enter price of eraser:");
        float eraserPrice=sc.nextInt();
        float totalPrice=pencilPrice+penPrice+eraserPrice;
        float tax=totalPrice+0.18f*totalPrice;
        System.out.println("tax is:"+tax);
        System.out.println("FinalBill is:"+tax);
        sc.close();
    }
}