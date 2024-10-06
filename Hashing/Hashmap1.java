package Hashing;
import java.util.*;

public class Hashmap1 {
    public static void main(String[] args) {
        //unodered map
        //country(key) population(value)
        HashMap<String,Integer> map = new HashMap<>();

        //Insertion
        map.put("India",120);
        map.put("USA",30);
        map.put("China",150);

        System.out.println(map);

        //Updation
        map.put("China",180);
        System.out.println(map);

        //Search/Lookup
        System.out.println(map.containsKey("China"));
        System.out.println(map.containsKey("German"));

        System.out.println(map.get("India"));//key exist
        System.out.println(map.get("German"));//key doesn't exist

        //for-each loop
        int[] arr = {5,8,2,19,6,20,25};
        //this takes each value of array order by order
        for (int value:arr){
            System.out.print(value+" ");
        }
        System.out.println();
        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.print(e.getKey()+":");
            System.out.print(e.getValue());
            System.out.println();
        }

        //or
        Set<String> keys = map.keySet();
        for (String key: keys){
            System.out.println(key+" "+map.get(key));
        }

        //removing
        map.remove("China");
    }
}
