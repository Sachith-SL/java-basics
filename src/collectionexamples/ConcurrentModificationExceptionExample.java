package collectionexamples;

import java.util.*;

public class ConcurrentModificationExceptionExample {
    public static void example(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);numbers.add(5);numbers.add(5);

//                Arrays.asList(1,2,3,4,5);
        Iterator<Integer> itr = numbers.iterator();
        while(itr.hasNext()){
            try{
//                if (itr.next()==4){
//                    numbers.remove(4);
//                }
                numbers.add(6);
            }
            catch (ConcurrentModificationException e){
                System.out.println("ConcurrentModificationException");
            }
            catch (Exception e){
                System.out.println("Exception");
            }


        }
        System.out.println(numbers);
    }
}
