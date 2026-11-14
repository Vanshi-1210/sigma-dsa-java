// This program prints all possible pairs of elements in an array using nested loops.

public class PrintPairs{
    public static void printPairs(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int numbers[]={2,5,6,7,9};
        printPairs(numbers);
    }
}