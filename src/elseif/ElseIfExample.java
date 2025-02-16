package elseif;

public class ElseIfExample {
    public static void example1(int mark){
        if(mark >90){
            System.out.println("A+");
        } else if (mark <90) {
            System.out.println("Pass");
        } else if ( mark <45) {
            System.out.println("not bad");
        }
    }
}
