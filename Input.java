import java.io.*;
public class Input {
    public static void main(String[] args)throws Exception {
        //FileInputStream fis=new FileInputStream("C:\\Users\\KIIT\\Test.txt");
        FileReader fis=new FileReader("C:\\Users\\KIIT\\Test.txt");
        //byte b[]=new byte[fis.available()];
        /*fis.read(b);
        String str=new String(b);
        System.out.println(str);*/
        int x=0;
        while((x=fis.read())!=-1)
        {

            System.out.print((char)x);
        }
    }
}