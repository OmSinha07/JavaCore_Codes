import java.util.Scanner;

public class array3 {
      public static void main(String[] args) {
        int ar[]=new int[5];
        int max=0;
        int i,s=0;
       
        System.out.println("Enter numbers ");
        Scanner in=new Scanner(System.in);
        for (i=0;i<ar.length;i++)
        {
            ar[i]=in.nextInt();
        }
        
        for(i=0;i<ar.length;i++)
        {
            if(max<ar[i])
                max=ar[i];
            
        }
        System.out.print("Maximum "+max);
}
}