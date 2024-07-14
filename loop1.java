import java.util.*;
public class loop1 {//factorial 
    public static void main(String[] args) {
        int fact=1;
        int n;
        System.out.println("enter no");
        Scanner in =new Scanner(System.in);
        n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
