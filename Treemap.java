import java.util.*;
import java.util.Map.*;
public class Treemap {
   public static void main(String[] args) {
    TreeMap<Integer,String>tm=new TreeMap<>(Map.of(0,"A",1,"B",2,"C"));
    tm.put(3,"D");
    tm.put(5,"D");
    Entry<Integer,String> e=tm.firstEntry();
    System.out.println(e.getKey()+" "+e.getValue());
    System.out.println(tm.ceilingEntry(4));
    System.out.println(tm.get(2));

   } 
}
