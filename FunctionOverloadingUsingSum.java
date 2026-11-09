// This program demonstrates function overloading in Java by defining multiple sum methods with different numbers of parameters.

public class FunctionOverloadingUsingSum {

    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(3,4,5));
    }
}
