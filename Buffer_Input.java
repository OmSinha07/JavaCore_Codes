
import java.io.*;

public class Buffer_Input
{
    public static void main(String[] args)throws Exception 
    {
        FileInputStream fis=new FileInputStream("C:\\Users\\KIIT\\Test.txt");//Buffer reader same syntax FileReader use
        BufferedInputStream bis=new BufferedInputStream(fis);
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        
        //System.out.println("String "+bis.readLine());
        
        
    }    
}
