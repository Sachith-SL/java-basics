package number;

public class DigitCount {
    static int  count = 0;
    public static int example(int n){

        if(n<10){
            count++;
            return count;
        }
        if(n>10){
            count++;
            return example(n/10);
        }
        else
            return count;
    }

    public static int example(int n,int d){

        if(n<10){
            if(n==d){
                count++;
            }
            return count;
        }
        if(n>10){
            if(n%10 == d)
                count++;
            return example(n/10);
        }
        else
            return count;
    }
}
