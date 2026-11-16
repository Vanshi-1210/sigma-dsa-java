public class StringTraversal {

    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String firstName="Vanshika";
        String lastName="Agrawal";
        String fullName=firstName+" "+lastName;
        printLetters(fullName);
    }
}
