ghhpackage HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // hashDemo();

        HashMapFinal<String, String> map = new HashMapFinal<>();

        map.put("Mango", "King of fruits");
        map.put("apple", "A sweet red fruit");
        map.put("LItchi", "fruit");

        System.out.println(map.get("Mango"));

    }

    public static void HashDemo() {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("vikram", 89);
        map.put("Anupam", 99);
        map.put("Afroz", 98);

        System.out.println(map.get("virkam"));
        System.out.println(map.containsKey("Anupam"));

        HashSet<Integer> set = new HashSet<>();
        set.add(34);
        set.add(33);
        set.add(34);
        set.add(89);
        set.add(88);
        set.add(90);
        System.out.println(set);
    }
}
