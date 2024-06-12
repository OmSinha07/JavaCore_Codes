public class method3 {
    static int prime(int x)
    {
        int c=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            c++;
        }
        if(c==2)
        return 1;
        else
        return 0;
    }
    public static void main(String [] args)
    {
        int d=prime(5);
        if(d==1)
        System.out.println("prime number");
        else
        System.out.println("not");
    }
}
