// This program demonstrates function overloading in Java by defining methods with the same name but different parameter data types.

public class FunctionOverloadingUsingDifferentDataTypes {

    public static int sum(int a,int b){
        return a+b;
    }

    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.println(sum(2.22f,2.34f));
    }
}
