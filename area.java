import java.util.Scanner;
import java.lang.*;

public class area {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float a,b,c;
        System.out.println("Enter dimension");
        a=in.nextFloat();
        b=in.nextFloat();
        c=in.nextFloat();
        float s=(a+b+c)/2f;
        double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);
        in.close();        
    }
}
