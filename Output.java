import java.io.*;
public class Output {
    public static void main(String[] args)throws Exception {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\KIIT\\Test.txt");
        String str="Learning java Programming";
         
        byte b[]=str.getBytes();
        
        /*
        //fos.write(str.getBytes());
        for(byte x:b)
            fos.write(x);*/
        //fos.write(b, 6, str.length()-6);
        
        fos.write(b);
        
        fos.close();
        
        }
        /*catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }*/
    }
    

