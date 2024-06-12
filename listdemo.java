import java.util.*;
public class listdemo {
    public static void main(String[] args) {
        {
            ArrayList<Integer> al1=new ArrayList<>(20);
            ArrayList<Integer> al2=new ArrayList<>(List.of(50,60,70,80,90));
            al1.add(10);
            al1.add(0,5);
            al1.addAll(1,al2);
            System.out.println(al1.get(5));
            al1.set(6, 100); 
            for(Integer x:al1)
            System.out.println(x);
            Iterator<Integer> it=al1.iterator();
            while(it.hasNext())
            {
                System.out.println(it.next());
            }

        }
    }
}
