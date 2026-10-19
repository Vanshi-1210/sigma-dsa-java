// Skips printing 3 using the continue statement

public class SkipNumberUsingContinueStatementInForLoop {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}
