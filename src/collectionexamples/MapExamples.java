package collectionexamples;

import java.util.Map;
import java.util.TreeMap;

public class MapExamples {
    public void example(){
        Map<String, Integer> map = new TreeMap<>();
        map.put("Sachith", 32);
        map.put("Chathurika", 31);
        map.put("Thejav", 3);
        map.put("Saman",4);
        map.put("Saman",31);

//        for(String key: map.keySet()){
//            System.out.println(key);
//        }

        for (Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }


//        System.out.println(map);


//        System.out.println(names);
    }
}
