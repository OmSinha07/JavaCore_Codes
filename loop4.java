import java.util.Scanner;

public class loop4 {
    
    public static void main(String[] args) {//printin digits in no
     System.out.println("enter no");
     int tab;
        Scanner in =new Scanner(System.in);
       int  n=in.nextInt();
       while(n>0)
       {
        System.out.println(n%10);
        n=n/10;
       }
}
}
