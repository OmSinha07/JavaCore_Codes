import java.util.*;
public class exception_handling01 {
    public static void main(String[] args) {
        int a,b,res;
    
    Scanner in=new Scanner(System.in);
    
    System.out.println("enter two no's");
    a=in.nextInt();
    b=in.nextInt();

    try
    {
        res=a/b;
        System.out.println(res);
    }
    catch(ArithmeticException e)
    {
      System.out.println("division by 0 is not allowed");
    }
    System.out.println("bye");
}
}
