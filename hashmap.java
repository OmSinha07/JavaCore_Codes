import java.util.*;
import java.util.Map.*;
public class hashmap {
   public static void main(String[] args) {
    HashMap<Integer,String>tm=new HashMap<>(Map.of(0,"A",1,"B",2,"C"));
    tm.put(3,"D");
    tm.put(5,"D");

  
    System.out.println(tm.get(2));

   } 
}

