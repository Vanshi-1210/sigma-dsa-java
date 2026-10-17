// Check whether a student passes or fails using the ternary operator

import java.util.*;
public class PassFailUsingTernaryOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your marks:");
        int marks=sc.nextInt();
        String Result=((marks>=33))? "PASS":"FAIL";
        System.out.println(Result);
        sc.close();
    }
}
