// Check whether a number is even or odd using the ternary operator

import java.util.*;
public class EvenOddUsingTernaryOperator {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("enter the value of number:"); 
      int number=sc.nextInt();
      String type=((number%2==0))? "even":"odd";
      System.out.println(type);
      sc.close();
    }
}
