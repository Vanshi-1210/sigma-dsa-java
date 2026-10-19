// Takes input until a number divisible by 10 is entered

import java.util.*;
public class StopLoopWhenNumberIsMultipleOfTen {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       do {
        System.out.print("Enter number:");
        int num=sc.nextInt();
        if(num%10==0){
            break;
        }
        System.out.println(num);
       } while(true);
       sc.close();
    }

}
