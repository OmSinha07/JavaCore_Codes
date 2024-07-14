import java.util.Scanner;

public class array8 
{//increasing size
    public static void main(String[] args) {
        int ar[]={3,9,7,8,12,6,15,5,4,10};
         int B[]=new int[14];
         for(int i=0;i<ar.length;i++)
        {
            B[i]=ar[i];
        }
        ar=B;
        System.out.println("Length of are"+ar.length);
    }
}
        