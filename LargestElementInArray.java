// Program to find the largest element in an array using a function and Integer.MIN_VALUE.

public class LargestElementInArray{
    public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
          return largest;
    }
    public static void main(String[] args) {
        int numbers[]={6,9,21,12,15,18};
        System.out.println("Largest number in array is:"+getLargest(numbers));
    }
}
