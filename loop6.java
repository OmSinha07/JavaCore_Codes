import java.util.Scanner;

public class loop6 {
    //Armstrong
    
    public static void main(String[] args) {
     System.out.println("enter no");
     int t,c=0,s=0,num=0;
        Scanner in =new Scanner(System.in);
       int  n=in.nextInt();
        num=n;
       while(num>0)
       {
        t= num%10;
        s+=t*t*t;
        num=num/10;
       }
       System.out.println(s);
       if (s==n) 
            System.out.println("Armstrong no");
        else
            System.out.println("not");
        
       
}
}
