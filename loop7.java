import java.util.Scanner;

public class loop7 {
    //Armstrong
    
    public static void main(String[] args) {
     System.out.println("enter no");
     int t,c=0,s=0,num=0;
        Scanner in =new Scanner(System.in);
       int  n=in.nextInt();
       num=n;
        while(num>0)
        {
            t=num%10;
            s=s*10+t;//main logic
            num/=10;
        }
        System.out.println(s);
    }
}