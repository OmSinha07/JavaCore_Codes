import java.util.Scanner;

public class loop2 {//sum of natural nos
    public static void main(String[] args) {
        int n;
        int sum=0;
         System.out.println("enter no");
        Scanner in =new Scanner(System.in);
        n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
    }
    System.out.println(sum);
}
}
