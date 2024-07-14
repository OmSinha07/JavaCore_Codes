import java.util.*;

public class array5
{
    
    public static void main(String[] args) 
    {
        int ar[]={3,9,7,8,12,6,15,5,4,10};
       int temp=ar[0];
       int j=0;
       for (int i=1;i<ar.length;i++)
       {
        ar[j]=ar[i];
        j++;
       }
       ar[ar.length-1]=temp;
        
        for(int i=0;i<ar.length;i++)
        {
        System.out.print(ar[i]+",");
        
        
        
    }
}
}
    