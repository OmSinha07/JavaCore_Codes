import java.util.Scanner;

public class loop5 {
    
    public static void main(String[] args) {//counting number of digits
     System.out.println("enter no");
     int t,c=0;
        Scanner in =new Scanner(System.in);
       int  n=in.nextInt();
       while(n>0)
       {
       t= n%10;
        c++;
        n=n/10;
       }
       System.out.println(c);
    }
}
