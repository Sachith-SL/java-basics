package collectionexamples;

import java.util.*;

public class ListExamples {
    public static void example(){

        List<Integer> list = new ArrayList<>();

        list.add(7);
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(5);
        list.add(3);
        list.forEach((num)-> System.out.print(num+", "));
        list.remove(Integer.valueOf(5));

//        Iterator itr = list.iterator();

//        while (itr.hasNext()){
//            Integer current = (Integer) itr.next();
////            System.out.print(current+", ");
//            if(current.equals(3)){
//                itr.remove();
//            }
//            System.out.print(current+", ");
//        }

        System.out.println();
        list.forEach((num)-> System.out.print(num+", "));
//        Collections.sort(list);
//        System.out.println();
//        System.out.println(Collections.max(list));
//        list.forEach((num)-> System.out.print(num+", "));
    }

    public static void example2(){
        List<Integer> list  = new ArrayList<>();

        list.add(7);
        list.add(5);
        list.add(9);
        list.set(2,2);
        list.add(0,4);

        Map<Integer,Integer> map = new HashMap<>();
        for (Integer i:list){
            map.put(list.indexOf(i),i);
        }

        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }



//        list.forEach((m)-> System.out.print(m));
//        System.out.println(list.contains(2));
//        System.out.println(list.indexOf(2));
//        System.out.println("------");
//        System.out.print(list.size());
    }

    public static void example3(){
        List<Integer> list = new LinkedList<>();

        list.add(7);
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(5);
        list.add(3);

        ListIterator listIterator = list.listIterator();

//        while (listIterator.hasNext()) {
//            System.out.print(listIterator.next() + " ");
//        }

        System.out.println("");
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+" ");
        }


    }
}
