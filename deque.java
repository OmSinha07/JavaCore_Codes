import java.util.*;
public class deque {
    public static void main(String[] args) {
        {
            ArrayDeque<Integer> dq=new ArrayDeque<>();
            dq.offerLast(10);
            dq.offerLast(20);
            dq.offerLast(30);
            dq.offerLast(40);
            System.out.println(dq.pollFirst());
            for(Integer x:dq)
            System.out.println(x);
                 }
       
    }
}
