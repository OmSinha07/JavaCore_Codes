import java.util.*;
public class priority_queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        p.add(20);
        p.add(10);
        p.add(30);
        p.add(15);
        System.out.println(p.peek());
    
        
            p.forEach((x)->System.out.println(x));
            p.poll();
            p.forEach((x)->System.out.println(x));l
    }
}
