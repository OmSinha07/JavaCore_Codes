import java.util.Scanner;

public class cuboid {
    public static void main(String [] args)
    {
        int l,b,h;
        double area,volume;
        Scanner in =new Scanner(System.in);
        l=in.nextInt();
        b=in.nextInt();
        h=in.nextInt();
        area= 2*((l*h)*(b*h)*(l*h));
        volume=l*b*h;
        System.out.println(area);
        System.out.println(volume);
        in.close();
    }
}
