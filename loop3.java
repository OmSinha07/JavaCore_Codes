import java.util.Scanner;

public class loop3 {//multiplication of nos
    public static void main(String[] args) {
     System.out.println("enter no");
     int tab;
        Scanner in =new Scanner(System.in);
       int  n=in.nextInt();
        for(int i=1;i<=10;i++)
        {
           tab= n*i;
           System.out.println(tab);
}
    }
}
