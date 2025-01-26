package number;

public class Swapping {
    public static void swap(int x, int y){
        System.out.printf("before swap:- x: %d and y:%d",x,y);
        x= x+y;
        y= x-y; //x+y-y = x
        x= x-y; //x+y-x = y

        System.out.printf("\nafter swap:- x: %d and y:%d",x,y);
    }
}
