import java.util.*;

public class expresion {
    public static void main(String[] args) {
        float base,ht,area;
        System.out.println("enter dimensions");
        Scanner in=new Scanner(System.in);
        base=in.nextFloat();
        ht=in.nextFloat();
        area=(float)1/2*base*ht;
        System.out.println(area);
    }
}
