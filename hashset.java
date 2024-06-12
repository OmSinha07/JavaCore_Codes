import java.util.*;
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();
        h.add(24);
        h.add(24);
        h.add(14);
        h.add(34);
        h.add(21);
        h2.add(200);
        System.out.println(h);
        System.out.println(h.contains(24));
        h.addAll(h2);
        System.out.println(h);
        h2.clear();
        System.out.println(h2);
        h.clone();
        h.forEach((x)->System.out.println(x));
        h.isEmpty();
    }
}
