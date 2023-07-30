import java.util.*;

public class mapconcept {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();

        mp.put(1, "Likhil");
        mp.put(3, "Hinata");
        mp.put(2, "NItin");

        System.out.println(mp);

        System.out.println(mp.containsKey(2));
        System.out.println(mp.containsValue("Likhil"));
        System.out.println(mp.containsKey(4));

        mp.put(2, "Adarsh");// overrides
        System.out.println(mp);

        mp.putIfAbsent(2, "HInata");
        System.out.println(mp);
        mp.putIfAbsent(4, "kaguya");
        System.out.println(mp);

        System.out.println(mp.size());

        System.out.println(mp.get(2));
        System.out.println(mp.get("NItin"));

    }
}
