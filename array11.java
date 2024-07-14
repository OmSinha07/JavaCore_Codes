import java.util.*;
public class array11 {

    public static void main(String[] args) {
        int A[]=new int[10];
        A[0]=3;A[1]=9;A[2]=7;A[3]=8;A[4]=12;A[5]=6;
        int n=6;
        int index=2;
        int x=4;
        for(int i=0;i<n;i++)
        System.out.print(A[i]+",");
        System.out.println("");
        for(int i=A.length-1;i>index;i--)
        {
            A[i]=A[i-1];

        }
        A[index]=x;

  

        for(int i=0;i<=n;i++)
        System.out.print(A[i]+",");
        System.out.println("");
    }
}