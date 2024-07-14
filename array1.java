import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        int ar[]=new int[5];
        int i,s=0;
        System.out.println("Enter numbers");
        Scanner in =new Scanner(System.in);
        for (i=0;i<ar.length;i++)
        {
            ar[i]=in.nextInt();
        }
        for (i=0;i<ar.length;i++)
        {
            s+=ar[i];
        }
        System.out.println(s);
    }
}
