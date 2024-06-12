public class method7 {
    static int rev(int n)
    { int revs=0;
while(n!=0)
{
    int t=n%10;
    revs=revs*10+t;
    n/=10;
}
return revs;

    }
    static void rev(int ar[])
    {
    for(int i=ar.length-1;i>=0;i--)
{
System.out.print(ar[i]+" ");
}
    }
    public static void main(String[] args) 
    {
        int ar[]={2,5,7,10};
        
        int r=rev(231);
        rev(ar);
        System.out.println();
        System.out.println(r);
    }
    
}
