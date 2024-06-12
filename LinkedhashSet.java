import java.util.*;
public class LinkedhashSet {
    public static void main(String[] args) {
        HashSet<Integer> lh=new HashSet<>();
        lh.add(5);
        lh.add(1);
        lh.add(2);
        lh.add(6);
        lh.forEach((x)->System.out.println(x));
        System.out.println();
        lh.forEach(System.out::println);
        System.out.println();
        Iterator<Integer>itr=lh.iterator();
        
        while (itr.hasNext()) 
        {
            System.out.println(itr.next());
            
        }
    }
        
}
