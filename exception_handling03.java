public class exception_handling03 extends Exception{
    public String toString()
    {
        System.out.println("Dimmension cant be negative");
    }
}
public class ThrowthrowsDemo
{
    static int area(int l,int b)throws Exception_handling03Exception
{
    if(l<0||b<0)
    throw new Exception();
    return l*b;
}
static void meth2()throws Exception
{
    System.out.println("Area is "+area(10, 0));
}
public static void main(String args[])throws Exception
{
    try
    {
        meth2();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }

}