import java.util.*;

    public class array6 {

    public static void main(String[] args) 
    {
    Scanner in=new Scanner(System.in);
    int ar[]={3,9,7,8,12,6,15,5,4,10};
    int B[]=new int[14];
        
    for( int i=0;i<ar.length;i++)
    {
        B[i]=ar[i];
    }
    ar=B;
    B=null;
    int i=ar.length;
    int n=in.nextInt();
    while(i>=0)
    {
    if(ar[i-1]>n)
        ar[i]=ar[i-1];
    else
    {
        ar[i]=n;
        
    }
        i--;
    }
    for( i=0;i<ar.length;i++)
    System.out.print(ar[i]+",");
    System.out.println(",");

    }
    }
 
 
          

