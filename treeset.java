import java.util.*;
public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>(List.of(50,20,13,14));
        ts.add(20);
        System.out.println(ts.ceiling(24));
        System.out.println(ts);
    }
    
}
