import java.util.*;
import java.util.Map.*;
public class hashmap {
   public static void main(String[] args) {
    HashMap<String,Integer>tm=new HashMap<>(Map.of("A",1,"B",2));
    HashMap<String,Integer>tm2Map=new HashMap<>(Map.of("A",1,"B",2));


    tm.put("D",5);
    tm.put("D",6);
    tm.put("E",tm2Map.getOrDefault("A", 0)+1);
  
    System.out.println(tm.get("E"));

   } 
}

