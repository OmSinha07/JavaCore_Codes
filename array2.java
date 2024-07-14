import java.util.Scanner;

public class array2 {
    //Linear Search
      public static void main(String[] args) {
        int ar[]=new int[5];
        int i,s=0;
        System.out.println("Enter number to be searched");
        int n;
        Scanner in =new Scanner(System.in);
        n=in.nextInt();
        System.out.println("Enter number ");
        for (i=0;i<ar.length;i++)
        {
            ar[i]=in.nextInt();
        }
        for (i=0;i<5;i++)
        {
            if(ar[i]==n)
            s=1;
        }
        if(s==1)
        System.out.println("element found");
        else
        System.out.println("element not found");
}
}
