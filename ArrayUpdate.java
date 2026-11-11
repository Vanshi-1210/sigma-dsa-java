// Program to demonstrate passing an array to a function and updating each element by incrementing it by 1.

public class ArrayUpdate {

    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={98,99,97};

        update(marks);
    //loop for printing our  marks 
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
