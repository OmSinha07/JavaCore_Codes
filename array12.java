import java.util.*;
public class array12 {

    public static void main(String[] args) {
        int A[]=new int[10];
        A[0]=3;A[1]=9;A[2]=7;A[3]=8;A[4]=12;A[5]=6;
        int n=6;
        int index=2;
    
        for(int i=index;i<n;i++)
        {
            A[i]=A[i+1];
        }
        for( int i=0;i<n-1;i++)
        {
        System.out.print(A[i]+",");
        }
    }
}
