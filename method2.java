public class method2 {
    static void Change(int a[],int x,int val)
 {
        a[x]=val;
 }
    public static void main(String args[])
    {
        int a[]={2,3,4,5};
        Change(a,0,20);
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}
