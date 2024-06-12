public class exception_handling04 
{
    
    static void meth1()throws Exception
    {
        try
        {
            throw new Exception();
        }
        finally
        {
            System.out.println("Final message");
        }
    }

    public static void main(String[] args)throws Exception
        
        {
            meth1();
    }
}



