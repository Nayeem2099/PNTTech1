package map;

import java.util.HashMap;
import java.util.Map;

public class UseHashMap {

    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();
        map.put("user1", "batman");
        map.put("user2", "spiderman");
        map.put("user3", "hulk");
        map.put("user4", "superman");
        System.out.println(map.get("user1")); //use key to get value
        System.out.println(map);

        //turn map into entry set, unpack the map
        for(Map.Entry entry: map.entrySet()) {
            System.out.println("key is: " + entry.getKey());
            System.out.println("value is: " + entry.getValue());
        }

    }
}
