import java.util.Scanner;

public class array7 {
        
    //Inserting an Element
    public static void main(String[] args) 
    {
        int ar[]=new int[10];
        int index=2;
        int n=6;
        int x=6;
        ar[0]=3;ar[1]=9;ar[2]=7;ar[3]=8;ar[4]=12;ar[5]=6;
      Scanner in =new Scanner(System.in);
        for (int i=ar.length-1;i>=index;i--)
        {
            ar[i]=ar[i-1];
        }
        ar[index]=6;
        for( int i=0;i<n;i++)
        System.out.print(ar[i]+",");
       
}
}
