package Hashing;
import java.util.HashSet;
import java.util.Iterator;
public class HashSet1 {
    public static void main(String[] args) {
        //unodered set
        HashSet<Integer> set = new HashSet<>();
        //Insert
        set.add(6);
        set.add(5);
        set.add(4);
        set.add(6);
        System.out.println(set);

        //Searching
        if(set.contains(6)){
            System.out.println("6 exist");
        }

        //Delete
        set.remove(4);

        //Size
        System.out.println(set.size());

        //Iterator
        Iterator it = set.iterator(); //Traversing of set
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
