import java.util.Scanner;

public class quad {
    public static void main(String[] args) 
    {
        int a,b,c;
        double r1,r2;
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
        r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println(r1);
        System.out.println(r2);
        in.close();
    }
}
