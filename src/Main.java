import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(11,"Nguyen Van A");
        hashMap.put(13,"Nguyen Van B");
        hashMap.put(15,"Nguyen Van C");
        hashMap.put(17,"Nguyen Van D");
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap);

        Map<Integer,String> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<Integer,String> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put(11,"Nguyen Van A");
        linkedHashMap.put(15,"Nguyen Van C");
        linkedHashMap.put(13,"Nguyen Van B");
        linkedHashMap.put(17,"Nguyen Van D");
        System.out.println("Display entries in linkedHashMap");
        System.out.println(linkedHashMap);
        System.out.println("\nPeople who is at 13 years old is " + linkedHashMap.get(13));


    }

}
