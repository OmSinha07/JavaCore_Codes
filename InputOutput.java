import java.io.*;
public class InputOutput {
    public static void main(String[] args)throws Exception {
        FileInputStream fis=new FileInputStream("C:\\Users\\KIIT\\Source.txt");
        //FileOutputStream fos=new FileOutputStream("C:\\Users\\KIIT\\Test1.txt");
        FileInputStream fos=new FileInputStream("C:\\Users\\KIIT\\Test1.txt");
        FileOutputStream fss=new FileOutputStream("C:\\Users\\KIIT\\Dest.txt");

        SequenceInputStream sis=new SequenceInputStream(fis,fos);
        int x;
        while ((x=sis.read())!=-1) {
            //if(x>=65 && x<=120)
            //fss.write(x+32);
            fss.write(x);
            //else
            
           // fos.write(x);
        }
        fis.close();
        fos.close();
        sis.close();
        fss.close();
    }}
